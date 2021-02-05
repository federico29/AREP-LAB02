package edu.escuelaing.arep;

import static spark.Spark.*;

import spark.Request;
import spark.Response;

import edu.escuelaing.arep.util.MyLinkedList;
import edu.escuelaing.arep.stat.StatCalculator;

public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> 
                "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h1>Calculadora Estadística</h1>"
                + "<p> Escriba el conjunto de números separados por comas: <br> " 
                + "<form action=\"/respuesta\">"
                + "  Números:<br>"
                + "  <input type=\"text\" name=\"data\" >"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Calcular\">"
                + "</form>"
                + "</body>"
                + "</html>");
        get("/respuesta", (req, res) -> resultsPage(req, res));
        // Using string/html
        notFound("<html><body><h1>Error 404: Página no encontrada</h1></body></html>");
        staticFiles.expireTime(10);
    }

    private static String resultsPage(Request req, Response res) {
        MyLinkedList<Double> lista = new MyLinkedList<Double>();
        StatCalculator calculadora = new StatCalculator();
        
        String [] numeros = req.queryParams("data").split(",");
        for (String num: numeros){
            lista.add(Double.parseDouble(num));
        }
        return 
                "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h1>Resultados</h1>"
                + "<p> La media y la desviación estándar del conjunto " 
                + lista.toString() + " es:" + "<br>"
                + "  Media: " + calculadora.mean(lista) + "<br>"
                + "  Desviación estándar: " + calculadora.standardDeviation(lista) + "<br>"
                + "</body>"
                + "</html>";
    }
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }
}
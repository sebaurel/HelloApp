package org.wcs.hello;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/hello-form.html", "/custom-hello.html"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String time = request.getParameter("time");
        String formule;

        if (time != "") {
            String[] heureSplit = time.split(":", 0);
            String heure = heureSplit[0] + heureSplit[1];
            int heureInt = Integer.parseInt(heure);
            if (heureInt < 1200) {
                formule = "Bonjour";
            } else if (heureInt < 2000) {
                formule = "Bon après-midi";
            } else {
                formule = "Bonsoir";
            }
        }else{
            formule = "T'as pas de montre";
        }
        String phrase = formule + " " + prenom + " !";

        request.setAttribute("phrase", phrase);



        getServletContext().getRequestDispatcher( "/custom-hello.jsp" ).forward( request, response );


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher( "/hello-form.jsp" ).forward( request, response );
    }
}


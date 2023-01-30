/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Person;

/**
 *
 * @author burha
 */
public class HelloWorldServlet extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        
        if (firstname == null || firstname.equals("") || lastname == null || lastname.equals("")){
            
            request.setAttribute("message", "Invalid entry, Please enter both your first and last name");
            request.setAttribute("firstname", firstname);
            request.setAttribute("lastname", lastname);
            request.setAttribute("invalid", true);
        
            getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp").forward(request, response);
            return;
        }
        
        Person person = new Person(firstname, lastname);
        request.setAttribute("person", person);
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp").forward(request, response);
    }

}

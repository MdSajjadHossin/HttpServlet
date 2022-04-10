/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.httppackage;

//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.*;
//import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Md Sajjad Hossin
 */
public class httpServlet extends HttpServlet {
        public void doGet(HttpServlet request, HttpServletResponse response)throws ServletException,IOException{
        System.out.println("This is get method..........");
        
        response.setContentType("text/html");
        
        PrintWriter out=response.getWriter();
        
        out.print("<h1>This is get method of my servlet</h1>");
    }
}

package kz.bitlab.servlets;



import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(value = "/home")

public class HomeServlet extends HttpServlet {



    @Override

    protected void doPost(HttpServletRequest request,

                          HttpServletResponse response) throws ServletException, IOException {

    }



    @Override

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" " +
                "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class = 'container'>");
        out.print("<div class = 'row mt-5'>");
        out.print("<div class = 'col-10 mx-auto'>");
        out.print("<table class = 'table table-striped table-bordered'>");
        out.print("<thead style='background-color:lightgray;'>");
        out.print("<tr><th>NAME</th><th>SURNAME</th><th>DEPARTMENT</th><th>SALARY</th></tr>");
        out.print("</thead>");
        out.print("<tbody>");

        ArrayList<Employee> staff = DBManager.getStaff();
        for(Employee cnt : staff){
            out.print("<tr><td>"+cnt.getName() + "</td><td>" + cnt.getSurname()+ "</td><td>" + cnt.getDepartment()+"</td><td>"+cnt.getSalary()+"</td></tr>");
        }

        out.print("</tbody>");
        out.print("</table>");
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");

    }

}
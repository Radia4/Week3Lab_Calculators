package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author radia
 */

public class AgeCalculatorServlet extends HttpServlet{
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext(). getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
        }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String a = request.getParameter("currentage");
        try{
            if (!a.equals("")){
                int age = Integer.parseInt(a);
                request.setAttribute("Message","Your age on your next birthday will be " + (age +1));
            }else{
                request.setAttribute("Message","You must give your current age");
            }
        }catch (Exception e){
            request.setAttribute("Message","You must enter a number");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request,response);

    }
}

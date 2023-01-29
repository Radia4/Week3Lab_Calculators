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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result","---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response); 
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String FirstNumber = request.getParameter("FirstNumber");
        request.setAttribute("FirstNumber", FirstNumber);
        String SecondNumber = request.getParameter("SecondNumber");
        request.setAttribute("SecondNumber", SecondNumber);
        
        int ans = 0;
        
        try {
        int number1 = Integer.parseInt(FirstNumber);
        int number2 = Integer.parseInt(SecondNumber);
        switch(request.getParameter("submit")) {
            case "+": 
                ans = number1 + number2;
                break;
            case "-":
                ans = number1 - number2;
                break;
            case "*": 
                ans = number1 * number2;
                break;
            case "%": 
                ans = number1 % number2;
                break;
        }
    
            } catch (Exception e) {
            request.setAttribute("result", "invalid");getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }
            request.setAttribute("result", ans );
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        }

}
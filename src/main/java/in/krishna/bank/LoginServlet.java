package in.krishna.bank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String customerId = request.getParameter("customerId");
        String customerName = request.getParameter("customerName");

        HttpSession session = request.getSession(true);
        session.setAttribute("customerId", customerId);
        session.setAttribute("customerName", customerName);

        session.setAttribute("balance", 15000.00);

        List<String> statement = new ArrayList<>();
        statement.add("Opening balance ₹15000.00");
        session.setAttribute("statement", statement);

        response.sendRedirect("dashboard.jsp");
    }
}

package in.krishna.bank;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/transaction")
public class TransactionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        String type = request.getParameter("type");
        double amount = Double.parseDouble(request.getParameter("amount"));
        Double balance = (Double) session.getAttribute("balance");
        List<String> statement = (List<String>) session.getAttribute("statement");

        if (type.equals("DEPOSIT")) {
            balance += amount;
            statement.add("Deposited ₹" + amount);
        } else if (type.equals("WITHDRAW") && amount <= balance) {
            balance -= amount;
            statement.add("Withdrew ₹" + amount);
        }

        session.setAttribute("balance", balance);
        session.setAttribute("statement", statement);

        response.sendRedirect("dashboard.jsp");
    }
}

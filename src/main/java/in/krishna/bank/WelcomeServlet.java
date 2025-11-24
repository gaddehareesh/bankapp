package in.krishna.bank;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        String customerName = request.getParameter("name");
        if (customerName == null || customerName.isBlank()) {
            customerName = "Valued Customer";
        }

        double balance = 15000.75;
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>Welcome " + customerName + "</h1>");
            out.println("<p>Your balance: ₹" + balance + "</p>");
            out.println("</body></html>");
        }
    }
}

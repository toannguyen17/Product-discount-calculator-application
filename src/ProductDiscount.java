import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalcution", urlPatterns = "/display-discount")
public class ProductDiscount extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String description = req.getParameter("description");
		Double price       = Double.parseDouble(req.getParameter("price"));
		Double discount    = Double.parseDouble(req.getParameter("percent"));

		Double discount_price = (price * discount)/100;

		PrintWriter writer = resp.getWriter();

		writer.println("<html><head><title>Discount Calculator</title></head>");
		writer.println("Product: " + description);
		writer.println("<br />");
		writer.println("Discount Amount: " + discount_price);
		writer.println("<br />");
		writer.println("Discount Price: "  + (price - discount_price));
		writer.println("<br />");
		writer.println("</html>");
	}
}

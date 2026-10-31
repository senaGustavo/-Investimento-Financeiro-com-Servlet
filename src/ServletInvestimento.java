import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Business.Investimento;

@WebServlet("/ServletInvestimento")
public class ServletInvestimento extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Recebe os dados do formulário
        double valorInicial = Double.parseDouble(request.getParameter("valor1"));
        int meses = Integer.parseInt(request.getParameter("meses"));
        String tipo = request.getParameter("tipoInvestimento");

        // 2. Usa a classe de negócio para calcular
        Investimento inv = new Investimento();
        double valorFinal = inv.calcular(valorInicial, meses, tipo);

        // 3. Prepara a resposta
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='pt-BR'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Resultado do Investimento</title>");
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/style.css'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<main class='container'>");
        out.println("<section class='card'>");
        out.println("<h1>Resultado da Simulação</h1>");
        out.println("<p><strong>Valor inicial:</strong> R$ " + String.format("%.2f", valorInicial) + "</p>");
        out.println("<p><strong>Tipo de investimento:</strong> " + tipo + "</p>");
        out.println("<p><strong>Período:</strong> " + meses + " meses</p>");
        out.println("<p><strong>Valor final:</strong> R$ " + String.format("%.2f", valorFinal) + "</p>");
        out.println("<br>");
        out.println("<a href='index.html'>Calcular novamente</a>");
        out.println("</section>");
        out.println("</main>");
        out.println("</body>");
        out.println("</html>");
    }
}
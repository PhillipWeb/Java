package pratica;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/CalculadoraIMC")
public class CalculadoraIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CalculadoraIMC() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		double peso = Double.parseDouble(request.getParameter("peso"));
		double altura = Double.parseDouble(request.getParameter("altura"));
		
		double imc = peso / (altura * altura);
		
		String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }
        
        request.setAttribute("nomeUsuario", nome);
        request.setAttribute("valorImc", imc);
        request.setAttribute("classificacaoImc", classificacao);
        
        request.getRequestDispatcher("resultadoIMC.jsp").forward(request, response);
	}

}

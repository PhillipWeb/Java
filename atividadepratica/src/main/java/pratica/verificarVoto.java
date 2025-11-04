package pratica;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/verificarVoto")
public class verificarVoto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public verificarVoto() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String nome = request.getParameter("nome");
        int idade = Integer.parseInt(request.getParameter("idade"));

      
        String resultado;

        if (idade < 16) {
            resultado = "Não pode votar";
        } else if (idade < 18 || idade > 70) { 
            resultado = "Voto facultativo";
        } else { 
            resultado = "Voto obrigatório";
        }

       
        request.setAttribute("nomeUsuario", nome);
        request.setAttribute("idadeUsuario", idade);
        request.setAttribute("resultadoVerificacao", resultado);

        request.getRequestDispatcher("resultadoVoto.jsp").forward(request, response);
	}

}

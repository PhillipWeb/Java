package pratica;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/avaliarSkatista")
public class avaliarSkatista extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public avaliarSkatista() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
        int idade = Integer.parseInt(request.getParameter("idade"));
        String estilo = request.getParameter("estilo");
        String frequencia = request.getParameter("frequencia");

        int pontuacao = 0;

        if ("street".equals(estilo)) {
            pontuacao += 2;
        } else if ("park".equals(estilo)) {
            pontuacao += 3;
        } else if ("vertical".equals(estilo)) {
            pontuacao += 4;
        }

        if ("1x".equals(frequencia)) {
            pontuacao += 1;
        } else if ("3x".equals(frequencia)) {
            pontuacao += 2;
        } else if ("diariamente".equals(frequencia)) {
            pontuacao += 3;
        }

        if (idade < 12) {
            pontuacao += 1; 
        } else if (idade >= 40) {
            pontuacao -= 1; 
        }
        
        if (pontuacao < 0) {
            pontuacao = 0;
        }
        
        String classificacao;
        if (pontuacao <= 3) {
            classificacao = "Iniciante nas pistas";
        } else if (pontuacao <= 6) {
            classificacao = "Skatista dedicado";
        } else {
            classificacao = "Lenda do skate";
        }

        request.setAttribute("nomeSkatista", nome);
        request.setAttribute("pontuacaoFinal", pontuacao);
        request.setAttribute("classificacaoFinal", classificacao);
        
        request.getRequestDispatcher("resultadoSkatista.jsp").forward(request, response);
	}

}

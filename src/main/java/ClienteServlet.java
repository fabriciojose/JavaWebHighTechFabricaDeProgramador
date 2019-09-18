import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;


@WebServlet(urlPatterns= "/cliente")
public class ClienteServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	
	Cliente cli;
	
	
	public ClienteServlet() {
		
		//System.out.println("Construtor");
	}
	
	@Override
	public void init() throws ServletException {
		//System.out.println("inicializando");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.service(req, resp);
	}
	
	@Override
	public void destroy() {
		//System.out.println("servlet destroy");
		super.destroy();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//super.doGet(req, resp);

		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		
		dispatcher.forward(req, resp);
		
		
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//super.doPost(req, resp)

		cli = new Cliente(req.getParameter("email"));
		
		//String strEmail = req.getParameter("email");
		
		//System.out.println("Email enviado: " + strEmail);
		
		System.out.println(cli.getEmail());
		
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Email enviado: " + cli.getEmail());
	
		
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doDelete(req, resp);
		
		System.out.println("metodo do DELETE");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doPut(req, resp);
		
		System.out.println("metodo DO PUT");
	}
	
	
}
 
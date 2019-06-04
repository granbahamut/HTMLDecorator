package co.com.ivancho.servlets;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.com.ivancho.decorator.BoldDecorator;
import co.com.ivancho.decorator.DivDecorator;
import co.com.ivancho.decorator.H1Decorator;
import co.com.ivancho.decorator.H2Decorator;
import co.com.ivancho.decorator.H3Decorator;
import co.com.ivancho.decorator.H4Decorator;
import co.com.ivancho.decorator.ListDecorator;
import co.com.ivancho.decorator.ParagraphDecorator;
import co.com.ivancho.pattern.ConcretePageConstructor;

/**
 * Servlet implementation class HTMLDecoratorServlet
 */
@WebServlet(name = "HTMLDecoratorServlet", urlPatterns = "/HTMLDecorator")
public class HTMLDecoratorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HTMLDecoratorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ConcretePageConstructor constructor = new ConcretePageConstructor();
		String a = constructor.decorate();

		Map<String, String[]> params = request.getParameterMap();

		if (params.containsKey("h1")) {
			H1Decorator h1 = new H1Decorator(constructor);
			a += h1.decorate();
		}
		if (params.containsKey("h2")) {
			H2Decorator h2 = new H2Decorator(constructor);
			a += h2.decorate();
		}
		if (params.containsKey("h3")) {
			H3Decorator h3 = new H3Decorator(constructor);
			a += h3.decorate();
		}
		if (params.containsKey("h4")) {
			H4Decorator h4 = new H4Decorator(constructor);
			a += h4.decorate();
		}
		if (params.containsKey("paragraph")) {
			ParagraphDecorator pd = new ParagraphDecorator(constructor);
			a += pd.decorate();
		}
		if (params.containsKey("list")) {
			ListDecorator pd = new ListDecorator(constructor);
			a += pd.decorate();
		}
		if (params.containsKey("bold")) {
			BoldDecorator b = new BoldDecorator(constructor);
			a += b.decorate();
		}
		if (params.containsKey("div")) {
			DivDecorator b = new DivDecorator(constructor);
			a += b.decorate();
		}

		request.setAttribute("val", a);
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

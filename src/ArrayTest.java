
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/at")
public class ArrayTest extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String[] f = { "���", "�ٳ���", "������", "����", "��" };
		request.setAttribute("f", f);
		RequestDispatcher rd = request.getRequestDispatcher("view03.jsp");//JSTL,EL
		rd.forward(request, response);

	}

}

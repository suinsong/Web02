
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.MemberDAO;
import kr.bit.mem.MemberVO;

@WebServlet("/danServlet")
public class DanServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int initialvalue = Integer.parseInt(req.getParameter("initialvalue"));
		//req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		MemberDAO dao = new MemberDAO();
		MemberVO vo = new MemberVO();
		
		vo.setInitialvalue(initialvalue);
		// int cnt=dao.fianlvalue(initialvalue);

		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head><title>구구단</title></head>");

		out.println("<table width=150px height=500px>");
		out.println("<tr>");
		out.println("<th colspan='2'>" + vo.getInitialvalue() + " 단  </th>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + vo.getInitialvalue() + "x 1 = </td>");
		out.println("<td>" + vo.getInitialvalue() * 1 + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + vo.getInitialvalue() + "x 2 = </td>");
		out.println("<td>" + vo.getInitialvalue() * 2 + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + vo.getInitialvalue() + "x 3 = </td>");
		out.println("<td>" + vo.getInitialvalue() * 3 + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + vo.getInitialvalue() + "x 4 = </td>");
		out.println("<td>" + vo.getInitialvalue() * 4 + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + vo.getInitialvalue() + "x 5 = </td>");
		out.println("<td>" + vo.getInitialvalue() * 5 + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + vo.getInitialvalue() + "x 6 = </td>");
		out.println("<td>" + vo.getInitialvalue() * 6 + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + vo.getInitialvalue() + "x 7 = </td>");
		out.println("<td>" + vo.getInitialvalue() * 7 + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + vo.getInitialvalue() + "x 8 = </td>");
		out.println("<td>" + vo.getInitialvalue() * 8 + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + vo.getInitialvalue() + "x 9 = </td>");
		out.println("<td>" + vo.getInitialvalue() * 9 + "</td>");
		out.println("</tr>");

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}
}

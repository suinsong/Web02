
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.MemberDAO;
import kr.bit.mem.MemberVO;

@WebServlet("/memView")
public class MemView extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int num = Integer.parseInt(req.getParameter("num"));
		//res.setContentType("text/html;charset=euc-kr");
		res.setCharacterEncoding("euc-kr");
		
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.memView(num);
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head><title>ȸ���󼼺���</title></head>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>��ȣ</th>");
		out.println("<td>" + vo.getNum() + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th>�̸�</th>");
		out.println("<td>" + vo.getIrum() + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th>����</th>");
		out.println("<td>" + vo.getAge() + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th>�̸���</th>");
		out.println("<td>" + vo.getEmail() + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th>�ڱ�Ұ�</th>");
		out.println("<td>" + vo.getIntro() + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th colspan='2'><a href='memList'>����Ʈ</a>&nbsp;"
				+ "<a href='memUform?num="+vo.getNum()+"'>����</a>&nbsp;"
				+ "<a href='memDel?num="+vo.getNum()+"'>����</a>"
				+ "</td></th>");

		out.println("</tr>");

		
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

}

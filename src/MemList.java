
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.MemberDAO;
import kr.bit.mem.MemberVO;

@WebServlet("/memList")
public class MemList extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		// member table���� ��üȸ�� ����Ʈ�� ������ ����.
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.memList();
		//req.setCharacterEncoding("euc-kr");
		// ��ü ����Ʈ�� html�� ������ �ؼ� ����������--->JSP
		// �����ϱ� ���� ���䵥���Ϳ� �ִ� ���ѱ۱��� ����

		res.setContentType("text/html;charset=euc-kr");

		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head><title>ȸ������Ʈ</title></head>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>��ȣ</th>");
		out.println("<th>�̸�</th>");
		out.println("<th>����</th>");
		out.println("<th>�̸���</th>");
		out.println("<th>����</th>");
		out.println("</tr>");

		for (MemberVO vo : list) {

			out.println("<tr>");
			out.println("<td>" + vo.getNum() + "</a></td>");
			out.println("<td><a href='memView?num="+vo.getNum()+"'>" + vo.getIrum() + "</td>");
			out.println("<td>" + vo.getAge() + "</td>");
			out.println("<td>" + vo.getEmail() + "</td>");
			out.println("<td><a href='memDel?num="+vo.getNum()+"'>����</a></td>");
			out.println("</tr>");
		}
		
		// memDel?num=    <<---QueryString ������ó�� ����:get��Ŀ�û

		out.println("<tr>");
		out.println("<td colspan='5' align=center>");
		out.println("<a href='member.html'>ȸ������</a></td> ");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

}

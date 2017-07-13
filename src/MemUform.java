
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.MemberDAO;
import kr.bit.mem.MemberVO;

@WebServlet("/memUform")
public class MemUform extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int num = Integer.parseInt(req.getParameter("num"));
		
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.memView(num);
//		res.setContentType("text/html;charset=euc-kr");
		res.setCharacterEncoding("euc-kr");
		
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head><title>회원 정보 수정</title></head>");
		out.println("<body><form action='memUpdate' method='post'>");
		out.println("<input type='hidden' name='num' value='"+vo.getNum()+"'>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>번호</th>");
		out.println("<td>" + vo.getNum() + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th>이름</th>");
		out.println("<td>" + vo.getIrum() + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th>나이</th>");
		out.println("<td><input type='text' name='age' value='"+vo.getAge()+"'/></td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th>이메일</th>");
		out.println("<td><input type='text' name='email' value='"+vo.getEmail()+"'/></td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th>자기소개</th>");
		out.println("<td><textarea rows='7' cols='30' name='intro'>"+vo.getIntro()+"</textarea></td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<th colspan='2'><input type='submit' value='수정'/> <a href='memList'>목록</a></th>");

		out.println("</tr>");

		out.println("</table>");
		out.println("</form></body>");
		out.println("</html>");

	}

}

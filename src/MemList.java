
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

		// member table에서 전체회원 리스트를 가지고 오자.
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.memList();
		//req.setCharacterEncoding("euc-kr");
		// 전체 리스트를 html로 포장을 해서 응답해주자--->JSP
		// 응답하기 전에 응답데이터에 있느 ㄴ한글깨짐 방짐

		res.setContentType("text/html;charset=euc-kr");

		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head><title>회원리스트</title></head>");
		out.println("<body>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>번호</th>");
		out.println("<th>이름</th>");
		out.println("<th>나이</th>");
		out.println("<th>이메일</th>");
		out.println("<th>삭제</th>");
		out.println("</tr>");

		for (MemberVO vo : list) {

			out.println("<tr>");
			out.println("<td>" + vo.getNum() + "</a></td>");
			out.println("<td><a href='memView?num="+vo.getNum()+"'>" + vo.getIrum() + "</td>");
			out.println("<td>" + vo.getAge() + "</td>");
			out.println("<td>" + vo.getEmail() + "</td>");
			out.println("<td><a href='memDel?num="+vo.getNum()+"'>삭제</a></td>");
			out.println("</tr>");
		}
		
		// memDel?num=    <<---QueryString 꼬릿말처럼 따라감:get방식요청

		out.println("<tr>");
		out.println("<td colspan='5' align=center>");
		out.println("<a href='member.html'>회원가입</a></td> ");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

}

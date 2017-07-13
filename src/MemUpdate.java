
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.MemberDAO;
import kr.bit.mem.MemberVO;

@WebServlet("/memUpdate")
public class MemUpdate extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");
		
		int num = Integer.parseInt(req.getParameter("num"));
		int age = Integer.parseInt(req.getParameter("age"));
		String email = req.getParameter("email");
		String intro = req.getParameter("intro");
		
		
		MemberVO vo= new MemberVO();
		vo.setNum(num);
		vo.setAge(age);
		vo.setEmail(email);
		vo.setIntro(intro);
		
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.memUpdate(vo);

		if (cnt > 0) {
			res.sendRedirect("memList");

		} else {
			throw new ServletException("FAILED");
		}

	}

}

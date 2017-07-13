
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.MemberDAO;
import kr.bit.mem.MemberVO;

@WebServlet("/mv")
public class MemListView extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.memList();

		request.setAttribute("list", list);
		javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("memberList.jsp");
		rd.forward(request, response);

	}

}

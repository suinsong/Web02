

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.MemberDAO;

@WebServlet("/memDel")
public class MemDel extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


		int num=Integer.parseInt(req.getParameter("num"));
		
		MemberDAO dao= new MemberDAO();
		int cnt=dao.memDel(num);		
		
		if(cnt>0){
			res.sendRedirect("memList");
			
		}else{
			throw new ServletException("FAILED");
		}
		
		
	}

}

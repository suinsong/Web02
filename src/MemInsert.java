
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.MemberDAO;
import kr.bit.mem.MemberVO;

@WebServlet("/memInsert")
public class MemInsert extends HttpServlet {
	//톰캣? 서블릿,jsp 구동시키는 엔진, 컨테이너
	
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		//form에서 넘어온 한글을 깨지지 않게 해야함
		req.setCharacterEncoding("euc-kr");
		
		
		//form에서 넘어온 parameter를 받는 작업
		String irum=req.getParameter("irum");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String intro=req.getParameter("intro");
	
		//MemberVO에 담아줘야함
		MemberVO vo= new MemberVO();
		vo.setIrum(irum);
		vo.setAge(age);
		vo.setEmail(email);
		vo.setIntro(intro);
		
		
		
		//db에 저장하기 :model과 연동(MemberDAO):Model과 연동(MemberDAO)-->JDBC
		MemberDAO dao= new MemberDAO();
		int cnt=dao.memInsert(vo);
		PrintWriter out=res.getWriter();
		if(cnt>0){
			res.sendRedirect("memList");
			
			
			//out.println("SUCCESS");
		}else{
			out.println("FAILED");
		}
		
		
		
	}

}


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
	//��Ĺ? ����,jsp ������Ű�� ����, �����̳�
	
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		//form���� �Ѿ�� �ѱ��� ������ �ʰ� �ؾ���
		req.setCharacterEncoding("euc-kr");
		
		
		//form���� �Ѿ�� parameter�� �޴� �۾�
		String irum=req.getParameter("irum");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String intro=req.getParameter("intro");
	
		//MemberVO�� ��������
		MemberVO vo= new MemberVO();
		vo.setIrum(irum);
		vo.setAge(age);
		vo.setEmail(email);
		vo.setIntro(intro);
		
		
		
		//db�� �����ϱ� :model�� ����(MemberDAO):Model�� ����(MemberDAO)-->JDBC
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

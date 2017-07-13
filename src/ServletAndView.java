
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.mem.MemberVO;

@WebServlet("/sw")
public class ServletAndView extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberVO vo = new MemberVO();
		vo.setNum(1);
		vo.setIrum("���浿");
		vo.setAge(25);
		vo.setEmail("gildong@hanmail.net");
		vo.setIntro("�ڱ�Ұ��Դϴ�");

		
		// content.jsp���� ���� html�� ������
					//���� ������ �̸�    ����������
		request.setAttribute("vo", vo);
		
		// ���� ��ų ��				// ���� �� jsp��ȯ
		RequestDispatcher rd=request.getRequestDispatcher("content.jsp");
		
		rd.forward(request, response);
		
		
		
		
		
		
		
		
		
	}

}

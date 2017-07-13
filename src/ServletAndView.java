
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
		vo.setIrum("나길동");
		vo.setAge(25);
		vo.setEmail("gildong@hanmail.net");
		vo.setIntro("자기소개입니다");

		
		// content.jsp에서 응답 html을 만들자
					//보낼 정보의 이름    보내는정보
		request.setAttribute("vo", vo);
		
		// 일을 시킬 비서				// 일을 할 jsp소환
		RequestDispatcher rd=request.getRequestDispatcher("content.jsp");
		
		rd.forward(request, response);
		
		
		
		
		
		
		
		
		
	}

}

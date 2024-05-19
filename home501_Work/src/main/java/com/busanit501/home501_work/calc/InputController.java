package com.busanit501.home501_work.calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "inputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {
    //get : 폼 화면 그려줌
    //주의사항  :  화면에 절대로 직접 접근하지 않는다.
    //컨트롤러 거쳐서 간다.
    //예) 로그인 화면 , 계산기 숫자를 입력받는 폼화면.

    //반드시 , 웹브라우저가 먼저 요청함. get방식으로 계산기 입력폼 불러와줘
    //HttpServ- req, 역할 : 브라우저가 요청한 정보가 담겨져 있다.
    //HttpServ- resp, 역할 : 서버가 응답시 정보를 담는 상자로 사용한다.

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
      ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("작업순서1 : InputController 거쳐가기.");
        //컨트롤러에서 해당 입력폼 화면으로 전달하는 코드
        //서버에사는 웹브라우저가 가야할 페이지 정보를 담아놓앗다. 여기에 requestDispatcher
        RequestDispatcher requestDispatcher = req.getRequestDispatcher
                ("/WEB-INF/calc/input.jsp");
        //역할 : 해당 뷰페이지로 전달하기
        //서버->  브라우저에에 정보를 제공
        requestDispatcher.forward(req, resp);
    }

    //post : 무언가 로직을 처리한다.
    //예) 로그인 처리, 계산기 숫자를 처라하는 로직.


}

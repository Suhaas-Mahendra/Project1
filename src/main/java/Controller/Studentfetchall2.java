package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;
import Dto.StudentDto;

@WebServlet("/fetchall1")
public class Studentfetchall2 extends HttpServlet {

			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				// TODO Auto-generated method stub
//				super.doGet(req, resp);
				
				StudentDao dao=new StudentDao();
				  List<StudentDto> l1=dao.fetchall();
				  
				  req.setAttribute("studentlist",l1);
				  RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
				  rd.forward(req, resp);
				  
				
			}
		
		
		
		
		
		
	}
	
	



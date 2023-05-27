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
@WebServlet("/delete")
public class deleteurl extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	// TODO Auto-generated method stub
        	//super.doGet(req, resp);
        	
        	
        String s1=	req.getParameter("id");
       int sid1= Integer.parseInt(s1);
       
       StudentDao dao=new StudentDao();
        String msg=dao.delete(sid1);
       
//       List<StudentDto> l1=dao.fetchall();
//   	req.setAttribute("studentlist", l1);
//   	
//   	resp.setContentType("text/html");//if we are returning from studentdao we should use set content type.
//   	resp.getWriter().print(msg);
//   	
//   	
//   	
//   	RequestDispatcher dispatcher=req.getRequestDispatcher("download.jsp");
//   	dispatcher.include(req, resp);
//   	
   	
   	
   	
        }
}

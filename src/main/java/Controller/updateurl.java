

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
@WebServlet("/updateurl")
public class updateurl extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String sid=req.getParameter("id");
String name=req.getParameter("name");
int sid2=Integer.parseInt(sid);
		
StudentDto dto=new StudentDto();
dto.setStd_id(sid2);
dto.setStd_name(name);


StudentDao dao=new StudentDao();
	String msg=dao.updateurl(sid2,name);
	
	
	List<StudentDto> l1=dao.fetchall();
	req.setAttribute("studentlist", l1);
	
	resp.setContentType("text/html");//if we are returning from studentdao we should use set content type.
	resp.getWriter().print(msg);
	
	
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("download.jsp");
	dispatcher.include(req, resp);	
	
	
	
	
	}		
	
}
	
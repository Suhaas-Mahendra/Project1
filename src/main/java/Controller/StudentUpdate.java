package Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import Dao.StudentDao;

@WebServlet("/update")
public class StudentUpdate extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sid=req.getParameter("sid");
		String sname=req.getParameter("sname");
		
		int sid1=Integer.parseInt(sid);
		
		StudentDao dao=new StudentDao();
		String msg=dao.update(sid1, sname);
		res.getWriter().print(msg);
		
		
	}
	

}

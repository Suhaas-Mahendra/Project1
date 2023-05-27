package Controller;


import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import Dao.StudentDao;
import Dto.StudentDto;

@WebServlet("/insert")
public class StudentController  extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sid=req.getParameter("sid");
		String sname=req.getParameter("sname");
		
		int sid1=Integer.parseInt(sid);
		
		StudentDto dto=new StudentDto();
		dto.setStd_id(sid1);
		dto.setStd_name(sname);
		
		StudentDao dao=new StudentDao();
		dao.insert(dto);
	}
	
	

}

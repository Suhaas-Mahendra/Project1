package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import Dao.StudentDao;
import Dto.StudentDto;
@WebServlet("/fetchall")
public class fetchall extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDao dao=new StudentDao();
		List<StudentDto> l=dao.fetchall();
		res.getWriter().print(dao.fetchall());
	
	
	}

	
}

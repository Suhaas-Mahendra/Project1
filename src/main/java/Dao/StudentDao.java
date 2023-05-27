

package Dao;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.StudentDto;

public class StudentDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	private Object sid;
	
	public void insert(StudentDto dto)
	{
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}
	public String remove(int sid)
	
	
	{
		StudentDto dto=entityManager.find(StudentDto.class, sid);
		if(dto!=null)
		{
			entityTransaction.begin();
			entityManager.remove(dto);
			entityTransaction.commit();
			
			return "data removed";
		}
		else
			return "no data found";
	
	}
	
	public String update(int sid,String sname)
	{
		StudentDto dto=entityManager.find(StudentDto.class, sid);
		if(dto!=null)
		{
			dto.setStd_name(sname);
			
			entityTransaction.begin();
			entityManager.merge(dto);
			entityTransaction.commit();
			
			return "data updated";
		}
		else
			return "no data found";
	}
	public String fetch(int sid)
	{
		StudentDto dto=entityManager.find(StudentDto.class,sid );
		return dto.getStd_id()+" "+dto.getStd_name();
	}
	
	public List<StudentDto> fetchall()
	{
		Query q=entityManager.createQuery("select list from StudentDto list",StudentDto.class);
		List<StudentDto> list=q.getResultList();
		return list;
		}
	public String delete(int sid)
	{
		
	StudentDto dto=entityManager.find(StudentDto.class,sid);
	entityTransaction.begin();
	entityManager.remove(dto);
	entityTransaction.commit();
	return "data is removed";
	}
	public String updateurl(int sid,String name)
	{
		StudentDto dto=entityManager.find(StudentDto.class, sid);
		if(dto!=null)
		{
			dto.setStd_name(name);
			entityTransaction.begin();
			entityManager.merge(dto);
			entityTransaction.commit();
			return "data is updated";
		}
		return "data is not present";
		
	}
	
}
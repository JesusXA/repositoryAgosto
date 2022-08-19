package org.dao.usercap;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.modelo.usercap.Usercap;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class DaoUsercap {
	
	@SessionTarget//sessionFactory, session
	private Session session;
	
	@TransactionTarget//beginTransaccion(), commit()
	private Transaction transaction;
	
	
	public void addUsercap(Usercap usercap) {
		try {
			session.save(usercap);
		} catch (Exception e) {
			System.out.println("Exception:" + e.getLocalizedMessage());
			transaction.rollback();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Usercap> selectUsercap(){
		List<Usercap> list = null;
		try {
			list = (List<Usercap>) session.createQuery("from Usercap").list();
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
		return list;
		
	}

}

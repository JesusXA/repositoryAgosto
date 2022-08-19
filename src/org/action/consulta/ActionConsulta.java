package org.action.consulta;

import java.util.ArrayList;
import java.util.List;

import org.dao.usercap.DaoUsercap;
import org.modelo.usercap.Usercap;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@SuppressWarnings("serial")
public class ActionConsulta  extends ActionSupport implements ModelDriven<Usercap>{
	
	private Usercap usercap = new Usercap();
	private DaoUsercap dao = new DaoUsercap();
	private List<Usercap> listUsercap = new ArrayList<Usercap>();
	
	public String execute() {
		return SUCCESS;
	}
	
	public String selectUsercap() {
		setListUsercap(dao.selectUsercap());
		return SUCCESS;
	}
	
	@Override
	public Usercap getModel() {
		return usercap;
	}
	
	
	public List<Usercap> getListUsercap() {
		return listUsercap;
	}
	public void setListUsercap(List<Usercap> listUsercap) {
		this.listUsercap = listUsercap;
	}
	
	
	
	

}

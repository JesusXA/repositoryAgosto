package org.action.alta;

import org.dao.usercap.DaoUsercap;
import org.modelo.usercap.Usercap;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class ActionAlta extends ActionSupport implements ModelDriven<Usercap>{
	
	private Usercap usercap = new Usercap();
	private DaoUsercap dao = new DaoUsercap();
	
	
	public String execute() {
		return SUCCESS;
	}
	
	public String addUsercap() {
		dao.addUsercap(usercap);
		return SUCCESS;
	}
	
	//RECUPERA TODOS LOS DATOS QUE ENVÍA LA JSP A LA ENTIDAD O MODELO.
	@Override
	public Usercap getModel() {
		return usercap;
	}
}

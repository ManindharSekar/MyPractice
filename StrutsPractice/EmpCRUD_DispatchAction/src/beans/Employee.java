package beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Employee extends ActionForm{
	private int id;
	private String name,email;
	private float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors ae = new ActionErrors();
		if(id<0){
			ae.add("e_id", new ActionMessage("msg1"));
		}if(name.equals("")){
			ae.add("e_name",new ActionMessage("msg2"));
		}if(email.equals("")){
			ae.add("e_email", new ActionMessage("msg3"));
		}if(salary<0){
			ae.add("e_salary",new ActionMessage("msg4"));
		}
		return ae;
	}

}

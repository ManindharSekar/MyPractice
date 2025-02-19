package formbean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Employee extends ActionForm{
	
	private int id;
	private String name,email,address,gender;
	private String[] Hobbies;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return Hobbies;
	}
	public void setHobbies(String[] hobbies) {
		Hobbies = hobbies;
	}

	
	public ActionErrors validate(ActionMapping am,HttpServletRequest sq){
		
		ActionErrors ae=new ActionErrors();
		if (id == 0)
			ae.add("e_id",new ActionMessage("msg1"));
			if (name.equals(""))
				ae.add("e_name",new ActionMessage("msg2"));
				if (email.equals(""))
					ae.add("e_email",new ActionMessage("msg3"));
					if (address.equals(""))
						ae.add("e_address",new ActionMessage("msg4"));
						if (gender.equals(""))
							ae.add("e_gender",new ActionMessage("msg5"));
							if (Hobbies.length < 1)
								ae.add("e_hobbie",new ActionMessage("msg6"));
		return ae;
		
	}

}

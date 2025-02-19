package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.EmpDao;

import beans.Employee;

public class EmpController extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Employee e=(Employee) form;
		int id = e.getId();
		String name = e.getName();
		String email = e.getEmail();
		float salary = e.getSalary();
	EmpDao empDao = new EmpDao();
	int i = empDao.save(id, name, email, salary);
		if(i!=0)
		return mapping.findForward("success");
	else
		return mapping.findForward("fail");
	}

}

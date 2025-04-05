package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.EventDispatchAction;
import org.apache.struts.actions.LookupDispatchAction;

public class EmpCrudController extends EventDispatchAction {

	
	//execute method will read parameter id
		//through parameter id we have to supply all submit button parameter names using(,)seperator
		//by making that(,)seperated string into,multiple substring than using each substring it will compare submit button id if match it will redirect req to same method name method
	
	public ActionForward empsave(ActionMapping map, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		Employee e = (Employee) form;

		EmployeeDAO dao = new EmployeeDAO();
		int i = dao.save(e.getId(), e.getName(), e.getEmail(), e.getAddress());
		if (i != 0)
			return map.findForward("success");
		else
			return map.findForward("failure");
	}

	public ActionForward empupdate(ActionMapping am, ActionForm af,
			ServletRequest req, ServletResponse res) throws Exception {
		Employee e = (Employee) af;

		EmployeeDAO dao = new EmployeeDAO();
		boolean b = dao.update(e.getId(), e.getName(), e.getEmail(),
				e.getAddress());
		if (b == true)
			return am.findForward("success");
		else
			return am.findForward("failure");

	}

	public ActionForward empdelete(ActionMapping am, ActionForm af,
			ServletRequest req, ServletResponse res) throws Exception {
		Employee e = (Employee) af;

		EmployeeDAO dao = new EmployeeDAO();
		boolean b = dao.delete(e.getId());
		if (b == true)
			return am.findForward("success");
		else
			return am.findForward("failure");
	}

	public ActionForward empfind(ActionMapping am, ActionForm af,
			ServletRequest req, ServletResponse res) throws Exception {
		Employee e = (Employee) af;

		EmployeeDAO dao = new EmployeeDAO();
		List l = dao.find(e.getId());
		req.setAttribute("list", l);
		return am.findForward("find");
	}

	public ActionForward empfindAll(ActionMapping am, ActionForm af,
			ServletRequest req, ServletResponse res) throws Exception {
		Employee e = (Employee) af;

		EmployeeDAO dao = new EmployeeDAO();
		List l = dao.findAll();
		req.setAttribute("list", l);
		return am.findForward("findAll");
	}

	

}

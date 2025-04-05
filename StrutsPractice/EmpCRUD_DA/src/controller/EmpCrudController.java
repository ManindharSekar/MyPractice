package controller;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class EmpCrudController extends DispatchAction {
	// we should not override execute and dispatchmethod
	// we have to write a custom method signature of method should equal to
	// execute method
	// name of method should equal button value

	public ActionForward save(ActionMapping map, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		Employee e = (Employee) form;

		EmployeeDAO dao = new EmployeeDAO();
		int i = dao.save(e.getId(), e.getName(), e.getEmail(), e.getAddress());
		if (i != 0)
			return map.findForward("success");
		else
			return map.findForward("failure");
	}

	public ActionForward update(ActionMapping am, ActionForm af,
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

	public ActionForward delete(ActionMapping am, ActionForm af,
			ServletRequest req, ServletResponse res) throws Exception {
		Employee e = (Employee) af;

		EmployeeDAO dao = new EmployeeDAO();
		boolean b = dao.delete(e.getId());
		if (b == true)
			return am.findForward("success");
		else
			return am.findForward("failure");
	}

	public ActionForward find(ActionMapping am, ActionForm af,
			ServletRequest req, ServletResponse res) throws Exception {
		Employee e = (Employee) af;

		EmployeeDAO dao = new EmployeeDAO();
		List l = dao.find(e.getId());
		req.setAttribute("list", l);
		return am.findForward("find");
	}

	public ActionForward findAll(ActionMapping am, ActionForm af,
			ServletRequest req, ServletResponse res) throws Exception {
		Employee e = (Employee) af;

		EmployeeDAO dao = new EmployeeDAO();
		List l = dao.findAll();
		req.setAttribute("list", l);
		return am.findForward("findAll");
	}

}

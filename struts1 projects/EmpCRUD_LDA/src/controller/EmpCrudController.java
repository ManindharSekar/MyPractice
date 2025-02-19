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

public class EmpCrudController extends LookupDispatchAction {
	
	// 1.using parameter id will read button value
	//2.for that value it will proper key from properties files
	//3.it will call getkeymethodmap  and will get return value from map object
	//4.from that map it will expect method values using button keys
	@Override
	protected Map getKeyMethodMap() {
		HashMap m = new HashMap();
		m.put("save", "empsave");
		m.put("update", "empupdate");
		m.put("delete", "empdelete");
		m.put("find", "empfind");
		m.put("findAll", "empfindAll");
		return m;
	}

	

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

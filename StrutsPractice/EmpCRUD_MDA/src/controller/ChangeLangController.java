package controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class ChangeLangController extends DispatchAction {
	
	@Override
	public ActionForward execute(ActionMapping map, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		String lang = req.getParameter("lang");
		Locale locale = new Locale(lang);
		req.getSession().setAttribute("org.apache.struts.action.LOCALE",locale);
		
		
		
		return map.findForward("index") ;
	}

}

package com.struts.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class HelloWorldAction extends Action {

  @Override
public ActionForward execute(ActionMapping am, ActionForm af,
		HttpServletRequest req,HttpServletResponse res) throws Exception {
	// TODO Auto-generated method stub
	return am.findForward("hello");
}
}

package config;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DbUtil.DbUtil;
import njupt.microcredit.entity.UserInfo;

public class SpiderServlet extends HttpServlet {
	
	DbUtil db=new DbUtil();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String op = req.getParameter("op");
		if(op==null) {
			op="";
		}
		switch (op) {
			
		case "select":
			try {
				select(req,resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		default:
				try {
					select(req,resp);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
	}}

	protected void select(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String username=req.getParameter("username");
		String address=req.getParameter("address");
		String gender=req.getParameter("gender");
		String sql=null;
		if(username==null&&address==null&&gender==null) {
			sql="select * from t_userinfo";
		}else if(username!=null&&address==null&&gender==null) {
			sql="select * from t_userinfo where username like'%" + username + "%'";
	}else if(username==null&&address!=null&&gender==null) {
		sql="select * from t_userinfo where address like'%" + address + "%'";
	}else if(username==null&&address==null&&gender!=null) {
		sql="select * from t_userinfo where gender = "+ address;
	}else if(username!=null&&address!=null&&gender==null) {
		sql="select * from t_userinfo where username like'%" + username + "%' and address like'%" + address + "%'";
	}else if(username!=null&&address==null&&gender!=null) {
		sql="select * from t_userinfo where username like '%" + username + "%' and gender ="+gender;
	}else if(username==null&&address!=null&&gender!=null) {
		sql="select * from t_userinfo where address like '%" + address + "%' and gender ="+gender;
	}else if(username!=null&&address!=null&&gender!=null) {
		sql="select * from t_userinfo where address like '%" + address + "%' and address like'%" + address + "%' and gender ="+gender;
	}
			List<UserInfo> lst = db.getUserinfo(sql);
			
			req.getSession().setAttribute("userinfolst", lst);
			resp.sendRedirect("weibospider.jsp");
		}
	
	
}
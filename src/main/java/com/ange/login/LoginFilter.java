package com.ange.login;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ange.model.User;

@SuppressWarnings("serial")
public class LoginFilter extends HttpServlet implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest sRequest, ServletResponse sResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) sRequest;
		HttpServletResponse response = (HttpServletResponse) sResponse;
		request.setCharacterEncoding("utf-8");
		sRequest.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		System.out.println(uri);
		String errorurl = request.getRequestURL().toString();
		errorurl = errorurl.replace(uri, "");
		if (uri.indexOf("translate") > -1) {
			errorurl += "/translate/system/User_error";
		} else {
			errorurl += "/system/User_error";
		}

		// TODO 设置不需要拦截的接口
		String[] limitUrl = { "system/User_error","wxPay/testCreateData", "login/wxLogin","login/webLogin", "file/upPic","system/getWxConfig","websocket/ChatNotice","loginTest/test"};

		String tokenString = request.getParameter("token");
		System.out.println(tokenString);
		System.out.println(uri);
		for (String url : limitUrl) {
			if (uri.equals("/translate/")||uri.equals("/")||uri.indexOf(url) != -1 || uri.indexOf(".js") != -1 || uri.indexOf(".html") != -1
					|| uri.indexOf(".jpg") != -1 || uri.indexOf(".png") != -1 ||uri.indexOf(".jpeg") != -1 || uri.indexOf(".css") != -1
					|| uri.indexOf(".jsp") != -1|| uri.indexOf("pic/") != -1||uri.indexOf("loginTest/") != -1) {
				filterChain.doFilter(request, response);
				return;
			}else if( uri.indexOf("upFile/") != -1) {
				response.setHeader("Content-Disposition", "attachment; filename=\"" + uri.substring(uri.lastIndexOf("/")+1) + "\""); 
				return;
			}
			filterChain.doFilter(request, response);
			return;
		}
		if (tokenString == null) {
			// request.getRequestDispatcher("../system/User_error").forward(request,
			// response);
			response.sendRedirect(errorurl);
			return;
		}
		User user = JsonWebToken.verifyToken(tokenString);
		if (user == null) {
			response.sendRedirect(errorurl);
			return;
		}
		request.setAttribute("userid", user.getId());
		request.setAttribute("user", user);
		filterChain.doFilter(request, response);
		return;
	}

	public void init(FilterConfig arg0) throws ServletException {

	}
	

}

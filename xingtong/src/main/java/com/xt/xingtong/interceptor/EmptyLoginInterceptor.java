package com.xt.xingtong.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/**
 * 前后端分离
 * @author HP
 *
 */
public class EmptyLoginInterceptor extends HandlerInterceptorAdapter{
	
	/**
	 * RequestMapping 执行之前,执行preHandle
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
		System.out.println("EmptyLoginInterceptor preHandle 被拦截的方法是----------handler => "+handler);
		response.setHeader("Access-Control-Allow-Origin", "*");//允许跨域访问
		response.setHeader("Access-Control-Allow-Methods", "*");
		return true;
	}

	
	/**
	 * RequestMapping 执行之后,执行postHandle,此时并未真正分发视图
	 */
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {

		response.setHeader("Access-Control-Allow-Origin", "*");//允许跨域访问
		response.setHeader("Access-Control-Allow-Methods", "*");

		
	}
	

	/**
	 * RequestMapping 执行之后,执行postHandle,视图也分发完毕.
	 * 1. 相当于 finally
	 * 2.方法执行异常
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,	HttpServletResponse response, Object handler, Exception ex)	throws Exception {
		response.setHeader("Access-Control-Allow-Origin", "*");//允许跨域访问
		response.setHeader("Access-Control-Allow-Methods", "*");
		
	}

	
	
	
	

}

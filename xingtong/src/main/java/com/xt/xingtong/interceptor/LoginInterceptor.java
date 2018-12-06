package com.xt.xingtong.interceptor;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.xt.xingtong.exception.UnLoginException;
import com.xt.xingtong.tool.SysUtils;

/***
 * 所有的请求经过该拦截器，该拦截器获取token 
 */

/**
 * 权限过滤
 * 
 * @Description: 权限过滤拦截器
 * @author Mashuai
 * @Date 2018-5-10 下午6:39:06
 * @Email 1119616605@qq.com
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

	/**
	 * RequestMapping 执行之前,执行preHandle
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler)
			throws UnLoginException, 
			TokenExpiredException, IOException {
		System.out
				.println("LoginInterceptor preHandle 被拦截的方法是----------handler => "
						+ handler);
		String path = request.getServletPath();// 获取请求的当前项目下的资源 , 匹配得到:
												// 当前项目/xxx/**/xxx.xxx 例如
												// /sys/login
		System.out.println("LoginInterceptor拦截器 获取请求的当前项目下的资源=>" + path);
		if (path.matches(SysUtils.NO_INTERCEPTOR_PATH)) {// 不拦截的URL正则表达式
			System.out.println("不拦截的URL正则表达式匹配成功,放行 ^_^ ");
			return true;
		}

		if (handler instanceof HandlerMethod) {

			String token = request.getParameter("token");// 取出用户每次请求都要传递的token参数
			System.out.println("LoginInterceptor 拦截器拦截到的请求token=>" + token);
			if (token == null || "".equals(token)) {
				System.out.println("未登录或请求没有携带Token,就想访问业务控制器,你是不是傻!!!");
				throw new UnLoginException("未登录或请求没有携带合法Token!");
			}
		} else {
			System.out
					.println("LoginInterceptor preHandle 被拦截的非控制器资源是----------handler => "
							+ handler);
		}

		return true;
	}

	/**
	 * RequestMapping 执行之后,执行postHandle,此时并未真正分发视图
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out
				.println("LoginInterceptor postHandle ----------modelAndView => "
						+ modelAndView);
		// modelAndView.setViewName("");//可以控制分发的视图
		response.addHeader("Access-Control-Allow-Origin", "*");// 允许跨域访问

	}

	/**
	 * RequestMapping 执行之后,执行postHandle,视图也分发完毕. 1. 相当于 finally 2.方法执行异常
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("LoginInterceptor afterCompletion ----------ex => "
				+ ex);

	}

}

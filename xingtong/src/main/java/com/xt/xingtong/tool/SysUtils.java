package com.xt.xingtong.tool;
/**
 * 系统权限工具类
 * 
 */
public class SysUtils {
	
	/**
	 * 类型: SysUser
	 * Session中的当前用户对象
	 */
	public static final String CURRENTUSER ="currentUser";//Session中的当前用户对象
	/**
	 * 类型: List<String> 字符串集合
	 * Session中当前用户拥有的角色集合
	 */
	public static final String CURRENTROLE = "currentRole";//Session中当前用户拥有的角色集合
	/**
	 * 类型: List<String> 字符串集合
	 * Session中当前用户拥有的权限集合
	 */
	public static final String CURRENTPERMISSION = "currentPermission";//Session中当前用户拥有的权限集合
	public static final String SYSSTR = "sys";//系统操作的命名空间
	public static final String LOGINSTR = "login";//登录操作的方法名
	public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(logout)|(mvc)|(app)|(weixin)|(static)|(main)|(websocket)).*";	//不对匹配该值的访问路径拦截（正则）

}

package com.example.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

/**
 * 
 * 类名称：UserService   
 * 类描述：   
 * 创建人：seon   
 * 创建时间：2017年12月7日 下午4:35:09 
 * @version
 */
@Service
public class UserService {
	/**
	 * 
	 * @Description: 方法说明 void  
	 * @throws
	 * @author seon
	 * @date 2017年12月7日
	 */
	@Secured("ROLE_USER")
	public void addUser() {
		System.out.println("这里有个User");
	}
}

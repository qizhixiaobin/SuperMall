
/*
 * @Author: abin abin_fu@foxmail.com
 * @Date: 2024-07-04 10:30:35
 * @LastEditors: abin abin_fu@foxmail.com
 * @LastEditTime: 2024-07-04 11:17:07
 */

package com.abin.supermall;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.abin.SupermallApplication;

public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SupermallApplication.class);

	}

}

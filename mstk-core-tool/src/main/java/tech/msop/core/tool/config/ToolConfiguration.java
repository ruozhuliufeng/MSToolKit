/*
 *      Copyright (c) 2018-2028, ruozhuliufeng Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: ruozhuliufeng 庄骞 (ruozhuliufeng@163.com)
 */
package tech.msop.core.tool.config;


import org.springblade.core.tool.support.BinderSupplier;
import org.springblade.core.tool.utils.SpringUtil;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

/**
 * 工具配置类
 *
 * @author ruozhuliufeng
 */
@AutoConfiguration
public class ToolConfiguration {

	/**
	 * Spring上下文缓存
	 */
	@Bean
	public SpringUtil springUtil() {
		return new SpringUtil();
	}

	/**
	 * Binder支持类
	 */
	@Bean
	@ConditionalOnMissingBean
	public Supplier<Object> binderSupplier() {
		return new BinderSupplier();
	}

}

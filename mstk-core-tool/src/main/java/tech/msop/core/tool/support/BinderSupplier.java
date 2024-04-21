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
 *  Author: ruozhuliufeng 庄骞 (smallruozhuliufeng@163.com)
 */
package tech.msop.core.tool.support;

import java.util.function.Supplier;

/**
 * 解决 no binder available 问题
 *
 * @author ruozhuliufeng
 */
public class BinderSupplier implements Supplier<Object> {

	@Override
	public Object get() {
		return null;
	}
}

/*
 * Copyright (C) 2008 feilong (venusdrogon@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.commons.core.date;

/**
 * 时间间隔(一般以秒为单位) <br>
 * 注意: Integer.MAX_VALUE:2147483647<br>
 * Integer.MIN_VALUE:-2147483648<br>
 * 一年数据为 31536000,所以 Integer 最大为 68.096259734906 年
 * 
 * @author <a href="mailto:venusdrogon@163.com">金鑫</a>
 * @version 1.0 2012-5-18 下午2:57:14
 * @version 1.0.5 2014-5-4 14:23 change to interface
 */
public interface TimeInterval{

	/** 1分钟 60s. */
	Integer	SECONDS_PER_MINUTE	= 60;

	/** 1小时 60 * 60=3600. */
	Integer	SECONDS_PER_HOUR	= SECONDS_PER_MINUTE * 60;

	/** 1天 60 * 60 * 24=86400. */
	Integer	SECONDS_PER_DAY		= SECONDS_PER_HOUR * 24;

	/** 一个星期 60 * 60 * 24 * 7= 604 800. */
	Integer	SECONDS_PER_WEEK	= SECONDS_PER_DAY * 7;

	/**
	 * 30天 一个月 60 * 60 * 24 * 30= 2592000<br>
	 * 估值,没有精确一个月28/29天 还是30 31天.
	 */
	Integer	SECONDS_PER_MONTH	= SECONDS_PER_DAY * 30;

	/**
	 * 365天 1年 60 * 60 * 24 * 365=31536000<br>
	 * Integer.MAX_VALUE:2147483647<br>
	 * Integer.MIN_VALUE-2147483648<br>
	 * 一年数据为 31536000,所以 Integer 最大为 68.096259734906 年
	 */
	Integer	SECONDS_PER_YEAR	= SECONDS_PER_DAY * 365;
}

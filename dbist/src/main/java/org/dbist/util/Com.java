/**
 * Copyright 2011 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dbist.util;

import java.util.Collection;
import java.util.Map;

import org.springframework.util.StringUtils;

/**
 * @author Steve M. Jung
 * @since 2 June 2011 (version 0.0.1)
 */
public class Com {
	public static boolean isEmpty(Object value) {
		if (value == null)
			return true;
		if (value instanceof String)
			return ((String) value).isEmpty();
		else if (value instanceof Collection)
			return ((Collection<?>) value).isEmpty();
		else if (value instanceof Map)
			return ((Map<?, ?>) value).isEmpty();
		return false;
	}
	
	public static String toUnderscoreCase(String value) {
		// TODO String toUnderscoreCase(String value)
		return value;
	}
	
	public static String toCamelCase(String value) {
		// TODO String toCamelCase(String value)
		return value;
	}
	
	public static String capitalize(String value) {
		return StringUtils.capitalize(value);
	}
	public static String uncapitalize(String value) {
		return StringUtils.uncapitalize(value);
	}
}

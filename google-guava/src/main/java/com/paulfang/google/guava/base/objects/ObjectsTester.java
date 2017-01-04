package com.paulfang.google.guava.base.objects;

import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;

public class ObjectsTester {

	public static void main(String[] args) {
		
		
		boolean r1 = Objects.equal(null, null);
		boolean r2 = Objects.equal(null, "abc");
		boolean r3 = Objects.equal("abc", "abc");
		
		int code1 = Objects.hashCode(null);
		int code2 = Objects.hashCode("abc");
		ToStringHelper helper = Objects.toStringHelper("abc");
		
	}

}

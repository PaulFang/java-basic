package com.paulfang.google.guava.base.strings;

import com.google.common.base.Strings;

public class StringsTester {

	
	public static void main(String[] args) {
		
		String r1 = Strings.nullToEmpty("abc");
		String r2 = Strings.nullToEmpty("");
		String r3 = Strings.nullToEmpty(null);
		
		String r4 = Strings.emptyToNull("abc");
		String r5 = Strings.emptyToNull("");
		String r6 = Strings.emptyToNull(null);
		
		
		boolean r7 = Strings.isNullOrEmpty("abc");
		boolean r8 = Strings.isNullOrEmpty("");
		boolean r9 = Strings.isNullOrEmpty(null);
		
		String r10 = Strings.padStart("abc", 6, 'x');
		String r11 = Strings.padEnd("abc", 6, 'o');
		
		String r12 = Strings.repeat("xyz", 5);
		
		String r13 = Strings.commonPrefix("com.xyz.pages", "com.xyz.pics");
		
		String r14 = Strings.commonSuffix("America,Hello", "China,Hello");
		
	}

}

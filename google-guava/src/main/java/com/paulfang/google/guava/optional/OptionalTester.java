package com.paulfang.google.guava.optional;

import com.google.common.base.Optional;

public class OptionalTester {

	public static void main(String[] args) {

		Optional<Integer> possible = Optional.of(6);

		System.out.println("After Optional<Integer> possible = Optional.of(6);");

		System.out.println("-----------------------------------------------------");

		System.out.println("possible.isPresent() = " + possible.isPresent());
		System.out.println("possible.get() = " + possible.get());
		System.out.println("possible.or(6) = " + possible.or(6));
		System.out.println("possible.orNull() = " + possible.orNull());

		System.out.println("\n=====================================================\n");

		Optional<Integer> opt = Optional.absent();

		System.out.println("After Optional<Integer> opt = Optional.absent();");

		System.out.println("-----------------------------------------------------");

		System.out.println("opt.isPresent() = " + opt.isPresent());
		System.out.println(opt.isPresent() ? "opt.get() = " + opt.get() : "opt.isNull() = " + opt.orNull());
		System.out.println("opt.or(1) = " + opt.or(1));

		System.out.println("\n=====================================================\n");

		Optional<Integer> pos = Optional.of(6);
		Optional<Integer> absentOpt = Optional.absent();
		Optional<Integer> NullableOpt = Optional.fromNullable(null);
		Optional<Integer> NoNullableOpt = Optional.fromNullable(10);
		if (pos.isPresent()) {
			System.out.println("pos isPresent : " + pos.isPresent());
			System.out.println("pos value : " + pos.get());
		}
		if (absentOpt.isPresent()) {
			System.out.println("absentOpt isPresent : " + absentOpt.isPresent());
		}
		if (NullableOpt.isPresent()) {
			System.out.println("fromNullableOpt isPresent : " + NullableOpt.isPresent());
		}
		if (NoNullableOpt.isPresent()) {
			System.out.println("NoNullableOpt isPresent : " + NoNullableOpt.isPresent());
		}

	}
}

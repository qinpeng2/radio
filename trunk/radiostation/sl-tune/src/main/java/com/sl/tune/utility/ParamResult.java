package com.sl.tune.utility;

public class ParamResult extends Result {
	
	public ParamResult(Result base, Object ... params) {
		setCode(base.getCode());
		setMessage(String.format(base.getMessage(), params));
	}
	
}

package com.sl.tune.utility;

public class Result {
	
	// valid status
	public static final Result SUCCESS = new Result(200, "SUCCESS");
	
	// defined exceptions
	public static final Result UNAUTHORIZED = new Result(301, "Unauthorized Operation");
	public static final Result NON_EXISTENT = new Result(302, "Non-Existent Resource"); 
	public static final Result DENY_EMPTY = new Result(303, "%s Cannot be Empty");
	public static final Result ALREAY_EXIST = new Result(304, "%s With The Same %s:[%s] Already Exist");
	public static final Result FK_FORCE = new Result(305, "%s Need a Valid %s");
	// exceptions
	
	public static final Result FILE_TRANSFER_ERROR = new Result(400, "Internal Error: File Transfer Failed");
	
	private int code;
	
	private String message;
	
	public Result() {
		
	}
	
	public Result(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public static Result createParamResult(Result base, Object... params ) {
		return new ParamResult(base, params);
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

package com.sl.tune.utility;

public class TuneException extends Exception{

	private static final long serialVersionUID = 828926603992402428L;

	private Result result;
	
	public TuneException() {}
	
	public TuneException(Result result) {
		this.result = result;
	}
	
	public TuneException(String message, Result result) {
		super(message);
		this.result = result;
	}
	
	public TuneException(Throwable t, Result result) {
		super(t);
		this.result = result;
	}
	
	public TuneException(String message, Throwable t, Result result) {
		super(message, t);
		this.result = result;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
}

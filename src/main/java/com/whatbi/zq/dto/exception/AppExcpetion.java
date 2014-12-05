package com.whatbi.zq.dto.exception;
/**
 * 如果使用的方法包含在事务中，那么只要throw new AppExcpetion("想打印的异常说明")，当前事务就会被回滚。
 * 类说明
 * @author lichao
 * @version 创建时间：2014年6月5日 下午2:51:17
 */
public class AppExcpetion extends RuntimeException{

	private static final long serialVersionUID = 8439535854278469731L;

	private String errCode;
	private String errMsg;
	
	public AppExcpetion(final String message){
		super(message);
	}
	
	public AppExcpetion(final String message, Throwable cause) {
		super(message, cause);
	}
	
    public AppExcpetion(Throwable cause) {
        super(cause);
    }

    public AppExcpetion(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }
}

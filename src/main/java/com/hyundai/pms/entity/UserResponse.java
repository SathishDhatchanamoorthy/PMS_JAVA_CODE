<<<<<<<< HEAD:src/main/java/com/sathish/angulartest/thahira/response/Response.java
package com.sathish.angulartest.thahira.response;

public class Response {
========
package com.hyundai.pms.entity;

public class UserResponse {
>>>>>>>> b4417b8043fb5bea54a85d87de6f900863239d8c:src/main/java/com/hyundai/pms/entity/UserResponse.java
	
	private int code;
	
	private String message;
	
	private Object data;
	
	private boolean status;
<<<<<<<< HEAD:src/main/java/com/sathish/angulartest/thahira/response/Response.java
	
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
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Response(int code, String message, Object data, boolean status) {
========

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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserResponse [code=" + code + ", message=" + message + ", data=" + data + ", status=" + status + "]";
	}

	public UserResponse(int code, String message, Object data, boolean status) {
>>>>>>>> b4417b8043fb5bea54a85d87de6f900863239d8c:src/main/java/com/hyundai/pms/entity/UserResponse.java
		super();
		this.code = code;
		this.message = message;
		this.data = data;
		this.status = status;
	}
<<<<<<<< HEAD:src/main/java/com/sathish/angulartest/thahira/response/Response.java
	@Override
	public String toString() {
		return "Res [code=" + code + ", message=" + message + ", data=" + data + ", status=" + status + "]";
	}
	
========

	public UserResponse() {
		super();
	}
	
	
>>>>>>>> b4417b8043fb5bea54a85d87de6f900863239d8c:src/main/java/com/hyundai/pms/entity/UserResponse.java

}

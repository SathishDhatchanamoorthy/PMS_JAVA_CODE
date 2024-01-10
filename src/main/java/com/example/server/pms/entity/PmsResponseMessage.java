package com.example.server.pms.entity;



public class PmsResponseMessage {

	 	private int code;
	    private String message;
	    private Object data;
	    private boolean status;
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
		public PmsResponseMessage(int code, String message, Object data, boolean status) {
			super();
			this.code = code;
			this.message = message;
			this.data = data;
			this.status = status;
		}
		public PmsResponseMessage() {
			super();
		}
		@Override
		public String toString() {
			return "PmsResponseMessage [code=" + code + ", message=" + message + ", data=" + data + ", status=" + status
					+ "]";
		}
	    
}

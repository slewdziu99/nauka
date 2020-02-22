package pl.adam.poligon.rest.webservices.restwebsevices.exception;

import java.util.Date;

public class ExceptionResponse {
	private Date timestamp;
	private String mesage;
	private String detail;
	
	public ExceptionResponse(Date timestamp, String mesage, String detail) {
		super();
		this.timestamp = timestamp;
		this.mesage = mesage;
		this.detail = detail;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getMesage() {
		return mesage;
	}
	public void setMesage(String mesage) {
		this.mesage = mesage;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	

}

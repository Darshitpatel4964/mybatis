package com.mybatis.demo.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This is RestDto.java class,This pattern was created with a very well defined purpose: 
 * transfer data to remote interfaces
 * @author Darshit Patel
 */

@Data
@NoArgsConstructor
public class RestDto<T> implements Serializable {

	private String message;
	private Boolean isError;
	private Integer status;
	private Integer length = 0;
	private T body;

	public RestDto(T object) {
		message = "Success";
		isError = Boolean.FALSE;
		status = HttpStatus.OK.value();
		this.body = object;
		getLenth();

	}

	public RestDto(HttpStatus status, String message) {
		this.message = message;
		isError = Boolean.TRUE;
		this.status = status.value();
	}

	public RestDto(HttpStatus status, String message, T object) {
		this.message = message;
		isError = Boolean.TRUE;
		this.status = status.value();
		this.body = object;
		getLenth();
	}

	void getLenth() {

		if (body != null) {
			if (this.body instanceof List) {
				length = ((List) body).size();
			}
			if (this.body instanceof Map) {
				length = ((Map) body).size();
			}
		}
	}

	public RestDto<T> setSuccessMessage(String message) {
		this.message = message;
		isError = Boolean.FALSE;
		status = HttpStatus.OK.value();
		return this;
	}

	public RestDto<T> setErrorMessage(String message, HttpStatus httpStatus) {
		this.message = message;
		isError = Boolean.TRUE;
		status = httpStatus.value();
		return this;
	}

}
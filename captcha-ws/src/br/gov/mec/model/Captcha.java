package br.gov.mec.model;

import java.io.Serializable;

public class Captcha implements Serializable {

	private static final long serialVersionUID = 1L;

	private String value;
	private String path;
	private String uuid;

	public Captcha(String value, String path, String uuid) {
		this.value = value;
		this.path = path;
		this.uuid = uuid;
	}

	public String getValue() {
		return value;
	}

	public String getPath() {
		return path;
	}

	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}

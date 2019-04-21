package com.geekzila.file.model;

public class File {

	private String name;
	private Double size;

	public File(Double size, String name) {
		this.name = name;
		this.size = size;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

}

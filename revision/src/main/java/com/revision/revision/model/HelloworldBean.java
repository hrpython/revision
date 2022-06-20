package com.revision.revision.model;

public class HelloworldBean {
private String message;


@Override
public String toString() {
	return "HelloworldBean [message=" + message + "]";
}

public HelloworldBean() {
	super();
	// TODO Auto-generated constructor stub
}

public HelloworldBean(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}

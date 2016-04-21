package model;
import ui.*;
import ctr.*;

public class Copy {
private String serialNumber;
private boolean state;
private DVD dvd;

public Copy(){
	
	this.serialNumber = serialNumber;
	this.state = state;
	this.dvd = dvd;
	
}

public String getSerialNumber() {
	return serialNumber;
}

public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}

public boolean isState() {
	return state;
}

public void setState(boolean state) {
	this.state = state;
}
}
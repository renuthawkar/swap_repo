package com.PracticeTest;

public class Rose {
	
int roseId;
String roseColour;



public int getRoseId() {
	return roseId;
}
public void setRoseId(int roseId) {
	this.roseId = roseId;
}
public String getRoseColour() {
	return roseColour;
}
public void setRoseColour(String roseColour) {
	this.roseColour = roseColour;
}
@Override
public String toString() {
	return "Rose [roseId=" + roseId + ", roseColour=" + roseColour + "]";
}


}

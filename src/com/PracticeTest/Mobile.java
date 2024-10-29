package com.PracticeTest;

public class Mobile {
	
	int mobileID;
	String mobileName;
	String mobileBrand;
	int prise;
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	public int getMobileID() {
		return mobileID;
	}
	public void setMobileID(int mobileID) {
		this.mobileID = mobileID;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	@Override
	public String toString() {
		return "Mobile [mobileID=" + mobileID + ", mobileName=" + mobileName + ", mobileBrand=" + mobileBrand
				+ ", prise=" + prise + "]";
	}
	
	
	

}

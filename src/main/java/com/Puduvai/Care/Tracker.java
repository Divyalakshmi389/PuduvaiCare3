package com.Puduvai.Care;

public class Tracker {
//	int total;
	String cured,active,death,lastUpdatedOn,total;


	public String getCured() {
	return cured;
}

public void setCured(String cured) {
	this.cured = cured;
}

public String getActive() {
	return active;
}

public void setActive(String active) {
	this.active = active;
}

public String getDeath() {
	return death;
}

public void setDeath(String death) {
	this.death = death;
}
public String getLastUpdatedOn() {
	return lastUpdatedOn;
}

public void setLastUpdatedOn(String lastUpdatedOn) {
	this.lastUpdatedOn = lastUpdatedOn;
}
public String getTotal() {
	return total;
}
public void setTotal(String total) {
	this.total = total;
}

	@Override
	public String toString() {
		return "[total=" + total + ", cured=" + cured + ", active=" + active + ", death=" + death
				+ ", lastUpdatedOn=" + lastUpdatedOn + "]";
	}
	
	
	//"total":"121608","cured":"118632","active":"1175","death":"1801","lastUpdatedOn":"19-08-2021 12:46:49 AM"}]

}

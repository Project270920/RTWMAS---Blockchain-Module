package main.entities;

public class Toilet {

	private String toiletID;

	public Toilet()	{	}
	public Toilet(String toiletID)	{
		this.toiletID = toiletID;
	}
	
	public String getToiletID() {
		return toiletID;
	}

	public void setToiletID(String toiletID) {
		this.toiletID = toiletID;
	}

	@Override
	public String toString() {
		return "Toilet [toiletID=" + toiletID + "]";
	}
}

package main.blockchain.block.header;

import main.entities.Participants;

public class Header {
	
	private int totalReports;
	private int validReports;
	private int invalidReports;
	
	private String dateAndTime;
	
	private Participants committerID;
	
	public Header()	{	}

	public Header(int totalReports, int validReports, int invalidReports,
			String dateAndTime, Participants committerID) {
		
		this.totalReports = totalReports;
		this.validReports = validReports;
		this.invalidReports = invalidReports;
		this.dateAndTime = dateAndTime;
		this.committerID = committerID;
	}


	
	public void setTotalReports(int totalReports) 				{	this.totalReports = totalReports;		}
	public void setValidReports(int validReports) 				{	this.validReports = validReports;		}
	public void setInvalidReports(int invalidReports)			{	this.invalidReports = invalidReports;	}
	public void setDateAndTime(String dateAndTime) 				{	this.dateAndTime = dateAndTime;			}
	public void setParticipantID(Participants participantID)	{	this.committerID = participantID;		}
	
	public int getTotalReports() 			{	return totalReports;	}
	public String getDateAndTime() 			{	return dateAndTime;		}
	public int getInvalidReports() 			{	return invalidReports;	}
	public int getValidReports() 			{	return validReports;	}
	public Participants getParticipantID()	{	return committerID;		}


	@Override
	public String toString() {
		return "HeaderData [totalReports=" + totalReports + ", validReports=" + validReports
				+ ", invalidReports=" + invalidReports + ", dateAndTime=" + dateAndTime 
				+ ", CommitterID=" + committerID + "]";
	}
}
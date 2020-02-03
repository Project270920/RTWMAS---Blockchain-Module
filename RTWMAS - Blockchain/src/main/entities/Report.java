package main.entities;

public class Report {

	private Employee careTakerInfo;
	private Toilet toiletInfo;
	private int dataSize;
	private String issuesDateAndTime;
	private String toiletStatus;
//	private List<EvaluatedUserFeedback> ReportList = new ArrayList<>();
	private String API;
	
	
	public void setCareTakerInfo(Employee careTakerInfo) 				{	this.careTakerInfo = careTakerInfo;			}
	public void setToiletInfo(Toilet toiletInfo) 						{	this.toiletInfo = toiletInfo;				}
	public void setToiletStatus(String toiletStatus)					{	this.toiletStatus = toiletStatus;			}
	public void setIssuesDateAndTime(String issuesDateAndTime)			{	this.issuesDateAndTime = issuesDateAndTime;	}
	public void setDataSize(int dataSize)							{	this.dataSize = dataSize;					}
//	public void setReportList(List<EvaluatedUserFeedback> reportList)	{	this.ReportList = reportList;				}
	public void setAPI(String aPI)										{	this.API = aPI;								}
	
	
	public Employee getCareTakerInfo()					{	return careTakerInfo;		}
	public Toilet getToiletInfo()						{	return toiletInfo;			}
	public String getToiletStatus()						{	return toiletStatus;		}
	public String getIssuesDateAndTime()				{	return issuesDateAndTime;	}
	public int getDataSize()							{	return dataSize;			}
//	public List<EvaluatedUserFeedback> getReportList()	{	return ReportList;			}
	public String getAPI()								{	return API;					}
	
		
		
	@Override
	public String toString() {
		return "Report [careTakerInfo=" + careTakerInfo + ", toiletInfo=" + toiletInfo + ", dataSize=" + dataSize
				+ ", issuesDateAndTime=" + issuesDateAndTime + ", toiletStatus=" + toiletStatus	+ ", API=" + API + "]";
//				+ ", ReportList="	+ ReportList

	}
}

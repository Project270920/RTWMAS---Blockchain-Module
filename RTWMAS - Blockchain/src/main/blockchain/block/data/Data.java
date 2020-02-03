package main.blockchain.block.data;

import java.util.ArrayList;
import java.util.List;

import main.entities.Employee;
import main.entities.Report;


public class Data	{
	
	private int serialNo;									//	Serial no. of Supervisor's Report
	private Employee supervisorInfo;						//	Supervisor Information
	private String reportStatus;							//	Status of Report : valid / invalid
	private List<Report> ReportList = new ArrayList<>();	//	List of Reports from different Toilets of its jurisdiction 
	
	public Data() 	{		}
	public Data(int serialNo, Employee supervisorInfo, String reportStatus, List<Report> reportList) 	{
		this.serialNo = serialNo;
		this.supervisorInfo = supervisorInfo;
		this.reportStatus = reportStatus;
		this.ReportList = reportList;
	}


	public void setSupervisorInfo(Employee supervisorInfo) 		{	this.supervisorInfo = supervisorInfo;	}
	public void setReportList(List<Report> reportList)			{	this.ReportList = reportList;			}	
	public void setSerialNo(int serialNo)						{	this.serialNo = serialNo;				}
	public void setReportStatus(String reportStatus)			{	this.reportStatus = reportStatus;		}
	
	public int getSerialNo()			{	return serialNo;			}
	public Employee getSupervisorInfo()	{	return supervisorInfo;		}
	public String getReportStatus() 	{	return reportStatus;		}
	public List<Report> getReportList() {	return ReportList;			}
	
	
	@Override
	public String toString() {
		return "Data [serialNo=" + serialNo + ", supervisorInfo=" + supervisorInfo + ", reportStatus=" + reportStatus
				+ ", ReportList=" + ReportList + "]";
	}
}
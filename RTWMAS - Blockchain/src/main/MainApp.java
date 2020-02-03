package main;

import java.util.ArrayList;
import java.util.List;

import main.blockchain.Blockchain;
import main.blockchain.block.data.Data;
import main.blockchain.block.header.Header;
import main.entities.Employee;
import main.entities.Participants;
import main.entities.Report;
import main.entities.Toilet;
import main.repo.EvaluatedUserFeedbackRepo;


public class MainApp {

	private static Participants participant1 = new  Participants(new Employee("Supervior-101","Aman"));
	private static Participants participant2 = new  Participants(new Employee("Supervior-102","Ravi"));
	private static Participants participant3 = new  Participants(new Employee("Supervior-103","Rahul"));
	
	private static Blockchain blockchain = new Blockchain();
    
	public static void main(String[] args) {
		
		participant1_network();
		participant2_network();
		participant3_network();
		
		    System.out.println("Blockchain valid   : " + blockchain.isBlockChainValid());
		    System.out.println(blockchain);
		
		System.out.println(participant1.getBlockchain());
		System.out.println(participant2.getBlockchain());
		System.out.println(participant3.getBlockchain());
	}
/*	
	public static void user1()	{
		blockchain.addBlock(blockchain.newBlock(getBlockchainHeader1(),getEmployeeData1()));
	}
	
	public static void user2()	{
		blockchain.addBlock(blockchain.newBlock(getBlockchainHeader2(),getEmployeeData2()));
	}
	
	public static void user3()	{
		blockchain.addBlock(blockchain.newBlock(getBlockchainHeader3(),getEmployeeData3()));
	}
*/	
	public static void participant1_network()	{
		participant1.subscribe(participant2);
		participant1.subscribe(participant3);
		
		participant1.setBlockchain(blockchain);
		
		participant1.getBlockchain().addBlock(participant1.getBlockchain().newBlock(getBlockchainHeader1(),getEmployeeData1()));
	}
	
	public static void participant2_network()	{
		participant2.subscribe(participant1);
		participant2.subscribe(participant3);

		participant2.setBlockchain(blockchain);
		
		participant2.getBlockchain().addBlock(participant2.getBlockchain().newBlock(getBlockchainHeader2(),getEmployeeData2()));
	}	
	
	public static void participant3_network()	{
		participant3.subscribe(participant1);
		participant3.subscribe(participant2);
		
		participant3.setBlockchain(blockchain);
		
		participant3.getBlockchain().addBlock(participant3.getBlockchain().newBlock(getBlockchainHeader3(),getEmployeeData3()));
	}
	
			public static Header getBlockchainHeader1()	{
				Header header = new Header();
					header.setTotalReports(3);
					header.setValidReports(2);
					header.setInvalidReports(1);
					header.setDateAndTime("17:40, 27-Jan-2020, Monday");
					header.setParticipantID(participant1);
					
				return header;
			}
			
			//	Data-1 (Generalized Evaluated Report of Supervisor)
			public static Data getEmployeeData1()	{
				
				List<Report> supervisorGeneralizedReport = new ArrayList<>();
					supervisorGeneralizedReport.add(getEmployeeReport11());
					supervisorGeneralizedReport.add(getEmployeeReport12());
					supervisorGeneralizedReport.add(getEmployeeReport13());
				
				Data data = new Data();
					data.setSerialNo(1);
					data.setSupervisorInfo(new Employee("Supervisor-1101","Supervisor-1"));
					data.setReportStatus("valid");
					data.setReportList(supervisorGeneralizedReport);
				
				return data;
			}
					//	Data-1, Care Taker Report-1
					public static Report getEmployeeReport11()	{
						
						EvaluatedUserFeedbackRepo reportList = new EvaluatedUserFeedbackRepo();
						
						Report report = new Report();
							report.setCareTakerInfo((new Employee("CareTaker-1011","Care Taker-1")));
							report.setToiletInfo(new Toilet("Toilet-1011"));
							report.setToiletStatus("Clean");
							report.setDataSize(reportList.getEvaluatedUserFeedbacks().size());
							report.setIssuesDateAndTime("14:00, 27-Jan-2020, Monday");
//							report.setReportList(reportList.getEvaluatedUserFeedbacks());
							report.setAPI("http://192.168.43.1:8000/Toilet1011/getAllEvaluatedUserFeedback");
		
						return report;
					}
					
					
					//	Data-1, Care Taker Report-2
					public static Report getEmployeeReport12()	{
						
						EvaluatedUserFeedbackRepo reportList = new EvaluatedUserFeedbackRepo();
						
						Report report = new Report();
							report.setCareTakerInfo((new Employee("CareTaker-1012","Care Taker-2")));
							report.setToiletInfo(new Toilet("Toilet-1012"));
							report.setToiletStatus("Clean");
							report.setDataSize(reportList.getEvaluatedUserFeedbacks().size());
							report.setIssuesDateAndTime("14:00, 27-Jan-2020, Monday");
//							report.setReportList(reportList.getEvaluatedUserFeedbacks());
							report.setAPI("http://192.168.43.1:8000/Toilet1012/getAllEvaluatedUserFeedback");
		
						return report;
					}
					
					//	Data-1, Care Taker Report-3
					public static Report getEmployeeReport13()	{
						
						EvaluatedUserFeedbackRepo reportList = new EvaluatedUserFeedbackRepo();
						
						Report report = new Report();
							report.setCareTakerInfo((new Employee("CareTaker-1013","Care Taker-3")));
							report.setToiletInfo(new Toilet("Toilet-1013"));
							report.setToiletStatus("Unclean");
							report.setDataSize(reportList.getEvaluatedUserFeedbacks().size());
							report.setIssuesDateAndTime("14:00, 27-Jan-2020, Monday");
//							report.setReportList(reportList.getEvaluatedUserFeedbacks());
							report.setAPI("http://192.168.43.1:8000/Toilet1013/getAllEvaluatedUserFeedback");
		
						return report;
					}
		
	
	
	public static Header getBlockchainHeader2()	{
		Header header = new Header();
			header.setTotalReports(3);
			header.setValidReports(2);
			header.setInvalidReports(1);
			header.setDateAndTime("17:40, 27-Jan-2020, Monday");
			header.setParticipantID(participant2);
			
		return header;
	}
	
	//	Data-1 (Generalized Evaluated Report of Supervisor)
	public static Data getEmployeeData2()	{
		
		List<Report> supervisorGeneralizedReport = new ArrayList<>();
			supervisorGeneralizedReport.add(getEmployeeReport21());
			supervisorGeneralizedReport.add(getEmployeeReport22());
			supervisorGeneralizedReport.add(getEmployeeReport23());
		
		Data data = new Data();
			data.setSerialNo(1);
			data.setSupervisorInfo(new Employee("Supervisor-1101","Supervisor-1"));
			data.setReportStatus("valid");
			data.setReportList(supervisorGeneralizedReport);
		
		return data;
	}
			//	Data-1, Care Taker Report-1
			public static Report getEmployeeReport21()	{
				
				EvaluatedUserFeedbackRepo reportList = new EvaluatedUserFeedbackRepo();
				
				Report report = new Report();
					report.setCareTakerInfo((new Employee("CareTaker-1011","Care Taker-1")));
					report.setToiletInfo(new Toilet("Toilet-1011"));
					report.setToiletStatus("Clean");
					report.setDataSize(reportList.getEvaluatedUserFeedbacks().size());
					report.setIssuesDateAndTime("14:00, 27-Jan-2020, Monday");
//					report.setReportList(reportList.getEvaluatedUserFeedbacks());
					report.setAPI("http://192.168.43.1:8000/Toilet1011/getAllEvaluatedUserFeedback");

				return report;
			}
			
			
			//	Data-1, Care Taker Report-2
			public static Report getEmployeeReport22()	{
				
				EvaluatedUserFeedbackRepo reportList = new EvaluatedUserFeedbackRepo();
				
				Report report = new Report();
					report.setCareTakerInfo((new Employee("CareTaker-1012","Care Taker-2")));
					report.setToiletInfo(new Toilet("Toilet-1012"));
					report.setToiletStatus("Clean");
					report.setDataSize(reportList.getEvaluatedUserFeedbacks().size());
					report.setIssuesDateAndTime("14:00, 27-Jan-2020, Monday");
//					report.setReportList(reportList.getEvaluatedUserFeedbacks());
					report.setAPI("http://192.168.43.1:8000/Toilet1012/getAllEvaluatedUserFeedback");

				return report;
			}
			
			//	Data-1, Care Taker Report-3
			public static Report getEmployeeReport23()	{
				
				EvaluatedUserFeedbackRepo reportList = new EvaluatedUserFeedbackRepo();
				
				Report report = new Report();
					report.setCareTakerInfo((new Employee("CareTaker-1013","Care Taker-3")));
					report.setToiletInfo(new Toilet("Toilet-1013"));
					report.setToiletStatus("Unclean");
					report.setDataSize(reportList.getEvaluatedUserFeedbacks().size());
					report.setIssuesDateAndTime("14:00, 27-Jan-2020, Monday");
//					report.setReportList(reportList.getEvaluatedUserFeedbacks());
					report.setAPI("http://192.168.43.1:8000/Toilet1013/getAllEvaluatedUserFeedback");

				return report;
			}

	
	
	
	
	
	public static Header getBlockchainHeader3()	{
		Header header = new Header();
			header.setTotalReports(3);
			header.setValidReports(2);
			header.setInvalidReports(1);
			header.setDateAndTime("17:40, 27-Jan-2020, Monday");
			header.setParticipantID(participant3);
			
		return header;
	}
	
	//	Data-1 (Generalized Evaluated Report of Supervisor)
	public static Data getEmployeeData3()	{
		
		List<Report> supervisorGeneralizedReport = new ArrayList<>();
			supervisorGeneralizedReport.add(getEmployeeReport21());
			supervisorGeneralizedReport.add(getEmployeeReport22());
			supervisorGeneralizedReport.add(getEmployeeReport23());
		
		Data data = new Data();
			data.setSerialNo(1);
			data.setSupervisorInfo(new Employee("Supervisor-1101","Supervisor-1"));
			data.setReportStatus("valid");
			data.setReportList(supervisorGeneralizedReport);
		
		return data;
	}
			//	Data-1, Care Taker Report-1
			public static Report getEmployeeReport31()	{
				
				EvaluatedUserFeedbackRepo reportList = new EvaluatedUserFeedbackRepo();
				
				Report report = new Report();
					report.setCareTakerInfo((new Employee("CareTaker-1011","Care Taker-1")));
					report.setToiletInfo(new Toilet("Toilet-1011"));
					report.setToiletStatus("Clean");
					report.setDataSize(reportList.getEvaluatedUserFeedbacks().size());
					report.setIssuesDateAndTime("14:00, 27-Jan-2020, Monday");
//					report.setReportList(reportList.getEvaluatedUserFeedbacks());
					report.setAPI("http://192.168.43.1:8000/Toilet1011/getAllEvaluatedUserFeedback");

				return report;
			}
			
			
			//	Data-1, Care Taker Report-2
			public static Report getEmployeeReport32()	{
				
				EvaluatedUserFeedbackRepo reportList = new EvaluatedUserFeedbackRepo();
				
				Report report = new Report();
					report.setCareTakerInfo((new Employee("CareTaker-1012","Care Taker-2")));
					report.setToiletInfo(new Toilet("Toilet-1012"));
					report.setToiletStatus("Clean");
					report.setDataSize(reportList.getEvaluatedUserFeedbacks().size());
					report.setIssuesDateAndTime("14:00, 27-Jan-2020, Monday");
//					report.setReportList(reportList.getEvaluatedUserFeedbacks());
					report.setAPI("http://192.168.43.1:8000/Toilet1012/getAllEvaluatedUserFeedback");

				return report;
			}
			
			//	Data-1, Care Taker Report-3
			public static Report getEmployeeReport33()	{
				
				EvaluatedUserFeedbackRepo reportList = new EvaluatedUserFeedbackRepo();
				
				Report report = new Report();
					report.setCareTakerInfo((new Employee("CareTaker-1013","Care Taker-3")));
					report.setToiletInfo(new Toilet("Toilet-1013"));
					report.setToiletStatus("Unclean");
					report.setDataSize(reportList.getEvaluatedUserFeedbacks().size());
					report.setIssuesDateAndTime("14:00, 27-Jan-2020, Monday");
//					report.setReportList(reportList.getEvaluatedUserFeedbacks());
					report.setAPI("http://192.168.43.1:8000/Toilet1013/getAllEvaluatedUserFeedback");

				return report;
			}
}

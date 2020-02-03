package main.entities;

import java.util.ArrayList;
import java.util.List;

import main.blockchain.Block;
import main.blockchain.Blockchain;
import main.entities.Participants;


public class Participants {

	private Blockchain blockchain = new Blockchain(); 
	private List<Participants> networkParticipants = new ArrayList<>();
	private Employee employee;

	
	public Participants()	{	}
	
	public Participants(Employee employee)	{
		this.employee = employee;
	}	
	
	
	public void setEmployeeInfo(Employee employee)		{	this.employee = employee;		}
	public void setBlockchain(Blockchain blockchain)	{	this.blockchain = blockchain;	}
	
	public Employee getEmployeeInfo() {		return employee;	}	
	public Blockchain getBlockchain() {		return blockchain;	}

	
	public void broadcasttoAllParticipants(Block block)	{
		this.blockchain.addBlock(this.blockchain.newBlock(block.getHeader(), block.getData()));
		for(Participants obj : this.networkParticipants)
			obj.blockchain.addBlock(this.blockchain.newBlock(block.getHeader(), block.getData()));
	}

	public void subscribe(Participants participants)	{	this.networkParticipants.add(participants);		}
	public void unSubscribe(Participants participants)	{	this.networkParticipants.remove(participants);	}
	
	
	public void displayAllParticipants()	{
		System.out.println("\tNetwork Participants of '" + this.employee.getEmpName() + "'");
		for(Participants obj : this.networkParticipants)
			System.out.println(obj);
	}
	
	public void displaySpecificParticipants(String empName, String empID)	{
		System.out.println("\tNetwork Participants of '" + this.employee.getEmpName() + "'");
		for(Participants obj : this.networkParticipants)	{
			if(obj.employee.getEmpName().equalsIgnoreCase(empName) || obj.employee.getEmpID().equals(empID))
				System.out.println(obj);
		}
	}
}

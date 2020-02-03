package main.repo;

import java.util.ArrayList;
import java.util.List;

import main.blockchain.block.data.UserFeedback;

public class UserFeedbackRepo {
private List<UserFeedback> list = new ArrayList<UserFeedback>();
	
	public UserFeedbackRepo()	{
		
		UserFeedback user1 = new UserFeedback("userID-101","Toilet-1011",true,true,false,true,false,false,true,true);
		UserFeedback user2 = new UserFeedback("userID-102","Toilet-1011",true,true,false,true,false,false,true,true);
		UserFeedback user3 = new UserFeedback("userID-103","Toilet-1011",true,true,false,true,false,false,true,true);
			
		list.add(user1);
		list.add(user2);
		list.add(user3);
	}
	
	public List<UserFeedback> getUserFeedbacks()	{
		return list;
	}
}

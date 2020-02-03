package main.repo;

import java.util.ArrayList;
import java.util.List;

import main.blockchain.block.data.EvaluatedUserFeedback;
import main.blockchain.block.data.UserFeedback;

public class EvaluatedUserFeedbackRepo {

	private List<EvaluatedUserFeedback> list = new ArrayList<EvaluatedUserFeedback>();
	
	public EvaluatedUserFeedbackRepo()	{
		
		EvaluatedUserFeedback feedbackEvaluationlist1 = new EvaluatedUserFeedback();
		EvaluatedUserFeedback feedbackEvaluationlist2 = new EvaluatedUserFeedback();
		EvaluatedUserFeedback feedbackEvaluationlist3 = new EvaluatedUserFeedback();
		
		feedbackEvaluationlist1.setPropsedUserFeedback(new UserFeedback("userID-101","Toilet-1011",true,true,false,true,false,false,true,true));
		feedbackEvaluationlist1.setActualUserFeedback(new UserFeedback("userID-101","Toilet-1011",true,true,false,true,false,false,true,true));
			list.add(feedbackEvaluationlist1);
			
		feedbackEvaluationlist2.setPropsedUserFeedback(new UserFeedback("userID-102","Toilet-1011",true,true,false,true,false,false,true,true));
		feedbackEvaluationlist2.setActualUserFeedback(new UserFeedback("userID-102","Toilet-1011",true,true,false,true,false,false,true,true));
			list.add(feedbackEvaluationlist2);
				
		feedbackEvaluationlist3.setPropsedUserFeedback(new UserFeedback("userID-103","Toilet-1011",true,true,false,true,false,false,true,true));
		feedbackEvaluationlist3.setActualUserFeedback(new UserFeedback("userID-103","Toilet-1011",true,true,false,true,false,false,true,true));
			list.add(feedbackEvaluationlist3);

	}
	
	public List<EvaluatedUserFeedback> getEvaluatedUserFeedbacks()	{
		return list;
	}
}

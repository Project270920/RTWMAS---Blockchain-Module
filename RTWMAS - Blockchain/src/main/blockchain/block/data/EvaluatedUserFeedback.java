package main.blockchain.block.data;

public class EvaluatedUserFeedback	{

	private UserFeedback propsedUserFeedback;
	private UserFeedback actualUserFeedback;

	public EvaluatedUserFeedback()		{		}

	public EvaluatedUserFeedback(UserFeedback propsedUserFeedback, UserFeedback actualUserFeedback) 	{
		
		this.propsedUserFeedback = propsedUserFeedback;
		this.actualUserFeedback = actualUserFeedback;
	}


	public void setPropsedUserFeedback(UserFeedback propsedUserFeedback)	{	this.propsedUserFeedback = propsedUserFeedback;	}
	public void setActualUserFeedback(UserFeedback actualUserFeedback)		{	this.actualUserFeedback = actualUserFeedback;	}

	public UserFeedback getActualUserFeedback()		{	return actualUserFeedback;	}
	public UserFeedback getPropsedUserFeedback()	{	return propsedUserFeedback;	}

	@Override
	public String toString() {
		return "EvaluatedUserFeedback [propsedUserFeedback=" + propsedUserFeedback + ", actualUserFeedback="
				+ actualUserFeedback + "]";
	}	
}

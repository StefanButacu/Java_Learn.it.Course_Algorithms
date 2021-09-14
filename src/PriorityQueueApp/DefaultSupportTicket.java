package PriorityQueueApp;

public class DefaultSupportTicket implements SupportTicket {

	private static int counter = 0;
	{
	
		counter++;
	}
	private Priority priority;
	private RequestType requestType;
	private  int id;
	
	DefaultSupportTicket(){
	    this.id = counter;
	    this.requestType = RequestType.OTHER;
	    this.priority =  Priority.LOW;
	    
	}
	
	DefaultSupportTicket(RequestType requestType){
		switch(requestType) {
		case OTHER:
			this.priority = Priority.LOW;
			break;
		case CHANGE_ACCOUNT_DETAILS:
			this.priority = Priority.LOW;
			break;
		case CAN_NOT_LOGIN:
			this.priority = Priority.MEDIUM;
			break;
	
		case COOPERATION:
			this.priority = Priority.MEDIUM;
			break;
		case ACCOUNT_IS_HACKED:
			this.priority = Priority.HIGH;
			break;
		case CAN_NOT_COMPLETE_PURCHASE:
			this.priority = Priority.HIGH;
			break;
		case ORDER_IS_NOT_RECEIVED:
			this.priority = Priority.HIGH;
			break;
		default:
			this.priority = Priority.LOW;
			break;
		}		
		this.requestType = requestType;
		this.id = counter;
	}	
	
	@Override
	public Priority getPriority() {
		// TODO Auto-generated method stub
		return this.priority;
	}

	@Override
	public int getSequentialNumber() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public RequestType getRequestType() {
		// TODO Auto-generated method stub
		return this.requestType;
	}

}

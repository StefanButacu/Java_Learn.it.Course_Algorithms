package PriorityQueueApp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting...");
		DefaultHelpDeskFacade srv = new DefaultHelpDeskFacade();
		DefaultSupportTicket t1 = new DefaultSupportTicket(RequestType.OTHER);
		DefaultSupportTicket t2 = new DefaultSupportTicket(RequestType.ORDER_IS_NOT_RECEIVED);
		DefaultSupportTicket t3 = new DefaultSupportTicket(RequestType.ACCOUNT_IS_HACKED);
		DefaultSupportTicket t4 = new DefaultSupportTicket(RequestType.CHANGE_ACCOUNT_DETAILS);
		DefaultSupportTicket t5 = new DefaultSupportTicket(RequestType.CAN_NOT_COMPLETE_PURCHASE);
		DefaultSupportTicket t6= new DefaultSupportTicket(RequestType.COOPERATION);
		DefaultSupportTicket t7 = new DefaultSupportTicket(RequestType.CAN_NOT_LOGIN);

		
		System.out.println(t4.getSequentialNumber());
		srv.addNewSupportTicket(t3);
		srv.addNewSupportTicket(t1);
		srv.addNewSupportTicket(t2);
		srv.addNewSupportTicket(t4);
		srv.addNewSupportTicket(t5);
		srv.addNewSupportTicket(t6);
		srv.addNewSupportTicket(t7);

		while(srv.getNumberOfTickets() > 0) {
			SupportTicket t = srv.getNextSupportTicket();
			System.out.println("id=" + t.getSequentialNumber() + "  req="+ t.getRequestType() + " pr="+ t.getPriority());
			
		}
		
	}

}

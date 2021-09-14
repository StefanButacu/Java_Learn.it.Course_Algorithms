package PriorityQueueApp;

import java.util.PriorityQueue;

public class DefaultHelpDeskFacade implements HelpDeskFacade {

	
	private PriorityQueue<SupportTicket> Q = new PriorityQueue<SupportTicket>(new TicketComparator());
	
	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		// TODO Auto-generated method stub
		Q.offer(supportTicket);

	}

	@Override
	public SupportTicket getNextSupportTicket() {
		// TODO Auto-generated method stub
		return Q.poll();
		
	}

	@Override
	public int getNumberOfTickets() {
		// TODO Auto-generated method stub
		return Q.size();
	}

}

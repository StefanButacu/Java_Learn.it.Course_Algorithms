package PriorityQueueApp;

import java.util.Comparator;



public class TicketComparator implements Comparator<SupportTicket> {

	@Override
	public int compare(SupportTicket o1, SupportTicket o2) {
		// TODO Auto-generated method stub
		if(o1.getPriority() == Priority.LOW) {
			if(o2.getPriority() == Priority.MEDIUM || o2.getPriority() == Priority.HIGH)
				return 1;
			else
				return (-1) * (o1.getSequentialNumber() - o2.getSequentialNumber());
		}
		else if(o1.getPriority() == Priority.MEDIUM) {
			if(o2.getPriority() == Priority.HIGH)
				return 1;
			else if(o2.getPriority() == Priority.LOW)
				return -1;
			else
				return (-1)*(o1.getSequentialNumber() - o2.getSequentialNumber());
			
		}
		else if(o1.getPriority() == Priority.HIGH) {
			if(o2.getPriority() == Priority.LOW || o2.getPriority() == Priority.MEDIUM)
				return -1;
			else
				return (-1)*(o1.getSequentialNumber() - o2.getSequentialNumber());
			
		}
		return 0;
	}
	

}

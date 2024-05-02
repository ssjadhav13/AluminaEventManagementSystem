package Services;
import Model.EventModel;
import Repository.EventRepsitory;

public class EventServices 
{
	EventRepsitory evRepo = new EventRepsitory();
	public int addEvent(EventModel model) 
	{
		if(evRepo.isEventPresent(model.getEname()))
		{
			return -1;
		}
		return evRepo.isAddEvent(model)?1:0;
		
	}
}

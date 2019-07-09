package services;
import homeWork.*;

public class CleaningProvider extends Provider{

	public ServiceProtocolInterface delegate; //delegate
	
	public void receiveService() {
		CleaningService cs = this.delegate.cleaningService();
		System.out.println(cs.getDescription());
	}
}
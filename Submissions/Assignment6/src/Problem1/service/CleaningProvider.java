package Problem1.service;

public class CleaningProvider {

	public CleaningServiceProtocolInterface delegate; //delegate
	
	public void receiveService() {
		CleaningService cs = this.delegate.cleaningService();
		System.out.println(cs.getDescription());
	}
}

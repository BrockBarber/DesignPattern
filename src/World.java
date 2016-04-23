
public class World {
	private static World instance = null;
	private static int acres = 0;
	private static int acresFree = 0;
	
	private World(){ 
		
	}
	public void start(){
		
	}
	public void run(){
		
	}
	public static World getInstance(){
		if(instance == null){
			instance = new World();
		}
		return instance;
	}
}

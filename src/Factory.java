
public class Factory {	
	//use getShape method to get object of type shape 
	public Animal getanimal(String Type){
		if(Type == null){
			return null;
		}		
		if(Type.equals("bear")){
			return new Animal();
		         
		} else if(Type.equalsIgnoreCase("wolf")){
			return new Animal();
		         
		} else if(Type.equalsIgnoreCase("deer")){
			return new Animal();
		} else if(Type.equalsIgnoreCase("rabbit")){
			return new Animal();
		}
			return null;
	}
	public Plant getPlant(String Type){
		if(Type == null){
			return null;
		}		
	 	if(Type.equalsIgnoreCase("grass")){
			return new Plant();
		         
		} else if(Type.equalsIgnoreCase("bush")){
			return new Plant();
		         
		} else if(Type.equalsIgnoreCase("tree")){
			return new Plant ();
		}
			return null;
	}
}
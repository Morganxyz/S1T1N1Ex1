package n1ex1Damat;

public class n1ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*El procés de càrrega d'una classe només té lloc una vegada. 
		 * Demostra que la càrrega pot ser provocada per la creació de la primera instància 
		 * d'aquesta classe o per l'accés a un membre estàtic d'aquesta. */
	

	//Demostració de cárrega de classe per instanciació
		
	InstruCorda corda0 = new InstruCorda();
	System.out.println(corda0.tocar());
	
	InstruPercu percu0 = new InstruPercu();
	System.out.println(percu0.tocar());
	
	InstruVent vent0 = new InstruVent();
	System.out.println(vent0.tocar());
	
	
	System.out.println("");
	
	//Demostració de càrrega de classe per acces a membre static
	
	System.out.println(InstruCorda.tocar2());
	System.out.println(InstruPercu.tocar2());
	System.out.println(InstruVent.tocar2());
	
	}
	
	


	

}

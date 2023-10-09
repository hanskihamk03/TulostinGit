
public class TehtavaGitTulostin {

	public static void main(String[] args) {
		
		System.out.println("Hei olen Tulostin-ohjelma"); 
		System.out.print("Ohjelman tekijä: "); 
		String tekija = "Hanna"; 
		System.out.println(tekija); 

		//
		double luku1 =5.0; 
		double luku2 =7.0;
		double tulo1 =luku1 * luku2;
		double summa = luku1 + luku2;
		double erotus = luku1 - luku2;
		double jako = luku1 / luku2;
		
		// homma toimi :) luku1 eli 5 tulostui omana muuttujan arvona 

		System.out.println("Luku1-muuttujan arvo on " + luku1); 

		System.out.println("Luku2-muuttujan arvo on " + luku2);  
 
		System.out.print(luku1 + " * " + luku2 + " = " + tulo1);

	}

}

import java.util.Scanner;

public class SecondoEsercizio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci  il mese: ");
		String mese=in.nextLine();
		switch (mese) {
		  case "Gennaio":
		    System.out.println(""+mese+" ha 31 giorni!");
		    break;
		  case "Febbraio":
		    System.out.println(""+mese+" ha 28 giorni!");
		    break;
		  case "Marzo":
		    System.out.println(""+mese+" ha 31 giorni!");
		    break;
		  case "Aprile":
		    System.out.println(""+mese+" ha 30 giorni!");
		    break;
		  case "Maggio":
		    System.out.println(""+mese+" ha 31 giorni!");
		    break;
		  case "Giugno":
		    System.out.println(""+mese+" ha 30 giorni!");
		    break;
		  case "Luglio":
		    System.out.println(""+mese+" ha 31 giorni!");
		    break;
		  case "Agosto":
			    System.out.println(""+mese+" ha 31 giorni!");
			    break;
		  case "Settembre":
			    System.out.println(""+mese+" ha 30 giorni!");
			    break;
		  case "Ottobre":
			    System.out.println(""+mese+" ha 31 giorni!");
			    break;
		  case "Novembre":
			    System.out.println(""+mese+" ha 30 giorni!");
			    break;
		  case "Dicembre":
			    System.out.println(""+mese+" ha 31 giorni!");
			    break;
			    default: 
			    	 System.out.println("Errore!");
			    	 break;
		}
		
		in.close();
		
		
		}

}

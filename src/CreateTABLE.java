import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class CreateTABLE {
	
	Scanner scan = new Scanner(System.in);
	
	private String Nume_Tab;
	private String Nume_Atr[] = new String[20];
	private String Tip_Data [] = new String[20];
	private int NumarInregistrari;
	private int NumarAtribute;
	private int Something[] = new int[20];
	
	

	public int getNumarAtribute() {
		
		System.out.print("Introduceti NUMARUL DE ATRIBUTE: ");
		NumarAtribute = scan.nextInt();
		
		return NumarAtribute;
		
	}	
	
	
	public int getNumarInregistrari() {
		
		System.out.print("Introduceti NUMARUL DE INREGISTRARI : ");
		NumarInregistrari = scan.nextInt();
		
		return NumarInregistrari;
		
	}	
	

	public void Variante() { 
		System.out.println("1. Nume" );
		System.out.println("2. Prenume" );
		System.out.println("3. Adresa" );
		System.out.println("4. Nr_Telefon" );
		System.out.println("5. IDNP" );
		System.out.println("6. Salariu" );
		System.out.println("7. Suma" );
		System.out.println("8. Email" );
		System.out.println("9. Varsta" );
		System.out.println("10. Varianta ta" );
	}
	
	
	public void Variante2() {
		 System.out.println("Introduceti tipul de date: ");
         System.out.println("1. int ");
         System.out.println("2. nchar(20) " );
         System.out.println("3. date" );
         System.out.println("4. money" );
         System.out.println("5. Varianta ta" );
	}
	
	
	public void Creare() {
		
		System.out.print("Introduceti NUMELE TABELULUI :  "); 
		Nume_Tab = scan.nextLine();
		
		int n = getNumarAtribute();
		getNumarInregistrari();
		
		for(int i=1; i<=n; i++) {
		
			Variante();
			System.out.print("Introduceti varianta: ");
			int data = scan.nextInt();
			
			switch (data) {
			  case 1:
				  Nume_Atr[i]="Nume";
				  Tip_Data[i]="nchar(20)";
				  Something[i] = 1;
				  	break;
			  case 2:
				  Nume_Atr[i]="Prenume";
				  Tip_Data[i]="nchar(20)";
				  Something[i] = 2;
				    break;
			  case 3:
				  Nume_Atr[i]="Adresa";
				  Tip_Data[i]="nchar(20)";
				  Something[i] = 3;
				    break;
			  case 4:
				  Nume_Atr[i]="Nr_Telefon";
				  Tip_Data[i]="int";
				  Something[i] = 4;
				    break;
			  case 5:
				  Nume_Atr[i]="IDNP";
				  Tip_Data[i]="bigint UNIQUE";
				  Something[i] = 5;
				    break;
			  case 6:
				  Nume_Atr[i]="Salariu";
				  Tip_Data[i]="int";
				  Something[i] = 6;
				    break;
			  case 7:
				  Nume_Atr[i]="Suma";
				  Tip_Data[i]="int";
				  Something[i] = 7;
				    break;
			  case 8:
				  Nume_Atr[i]="Email";
				  Tip_Data[i]="nchar(25)";
				  Something[i] = 8;
				    break;
			  case 9:
				  Nume_Atr[i]="Varsta";
				  Tip_Data[i]="int";
				  Something[i] = 9;
				    break;	    
			  case 10:
				  System.out.print("Introduceti [ numele atributului ]: "); 
				  Nume_Atr[i] = scan.nextLine();
				  Variante2();
		          int data2 = scan.nextInt();
		            
		          switch (data2) {
		              case 1:
		                  Tip_Data[i]="int";
		                    break;
		              case 2:
		                  Tip_Data[i]="nchar(20)";
		                    break;
		              case 3:
		                  Tip_Data[i]="date";
		                    break;
		              case 4:
		                  Tip_Data[i]="money";
		                    break;
		              case 5:
		            	  System.out.print("Introduceti [ tipul de date ]: "); 
						  Tip_Data[i] = scan.nextLine();
		                    break;
		            }
				    break;
				}
			System.out.println(); 
		}
	}
	
	
	public void Afisare() {
		
		int n = NumarAtribute;
		String spatiu1 ="       ";
		String spatiu2 ="        ";
		
		System.out.println("____________________________________________________");
		System.out.println();
		
		System.out.println("CREATE TABLE " + Nume_Tab );
		System.out.print("(" + spatiu1);
		System.out.print("ID_" + Nume_Tab);
		System.out.println(" int PRIMARY KEY,");
		
		
		for(int i=1; i<=n; i++) {

			System.out.print(spatiu2 + Nume_Atr[i] + " " + Tip_Data[i] );
			if(i != n) {
				System.out.println(",");
			}
			else { 
				System.out.println();
				System.out.println(spatiu2 + ")");
				System.out.println("GO");
				System.out.println();
			}
		}
	}

	
	public void Inserare() {
		
		int n = NumarAtribute;
		
		System.out.print("INSERT INTO " + Nume_Tab + " (");
		for(int i=1; i<=n; i++) {
			System.out.print( Nume_Atr[i]);
			if(i != n) {
				System.out.print(", ");
			}
			else 
				System.out.println(") VALUES");
		}
	}
	
	
	public void TestInserare() {
		
		String[] Nume = {
				 "Popa", "Popescu", "Radu", "Sandu", "Melnic", "Moara", "Comoara", "Inger", "Aripa", "Vasla", "Simion", "Fluturas", "Animal",
				 "Munteanu", "Coatu", "Calin", "Lascu", "Mariut", "Moraru", "Magaru", "Oaie", "Bou", "Coi", "Banana", "Papagal", "Suc",
				 "Bat", "Stici", "Lungu", "Schitco", "Varga", "Corovai", "Cimpoi", "Mouse", "Ananas", "Soimu", "Nastase", "Inima", "Sula",
				 "Bacioi", "Ceai", "Chitic", "Borcan", "Cioban", "Ahot", "Slovac", "Vanatoru", "Activ", "Dodon", "Bidon", "Berbedeu", "Verdeata",
				 "Baraboi", "Didian", "Cazacu", "Cernat", "Druta", "Enache", "Epureanu", "Vulpe", "Florea", "Sotir", "Zefir", "Floare", "Musteata"
				 };
		
		
		String[] Prenume = {
				"Alex", "Sanda", "Alina", "Maria", "Ion", "Vasile", "Anton", "Lena", "Valentina", "Calin", "Teofil",
				"Dumitru", "Tima", "Andrei", "Daniel", "Alina", "Valeriu", "Mihai", "Daniela", "Sorin", "Liviu",
				"Aurel", "Elena", "Carmen", "Cristi", "Cristina", "Mircea", "Paul", "Paula", "Bogdan", "Danuta",
				"Bogdana", "Aida", "Aid", "Alexandru", "Alexandra", "Cornel", "Grigorie", "Cornelia", "Ioan", "Dragos"
				};
		
		
		
		String[] Adresa = {"Frumoasa", "str.Muncesti", "str.Independentei", "str.Hristo Botev", "str.Trandafirilor", "str.Cetatea Alba", 
				"str.Botanica Veche", "str.Zelinski", "str.Independentei", "str.Diminetii", "str.Muncesti", "str.Vasile Lupu", "str.Alba – Iulia",  
				"sos.Balcani", "str.Nicolae Costin", "str.Paris", "str.Pelivan", "str.Ion si Doina Aldea – Teodorivici", "str.Igor Vieru",
				"str.Ion Creanga", "str.Ion Neculce", "str.Alexandrescu", "str.Calea Iesilor", "str.Liviu Deleanu",  "Piata Unirii Principatelor",   
				"bd.C. Negruzzi", "bd.Dumitru Cantemir", "str.Vasile Alecsandri", "sos.Hancesti", "str.Gheorghe Asachi", "str.Ismail", 
				"str.Lech Kaczinsky", "str.Academiei", "str.Drumul Viilor", "str.Sciusev", "str.Ialoveni", "str.Dokuceaev", "str.Cahul",  
				"str.Albisoara", "bd.Moscovei", "str.Bogdan – Voievod", "str.M. Basarab", "str.Dimo", "str.Miron Costin", "str.Gradinilor",    
				"str.Studentilor", "str.Gh. Madan", "str.Pajurii", "str.Albisoara", "bd.Grigorie Vieru", "str.Aerodromului", "str.Puskin",   
				"str.Mircesti", "str.Milescu Spatarul", "str.Petru Zadnipru", "str.Mihai Sadoveanu", "str.Alexei Russo", "str.Ginta Latina",        
				"str.Voluntarilor", "str.Miron Dragan", "str.Nicolae Zelinski", "str.Academiei", "bd.Cuza-Voda", "str.Drumul Crucii",  
				"bd.Mircea cel Batran", "Aleea Alexandru", "bd.Aliorului", "Aleea Antonescu Petre", "Aleea Apahida", "bd.Argedava", "bd.Iurie Gagarin",
				"bd.Arinis", "Aleea Buridava", "str.Buteica Marius Emanoil", "bd.Arinii Dornei", "Aleea Buhusi", "bd.Bradisului", "str.Miron Costin", 
				"str.Arubium", "Aleea Arutela", "str.Avrig", "Aleea Bacau", "str.Baia de Aries","bd.Baiculesti", "str.Baiut","Aleea Banul Udrea", 
				"str.Baraganu","bd.Barajul Bicaz", "Aleea Barajul Bistr.itei", "str.Barajul Cucuteni", "str.Barajul Dunarii", "bd.Barajul Iezeru", 
				"Aleea Barajul Lotru", "bd.Barajul Rovinari", "str.Barajul Sadului", "str.Barajul Uzului", "Aleea Barbatesti", "Aleea Ariesul Mare", 
				"bd.Barsanesti","str.Berevoiesti","Aleea Bistricioara", "str.Blajel", "str.Botorani", "Aleea Botta Emil", "str. Gheorghe Nicolae", 
				"str.Bran", "str.Brasoveni", "Aleea Bratescu Constantin", "str.Buchetului", "Aleea Bucsenesti", "str.Budacu", "str.Bujoreni"
				};
		

		int n = NumarAtribute;

		
		for(int i=1; i<=n; i++) {
				
			if ( Something[i] == 1) 
				System.out.print(getRandomElements(Nume));

			else if ( Something[i] == 2) 
				System.out.print(getRandomElements(Prenume));			
				
			else if ( Something[i] == 3)
				System.out.print(getRandomAdress(Adresa));
			
			else if ( Something[i] == 4)
				System.out.print(getRandomPhone());
			
			else if ( Something[i] == 5)
				System.out.print(getRandomINDP());
			
			else if ( Something[i] == 6)
				System.out.print(getRandomSum());
			
			else if ( Something[i] == 7)
				System.out.print(getRandomSum());
			
			else if ( Something[i] == 8)
				System.out.print(getAlphaNumericString());
			
			else if ( Something[i] == 9)
				System.out.print(getRandomAge());
			
			else if ( Something[i] == 10)
				System.out.print("UNDER DEVELOPEMENT");
			
		
			if(i != n) {
				System.out.print(", ");
			}
			else 
				System.out.print(")");
		}
		
	
	}
	
	
	public void TestInserare2() {
		

		Inserare();
		
		for(int i=1; i<=NumarInregistrari; i++) {
			
			System.out.print("  (" + i + ", ");
			
			TestInserare();
			
			if(i != NumarInregistrari) {
				System.out.println(",");
			}
			else 
				System.out.println();
		}
		
		System.out.println("GO");
	}
	
	
	public static String getRandomElements(String[] Array) {
		
		Random R = new Random();
		
		int RandomElement = R.nextInt(Array.length);
		
		String Output = "'" + Array[RandomElement] + "'";
		
		return Output;
	}
	
	
	public static String getRandomPhone() {
		
		
		Random random = new Random();
		
		//random.nextInt(Biggest - Lower-1) + Lower;
		int FirstPart = random.nextInt(7 - 5) + 6;          // Random number between 7 and 6
		int SecondPart = random.nextInt(9 - 7) + 8;			// Random number between 9 and 8
	    int num = random.nextInt(899999) + 100000;			// Random number consists 6 digits
	    
	    String Final = "0" + FirstPart + SecondPart + num;
	       
	    
	    return Final;
	}
	
	
	public static String getRandomINDP() {
		
		// Length of number indicates the number of digits
		// 10000 <= n <= 99999  -- 5 digits	
		
		// Random number 7 digits
		int Number = (int)((Math.random() * 9000000)+100000);
	
		String FinalString = "200500" + Number;	
		
		return FinalString;
	}
	
	
	public static String getRandomAdress(String[] Array) {
			
		Random R = new Random();
		int RandomElement = R.nextInt(Array.length);
		int NumberAdress = R.nextInt(150);
		
		String Adress = "'" + Array[RandomElement] + " " + NumberAdress + "'";
		
		return Adress;
	}

	
	public static String getRandomSum() {
		
		Random random = new Random();
		
		// Generates a random number between 1 and 4 for probability
		int Condition = random.nextInt(4) + 1;
		
		int FirstDigit = 0;
		int SecondDigit = 0;
		
		//  75% that FirstDigit is a number of 1 
		if(Condition != 4) {
			FirstDigit = random.nextInt(8) + 2; // Number between 2 and 9	
				// 66% 
				if(Condition<=2)  // Second number will be from 1 to 9 [ 66, 73, 42] + 00
					SecondDigit = random.nextInt(9) + 1;
				// 33% probability that this number will contain just first digit, and second will be 0    [40, 50, 60, 70] + 00
				else  
					SecondDigit = 0;
		}
		// 25% that FirstDigit consists a number of 2
		else
			FirstDigit = random.nextInt(75) + 1;
		
		// The final result
		String Suma = FirstDigit + "" + SecondDigit + "00";
		
		return Suma;
	}
		
	
    public static String getAlphaNumericString() { 
    	
    	int n = 7;
    	
        // length is bounded by 256 Character 
        byte[] array = new byte[256]; 
        new Random().nextBytes(array); 
  
        String randomString = new String(array, Charset.forName("UTF-8")); 
  
        // Create a StringBuffer to store the result 
        StringBuffer r = new StringBuffer(); 
  
        // Append first 20 alphanumeric characters 
        // from the generated random String into the result 
        for (int k = 0; k < randomString.length(); k++) { 
  
            char ch = randomString.charAt(k); 
            																		//  To add big characters in the String
            if (((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))              // || (ch >= 'A' && ch <= 'Z') 
            		&& (n > 0)) {
                r.append(ch); 
                n--; 
            } 
        } 
        
        String result = "";
        
        Random random = new Random();
		
		int Condition = random.nextInt(2) + 1;
		
			if(Condition == 1)
				result = "'" + r.toString() + "@mail.ru'";
			else 
				result = "'" + r.toString() + "@gmail.com'";
			

        return result;     
    } 
 
	
	public static int getRandomAge() {
		
		Random random = new Random();
		int Age = random.nextInt(45 - 18) + 18;
		
		return Age;
	}
	
	
	
	
	
	
}

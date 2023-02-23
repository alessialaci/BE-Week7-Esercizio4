import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import it.epicodealessia.adapter.DataSource;
import it.epicodealessia.adapter.Info;
import it.epicodealessia.adapter.InfoAdapter;
import it.epicodealessia.adapter.UserData;
import it.epicodealessia.composite.Autore;
import it.epicodealessia.composite.Libro;
import it.epicodealessia.composite.Sezione;
import it.epicodealessia.composite.Sottosezione;

public class Main {

	public static void main(String[] args) {
		System.out.println("Design Pattern: Adapter");
		adapter();
		
		System.out.println("------------------------");
		
		System.out.println("Design Pattern: Composite");
		composite();
	}
	
	public static void adapter() {
		Info i = new Info("Alessia", "Lacitignola", LocalDate.of(1998, 3, 21));
		UserData ud = new UserData();
		DataSource dataSource = new InfoAdapter(i);
		
		ud.getData(dataSource);
	}

	public static void composite() {
		Autore a1 = new Autore("Mario", "Rossi");
		Autore a2 = new Autore("Luigi", "Verdi");
		Autore a3 = new Autore("Anna", "Neri");
		
		List<Autore> autori = new ArrayList<>(Arrays.asList(a1, a2, a3));
		
		Sottosezione ss1 = new Sottosezione(15);
		Sottosezione ss2 = new Sottosezione(11);
		Sottosezione ss3 = new Sottosezione(12);
		Sottosezione ss4 = new Sottosezione(20);
		Sottosezione ss5 = new Sottosezione(18);
		Sottosezione ss6 = new Sottosezione(19);
		
		List<Sottosezione> sottosezioni1 = new ArrayList<>(Arrays.asList(ss1, ss2));
		List<Sottosezione> sottosezioni2 = new ArrayList<>(Arrays.asList(ss3, ss4));
		List<Sottosezione> sottosezioni3 = new ArrayList<>(Arrays.asList(ss5, ss6));
		
		Sezione s1 = new Sezione(sottosezioni1);
		Sezione s2 = new Sezione(sottosezioni2);
		Sezione s3 = new Sezione(sottosezioni3);
		
		List<Sezione> sezioni = new ArrayList<>(Arrays.asList(s1, s2, s3));
		
		Libro l1 = new Libro(autori, 15, sezioni);
		
		//ss1.stampa();
		//s1.stampa();
		l1.stampa();
	}
	
}

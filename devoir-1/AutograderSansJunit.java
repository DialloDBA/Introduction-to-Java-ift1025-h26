public class AutograderSansJunit {

	public static void main(String[] args) {
		testAgrandirTableauNull();
		testAgrandirTableauTaille1();
		testAgrandirTableauTaille3();
		testAgrandirTableauUneCaseMemeContenu();
		testAgrandirTableauAjouterNouvelElement();
	}

	public static void success(String nomDeTest) {
		System.out.println("Test " + nomDeTest + " reussi.");
	}

	public static void echec(String nomDeTest) {
		System.err.println("Test " + nomDeTest + " echoue!");
	}

	public static void testAgrandirTableauNull() {
		if (Tabulateur.agrandirTableau(null) == null)
			success("testAgrandirTableauNull");
		else
			echec("testAgrandirTableauNull");
	}

	public static void testAgrandirTableauTaille1() {
		String[] a = new String[1];
		String[] b = Tabulateur.agrandirTableau(a);
		if (b.length == a.length + 1)
			success("testAgrandirTableauTaille1");
		else
			echec("testAgrandirTableauTaille1");
	}

	public static void testAgrandirTableauTaille3() {
		String[] a = new String[3];
		String[] b = Tabulateur.agrandirTableau(a);
		if (b.length == a.length + 1)
			success("testAgrandirTableauTaille3");
		else
			echec("testAgrandirTableauTaille3");
	}

	public static void testAgrandirTableauUneCaseMemeContenu() {
		String[] a = new String[3];
		a[0] = "Java";
		a[1] = "est";
		a[2] = "en Indonesie";
		String[] b = Tabulateur.agrandirTableau(a);
		if (b[2].equals("en Indonesie"))
			success("testAgrandirTableauUneCaseMemeContenu");
		else
			echec("testAgrandirTableauUneCaseMemeContenu");
	}

	public static void testAgrandirTableauAjouterNouvelElement() {
		String[] a = new String[3];
		a[0] = "Java";
		a[1] = "est";
		a[2] = "en Indonesie";
		String[] b = Tabulateur.agrandirTableau(a);
		if (b[3] == null)
			success("testAgrandirTableauAjouterNouvelElement");
		else
			echec("testAgrandirTableauAjouterNouvelElement");
	}
}

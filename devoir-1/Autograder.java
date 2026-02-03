import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Autograder {

	@Test
	public void testAgrandirTableauNull() {
		assertNull(Tabulateur.agrandirTableau(null));
	}

	@Test
	public void testAgrandirTableauTaille1() {
		String[] a = new String[1];
		String[] b = Tabulateur.agrandirTableau(a);
		assertTrue(b.length == a.length + 1);
	}

	@Test
	public void testAgrandirTableauTaille3() {
		String[] a = new String[3];
		String[] b = Tabulateur.agrandirTableau(a);
		assertTrue(b.length == a.length + 1);
	}

	@Test
	public void testAgrandirTableauUneCaseMemeContenu() {
		String[] a = new String[3];
		a[0] = "java";
		a[1] = "est";
		a[2] = "en";
		String[] b = Tabulateur.agrandirTableau(a);
		assertTrue(b[2].equals("en"));
	}

	@Test
	public void testAgrandirTableauAjouterNouvelElement() {
		String[] a = new String[3];
		a[0] = "java";
		a[1] = "est";
		a[2] = "en Indonesie";
		String[] b = Tabulateur.agrandirTableau(a);
		assertNull(b[3]);
	}
}

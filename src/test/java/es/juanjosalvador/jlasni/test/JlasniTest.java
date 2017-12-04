package es.juanjosalvador.jlasni.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import es.juanjosalvador.jlassni.JLasni;


public class JlasniTest {

	private static JLasni jlasni;
	
	private static Map<String,String> mapaRespuestas;
	
	static {
		mapaRespuestas= new HashMap<String, String>();
		mapaRespuestas.put("ROTO", "Hola me he roto :D");
		mapaRespuestas.put("PECHOTE", "Me pica un pechote (????)");
		mapaRespuestas.put("BOTONACO", "Aquí ­ va un BOTONACO");
		mapaRespuestas.put("GUAPISIMO", "Guapisimo xDDDDDDDDDDDDD");
		mapaRespuestas.put("APASTAR", "A PASTAR");
		mapaRespuestas.put("CROQUETA", "Me he roto *huye haciendo la croqueta*");
		mapaRespuestas.put("HIPAZO", "HIPAZO.");
		mapaRespuestas.put("OTP", "DobleJota OTP.");
		mapaRespuestas.put("MEIGNORA", "%s me ignora (????)");
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		jlasni=new JLasni();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testRoto() {
		assertSame(mapaRespuestas.get("ROTO"), jlasni.roto());
	}

	@Test
	public void testPechote() {
		assertSame(mapaRespuestas.get("PECHOTE"), jlasni.pechote());
		jlasni.pechote();
	}

	@Test
	public void testMeIgnora() {
		String freakviking = "@FreakViking";
		assertEquals(String.format(mapaRespuestas.get("MEIGNORA"), freakviking),jlasni.meIgnora(freakviking));
	}

	@Test
	public void testBotonaco() {
		assertSame(mapaRespuestas.get("BOTONACO"), jlasni.botonaco());
	}

	@Test
	public void testGuapisimo() {
		assertSame(mapaRespuestas.get("GUAPISIMO"),jlasni.guapisimo());
	}

	@Test
	public void testFelicidad() {
		String msg = jlasni.felicidad();
		assertTrue(msg.startsWith("asdf"));
		for(char letter: msg.toCharArray()) {
			if(!Character.isLetter(letter))
				fail("no hay felicidad");
		}
	}

	@Test
	public void testAPastar() {
		assertSame(mapaRespuestas.get("APASTAR"), jlasni.aPastar());
	}

	@Test
	public void testCroqueta() {
		assertSame(mapaRespuestas.get("CROQUETA"), jlasni.croqueta());
	}

	@Test
	public void testOtp(){
		assertSame(mapaRespuestas.get("OTP"), jlasni.otp());
	}
	
	@Test
	public void testHipazo(){
		assertSame(mapaRespuestas.get("HIPAZO"),jlasni.hipazo());
	}
}

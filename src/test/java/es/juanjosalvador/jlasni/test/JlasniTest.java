package es.juanjosalvador.jlasni.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import es.juanjosalvador.jlassni.JLasni;

public class JlasniTest {

	private static JLasni jlasni;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		jlasni=new JLasni();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testRoto() {
		jlasni.roto();
	}

	@Test
	public void testPechote() {
		jlasni.pechote();
	}

	@Test
	public void testMeIgnora() {
		jlasni.meIgnora("@FreakViking");
	}

	@Test
	public void testBotonaco() {
		jlasni.botonaco();
	}

	@Test
	public void testGuapisimo() {
		jlasni.guapisimo();
	}

	@Test
	public void testFelicidad() {
		jlasni.felicidad();
	}

	@Test
	public void testAPastar() {
		jlasni.aPastar();
	}

	@Test
	public void testCroqueta() {
		jlasni.croqueta();
	}

	@Test
	public void testOtp(){
		jlasni.otp();
	}
	
	@Test
	public void testHipazo(){
		jlasni.hipazo();
	}
}

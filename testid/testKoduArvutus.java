import org.junit.*;
import static org.junit.Assert.*;
public class testKoduArvutus{
	@Test
    public void kiiruseTest(){
		assertEquals(5.0, testKodu.kiirus(5, 1), 0.01);
		assertEquals(255.0, testKodu.kiirus(85, 3), 0.01);
	}	/*
	@Test
	public void kytuseTest(){
		assertEquals(14, testKodu.kytusk(200), 0.01);
		assertEquals(4.9, testKodu.kytusk(70), 0.01);
	}*/
}
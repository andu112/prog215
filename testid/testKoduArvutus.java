import org.junit.*;
import static org.junit.Assert.*;
public class ArvutusteTestid{
	@Test
    public void kiiruseTest(){
		assertEquals(5.0, testKodu.kiirus(5, 1), 0.01);
		assertEquals(255.0, testKodu.kiirus(85, 3), 0.01);
	}	
	//Koostage testfunktsioon kauguse leidmiseks kahe koordinaadipaari vahel tasandil
	//Loo tegelik funktsioon tulemuse arvutamiseks, kĆ¤ivita testi kaudu.
	@Test
	public void kytuseTest(){
		assertEquals(14, testKodu.kytusk(200), 0.01);
		assertEquals(4.9, testKodu.kytusk(70), 0.01);
	}
}
/*
jaagup@tigu:~/public_html/15/prog215/testid$ javac -cp .:junit-4.12.jar ArvutusteTestid.java
jaagup@tigu:~/public_html/15/prog215/testid$ java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ArvutusteTestid
JUnit version 4.12
.
Time: 0.053

OK (1 test)
*/
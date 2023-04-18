package metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculMensualiteTest {
    private ICredit metier = new ImplCredit();

//    @BeforeAll
//    public void setUp() throws Exception{
//        metier = new ImplCredit();
//    }
@Test
    void CalculMensualite(){
    Assertions.assertEquals(0, 1);
}
@Test
public void TestCalcul(){
        double resultatAttendu =33741.94505;
        double resulCalcul = metier.CalculMensualite(20000, 240, 4.5);
        Assertions.assertEquals(resultatAttendu, resulCalcul, 0.0001);
}

}

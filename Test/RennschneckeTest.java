import org.junit.Test;

import static org.junit.Assert.*;

public class RennschneckeTest {

    Rennschnecke schnecke1 = new Rennschnecke("peter","affe",4,5);

    @Test
    public void kriecheTest(){
        assertEquals(0,schnecke1.krieche(0));
    }
}
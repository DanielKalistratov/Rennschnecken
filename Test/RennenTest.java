import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RennenTest {

    ArrayList<Rennschnecke> schnecken = new ArrayList<Rennschnecke>();
    Rennen rennen = new Rennen("test", schnecken, 15);
    Rennschnecke schnecke1 = new Rennschnecke("peter", "test", 7, 0);
    Rennschnecke schnecke2 = new Rennschnecke("Mauer", "haus", 8, 3);
    Rennschnecke schnecke3 = new Rennschnecke("Amphi", "king", 9, 9);
    Rennschnecke schnecke4 = new Rennschnecke("olaf", "peter", 4, 18);
    @Test
    public void addRennschneckeTest(){
        assertFalse(schnecken.contains(schnecke1));
        rennen.addRennschnecke(schnecke1);
        assertTrue(schnecken.contains(schnecke1));
        assertEquals(schnecke1, rennen.getSchnecken().get(0));
    }

    @Test
    public void removeRennschneckeTest(){
        rennen.addRennschnecke(schnecke1);
        rennen.removeRennschnecke("peter");
        assertFalse(schnecken.contains(schnecke1));
    }
    @Test
    public void ermittleGewinnerTest(){
        rennen.addRennschnecke(schnecke1);
        rennen.addRennschnecke(schnecke2);
        rennen.addRennschnecke(schnecke3);
        assertNull(rennen.ermittleGewinner());
        rennen.addRennschnecke(schnecke4);
        assertEquals(schnecke4, rennen.ermittleGewinner());
    }
    @Test
    public void lassSchneckenKriechenTest(){
        assertFalse(schnecken.contains(schnecke1.zurückgelegterweg));

    }

}
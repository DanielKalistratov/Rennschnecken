import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Rennschnecke schnecke3 = new Rennschnecke("Amphi", "king", 9, 9);
        Rennschnecke schnecke4 = new Rennschnecke("olaf", "peter", 4, 18);
        ArrayList<Rennschnecke> schnecken = new ArrayList<Rennschnecke>();
        Rennen rennen = new Rennen("test", schnecken, 15);

        rennen.addRennschnecke(schnecke3);
        rennen.addRennschnecke(schnecke4);


        rennen.ermittleGewinner();



    }
}

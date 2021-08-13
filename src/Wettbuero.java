import java.util.ArrayList;

public class Wettbuero {

    private Rennen rennen;
    private ArrayList<Wette> wetten;
    double multiplikator;


    public Wettbuero(Rennen rennen, double multiplikator)
    {
        if (multiplikator < 0)
        {
            throw new IllegalArgumentException("Es dürfen keine Negativen Wetten abgeschlossen werden!");
        }

        this.rennen = rennen;
        this.multiplikator = multiplikator;
        this.wetten = new ArrayList<Wette>();
    }

    public void wetteAnnehmen(String schneckenname, double wetteinsatz, String spielername)
    {
        wetten.add(new Wette(schneckenname, wetteinsatz, spielername));
    }

    public void Wette() {
        String Wette;
    }

    public void rennendurchfuehren(){
        this.rennen.durchfuehren();
    }

    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("Renen:\n");
        s.append(this.rennen);
        s.append("Wetten:\n");

        if (wetten.size() > 0)
        {
            for (Wette wette : this.wetten)
            {
                s.append(wette);
                s.append("\n");
            }
        }
        else
        {
            s.append("keine Wette vorhanden");
        }

        return s.toString();
    }
    public void print() {
        StringBuilder s = new StringBuilder();

        s.append("Wettbüro für:\n");
        s.append(this.rennen.toString());
        s.append("Wetten:\n");

        if (wetten.size() > 0)
        {
            for (Wette bet : this.wetten)
            {
                s.append(bet);
                s.append("\n");
            }
        }
        else
        {
            s.append("(keine)");
        }

        System.out.println(s.toString());
    }


}

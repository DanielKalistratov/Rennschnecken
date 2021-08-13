import java.util.ArrayList;

public class Rennen {
    String namevrennen;
    int schneckenanzahl;

    public ArrayList<Rennschnecke> getSchnecken() {
        return schnecken;
    }

    public void setSchnecken(ArrayList<Rennschnecke> schnecken) {
        this.schnecken = schnecken;
    }

    private ArrayList<Rennschnecke> schnecken;
    int strecke;

    public Rennen(String namevrennen,ArrayList<Rennschnecke> schnecken,int strecke){
        this.namevrennen = namevrennen;
        this.schnecken = schnecken;
        this.schneckenanzahl = schnecken.size();
        this.strecke = strecke;
    }

    public void printInformation(){
        System.out.println("Name der Strecke: "+this.namevrennen +"Schneckenanzahl: "+ this.schneckenanzahl +"Strecke in Meter: " +this.strecke);
    }

    public void addRennschnecke(Rennschnecke neueSchnecke){
        if (this.schnecken.contains(neueSchnecke))
        {
            throw new ArrayStoreException("Diese Schnecke ist schon im Rennen");
        }
       else {
            schnecken.add(neueSchnecke);
        }
    }

    public void removeRennschnecke(String name){
        for (int i = 0; i < schnecken.size(); i++) {
            if (name.equals(schnecken.get(i).name)){
                schnecken.remove(schnecken.get(i));
            }
        }
    }

    public String toString(){
        return String.format("NamevomRennen: %s Schneckenanzahl: %s Strecke: %s Schnecken: %s", namevrennen,schneckenanzahl,strecke,schnecken);
    }
    public int getstrecke() {
        return strecke;
    }

    public Rennschnecke ermittleGewinner() {
        for (int i = 0; i < schnecken.size(); i++) {
            if (schnecken.get(i).zurückgelegterweg > strecke) {
                return schnecken.get(i);
            }
        }
        return null;
    }

    public void lassSchneckenKriechen(){
        for (int i = 0; i < schnecken.size(); i++) {
            schnecken.get(i).krieche(2);
        }
    }
    public void durchfuehren(){
        while (ermittleGewinner() == null){
            lassSchneckenKriechen();

        }
    }


}

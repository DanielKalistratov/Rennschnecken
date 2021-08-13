public class Rennschnecke {
    String name;
    String rasse;
    int maximalgeschwindigkeit;
    int zurückgelegterweg;


    public Rennschnecke(String name, String rasse, int maximalgeschwindigkeit, int zurückgelegterweg) {
        this.name = name;
        this.rasse = rasse;
        this.maximalgeschwindigkeit = maximalgeschwindigkeit;
        this.zurückgelegterweg = zurückgelegterweg;
    }

    public int krieche(int zufallstreck) {
        if (zufallstreck < maximalgeschwindigkeit && zufallstreck > 0) {
            return (int) (Math.random() * 5);
        }
        return 0;
    }
//        public String toString(){
//            return String.format("Name: %s Rasse: %s Maximalgeschwindingkeit: %s zurückgelegterweg: %s" ,name,rasse,maximalgeschwindigkeit, zurückgelegterweg);
//        }
}

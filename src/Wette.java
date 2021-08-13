public class Wette {

        private String spielerName;
        private String schneckenName;
        private double wetteinsatz;

        public Wette(String schneckenName, double wetteinsatz, String spielerName)
        {
            if (wetteinsatz < 0)
            {
                throw new IllegalArgumentException("Es darf kein Wetteinsatz unter 0 geben");
            }

            this.spielerName = spielerName;
            this.schneckenName = schneckenName;
            this.wetteinsatz = wetteinsatz;
        }
        public String toString()
        {
            return this.spielerName + ":" + this.wetteinsatz + "@" + this.schneckenName;
        }

        public String getSpielername()
        {
            return spielerName;
        }


        public String getSchneckenname()
        {
            return schneckenName;
        }


        public double getWetteinsatz()
        {
            return wetteinsatz;
        }
}

class kelasTabung {
        double diameter;
        double tinggi;
        double pi = 3.14;

        public kelasTabung(double dm, double tg) {
            this.diameter = dm;
            this.tinggi = tg;
        }

        double kelilingAlas() {
            double k_Alas = 2 * pi * (diameter/2);
            return k_Alas;
        }

        double luasPermukaan() {
            double l_Permukaan = 2 * pi * (diameter/2) * (tinggi + (diameter/2));
            return l_Permukaan;
        }

        double volume() {
            double volume = pi * (diameter/2) * (diameter/2) * tinggi;
            return volume;
        }


}


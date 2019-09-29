class kelasKerucut {
    double diameter;
    double tinggi;
    double selimut;
    double pi = 3.14;

    public kelasKerucut(double dm, double t, double s) {
        this.diameter = dm;
        this.tinggi = t;
        this.selimut = s;
    }

    double luasAlas() {
        double l_Alas = pi * (diameter/2) * (diameter/2);
        return l_Alas;
    }

    double keliling() {
        double kll_Alas = 2 * pi* (diameter/2);
        return kll_Alas;
    }

    double volume() {
        double vol = (1/3) * luasAlas() * tinggi;
        return vol;
    }

    double luasPermukaan() {
        double l_Permukaan = pi * (diameter/2) * ((diameter/2) + tinggi);
        return l_Permukaan;
    }
}

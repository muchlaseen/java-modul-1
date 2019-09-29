class kelasBalok {
    double panjang;
    double lebar;
    double tinggi;

    public kelasBalok(double p, double l, double t) {
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }
    double kelilingBalok() {
        double kll_Balok = 4 * (panjang + lebar + tinggi);
        return kll_Balok;
    }
    double luasPermukaan() {
        double l_Permukaan = 2 * ((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
        return l_Permukaan;
    }

    double volume() {
        double vol = panjang * lebar * tinggi;
        return vol;
    }

}

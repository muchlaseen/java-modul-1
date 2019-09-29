class kelasKubus {
    double panjangSisi;
    int jmlSisi = 6;
    int rusuk = 12;

    public kelasKubus(double s) {
        this.panjangSisi = s;
    }

    double keliling() {
        double kll = rusuk * panjangSisi;
        return kll;
    }

    double volume() {
        double vol = panjangSisi * panjangSisi * panjangSisi;
        return vol;
    }

    double luasPermukaan() {
        double l_Permukaan = jmlSisi * panjangSisi;
        return l_Permukaan;
    }
}

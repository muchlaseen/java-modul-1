import java.util.Scanner;

public class NPM06941_modulSatu {

    static void menu(){
        System.out.println("1. Bangun Ruang Tabung");
        System.out.println("2. Bangun Ruang Balok");
        System.out.println("3. Bangun Ruang Kerucut");
        System.out.println("4. Bangun Ruang Kubus");
    }


    public static void main(String[] args) {
        int pilihan;
        char pilih;

        Scanner input = new Scanner(System.in);

        do{
            menu();
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("### Menghitung Bangun Ruang Tabung ###");
                    System.out.print("Masukkan diameter alas tabung : ");
                    double diameterTb = input.nextDouble();
                    System.out.print("Masukkan tinggi tabung : ");
                    double tinggiTb = input.nextDouble();

                    kelasTabung tabung = new kelasTabung(diameterTb, tinggiTb);
                    double kelAlas = tabung.kelilingAlas();
                    double luasTabung = tabung.luasPermukaan();
                    double volTabung = tabung.volume();

                    System.out.println("Keliling alas tabung adalah  : "+kelAlas);
                    System.out.println("Luas permukaan tabung adalah : "+luasTabung);
                    System.out.println("Volume tabung adalah         : "+volTabung);

                    break;

                case 2:
                    System.out.println("### Menghitung Bangun Ruang Balok ###");
                    System.out.print("Masukkan panjang balok : ");
                    double panjangBlk = input.nextDouble();
                    System.out.print("Masukkan lebar balok : ");
                    double lebarBlk = input.nextDouble();
                    System.out.print("Masukkan tinggi balok : ");
                    double tinggiBlk = input.nextDouble();

                    kelasBalok balok = new kelasBalok(panjangBlk, lebarBlk, tinggiBlk);
                    double volBalok = balok.volume();
                    double luasBalok = balok.luasPermukaan();
                    double kllBalok = balok.kelilingBalok();

                    System.out.println("Keliling balok adalah  : "+kllBalok);
                    System.out.println("Luas permukaan balok adalah : "+luasBalok);
                    System.out.println("Volume balok adalah         : "+volBalok);
                    break;

                case 3:
                    System.out.println("### Menghitung Bangun Ruang Kerucut ###");
                    System.out.print("Masukkkan diameter : ");
                    double diameterKrc = input.nextDouble();
                    System.out.print("Masukkkan tinggi : ");
                    double tinggiKrc = input.nextDouble();
                    System.out.print("Masukkkan selimut : ");
                    double selimutKrc = input.nextDouble();

                    kelasKerucut kerucut = new kelasKerucut(diameterKrc, tinggiKrc, selimutKrc);
                    double volKrc = kerucut.volume();
                    double luasKrc = kerucut.luasPermukaan();
                    double kllKrc = kerucut.keliling();

                    System.out.println("Keliling alas kerucut adalah  : "+kllKrc);
                    System.out.println("Luas permukaan kerucut adalah : "+luasKrc);
                    System.out.println("Volume kerucut adalah         : "+volKrc);
                    break;

                case 4:
                    System.out.println("### Menghitung Bangun Ruang Kubus ###");
                    System.out.print("Masukkkan panjang sisi : ");
                    double panjangSisi = input.nextDouble();

                    kelasKubus kubus = new kelasKubus(panjangSisi);
                    double volKbs = kubus.volume();
                    double luasKbs = kubus.luasPermukaan();
                    double kllKbs = kubus.keliling();

                    System.out.println("Keliling kubus adalah :"+kllKbs);
                    System.out.println("Volume kubus adalah : "+volKbs);
                    System.out.println("Luas permukaan adalah : "+luasKbs);

                    break;


                default:
                    System.out.println("Pilihan tidak ada!!");
                    break;
            }

            System.out.print("Apakah anda ingin mengulang? (Y/N) : ");
            pilih = input.next().charAt(0);

        }
        while(pilih == 'Y' || pilih == 'y');


    }

}

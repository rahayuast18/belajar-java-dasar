public class Random {
    public static void main(String[] args) {
        int[] angka = {10,20,30};

        for (int tampil: angka) {
            System.out.println(tampil);
        }

        System.out.println("----- ----- -----");

        int total = 0;
        for (int jumlah: angka) {
            System.out.println("pertama >> " + total);
            total += jumlah;
            System.out.println("kedua >> " + total);
        }
    }
}

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        BinnaryTree binnaryTree = new BinnaryTree();
        Scanner scanner = new Scanner(System.in);
        int elemen = 0, panjang = 0;
        boolean menu = false;
        do {
            System.out.println("\nBinary Tree Menu : ");
            System.out.println("1. Tambahkan elemen");
            System.out.println("2. Mencari elemen");
            System.out.println("3. Hapus elemen");
            System.out.println("4. Chek size");
            System.out.println("5. Check balance");
            System.out.println("6. Output Dept-First Search(In-Order)");
            System.out.println("7. Output Dept-First Search(Post-Order)");
            System.out.println("8. Output Dept-First Search(Pre-Order)");
            System.out.println("9. Output Bread-First Search(Level Order)");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan : ");
            int input = scanner.nextInt();
            if (input==1){
                System.out.print("Masukkan panjang : ");
                panjang = scanner.nextInt();
                for (int i = 0; i < panjang; i++) {
                    System.out.print("Masukkan elemen ke-"+(i+1)+" : ");
                    elemen = scanner.nextInt();
                    binnaryTree.add(elemen);
                }
            }else if(input==3){
                System.out.print("Pilih elemen yang ingin dihapus : ");
                int hapus = scanner.nextInt();
                binnaryTree.delete(hapus);
                System.out.println("Elemen telah dihapus");
            }else if(input==2){
                System.out.print("Pilih elemen yang ingin dicari : ");
                int cari = scanner.nextInt();
                System.out.println(binnaryTree.find(cari));
            }else if(input==4){
                System.out.println("Panjang dari binnary tree : "+binnaryTree.getSize());
            }else if(input==5){
                System.out.print("Balance of Binnary Tree : "+binnaryTree.isBalanced(binnaryTree.root));
            }else if(input==6){
                System.out.println("Dept First Search (In-Order) : ");
                binnaryTree.traverseInOrder(binnaryTree.root);
            }else if(input==7){
                System.out.println("Dept First Search (Post-Order) : ");
                binnaryTree.traversePostOrder(binnaryTree.root);
            }else if(input==8){
                System.out.println("Dept First Search (Pre-Order) : ");
                binnaryTree.traversePreOrder(binnaryTree.root);
            }else if(input==9){
                System.out.println("Bread First Search (Level-Order) : ");
                    binnaryTree.traverseLevelOrder();
            }else if(input==0){
                System.exit(0);
            }else{
                System.out.println("Mohon masukkan angka (0 - 9) saja !");
            }

        }while (!menu);
    }
}

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = scanner.nextInt();
        System.out.println("Nhap b:");
        int b = scanner.nextInt();
        a = Math.abs(a); // lay gia tri tuyet doi cua a
        b = Math.abs(b);
        if (a == 0 || b==0){
            System.out.println("khong co truong hop nay xay ra");
        }
        while (a!=b){
            if (a>b){
                a = a-b;
                System.out.println("a = "+a);

            }else {
                b= b-a;
                System.out.println("b = "+b);

            }
        }
        System.out.println("Uoc chung lon nhat la "+a);
    }
}

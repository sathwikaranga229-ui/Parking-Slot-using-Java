import java.util.Scanner;
public class ParkingSlot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = 1000;
        System.out.println("Available parking slots=5");
        for(int i=0;i<=n;i++){
            System.out.println("Enter parking slot number:  ");
        int slot=sc.nextInt();
            if(slot>=1 && slot<=5){
                System.out.println("SlotAvailable");
            }
            else{
                System.out.println("NotAvailable");
            }
        }
    }
}

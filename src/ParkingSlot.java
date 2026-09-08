import java.util.Scanner;
public class ParkingSlot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Slots: ");
        int n = sc.nextInt();

        for (int i = 0;i<=n;i++){
            System.out.println("Enter Slot Number: ");
            int slot = sc.nextInt();
            if (slot<=n){
                System.out.println("Slots available");
            }else{
                System.out.println("Not available");
            }
        }
    }
}

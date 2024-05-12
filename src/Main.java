import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of hours parked in 24 hours time format: ");
        int hours = sc.nextInt();
        System.out.println("Enter 1 for Hospital parking and enter 2 for Mall parking: ");
        int parkingPlace = sc.nextInt();
            if (parkingPlace == 1) {
                MallParking mp = new MallParking();
                mp.mallParking(hours);
                System.out.println(mp.toString());
            } else if (parkingPlace == 2) {
                HospitalParking hp = new HospitalParking();
                hp.hospitalParking(hours);
                System.out.println(hp.toString());
            } else{
                System.out.println("Invalid parking place");
            }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<bus> buslist=new ArrayList<>();
        ArrayList<booking> bookinglist=new ArrayList<>();
        buslist.add(new bus(1000,2,true));
        buslist.add(new bus(2000,30,true));
        for(bus b:buslist){
            b.Displaybusinfo();
        }
        int useroption=1;
        Scanner sc=new Scanner(System.in);
        while(useroption==1){
            System.out.println("Enter 1 to book and 2 to exit");

            useroption = sc.nextInt();
            if(useroption==1){
                System.out.println("Booking Started.......");
                booking obj=new booking();
                if(obj.isAvailable(bookinglist,buslist)){
                    bookinglist.add(obj);
                    System.out.println("YOUR BOOKING IS CONFIRMED");
                }
                else{
                    System.out.println("bus is full try another bus or date");

                }
            }
        }
    }
}

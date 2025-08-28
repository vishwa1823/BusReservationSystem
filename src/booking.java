import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class booking {
    String passengername;
    static int bookingbusno;
    Date bookingdate;

    public booking() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NAME OF PASSESNGER");
        passengername = sc.next();
        System.out.println("enter the bus no");
        bookingbusno=sc.nextInt();
        System.out.println("enter the BOOKING DATE");
        String datee=sc.next();
        SimpleDateFormat formatt= new SimpleDateFormat("dd-mm-yyyy");
        try {
            bookingdate=formatt.parse(datee);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
    public  boolean isAvailable(ArrayList<booking> book, ArrayList<bus> buss) {
        int capacity=0;
        int booked = 0;
        for (bus beg : buss) {
            if (bookingbusno == beg.getBusNo()) {
                capacity = beg.getCapacity();
            }

            for (booking beg2 : book) {
                if (bookingbusno == beg.getBusNo() && beg2.bookingdate.equals(bookingdate)) {
                    booked++;
                }

            }
        }
        return booked < capacity ?true :false;
    }
}

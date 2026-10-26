import Packages.Booking;

public class Main {
    
    public static void main(String[] args) {
        
        Booking obj=new Booking("PK7A21","Lahore","New York","30/10/2026","2:00AM","18A","Confirmed");

        System.out.println(obj.toString());

        obj.changeSeat("20F");
        obj.checkIn();

        System.out.println(obj.toString());

        obj.changeSeat("20F");

        System.out.println(obj.toString());

    }
}

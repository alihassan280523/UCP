package Packages;

public class Booking {
    
    private String reference;
    private String departure;
    private String destination;
    private String date;
    private String time;
    private String seat;
    private String status;

    public Booking(String ref,String dept,String dest,String date,String time,String seat,String status){
        this.reference=ref;
        this.departure=dept;
        this.destination=dest;
        this.date=date;
        this.time=time;
        this.seat=seat;
        this.status=status;
    }

    public void changeSeat(String seat){
        if(status.compareTo("Checked in")==0){
            System.out.println("\nCan not change seat after checked in\n");
            return;
        }

        this.seat=seat;
        System.out.println("\nSeat changed\n");
    }

    public void checkIn(){
        this.status="Checked in";
        System.out.println("\nYou are checked in\n");
    }

    @Override 
    public String toString(){
        return (
            "\nReference: "+reference+
            "\nDeparture: "+departure+
            "\nDestination: "+destination+
            "\nDate: "+date+
            "\nTime: "+time+
            "\nSeat: "+seat+
            "\nStatus: "+status
        );
    }
}

public class MallParking implements ParkingSystem{
    int time;
    double surcharge;
    public double mallParking(){
        return surcharge;
    }
    public void mallParking(int time){
        this.time = time;
        this.surcharge = 0.1;
    }
    public double processTicket(){
        double ticketPrice = 0;
        if(this.time>=0 && this.time<=5){
            ticketPrice = surcharge* TWENTY_FOUR + TWENTY_FOUR;
        }else if(this.time>=5 && this.time<=17) {
            ticketPrice = this.surcharge* MORNING + MORNING;
        }else if(this.time>=17 && this.time<=24) {
            ticketPrice = this.surcharge* NIGHTLY + NIGHTLY;
        }else System.out.println("Invalid Parking Time");
        return ticketPrice;
    }
    @Override
    public String toString(){
        return "parking ticket price is $" +processTicket();
    }

}

public class HospitalParking implements ParkingSystem {

    int time;
    double surCharge;

    public void hospitalParking() {

    }
    public void hospitalParking(int time) {
        this.time = time;
        this.surCharge = 0.2;
    }
    public double processTicket() {
        double ticket = 0;
        if (this.time >= 0 && this.time <= 5) {
            ticket = this.surCharge * TWENTY_FOUR + TWENTY_FOUR;
        } else if (this.time >=5 && this.time <= 17) {
            ticket = this.surCharge * MORNING + MORNING;
        } else if (this.time >= 17 && this.time <= 24) {
            ticket = this.surCharge * NIGHTLY + NIGHTLY;
        } else {
            System.out.println("Invalid Parking Time");
        }
        return ticket;
    }
    public String toString(){
        return "Ticket price is $" +processTicket();
    }
}

package ArrayLlist;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Avalon Mall", 8, 12);
        theatre.getSeats();
        if (theatre.reserveSeat("C08")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        int ticketPrice = 1790;
        int bonusForOneMile = 20;

        int totalBonus = ticketPrice / bonusForOneMile;
        System.out.println("Бонусов начислено: " + totalBonus);
    }
}

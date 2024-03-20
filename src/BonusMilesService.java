public class BonusMilesService {
    public int calculate(int a) {
        int price = a;
        int percent = 20;
        int miles = price / percent;
        return miles;
    }

}

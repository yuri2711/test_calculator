package lib;

public class Math implements Number {

    @Override
    public int getNumber(String input) {
        String[] mass = input.split(" ", 3);
        Calculation calculation = new Calculation();
        if(mass.length<3)return 1000;
        return  calculation.getResult(mass[0], mass[1],mass[2]);
    }
}

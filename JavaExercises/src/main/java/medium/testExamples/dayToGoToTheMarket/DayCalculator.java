package medium.testExamples.dayToGoToTheMarket;

public class DayCalculator {
    String day = "Domingo";

    public String calculator(String val){
        if (getDia().equals(val)){
            System.out.println("Domingo é o melhor dia da Feira");
        }else {
            System.out.println(val + " não é o melhor dia para ir à feira");
        }
        return val;
    }

    public String getDia() {
        return day;
    }
}


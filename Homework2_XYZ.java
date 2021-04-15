public class Homework2_XYZ {
    public static void main(String[] args) {
        int population = 10000000;
        int birth = 14;
        int mortality = 8;

        for(int years = 1; years <= 10; years++){
            if (birth > 7){
                birth--;
            }
            if (mortality > 6) {
                mortality--;
            }
                population += (birth - mortality) * (population / 1000);
        }

        System.out.println("Через 10 лет численность населения будет: " + population);

    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(ageAndTemperature(50, -15));
        System.out.println(ageAndTemperature(16, 4));
        System.out.println(ageAndTemperature(5, 28));
        System.out.println(ageAndTemperature(46, -12));
        System.out.println(ageAndTemperature(25, 17));
        System.out.println(ageAndTemperature(generateRandomAge(),generateRandomAge()));
    }

    public static String ageAndTemperature(int age, int temperature) {

        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)
            return "Можно идти гулять";
        else if (age < 20 && temperature >= 0 && temperature <= 28)
            return "Можно идти гулять";
        else if (age > 45 && temperature >= -10 && temperature <= 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }



    public static int generateRandomAge () {
        Random rn = new Random();
        int answer = rn.nextInt(100);
        return answer;
    }
}
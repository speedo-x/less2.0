public class start {
    public static void main(String[] args) {

        String name = "Ivan";
        String admin = name;
        System.out.println(admin);

        int grade = 10;
        int result = grade + 5;

        System.out.println("Grade пользователя " + admin + " равен " + result);

        String admin2 = "dima";
        double dimagrade = result / 2. ;
        System.out.println("Grade пользователя " + admin2 + " равен " + dimagrade);


        double x = 5;
        double y = 7;
        double resultz = x/y;
        System.out.println ("Результат : " + resultz);


        int z = 2147483647;
        int resulty = ++z;
        System.out.println ("Результат : " + resulty);

        int A = 1000;
        int B = 500;
            int resultSoSkidkoy = (int) ((A + B) * 0.9);
            int resultSkidka = (int) ((A+B) * 0.1);
            System.out.println("Итого со скидкой  : " + resultSoSkidkoy);
            System.out.println("Итого скидка  : " + resultSkidka);

        int A1 = 200;
        double SkidkaA = 0.85;
        int kolA = 10 ;
        int B1 = 30;
        int kolB = 2 ;
        double resultPokupka = (A1*SkidkaA*kolA) + (B1*kolB);
        System.out.println("Итого cумма покупки 1 : " + resultPokupka);

        int A2 = 500;
        double SkidkaA2 = 0.5;
        int kolA2 = 7 ;
        int B2 = 50;
        int kolB2 = 1 ;
        double resultPokupka2 = (A2*SkidkaA2*kolA2) + (B2*kolB2);
        System.out.println("Итого cумма покупки 2 : " + resultPokupka2);

        int A3 = 300;
        double SkidkaA3 = 0.9;
        int kolA3 = 7 ;
        int B3 = 20;
        int kolB3 = 3 ;
        double resultPokupka3 = (A3*SkidkaA3*kolA3) + (B3*kolB3);
        System.out.println("Итого cумма покупки 3 : " + resultPokupka3);



    }

}


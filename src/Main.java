public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 7;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов,  нужно надеть шапку.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int Speed = 78;
        if (Speed > 60) {
            System.out.println("Если скорость " + Speed + ", то придется заплатить штраф.");
        }
        if (Speed <= 60) {
            System.out.println("Если скорость " + Speed + ", то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 23;
        if (age <= 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");
        } else if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age > 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int age = 21;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");


        int capasiti = 102;
        int seatsCount = 60;
        int otherCount = capasiti - seatsCount;
        int seatsUsed = 62;
        int otherUsed = 23;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + " сидячих мест.");
        } else {
            System.out.println("Сидячих мест нет .");
        }
        if (otherUsed < otherCount) {
            System.out.println("Есть еще " + (otherCount - otherUsed) + " стоячих мест.");
        } else {
            System.out.println("стоячих мест нет .");
        }


    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 211;
        int two = 211;
        int three = 211;
        if (one > two) {
            if (one>=three){
                System.out.println("наибольшее число " + one);}
            else {
                System.out.println("наибольшее число " + three);}
        }      else if (two>one){
                if (two>=three){
                    System.out.println("наибольшее число " + two);
                }else {
                    System.out.println("наибольшее число " + three);
                } } else {
            if (one>three) {
                System.out.println("наибольшее число " + one);}
            else if (three>one) {
                System.out.println("наибольшее число " + three);
            } else {
                System.out.println("Все числа равны");


            }
        }

    }
}















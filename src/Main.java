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

        int age = 33;

        if (age >= 18) {
            System.out.println("«Если возраст человека равен " + age + ", то  он совершеннолетний ");
        }
        if (age < 18) {
            System.out.println(" Если возраст человека равен " + age + " то  он не достиг совершеннолетия, нужно немного подождать");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int outsideTemperature = 0;
        if (outsideTemperature < 5) {
            System.out.println(" На улице " + outsideTemperature + " градусов -  нужно надеть шапку ");
        }
        outsideTemperature += 20;
        if (outsideTemperature >= 5) {
            System.out.println(" На улице " + outsideTemperature + " градусов -  можно идти без шапки ");
        }


    }

    public static void task3() {
        System.out.println("Задача 3");
        int carSpeed = 62;
        if (carSpeed > 60) {
            System.out.println(" Если скорость " + carSpeed + " км/ч, то  придется заплатить штраф ");
        } else {
            System.out.println(" Если скорость " + carSpeed + " км/ч, то можно ездить спокойно ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int age = 70;
        if (age < 2) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно спать");
        }
        if (age >= 2 && age <= 6) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println(" Если возраст человека равен " + age + ", то ему нужно в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println(" Если возраст человека равен " + age + ", то его место в университете");
        }
        if (age >= 24 && age < 60) {
            System.out.println(" Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        if (age >= 60) {
            System.out.println(" Если возраст человека равен " + age + ", то он может отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int age = 4;
        if (age < 5) {
            System.out.println(" Если возраст ребенка равен " + age + ", то ему  нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println(" Если возраст ребенка равен " + age + ", то ему  можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age >= 14) {
            System.out.println(" Если возраст ребенка равен " + age + ", то ему  можно кататься на аттракционе без сопровождения взрослого");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int seating = 60;
        int occupiedPlaces = 102;
        if (occupiedPlaces < seating) {
            System.out.println(" В вагоне есть сидячии места");
        } else {
            if (occupiedPlaces >= seating && occupiedPlaces < wagonCapacity) {
                System.out.println("( В вагоне есть стоячии места");
            } else {
                System.out.println("В вагоне мест нет");
            }

        }
    }

    private static void task7() {
        System.out.println("Задача 7");
        int one = 120;
        int two = 2;
        int three = 346;
        if (one > two && one > three) {
            System.out.println(one + " самое большое число ");
        } else if (two > one && two > three) {
            System.out.println(two + " самое большое число ");
        } else if (three > one && three > two) {
            System.out.println(three + " самое большое число ");
        }
    }

}




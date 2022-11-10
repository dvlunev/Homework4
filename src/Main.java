public class Main {
    public static void main(String[] args) {
        //ДЗ 1 Задание 1
        int age = 18;
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать =)");
        }
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        //ДЗ 1 Задание 2
        int age2 = 24;
        if (age2 < 7) {
            System.out.println("Ребенок посещает ясли или садик =)"); // добавли от себя, на случай чтобы программа была универсальной если значение будет меньше 7
        }
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //ДЗ 1 Задание 3
        int wagonСapacity = 102;
        int seatCapacity = 60;
        int standCapacity = wagonСapacity - seatCapacity;
        int bookedSeat = 59;
        int bookedStand = 41;
        if (bookedSeat < seatCapacity && bookedStand < standCapacity) {
            System.out.println("В вагоне доступно сидячих мест " + (seatCapacity - bookedSeat) + " и стоячих мест " + (standCapacity - bookedStand));
        }
        if (bookedSeat < seatCapacity && bookedStand >= standCapacity) {
            System.out.println("В вагоне доступны только сидячие места " + (seatCapacity - bookedSeat) + " шт");
        }
        if (bookedSeat >= seatCapacity && bookedStand < standCapacity) {
            System.out.println("В вагоне доступны только стоячие места " + (standCapacity - bookedStand) + " шт");
        }
        if (bookedSeat >= seatCapacity && bookedStand >= standCapacity) {
            System.out.println("В вагоне нет свободных мест");
        }
        //ДЗ 2 Задание 1
        int age3 = 18;
        if (age3 < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать =)");
        } else {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        //ДЗ 2 Задание 2
        int age22 = 24;
        if (age22 < 7) {
            System.out.println("Ребенок посещает ясли или садик =)"); // добавли от себя, на случай чтобы программа была универсальной если значение будет меньше 7
        } else if (age22 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age22 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //ДЗ 2 Задание 3
        int wagonСapacity2 = 102;
        int seatCapacity2 = 60;
        int standCapacity2 = wagonСapacity2 - seatCapacity2;
        int bookedSeat2 = 58;
        int bookedStand2 = 40;
        if (bookedSeat2 < seatCapacity2 && bookedStand2 < standCapacity2) {
            System.out.println("В вагоне доступно сидячих мест " + (seatCapacity2 - bookedSeat2) + " и стоячих мест " + (standCapacity2 - bookedStand2));
        } else if (bookedSeat2 >= seatCapacity2 && bookedStand2 >= standCapacity2) {
            System.out.println("В вагоне нет свободных мест");
        } else if (bookedSeat2 >= seatCapacity2) {
            System.out.println("В вагоне доступны только стоячие места " + (standCapacity2 - bookedStand2) + " шт");
        } else {
            System.out.println("В вагоне доступны только сидячие места " + (seatCapacity2 - bookedSeat2) + " шт");
        }
        //ДЗ 3 Задание 1
        int age31 = 25;
        boolean canNotGoToAnyWhere = age31 < 2;
        boolean shouldGoToKinderGarden = age31 >= 2 && age31 <= 6;
        boolean shouldGoToSchool = age31 >= 7 && age31 <= 18;
        boolean shouldGoToUniv = age31 >= 19 && age31 <= 24;
        if (canNotGoToAnyWhere) {
            System.out.println("Если возраст человека равен " + age31 + ", то ему пока никуда не нужно ходить =)");
        } else if (shouldGoToKinderGarden) {
            System.out.println("Если возраст человека равен " + age31 + ", то ему нужно ходить в детский сад");
        } else if (shouldGoToSchool) {
            System.out.println("Если возраст человека равен " + age31 + ", то ему нужно ходить в школу");
        } else if (shouldGoToUniv) {
            System.out.println("Если возраст человека равен " + age31 + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age31 + ", то ему нужно ходить на работу или работать на удаленке =)");
        }
        //ДЗ 3 Задание 2
        int age32 = 15;
        boolean canNotRideAt = age32 < 5;
        boolean canRideWithAdult = age32 >= 5 && age32 <= 14;
        if (canNotRideAt) {
            System.out.println("Вы не можете кататься на аттракционе");
        } else if (canRideWithAdult) {
            System.out.println("Вы можете кататься на аттракционе только в сопровождении взрослого");
        } else {
            System.out.println("Вы можете кататься на аттракционе самостоятельно, без сопровождения взрослого");
        }
        //ДЗ 3 Задание 3
        int one = 16;
        int two = 16;
        int three = 16;
        boolean oneMore = one > two && one > three;
        boolean twoMore = two > one && two > three;
        boolean threeMore = three > one && three > two;
        boolean equalOneTwo = one == two;
        boolean equalOneThree = one == three;
        boolean equalTwoThree = two == three;
        if (oneMore) {
            System.out.println("Наибольшее из трех чисел one " + one);
        } else if (twoMore) {
            System.out.println("Наибольшее из трех чисел two " + two);
        } else if (threeMore) {
            System.out.println("Наибольшее из трех чисел three " + three);
        } else if (equalOneTwo && one > three) {
            System.out.println("Числа one и two равны и являются наибольшими - " + one);
        } else if (equalOneThree && one > two) {
            System.out.println("Числа one и three равны и являются наибольшими - " + one);
        } else if (equalTwoThree && two > one) {
            System.out.println("Числа two и three равны и являются наибольшими - " + two);
        } else {
            System.out.println("Все числа равны - " + one);
        }
    }
}
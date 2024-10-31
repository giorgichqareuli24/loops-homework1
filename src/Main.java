public class Main {
    public static void main(String[] args) {

//        int sum = 0;
//        for (int i = 10; i <= 100; i++) {
//            if (i % 5 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("10-დან 100-მდე 5-ის ჯერადი რიცხვების ჯამია: " + sum);




//        int number = -36474;
//        int count = 0;
//        int num = number;
//
//        if (num < 0) {
//            num = -num;
//        }
//
//        while (num > 0) {
//            num /= 10;
//            count++;
//        }
//
//        if (number == 0) {
//            count = 1;
//        }
//
//        System.out.println("რიცხვი " + number + " არის " + count + " ნიშნა.");






//        int number = 24;
//        boolean isSimple = true;
//        if (number <= 1) {
//            isSimple = false;
//        } else {
//            for (int i = 2; i <= number / 2; i++) {
//                if (number % i == 0) {
//                    isSimple = false;
//                    break;
//                }
//            }
//        }
//
//        if (isSimple) {
//            System.out.println("რიცხვი " + number + " არის მარტივი.");
//        } else {
//            System.out.println("რიცხვი " + number + " არ არის მარტივი.");
//        }





//        int num1 = 48;
//        int num2 = 76;
//        int USG = 1;
//        int i = 1;
//
//        while (i <= num1 && i <= num2) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                USG = i;
//            }
//            i++;
//        }
//
//        System.out.println("უდიდესი საერთო გამყოფია: " + USG);





//        for (int number = 100; number <= 999; number++) {
//            int cifrtaJami = 0;
//            int temp = number;
//
//            while (temp > 0) {
//                cifrtaJami += temp % 10;
//                temp /= 10;
//            }
//
//            if (number % cifrtaJami == 0) {
//                System.out.println(number);
//            }
//        }






//        int num = 10;
//        int first = 0;
//        int second = 1;
//
//        System.out.println("ფიბონაჩის მიმდევრობის პირველ 10 წევრი:");
//
//        for (int i = 1; i <= num; i++) {
//            if (i == 1) {
//                System.out.print(first + " ");
//            } else if (i == 2) {
//                System.out.print(second + " ");
//            } else {
//                int next = first + second;
//                System.out.print(next + " ");
//                first = second;
//                second = next;
//            }
//        }


    }
}
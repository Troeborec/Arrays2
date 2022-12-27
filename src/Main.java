import javax.print.attribute.standard.PresentationDirection;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        //task 1
        System.out.println("Задача №1");
        int summ = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            summ +=arr[i];
        }
        System.out.println(summ);
    }

    public static void task2() {
        //task2
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        int maxOne = 0;
        int minOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное число " + min);
        System.out.println("Максимальное число " + max);
    }
    public static void  task3(){
        //task3
        System.out.println("Задача №3");
        int[] arrThree = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arrThree.length; i++) {
            sum +=arrThree[i];
            }
        System.out.println(sum / (float) arrThree.length);
        }

    public static void task4() {
        //task4
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
            }
        }
    }


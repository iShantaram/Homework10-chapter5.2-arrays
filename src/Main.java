
public class Main {
    public static void main(String[] args) {
        // HW10
        int[] arr = generateRandomArray(30);

        // Task1
        System.out.println("\nTask 1:");
        int sumPaiment = 0;
        for (int i : arr) {
            sumPaiment += i;
        }
        System.out.println("Сумма трат за месяц составила " + sumPaiment + " рублей");

        // Task2
        System.out.println("\nTask 2:");
        int minPaiment = arr[0], maxPaiment = arr[0];
        for (int i : arr) {
            if (i < minPaiment) {
                minPaiment = i;
            }
            if (i > maxPaiment) {
                maxPaiment = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPaiment + " рублей.\n" +
                "Максимальная сумма трат за день составила " + maxPaiment + " рублей.");

        // Task3
        System.out.println("\nTask 3:");
        float avgPaiment = (float) sumPaiment / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgPaiment + " рублей");

        // Task4
        System.out.println("\nTask 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray(int lengthArr) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
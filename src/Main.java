import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задача №1.");
        int[] nums = new int[12];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        double[] nums1 = new double[]{1.57, 7.654, 9.986};
        System.out.println(nums1[0]);
        System.out.println(nums1[1]);
        System.out.println(nums1[2]);
        double[] nums2 = {1.57, 7.654, 9.986, 3.23};
        System.out.println(nums2[0]);
        System.out.println(nums2[1]);
        System.out.println(nums2[2]);
        System.out.println(nums2[3]);
    }

    private static void task2() {
        System.out.println("Задача №2.");
        int[] arr = new int[]{1, 2, 3};
        for (int index = 0; index < arr.length; index++) {
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        double[] arr1 = new double[]{1.57, 7.654, 9.986};
        for (int index = 0; index < arr1.length; index++) {
            if (index == arr1.length - 1) {
                System.out.println(arr1[index]);
                break;
            }
            System.out.print(arr1[index] + ", ");
        }
        double[] arr2 = new double[]{1.57, 7.654, 9.986, 3.23};
        for (int index = 0; index < arr2.length; index++) {
            if (index == arr2.length - 1) {
                System.out.println(arr2[index]);
                break;
            }
            System.out.print(arr2[index] + ", ");
        }
    }

    private static void task3() {
        System.out.println("Задача №3.");
        int[] arr = new int[]{1, 2, 3};
        for (int index = arr.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        double[] arr1 = new double[]{1.57, 7.654, 9.986};
        for (int index = arr1.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr1[index]);
                break;
            }
            System.out.print(arr1[index] + ", ");
        }
        double[] arr2 = new double[]{1.57, 7.654, 9.986, 3.23, 43.24};
        for (int index = arr2.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr2[index]);
                break;
            }
            System.out.print(arr2[index] + ", ");
        }
    }

    private static void task4() {
        System.out.println("Задача №4.");
        int[] arr = {1, 2, 3};
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 2 != 0) {
                arr[index] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
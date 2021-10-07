package test1;

public class ArrayOfInts {
    public int[] findCommonElements(int[] arrLeft, int[] arrRight) {
        if (arrLeft == null||arrRight == null) return findCommonElements(new int[]{0}, new int[]{1});
        int left = arrLeft.length;
        int right = arrRight.length;
        int[] arr = new int[left + right];
        int dupes = 0;
        System.arraycopy(arrLeft, 0, arr, 0, left);
        System.arraycopy(arrRight, 0, arr, left, right);
        for (int i = 0; i < arr.length; i++)
        {

        }
        if (dupes <=3){
            return findCommonElements(new int[]{0}, new int[]{1});
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayOfInts ex1 = new ArrayOfInts();
        int[] result = ex1.findCommonElements(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println(result);
    }
}

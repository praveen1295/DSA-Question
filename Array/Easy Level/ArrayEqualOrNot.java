public class ArrayEqualOrNot {
    public static boolean arrEqualOrNot(Object arr1[], Object arr2[]) {
        if (arr1.length != arr2.length)
            return false;
        else if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer a[] = { 1, 2, 3, 4 }; // We can't use int for Object class becouse int is primitive and Integer is a  class;
        Integer b[] = { 1, 2, 3, 4 };

        String c[] = { "praveen", "pvb", "bankhede" };
        String d[] = { "praveen", "pvb", "bankhede" };

        // Or use Arrays.equals(a, b);
        // If we want to chack both Integer and String than we can use object Class;

        if (arrEqualOrNot(a, b)) {
            System.out.println("Array are Equal");
        } else {
            System.out.println("Array are Not Equal");
        }

        if (arrEqualOrNot(c, d)) {
            System.out.println("Array are Equal");
        } else {
            System.out.println("Array are Not Equal");
        }

    }
}

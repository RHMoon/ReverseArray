public class App {
    public static void main(String[] args) throws Exception {
        Integer [] numArray = {10,2,8,3,1,5,9,14,6};
        int biggest = numArray[0];
        int smallest = numArray[0];

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > biggest) {
                biggest = numArray[i];
            }
            if (numArray[i] < smallest) {
                smallest = numArray[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Biggest number: " + biggest);
    }
}

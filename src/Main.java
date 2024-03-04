public class Main {
    public static void main(String[] args) {
        ArrayStructuers newArray = new ArrayStructuers();
        newArray.generatedRandomArray();
        newArray.printArray();

//        System.out.println(newArray.getValueAtIndex(2) + " is value of index 2");
//        System.out.println("the number 2 is present?="+newArray.doesArrayContainThisValue(2));
//
//        newArray.deleteIndex(4);
//        newArray.printArray();
//
//        newArray.insertValue(55);
//        newArray.printArray();
//
//        newArray.linearSearchForValue(17);

        newArray.bubbleSort();
        System.out.println("Array ordinato:");
        newArray.printArray();
    }
}
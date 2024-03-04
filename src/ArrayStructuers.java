public class ArrayStructuers {
    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generatedRandomArray(){
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random()*10)+10;
        }
    }

    public int getValueAtIndex(int index){
        if(index < arraySize) return theArray[index];
        return 0;
    }

    public boolean doesArrayContainThisValue(int searchValue){
        boolean valueInArray = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == searchValue){
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index){
        if (index < arraySize) {
            for (int i = index; i < (arraySize-1); i++) {
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value){
        if (arraySize<50) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    public String linearSearchForValue(int value){
        boolean valueInArray = false;
        String indexWithValue = "";
        System.out.println("The value was found in the following: ");
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i]== value){
                valueInArray = true;
                System.out.print(i+ " ");
                indexWithValue += i + " ";
            }
        }
        if (!valueInArray) {
            indexWithValue = "None";
            System.out.print(indexWithValue);
        }
        System.out.println();
        return indexWithValue;
    }

    public void bubbleSort(){
        for (int i = arraySize-1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (theArray[j] > theArray[j+1])
                    swapValues(j,j+1);
            }
        }
    }

    private void swapValues(int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    public void printArray(){
        System.out.println("------------");
        for (int i = 0; i < arraySize ; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " | ");
            System.out.println("------------");
        }
    }
}

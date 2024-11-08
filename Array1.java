import java.util.*;;

public class Array1 {
    //1 Array as argument

    //update function to change array value
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
            System.out.println(marks[i]);
        }
    }

    //2 linear search in array
    public static int linearSearch(int num[], int key){
        for(int i =0; i<num.length; i++){
            if (num[i] == key ) {
                return i;
        }
        }
        return -1;
    }

    //3. menu search using linear search
    public static int SelectLinearSearch(String menu[], int final_value){
        
        for(int i=0; i<menu.length; i++){
            if (i == final_value) {
                return i;
            }
        }
        return -1;
    }

    //4. to find largest and smallest element int array using interger.MIN-VALUE and  interger.MAX-VALUE
    public static void Find_Num(int number[]){
        int largest =   Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            //for largest number
            if (largest<number[i]) {
                largest = number[i];
            }
            //for smallest number
            if(smallest > number[i]){
                smallest = number[i];
            }
                }
                System.out.println("Largest number is: "+largest);
                System.out.println("Smallest number is: "+smallest);
    }

    public static void main(String args[]){
        //for array as argument
        //int marks[]={91,92,93};
        //call update function and passing array into function
        //update(marks);

        //for linear search
        // int num[] ={2,4,5,10,11,5,6};
        // int key = 10;

        // int index = linearSearch(num , key);

        // if(index == -1){
        //     System.err.println("Not Found");
        // }else{
        //     System.out.println("key is at index: "+index);
        // }

        //for menu using linear search
        // String menu[] = {"1. dosa", "2. sandwich", "3. coke", "4. fruti", "5. Samosa"} ;
        // for(int i=0; i< menu.length; i++){
        //     System.out.println(menu[i]);
        // }

        // System.out.println();
        // System.out.println("What is your order number of food: ");

        // Scanner sc = new Scanner(System.in);
        // int choice = sc.nextInt();
        // int final_value = choice-1;

        // int finalch = SelectLinearSearch(menu, final_value);
       
        // if(finalch == -1){
        //     System.out.println("Not in menu select from menu");
        // }else{
        //     System.out.println("Here is your order: " + menu[finalch]);
        // }

        //for largest and smallest number in array
        int number[] ={1,2,6,3,5};
        Find_Num( number);
        
    }
}

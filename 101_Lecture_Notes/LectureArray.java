/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5,8,7,8,4,2,9,1};
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int x = 8;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == x){
                System.out.println("Duplicate found in index: " + i);
            }
        }
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("Consect at " + i " and " + (i+1));
            }
        }
        
        
	}
}
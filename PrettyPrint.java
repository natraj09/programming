/*

* Print concentric rectangular pattern in a 2d matrix. 
* Let us show you some examples to clarify what we mean.
* 4 4 4 4 4 4 4 
* 4 3 3 3 3 3 4 
* 4 3 2 2 2 3 4 
* 4 3 2 1 2 3 4 
* 4 3 2 2 2 3 4 
* 4 3 3 3 3 3 4 
* 4 4 4 4 4 4 4 
*/


public class PrettyPrint {
	public ArrayList<ArrayList<Integer>> prettyPrint(int N) {
	   
	ArrayList<ArrayList<Integer>>  outerList = new  ArrayList<ArrayList<Integer>>(); 
	int rowCount = 0;
    int rowValue = 0;
    int f = 2;
    for (int i = 0 ; i < 2*N - 1 ; i ++) {
      ArrayList<Integer> innerList = new ArrayList<Integer>();
      int minColValue = 0;
      int colRepeat = 0;
      if (i <= ((2*N-1)/2)){
       minColValue = N-i;
       colRepeat = 2*minColValue - 1;
      }else{
        minColValue = f;
        colRepeat = 2*(minColValue) - 1;
        f++;
      }
      int colCount = 0;
      for( int j =  0  ; j < 2*N -1 ; j++ )  {     
        if((N - j) <= minColValue && colRepeat > 0){ //Repeat colums   
          //System.out.print(minColValue);
          innerList.add(minColValue);
          colRepeat--;
        }else { // second half of columns
          if(j > ((2*N-1)/2)) {
            innerList.add(++minColValue);  
            //System.out.print(++minColValue);
          }
          else{ // first half of columns
            innerList.add(N-colCount);  
          }
          colCount++;
        }
        
       
        
      }
     
       outerList.add(innerList);
      
    }
	    return outerList;
	    
	}
}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        char[] JavaCharArray = {'E','X','A','M','P','L','E'};
        for (int i=0; i < JavaCharArray.length; i++){
            //System.out.print(" " +JavaCharArray[i]);
            
            int min_idx = i;
            int j=i+1;
            for (; j<JavaCharArray.length; j++){
            if (JavaCharArray[j] < JavaCharArray[min_idx]){
            min_idx=j;
            }
            
                
            }
            
            char  temp = JavaCharArray[min_idx];
            JavaCharArray[min_idx] = JavaCharArray[i];
            JavaCharArray[i]= temp;
            }
            for (int k = 0; k < JavaCharArray.length; k++)
            System.out.println(" "+ JavaCharArray[k]);
            
        }
    }
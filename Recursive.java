class Recursive {
    static int squareRootWithoutRecursive(int a, int b){ // untuk menyimpan angka nilai dgn pangkat nya
        int result = a;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        return result;
    }
    
    static int squareRoot(int a, int b){
        return b > 0 ? a * squareRoot(a,b - 1): 1; // nilai a = 2 | nilai b dimuali dari : 1 kemudian dikalikan dengan a= 2
    }
    
    /* 
    2 x (5)squareRoot (2,5)
    2 x (4)squareRoot (2,4)
    2 x (3)squareRoot (2,3)
    2 x (2)squareRoot (2,2)
    2 x (1)squareRoot (2,1)
    1
    
    
    */
    public static void main (String [] args){
        int result = squareRoot(2,5);
        System.out.println("Result = " + result);
        
    }
}

/*
Outputnya 32 karna 2 pangkat 5
*/
```
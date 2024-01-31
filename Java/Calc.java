// method overiding

class Calculator{
    
public int add( int n1,int n2){
    return n1+n2;
}

public int sub( int n1,int n2){
    return n1-n2;
}

public int multi( int n1,int n2){
    return n1*n2;
}

public int div( int n1,int n2){
    return n1/n2;
}
}


public class Calc {

    public static void main(String args[]){
         AdvCalc c1=new AdvCalc();
        int r1=c1.add(3, 4);
         System.out.println(r1);
    }
    
}


class AdvCalc extends Calculator {
     public int add(int n1,int n2){
        return n1+n2+2;
        
     }
}




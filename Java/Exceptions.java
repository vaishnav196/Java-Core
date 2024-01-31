public class Exceptions {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // int i=0;
        // int i=9;
        // int j=18/i;
        // System.out.println(j);
        // System.out.println("exception errors are there....");
        int i = 0;
        int j = 0;
    //     int arry[] = new int[5];
    //     try {
    //         j = 18 / i;
    //         System.out.println("every thing is working properly");
    //         System.out.println(arry[9]);
    //     } catch (ArithmeticException e) {
    //         System.out.println("something is wrong in arthimetic logic");
    //     } catch (Exception e) {
    //         System.out.println("Something Error occured During the Excetution. " + e);
    //     }

    //     System.out.println("handled Error Successfully");

    // }
    try{
        j=18/i;
        System.out.println("try block is running");
    }
    catch(Error e){
        System.out.println("something error occured");
    }
    finally{
            System.out.println("finally block");
    }

}
}


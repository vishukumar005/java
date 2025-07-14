public class Loops {
  public static void main(String[] args) {
    /*
      while
      for
      do while
     */

     /*
       while(condition) {
        do something
       }
      */
      // int i = 1;
      // while (i <= 5) {
      //   System.out.println("Hello world");
      //   i++;
      // }

      /*
        for(initialisation; condition; updation) {
          do something
        }
       */

      //  for(int i = 1; i<= 10; i++) {
      //   System.out.println("Vishal kumar singh");
      //  }

       //do-while Loop
       /*
         do {

         }while(condition);
        */
  //   int counter = 1;
  //   do {
  //     System.out.println("Hello world");
  //     counter++;
  //   }while(counter <= 10);
  // }

  //Break statement
  //to exit the loop
  //example
    for(int i = 1; i<= 5; i++) {
      if(i == 3) {
        break;
      }
      System.out.println(i);
    }
    System.out.println("I am out of the loop");


    //Continue statement -> to skip an iteration
    for(int i = 1; i<= 5; i++) {
      if(i == 3) {
        continue;
      }
      System.out.println(i);
    }






 }

}

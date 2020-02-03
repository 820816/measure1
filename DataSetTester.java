/**
   This program tests the DataSet class.
*/
public class DataSetTester
{
   public static void main(String[] args)
   {
      DataSet bankData = new DataSet();

      bankData.add(new BankAccount(0));
      bankData.add(new BankAccount(10000));
      bankData.add(new BankAccount(2000));

      System.out.println("Average balance = "
            + bankData.getAverage());
      Measurable max = bankData.getMaximum();
      System.out.println("Highest balance = "
         + max.getMeasure());

      DataSet coinData = new DataSet();

      coinData.add(new Coin(0.25, "quarter"));
      coinData.add(new Coin(0.1, "dime"));
      coinData.add(new Coin(0.05, "nickel"));

      System.out.println("Average coin value = "
            + coinData.getAverage());
      max = coinData.getMaximum();
      System.out.println("Highest coin value = "
            + max.getMeasure());

      BankAccount b1=new BankAccount(5000);
      BankAccount b2=new BankAccount(5500);

      int value=b1.compareTo(b2);

      if(value>0)
          System.out.println("Bank account b1 has more money.");
      else if(value<0)
          System.out.println("Bank account b2 has more money.");
      else
          System.out.println("The accounts have the same amount of money.");
          
      DataSet quizData = new DataSet();
      
      quizdata.

   }
}

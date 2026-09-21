

    class employee{

        public void deposit(int money)
        {   
            if(money>0)
            {

                System.out.println(money + " is credited");
            }
        }
       
    }

    public class Main {
     public static void main(String args[])
     {
       employee ob = new employee();

        ob.deposit(5000);
       
     }
    }

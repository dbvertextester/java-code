import java.util.Scanner;

class Customer {

    int accNum;
    String name;
    double balance;
    String branch;
    public int getAccNum() {
        return accNum;
    }
    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public Customer(int accNum, String name, double balance, String branch) {
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
        this.branch = branch;
    }
    public Customer(double accountNo, String name2, double balance2, String branch ) {
    }
    @Override
    public String toString() {
        return "Account [accNum=" + accNum +
                ", name=" + name +
                 ", balance=" + balance + 
                 ", branch=" + branch + "]";
    }

    class currentAcc extends Customer{

        currentAcc(int accNum, String name, double balance, String branch) {
            super(accNum, name, balance, branch);
        }

    }

    class savingAcc extends Customer {

        savingAcc(int accNum, String name, double balance, String branch) {
            super(accNum, name, balance, branch);
             
        }

    }

    public class Bank {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Customer[] c = new Customer[2];

            System.out.println(" Enter Your choice :  \n 1. create a Saving Account. \n 1.create a Current Account "+
                                     "\n3.Account Details. \n 4.Total bank Amount. \n 5. Diposite Amount. \n 6. Withdrow Amount  ");
            int ch = sc.nextInt();
            int i =0;


        switch(ch){
            case 1:{
                   System.out.println(" Enter your Details ");
                  int accNum = sc.nextInt();
                  String name=sc.next();
                  double balance = sc.nextDouble();
                  String brnach = sc.next();
                  if(balance >= 5000){
                  c[i] = new savingAcc(accNum, name, balance, brnach);
                  i++;
                } else {
                    System.out.println("Account Opning Balance Must be 5000 ");
                    break;
                }
            }
            case 2: {
                System.out.println("Enter your details");
                int accNum = sc.nextInt();
                String name=sc.next();
                double bal = sc.nextDouble();
                String brnach = sc.next();
                  if(bal >= 5000){
                c[i]=new currentAcc (accNum ,name,bal,brnach );
                i++;
                }else {
                    System.out.println("Account Opning Balance Must be 5000 ");
                    break;
                }break ;
            }    
            case 3: {
                  System.out.println("Enter your ac Number ");
                  int k1 = sc.nextInt();
                  for (Customer cc : c ){
                    if(cc.getAccNum() == k1){
                        System.out.print("\t\t" + "Name & balance :" + cc.getName()+ " "+ cc.getBalance());

                    } else {
                        System.out.println("Roung Acc Number ");
                    }
                  }
                }break;  
             case 4: {
                int sum =0;
                for (Customer cc  : c){
                    if(cc instanceof savingAcc || cc instanceof currentAcc){
                        sum+=cc.getBalance();
                        System.out.print(" Total bank Amount : "+sum);

                    }
                  }
                }
             case 5 : {
                       System.out.println(" Enter your Account num : ");
                       int k2 = sc.nextInt();
                       System.out.println(" Enter Amopunt to Diposite : ");
                       int k3 = sc.nextInt();
                       for (Customer cc  : c){
                          if(cc.getAccNum() == k2){
                           double d= cc.getBalance()+k3;
                           cc.setBalance(d);
                          }
                       }
                } 
            case 6 : {
                System.out.println(" Enter Your account number : ");
                int k4 = sc.nextInt();
                for(Customer cc : c){
                    if(cc.getAccNum() == k4){
                        System.out.print("Enter your Withdrow Amount ");
                        int k5 =sc.nextInt();
                    if(cc.getBalance()>1000 && cc.getBalance() > (1000+k5)){
                        double Withdrow = cc.getBalance() - k5;
                        cc.setBalance((Withdrow));
                    } else {
                        System.out.println(" Minimum balance Must be recuard 1000");
                    }
                    
                    }

                }
            }
            default : {
                System.out.println("Please Enter the 1 to 6 Number ");
            }
            
            }    
            
        }

    }
}
public class BankAccount  { //1) which object
 //2) what is the type of this object --> create class
 static String bankName; //3) what are the values of the object -->  create static and ns fields
 static String branchName; //4) what aret the operations of this obj --> create methods
 static String ifsc;       //5)what are the diff individual objects --> create instances
 long accNum;
 String accHName;
 double balance;
 Address address;
 public void deposit(double amt) throws  IllegalArgumentException{
 if(amt <= 0)
 throw new IllegalArgumentException("Do not pass -ve amount");
 this.balance = this.balance + amt; 
 this.alert(amt, "credited to");
 }
 public double withdraw(double amt) throws IllegalArgumentException, IllegalStateException {
 if(amt <= 0)
 throw new IllegalArgumentException("Do not pass -ve amount");
 if(amt > this.balance)
 throw new IllegalStateException("Insufficient Funds");
 this.balance = this.balance - amt;
 this.alert(amt, "debited from");
 return amt; 
 }
 private void alert(double amt, String action){
 System.out.println("Cash "+ amt + " is "+action+" your account "+this.accNum);
 System.out.println("Current Balance in your account is: "+ this.balance);
 }
 public void currentBalance(){
 System.out.println(this.balance);
 }
    public void transferMoney(BankAccount destAcc, double amt) 
 throws IllegalArgumentException, IllegalStateException{
 this.withdraw(amt);
 destAcc.deposit(amt); 
 System.out.println("Cash "+ amt + " is transfered to "+ destAcc.accNum);
 }
 static void bankName(){
 System.out.println("Bank Name: "+ bankName);
 }
 static void branchName(){
 System.out.println("Brach Name: "+ branchName);
 }
 static void ifsc(){
 System.out.println("Ifsc: "+ ifsc);
 }
 void display(){
 System.out.println("  bankName\t: " + bankName);
 System.out.println("  branchName\t: " + branchName);
 System.out.println("  ifsc\t\t: " + ifsc);
 System.out.println("  accNum\t\t: " + accNum);
 System.out.println("  accHName\t: " + accHName);
 System.out.println("  balance\t: " + balance);
 System.out.println("  dnum\t\t: " + address.dnum);
 System.out.println("  strNum\t: " + address.strNum);
 System.out.println("  city\t\t: " + address.city);
 }
}

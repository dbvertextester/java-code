package _41Facalty.java;

public class Parttime extends Facalty{
    
    int hour;
    double rate;

Parttime(int facaltyId, int hour, double rate){

    this.facaltyId =facaltyId;
    this.salary    = hour * rate;

}   
void display(){
    System.out.println(" Facalty id" + this.facaltyId);
    System.out.println("Sallery PartTime : "+ this.salary);
} 
}

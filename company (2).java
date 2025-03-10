
class company{
}
class car extends company{
         String brand;
         int speed;
         int no.of_doors;
         int seating_capacity;
  car(String brand,int speed,int no.of_doors,int seating_capacity){
  this.brand=brand;
  this.speed=speed;
  this.no.of_doors=no.of_doors;
  this.seating_capacity=seating_capacity;
}
public void display(){
System.out.println("Brand of the car is: "+brand);
System.out.println(" Max Speed of the car is: "+speed);
System.out.println("No.of Doors: "+no.of_doors);
System.out.println("Seating Capacity: +"seating_capacity);
}
public static void main(String[] args){ 
Scanner scan=new Scanner(System.in);  
System.out.println("Enter the Brand of the car is :"); 
String brand=scan.nextString();
System.out.println("Enter the Max Speed of the car is:");
String speed=scan.nextint(); 
System.out.println("Enter the No.of Doors  of the car is :"); 
String no.of_doors=scan.nextint();
System.out.println("Enter the Seating Capacity of the car is:");
String seating_capacity=scan.nextint();


third.display();
car first=new car("Suzuki",100,4,4);
car second=new car("BMW",140,2,2);

first.display();
second.diaplay();

}
}

class bike extends company{
   String brand;
   int speed;
   boolean gear;
bike("String brand,int speed,boolean gear"){
    this.brand=brand;
  this.speed=speed;
  this.gear=gear;
  
}
public void display(){
System.out.println("Brand of the bike is: "+brand);
System.out.println(" Max Speed of the bike is: "+speed);
System.out.println("If it has gears or not:"+gear)
}
public static void main(String[] args){ 
Scanner scan=new Scanner(System.in);  
System.out.println("Enter the Brand of the bike is :"); 
String brand=scan.nextString();
System.out.println("Enter the Max Speed of the bike is:");
String speed=scan.nextint();
System.out.println("Enter If it has gears or not: ");
third.display();
car first=new car("Royal Enfield",120,"Yes");
car second=new car("Duke",140,"Yes");

first.display();
second.diaplay();

}
} 
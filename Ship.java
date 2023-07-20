class Ship
{
	
	
String name;
int capacity;
double length;

//constructor
public  Ship(String name, int capacity, double length){
		/*name=nameb;
		capacity=capacitys;
		length=len*/
		
		//1,this keyword is the it will resolve the conflict btw instance var and constructor var(parametrt),,to avoid the ambigity(confusion) of the compiler
		//2,to invoke the instance mem of the classs
		this.name=name;
		this.capacity =capacity;
		this.length=length;
		
		
		System.out.println("ship constructor is invoked");
		this.toShip();
	}
	
//constructor
  Ship(){
	  
  }
	

	



public static void toShip(){
System.out.println("hey come lets enjoy ");
}
}
class Rocket 
{
String name;
int fuelCapacity;
double height;

public Rocket(String nme,int fuelC,double heightt){
	name=nme;
	fuelCapacity= fuelC;
	height=heightt;
	
	System.out.println("invoking rocket");
}

public static void toLaunch(){
System.out.println("ready to launch the rocket");
}
}
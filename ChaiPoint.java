//using for loop with the variable ref for storing the values.By printing the ref var we will get the values which is stored inside the variable ref.
/*class ChaiPoint
{
	
static String location="kormangala";
static String tea="masala tea";
static String tea1="lemon tea";
static String tea2="ginger tea";
static String tea3="early green tea";
static String tea4="pure green tea";
static String tea5="elachi tea";
static String tea6="spicy chai";
static String tea7="tea bags";
static String tea8="assam kadak chai";
static String tea9="black tea";

//static String chaiAvailable[]={"masala tea","lemon tea","ginger tea"};
static String chaiAvailable[]={tea,tea1,tea2,tea3,tea4,tea5,tea6,tea7,tea8,tea9
//};
//method
public static void getchaiAvailable(){
System.out.println("starting");

for (String ref:chaiAvailable){
System.out.println(ref);
}

for(int chai=0;chai<chaiAvailable.length;chai++){
	String ref=chaiAvailable[chai];
	System.out.println(ref);
}
System.out.println("ending");

}*/
class ChaiPoint
{
static String chaiAvailable[]={null,null,null,null};
static int index;
//add operation(adds tea into  chaiAvailable one by one)
public static boolean addChai(String chai){
	boolean isAdded=false;
	 
	if(chai!=null){
		//chaiAvailable[0]="masala tea"
		chaiAvailable[index] = chai;
		index++;
		isAdded=true;
		
	}else{
		System.out.println("cannot add");
		
	}return isAdded;
}

public static void getAllChai(){
	
	
	for(int chai=0;chai<chaiAvailable.length;chai++){
	String ref=chaiAvailable[chai];
	System.out.println(ref);
	}
}

}


















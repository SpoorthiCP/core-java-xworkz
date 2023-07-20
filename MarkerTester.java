class MarkerTester
{

public static void main(String hii[]){
/*
//default values 
Marker mar=new Marker();
mar.brandName="fine liner";
mar.price=90;
mar.colour="red";
System.out.println(mar.brandName+" "+mar.price+" "+mar.colour);
mar.toHighlight();
*/


/*
//parametreized constructor with 1 aruguments
Marker mar=new Marker(90);
System.out.println(mar.brandName+" "+mar.price+" "+mar.colour);
mar.toHighlight();
*/

//parametreized constructor with 2 aruguments

Marker mar=new Marker("red marker","red");
System.out.println(mar.brandName+" "+mar.price);
mar.toHighlight();
}
}
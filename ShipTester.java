class ShipTester
{
public static void main(String bro[]){

Ship sea=new Ship("titanic",2500,269.1);
//sea.name="titanic";
//sea.capacity=2500;
//sea.length=269.1;
//sea.toShip();
System.out.println(sea.name+ " "+sea.capacity+" "+sea.length);

Ship sea1=new Ship("queen mary",2691,365.2);
System.out.println(sea1.name+ " "+sea1.capacity+" "+sea1.length);

Ship sea2=new Ship("oasis of the seas",3675,365.2);
System.out.println(sea2.name+ " "+sea2.capacity+" "+sea2.length);

Ship sea3=new Ship("msc meravigila",5672,361.2);
System.out.println(sea3.name+ " "+sea3.capacity+" "+sea3.length);

Ship sea4=new Ship("harmony of the seas",3651,45.2);
System.out.println(sea4.name+ " "+sea4.capacity+" "+sea4.length);

Ship sea5=new Ship("carnival breeeze",4562,63.5);
System.out.println(sea5.name+ " "+sea5.capacity+" "+sea5.length);

Ship sea6=new Ship("norwegian",6521,234.1);
System.out.println(sea6.name+ " "+sea6.capacity+" "+sea6.length);

Ship sea7=new Ship("costal smeralda",5642,465.5);
System.out.println(sea7.name+ " "+sea7.capacity+" "+sea7.length);

Ship sea8=new Ship("royal princess",3695,63.5);
System.out.println(sea8.name+ " "+sea8.capacity+" "+sea8.length);

Ship sea9=new Ship("celebrity edge",9634,452.5);
System.out.println(sea9.name+ " "+sea9.capacity+" "+sea9.length);

//default constructor
Ship sea10=new Ship();
System.out.println(sea10);


// to reduce the lines of code we can pass the parameter inside the constructor with is created in class ,where in tester we can pass the arguments while we creating the object.
/*
Ship sea1=new Ship();
sea1.name="queen mary";
sea1.capacity=2691;
sea1.length=345.0;
sea1.toShip();
System.out.println(sea1.name+ " "+sea1.capacity+" "+sea1.length);

Ship sea2=new Ship();
sea2.name="oasis of the seas";
sea2.capacity=6780;
sea2.length=361.5;
sea2.toShip();
System.out.println(sea2.name+ " "+sea2.capacity+" "+sea2.length);

Ship sea3=new Ship();
sea3.name="msc meravigila";
sea3.capacity=5700;
sea3.length=315.7;
sea3.toShip();
System.out.println(sea3.name+ " "+sea3.capacity+" "+sea3.length);

Ship sea4=new Ship();
sea4.name="harmony of the seas";
sea4.capacity=6780;
sea4.length=362.2;
sea4.toShip();
System.out.println(sea4.name+ " "+sea4.capacity+" "+sea4.length);

Ship sea5=new Ship();
sea5.name="carnival breeeze";
sea5.capacity=3690;
sea5.length=306.0;
sea5.toShip();
System.out.println(sea5.name+ " "+sea5.capacity+" "+sea5.length);

Ship sea6=new Ship();
sea6.name="norwegian";
sea6.capacity=3998;
sea6.length=333.5;
sea6.toShip();
System.out.println(sea6.name+ " "+sea6.capacity+" "+sea6.length);

Ship sea7=new Ship();
sea7.name="costal smeralda";
sea7.capacity=6540;
sea7.length=337.0;
sea7.toShip();
System.out.println(sea7.name+ " "+sea7.capacity+" "+sea7.length);

Ship sea8=new Ship();
sea8.name="royal princess";
sea8.capacity=3600;
sea8.length=330.0;
sea8.toShip();
System.out.println(sea8.name+ " "+sea8.capacity+" "+sea8.length);

Ship sea9=new Ship();
sea9.name="celebrity edge";
sea9.capacity=2918;
sea9.length=306.0;
sea9.toShip();
System.out.println(sea9.name+ " "+sea9.capacity+" "+sea9.length);
*/
}
}
class PandaFoodTester
{
public static void main(String args[]){

double value=PandaFood.search("palav",3);
System.out.println(value);
double value1=PandaFood.search("gheerice",3);
System.out.println(value1);
double value2=PandaFood.search("risebath",3);
System.out.println(value2);
double value3=PandaFood.search("kulcha",3);
System.out.println(value3);
double value4=PandaFood.search("panner kadai",3);
System.out.println(value4);
double value5=PandaFood.search("avalakki",3);
System.out.println(value5);
double value6=PandaFood.search("veg briyani",3);
System.out.println(value6);
double value7=PandaFood.search("kashmiri briyani",3);
System.out.println(value7);
double value8=PandaFood.search("puliogrere",3);
System.out.println(value8);
double value9=PandaFood.search("kesaribath",3);
System.out.println(value9);

System.out.println("hello JK");
//update
String mamma=PandaFood.getValueUpdated("palav","bisibelebath");
System.out.println("the updated food name is "+mamma);
String mamma1=PandaFood.getValueUpdated("gheerice","curdrice");
System.out.println("the updated food name is "+mamma1);
String mamma2=PandaFood.getValueUpdated("kulcha","butter nan");
System.out.println("the updated food name is "+mamma2);
String mamma3=PandaFood.getValueUpdated("veg briyani","mushroom masala");
System.out.println("the updated food name is "+mamma3);
}
}
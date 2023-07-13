class PandaFood
{
	
public static double search(String food,int quantity)
{
if(food=="palav"){
System.out.println("the orderd food is "+food);

return 150*quantity;
}
if(food=="gheerice"){
System.out.println("the orderd food is "+food);

return 200*quantity;
}
if(food=="risebath"){
System.out.println("the orderd food is "+food);

return 120*quantity;
}
if(food=="kulcha"){
System.out.println("the orderd food is "+food);

return 150*quantity;
}
if(food=="panner kadai"){
System.out.println("the orderd food is "+food);

return 270*quantity;
}
if(food=="avalakki"){
System.out.println("the orderd food is "+food);

return 50*quantity;
}
if(food=="veg briyani"){
System.out.println("the orderd food is "+food);

return 200*quantity;
}
if(food=="kashmiri briyani"){
System.out.println("the orderd food is "+food);

return 350*quantity;
}
if(food=="puliogrere"){
System.out.println("the orderd food is "+food);

return 90*quantity;
}
if(food=="kesaribath"){
System.out.println("the orderd food is "+food);
return 60*quantity;
}
return 0.0;
}



//update
public static String getValueUpdated(String oldName ,String newName){

System.out.println("invoking");
if(food.equals(oldName)){
	oldName=newName;
		//System.out.println("metro name is founded"+name);
	

return oldName;
}

/*if(oldName=="gheerice"){
	oldName=newName;
		//System.out.println("metro name is founded"+name);
	

return oldName;
}
if(oldName=="kulcha"){
	oldName=newName;
		//System.out.println("metro name is founded"+name);
	

return oldName;
}
if(oldName=="veg briyani"){
	oldName=newName;
		//System.out.println("metro name is founded"+name);
	

return oldName;
}
return null;
*/
}
}






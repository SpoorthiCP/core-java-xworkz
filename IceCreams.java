class IceCreams
{
static String flavours[]={null,null,null,null,null,null};
static int index=0;
public static boolean creamyWoo(String icyCreamy)
{
boolean isYummy=false;
if(icyCreamy!=null){
flavours[index]=icyCreamy;
index++;
isYummy=true;
}else{
System.out.println("plzz select another ice cream");

}
return isYummy;
}
public static void getIceCream(){
for(int k=0;k<flavours.length;k++){
String reference=flavours[k];
System.out.println(reference);
}
}
public static boolean updateFlavours(String existingflavour,String newFlavour){
	boolean isUpdated=false;
	for(int i=0;i<flavours.length;i++){
		if(flavours[i].equals(existingflavour)){
			flavours[i]=newFlavour;
			isUpdated=true;
		}
	}return isUpdated;
}

//delete 
public static int deleteFlavours(String deleteedFlavours){
	int noOfElements=flavours.length;
	boolean isDeleted=false;
	for(int index=0;index<flavours.length;index++){
		if(flavours[index].equals(deleteedFlavours)){
			//System.out.println("item name to be deleted is matched");
			break;
		}
	
	}
	if(index<noOfElements){
		noOfElements=noOfElements-1;
		for(int newItem=index;newItem<noOfElements;newItem++){
			//logic to remove 
			flavours[newItem]=flavours[newItem+1];
		}
	}
		System.out.println(noOfElements);
	return noOfElements;		
}
public static void getAllTheFlavours(int newLength){
	for(int index=0;index<newLength;index++){
		System.out.println(flavours[index]);
	}
}
}
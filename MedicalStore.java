class MedicalStore
{
static String medicineNames[]={null,null,null,null,null,null,null,null,null};
static int index=0;
public static boolean mediPlus(String tablet)
{
boolean isSearched=false;
if(tablet!=null){
medicineNames[index]=tablet;
index++;
isSearched=true;
}else{
System.out.println("sorry this medicine is not available");

}
return isSearched;
}
public static void getMedicines(){
for(int k=0;k<medicineNames.length;k++){
String reference=medicineNames[k];
System.out.println(reference);
}
}
public static boolean updateMedicinesNames(String existingName ,String newName){
boolean isUpdated=false;
for(int i=0;i<medicineNames.length;i++){
	if(medicineNames[i].equals(existingName)){
		medicineNames[i]=newName;
		isUpdated=true;
	}
}return isUpdated;
	

}
}
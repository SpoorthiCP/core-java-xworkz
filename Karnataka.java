class Karnataka
{
	//limitation of array size is fixed                                                                                                                                                                                                               
static String cityNames[]={null,null,null,null,null,null,null};
static  int index;
public static boolean addCities(String city){
	
boolean isSubstitued=false;
if(cityNames.length> index){
	
if(city!=null){
cityNames[index]=city;
index++;
isSubstitued = true;
}else{
System.out.println("plzz substitute crrt cities");
}
}else{
	System.out.println("cities cannot added");
}
return isSubstitued;
}
public static void getCities(){
/*for(int i=0;i<cityNames.length;i++){
String reference=cityNames[i];
System.out.println(reference);*/
for(String cityName:cityNames){
System.out.println(cityName);	
}
}

public static boolean updateCityName(String existingCities,String updatedCities ){
	 boolean isUpdated=false;
	for(int i=0;i<cityNames.length;i++ ){
	if(cityNames[i].equals(existingCities)){
		cityNames[i]=updatedCities;
		isUpdated=true;
	}	
	}return isUpdated;
}
}

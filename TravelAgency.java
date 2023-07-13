class TravelAgency
{
static String touristPlace[]={null,null,null,null,null,null,null};
static int index=0;
public static boolean agency(String travel)
{
boolean isPlaceAdded=false;
if(travel!=null){
touristPlace[index]=travel;
index++;
isPlaceAdded=true;
}else{
System.out.println("sorry this place is not in the list plz enter another travel place");

}
return isPlaceAdded;
}
public static void getTravelAgency(){
for(int k=0;k<touristPlace.length;k++){
String reference=touristPlace[k];
System.out.println(reference);
}
}
public static boolean updatePlace(String ExistingPlace,String newPlace){
	boolean isUpdated=false;
	for(int i=0;i<touristPlace.length;i++){
		if(touristPlace[i].equals(ExistingPlace)){
			touristPlace[i]=newPlace;
			isUpdated=true;
		}
	}return isUpdated;
}
}
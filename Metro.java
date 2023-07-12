class Metro
{
static String stationNames[]={null,null,null,null,null,null,null};
static int index=0;
public static boolean nammaMetro(String station){
boolean isAdded=false;
if(station!=null)
{
 stationNames[index]=station;
 index++;
isAdded=true;
}else{
System.out.println("plzz enetr the valid metro names");

}return isAdded;
}
public static void getMetroNames(){
for(int i=0;i<stationNames.length;i++){
String reference =stationNames[i];
System.out.println(reference);
}
}


public static boolean updateStationNames(String existingStation,String newStation){
	boolean isUpdated=false;
	for(int j=0;j<stationNames.length;j++){
		if(stationNames[j].equals(existingStation)){
			stationNames[j]=newStation;
			isUpdated=true;
		}
	}return isUpdated;
}
//return specific name (string)
public static String getMetroByName(String statNames){
	String sName=null;
System.out.println("invoking");
for(String name:stationNames){
	if(name.equals(statNames)){
		sName=name;
		//System.out.println("metro name is founded"+name);
	}
}
return sName;
}
}
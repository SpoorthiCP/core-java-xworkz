class IndianRupee{

private int rupeeId;
private String rupeeName;
private String printDate;
private String colour;
private String serialNo;
static  int noOfLanguages;
private String size;
private String backSidePlaceName;
private String location;


//
public void setId(int rupeeId){
this.rupeeId=rupeeId;
}
public int getId(){
return rupeeId;
}
//
public void setName(String rupeeName){
this.rupeeName=rupeeName;
}
public String getName(){
return rupeeName;
}

public void setDate(String printDate){
this.printDate=printDate;
}
public String getDate(){
return printDate;
}
//
public void setColour(String colour){
this.colour=colour;
}
public String getColour(){
return colour;
}
//
public void setSerial(String serialNo){
this.serialNo=serialNo;
}
public String getSerial(){
return serialNo;
}
//
public void setSize(String size){
this.size=size;
}
public String getSize(){
return size;
}
//
public void setPlace(String backSidePlaceName){
this.backSidePlaceName=backSidePlaceName;
}
public String getPlace(){
return backSidePlaceName;
}
//
public void setLoc(String location){
this.location=location;
}
public String getLoc(){
return location;
}
}
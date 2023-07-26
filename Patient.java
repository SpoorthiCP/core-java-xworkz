class Patient
{
private int patientId;
private String patientName;
private int patientAge;
private String patientBldGrup;
private String attenderName;
private String patientGender;
private String address;
private long contactNo;
private int wardNo;
private String diseaseName;
private String consultant;
private String hospitalName;
private double fees;

// 
public void setId(int patientId){
this.patientId=patientId;
}
public int getId(){
return patientId;
}
//
public void setName(String patientName){
this.patientName=patientName;
}
public String getName(){
return patientName;
}
//
public void setAge(int patientAge){
this.patientAge=patientAge;
}
public int getAge(){
return patientAge;
}
//
public void setBlood(String patientBldGrup){
this.patientBldGrup=patientBldGrup;
}
public String getBlood(){
return patientBldGrup;
}
//
public void setAttend(String attenderName){
this.attenderName=attenderName;
}
public String getAttend(){
return attenderName;
}
//
public void setGender(String patientGender){
this.patientGender=patientGender;
}
public String getGender(){
return patientGender;
}
//
public void setAdd(String address){
this.address=address;
}
public String getAdd(){
return address;
}
//
public void setContact(long contactNo){
this.contactNo=contactNo;
}
public long getContact(){
return contactNo;
}
//
public void setWard(int wardNo){
this.wardNo=wardNo;
}
public int getWard(){
return wardNo;
}
//
public void setDis(String diseaseName){
this.diseaseName=diseaseName;
}
public String getDis(){
return diseaseName;
}
//
public void setCon(String consultant){
this.consultant=consultant;
}
public String getCon(){
return consultant;
}
//
public void setHos(String hospitalName){
this.hospitalName=hospitalName;
}
public String getHos(){
return hospitalName;
}
//
public void setFee(double fees){
this.fees=fees;
}
public double getFee(){
return fees;
}


}
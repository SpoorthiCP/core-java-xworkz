class PatientTester{
public static void main(String hii[]){
//hospital
Patient hospital=new Patient();

hospital.setId(100);
hospital.setName("anush ramaiah");
hospital.setAge(23);
hospital.setBlood("A+");
hospital.setAttend("ramaiah");
hospital.setGender("male");
hospital.setAdd("rajajinagar,bangaluru-560022");
hospital.setContact(8542456);
hospital.setWard(101);
hospital.setDis("dengu");
hospital.setCon("Dr.pratap");
hospital.setHos("annapurna multispeciality hospital");
hospital.setFee(25000.45);

System.out.println(hospital.getId()
+ '\n' +
hospital.getName()+ '\n' +
hospital.getAge()+ '\n' +
hospital.getBlood()+ '\n' +
hospital.getAttend()+ '\n' +
hospital.getGender()+ '\n' +
hospital.getAdd()+ '\n' +
hospital.getContact()+ '\n' +
hospital.getWard()+ '\n' +
hospital.getDis()+ '\n' +
hospital.getCon()+ '\n' +
hospital.getHos()+ '\n' +
hospital.getFee());
System.out.println("*****************************************");
//clinic
Patient clinic =new Patient();

clinic.setId(21);
clinic.setName("guru prasad");
clinic.setAge(55);
clinic.setBlood("b+");
clinic.setAttend("prasanth and padmini");
clinic.setGender("male");
clinic.setAdd("basveshwar nagar,bangaluru-560051");
clinic.setContact(458964564);
clinic.setWard(2);
clinic.setDis("daibetics");
clinic.setCon("Dr.praveen");
clinic.setHos("devi clinic");
clinic.setFee(2500.56);

System.out.println(clinic.getId()
+ '\n' +clinic.getName()+ '\n' +
clinic.getAge()+ '\n' +
clinic.getBlood()+ '\n' +
clinic.getAttend()+ '\n' +
clinic.getGender()+ '\n' +
clinic.getAdd()+ '\n' +
clinic.getContact()+ '\n' +
clinic.getWard()+ '\n' +
clinic.getDis()+ '\n' +
clinic.getCon()+ '\n' +
clinic.getHos()+ '\n' + 
clinic.getFee());
}
}

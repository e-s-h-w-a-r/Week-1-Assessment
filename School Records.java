School Records
package com.prodapt.Week1Assignment;

public class SchoolRecords {
String schoolName = "XYZ", schoolAddress = "ABC";
int schoolID = 123;
public void ddRecords() {
	System.out.println("Records added");
}
public void dispRecords() {
	System.out.println("School Name : " + schoolName);
	System.out.println("School ID : " + schoolID);
	System.out.println("School Address : " + schoolAddress);
}
}

Tester
package com.prodapt.Week1Assignment;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SchoolRecords sr = new SchoolRecords();
sr.ddRecords();
sr.dispRecords();
	}

}
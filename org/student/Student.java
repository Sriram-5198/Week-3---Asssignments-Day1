package org.student;

import org.department.Department;

public class Student extends Department  {
   public void studentName() {
	System.out.println("Sri Ram");

}
   
   public void studentDept() {
	System.out.println("Bsc.Cs");

}
   
   public void studentId() {
	System.out.println("16CS74");

}
   public static void main(String[] args) {
	Student st=new Student();
//	st.collegeName();
//	st.collegeCode();
//	st.collegeRank();
	st.deptName();
	st.studentName();
	st.studentDept();
	st.studentId();
	
}
}

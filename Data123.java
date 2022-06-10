package study;

import java.io.*;  
import java.sql.*;  
import javax.sql.*;  
import java.util.*;  
public class Data123  
 {  
 public static void main(String[] args) throws Exception   
  {   int regdno,mark;  
     String stdname,branch;    
     Connection con=null;  
     Statement s=null;  
     ResultSet rs=null;  
    int ch;  
    boolean flag=true;  
          Scanner sc=new Scanner(System.in);  
 
          Class.forName("org.postgresql.Driver");
  Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/awsdb", "postgres", "Raghav");  
    
       
       
do  
{   
System.out.println("1- Insert a record");  
 System.out.println(" 2- Delete the record");  
 System.out.println(" 4- Udpate a reord");  
System.out.println("4- Retrieve the record");  
System.out.println("5- Exit");  
System.out.println("Enter your choice");  
ch=Integer.parseInt(sc.nextLine());  
  
switch(ch)  
{  
case 1:  
Statement st = conn.createStatement(); 
 System.out.println(" enter regdno");  
 regdno=sc.nextInt();  
  System.out.println(" enter stdname");  
  stdname=sc.next();  
  System.out.println(" enter branch");  
  branch=sc.next();   
  System.out.println(" enter mark");  
  mark=sc.nextInt();
     
   String qry="insert into student values("+regdno+",'"+stdname+"','"+branch+"',"+mark+")";  
   System.out.println(qry);
	
	int z= st.executeUpdate(qry);
	
	if(z>0)
		System.out.println("Data Inserted Successfully !!");    
  break;  
   
case 2:  
    
Statement s1 = conn.createStatement(); 
 System.out.println(" enter regdno");  
 regdno=sc.nextInt();  
  System.out.println(" enter stdname");  
  stdname=sc.next();  
  System.out.println(" enter branch");  
  branch=sc.next();   
  System.out.println(" enter mark");  
  mark=sc.nextInt();
     
   String qry1="delete from student where regdno="+"'"+mark+"'";  
   System.out.println(qry1);
   
	int z1= s1.executeUpdate(qry1);
	
	if(z1>0)
		System.out.println("Data deleted Successfully !!");   
	 break; 
case 3:  
   
 Statement s2 = conn.createStatement();
   System.out.println("enter usn to be updated");  
   String regdno1=sc.nextLine();  
   String query="update student set marks=90 where reg='"+regdno1+"'";  
    
   int z3=s2.executeUpdate(query);  
   
  

	if(z3>0)
		System.out.println("Data updated Successfully !!"); 
   
       
  break;  

case 4:  
  

  String q="select * from stud ";  
  Statement s4=con.createStatement();  
  rs=s4.executeQuery(q);  
  ResultSet rs1 = s4.executeQuery("select * from student");   
	
	
	while(rs1.next())
	{
		 System.out.println(rs1.getInt("regdno")+","+rs1.getString("stdname")+","+rs1.getString("branch")+","+rs1.getInt("mark"));
	}
	conn.close();    
 
    
s.close();  
con.close();  
break;  
case 5:  
 System.exit(1);  
   break;  
  
}
System.out.println("do u want to continue(yes /no)");  
String str=sc.nextLine();  
if(str.equals("yes")|| str.equals("y"))  
flag=true;  
if(str.equals("no")||str.equals("no"))  
flag=false;  
  
}while(flag); 
  
}}

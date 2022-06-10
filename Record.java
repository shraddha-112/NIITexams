package exams;

import java.sql.*;
import java.util.Scanner;

public class Record {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/niit", "postgres", "Ruchi@112");
		
		Statement st = (Statement) con.createStatement();
		Scanner  sc = new  Scanner(System.in);
		
		System.out.println("Enter a Number between 1- 4: 1-> Insert Data, 2-> Update Data, 3-> Retrieve Data, 4-> Delete Data");
        int  x = sc.nextInt();
        
        switch(x) {
        
        case 1: 
        	System.out.println("Enter data of Student by following- regdno, stdname, branch, marks");
    		int  regdno= sc.nextInt();
    		String  stdname =  sc.next();
    		String  branch= sc.next();
    		float  mark  =sc.nextFloat();
    		
    		String qry= "insert into Student2  values("+ regdno + " , '"+ stdname+ "', '"+branch+ "' , "+ mark+")";
    		System.out.println(qry);
    		sc.close();

    		int z = st.executeUpdate(qry);
    		if(z>0)
    			System.out.println("Data Inserted Successfully !!");
    		con.close(); 
    		
    		break;
    	
        case 2:
        	System.out.println("Enter Student name, branch & marks to Update");
        	String  stdname1 =  sc.next();
    		String  branch1= sc.next();
    		float  mark1  =sc.nextFloat();
    		
    		System.out.println("Enter Student's regdno whose data you like to update");
    		int  regdno1 = sc.nextInt();
    		
    		String qry1="update Student2 set stdname='"+stdname1+"', branch='"+branch1+"', marks="+mark1+" where regdno="+regdno1;                   
    		System.out.println(qry1);
    		sc.close();

    		int z1 =st.executeUpdate(qry1);
    		if(z1>0)
    			System.out.println("Data Updated Successfully !!");
    		con.close(); 
    		
    		break;
    		

        case 3: 
        	ResultSet rs = st.executeQuery("select * from Student2");
    		while(rs.next())
//    			System.out.println(rs);
    			System.out.println(rs.getInt("regdno") + ", " + rs.getString("stdname")+ ", " +rs.getString("branch")+", "+rs.getFloat("mark"));
    		con.close();
    		
    		break;
    		
        case 4:
        	
        	System.out.println("Enter Student regdno to delete: ");
        	int  regdno2 = sc.nextInt();
        	String qry2 = "delete from Student2 where regdno = "+regdno2;
        	
        	int z2 =st.executeUpdate(qry2);
    		if(z2>0)
    			System.out.println("Data Deleted Successfully !!");
    		con.close();
        	
    		break;
    		
    	default: 
    		System.out.println("Other Number");
       }

		sc.close();
	}

}

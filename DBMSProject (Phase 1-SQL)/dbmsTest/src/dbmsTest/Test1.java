package dbmsTest;

import java.sql.*;
import java.util.Scanner;


public class Test1 {

	public static void main(String[] args) {
		
		mainscreen ms = new mainscreen();
		ms.setVisible(true);

	}

	
	public static ResultSet getProduct() {
	try {
		Connection conn = getconn();
		Statement stat = conn.createStatement();

		ResultSet res = stat.executeQuery("select * from products");
		
		
		return res;
	}catch(Exception e){
		System.out.println(e.toString());
		return null;
	}
	}
	
	public static boolean insertLOGIN(String email, String pass, int ID) {
		
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("INSERT INTO LOGIN(EMAIL, PASSWORD, LOGIN_ID) VALUES (?, ?, ?)");
			stat.setString(1, email);
			stat.setString(2, pass);
			stat.setInt(3, ID);
			stat.executeUpdate();
			return true;
			
			
		}catch(Exception e){
			
			return false;
		}
		}
	
	public static boolean insertCustomer(String name, String email, int cno, int id) {
		
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("INSERT INTO CUSTOMER(CUSTOMERID, CU_NAME, CU_EMAIL, CU_CONTACT) VALUES (?, ?, ?, ?)");
			stat.setInt(1, id);
			stat.setString(2, name);
			stat.setString(3, email);
			stat.setInt(4, cno);
			stat.executeUpdate();
			return true;
			
			
		}catch(Exception e){
			
			return false;
		}
		}
	
	public static boolean insertSupplier(int id, String name, String des) {
		
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("INSERT INTO SUPPLIER(SUPPLIERID, SUPPLIERNAME, DESCRIPTION) VALUES (?, ?, ?)");
			stat.setInt(1, id);
			stat.setString(2, name);
			stat.setString(3, des);
			
			stat.executeUpdate();
			return true;
			
			
		}catch(Exception e){
			
			return false;
		}
		}
	
public static boolean insertProduct(int id, String name , String status) {
		
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("INSERT INTO PRODUCTS(PRODUCT_ID,PRODUCT_NAME,status) VALUES (?, ?, ?)");
			stat.setInt(1, id);
			stat.setString(2, name);
			stat.setString(3, status);
			stat.executeUpdate();
			return true;
			
			
		}catch(Exception e){
			
			return false;
		}
		}
	
	public static void UPDATELOGIN(String email, String pass, int ID) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("UPDATE LOGIN SET EMAIL=?, PASSWORD=? WHERE LOGIN_ID=?");
			stat.setString(1, email);
			stat.setString(2, pass);
			stat.setInt(3, ID);
			stat.executeUpdate();
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			
		}
		}
	
	public static boolean searchID(int ID) {
		boolean state=false;
		try {
			Connection conn = getconn();
			Statement stat = conn.createStatement();
			ResultSet res = stat.executeQuery("Select LOGIN_ID from login");
			while(res.next()) {
				if(ID==res.getInt(1)) {
					state= true;
				}
			}
			return state;
			
		
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			return false;
			
		}
			
		}
	
	public static boolean searchProduct(int ID) {
		boolean state=false;
		try {
			Connection conn = getconn();
			Statement stat = conn.createStatement();
			ResultSet res = stat.executeQuery("Select PRODUCT_ID from PRODUCTS");
			while(res.next()) {
				if(ID==res.getInt(1)) {
					state= true;
				}
			}
			return state;
			
		
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			return false;
			
		}
			
		}
	
	public static boolean searchSupplier(int ID) {
		boolean state=false;
		try {
			Connection conn = getconn();
			Statement stat = conn.createStatement();
			ResultSet res = stat.executeQuery("Select SUPPLIERID from SUPPLIER");
			while(res.next()) {
				if(ID==res.getInt(1)) {
					state= true;
				}
			}
			return state;
			
		
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			return false;
			
		}
			
		}
	
	public static boolean searchCustomer(int ID) {
		boolean state=false;
		try {
			Connection conn = getconn();
			Statement stat = conn.createStatement();
			ResultSet res = stat.executeQuery("Select CUSTOMERID from CUSTOMER");
			while(res.next()) {
				if(ID==res.getInt(1)) {
					state= true;
				}
			}
			return state;
			
		
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			return false;
			
		}
			
		}
	
	public static void UPDATECustomer(String name, String email, int cno, int id) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("UPDATE CUSTOMER SET CU_NAME=?, CU_EMAIL=?, CU_CONTACT=? WHERE CUSTOMERID=?");
			stat.setString(1, name);
			stat.setString(2, email);
			stat.setInt(3, cno);
			stat.setInt(4, id);
			
			stat.executeUpdate();
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			
		}
		}
	
	public static void UPDATEProduct(int id, String name, String status) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("UPDATE PRODUCTS SET PRODUCT_NAME=?, STATUS=? WHERE PRODUCT_ID=?");
			stat.setString(1, name);
			stat.setString(2, status);
			stat.setInt(3, id);
			
			
			stat.executeUpdate();
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			
		}
		}
	
	public static void UPDATESupplier(int id, String name, String des) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("UPDATE SUPPLIER SET SUPPLIERNAME=?, DESCRIPTION=? WHERE SUPPLIERID=?");
			stat.setString(1, name);
			stat.setString(2, des);
			stat.setInt(3, id);
			
			
			stat.executeUpdate();
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			
		}
		}
	
	public static boolean searchLogin(String email,String pass) {
		boolean state=false;
		try {
			Connection conn = getconn();
			Statement stat = conn.createStatement();
			ResultSet res = stat.executeQuery("Select email,password from login");
			while(res.next()) {
				
				if(email.equals(res.getString(1)) && pass.equals(res.getString(2))) {
					
					state= true;
				}
			}
			return state;
			
		
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			return false;
			
		}
			
		}
	
	public static void deleteLOGIN(int ID) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("DELETE FROM LOGIN WHERE LOGIN_ID=?");
			
			stat.setInt(1, ID);
			stat.executeUpdate();
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			
		}
		}
	
	public static void deleteProduct(int ID) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("DELETE FROM PRODUCTS WHERE PRODUCT_ID=?");
			
			stat.setInt(1, ID);
			stat.executeUpdate();
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			
		}
		}
	
	public static void deleteSupplier(int ID) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("DELETE FROM SUPPLIER WHERE SUPPLIERID=?");
			
			stat.setInt(1, ID);
			stat.executeUpdate();
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			
		}
		}
	
	
	public static void deleteCustomer(int ID) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("DELETE FROM CUSTOMER WHERE CUSTOMERID=?");
			
			stat.setInt(1, ID);
			stat.executeUpdate();
			
			
			
		}catch(Exception e){
			System.out.println(e.toString());
			
		}
		}
	
	

	public static ResultSet getProduct1(String name) {
	try {
		Connection conn = getconn();
		PreparedStatement stat = conn.prepareStatement("select * from (products join supplies on products_product_id=product_id) join supplier on supplierid=supplier_supplierId  where suppliername=?");
		stat.setString(1, name);
		ResultSet res = stat.executeQuery();
		
		return res;
	}catch(Exception e){
		System.out.println(e.toString());
		return null;
	}
	}	
	
	public static ResultSet viewBill(int id) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("select bill_id,total,method,cu_name,customerId , cname from bill b JOIN cashier c on b.cashier_id= c.id JOIN customer cus ON cus.customerid= b.customer_customerid where cus.customerId=?");
			stat.setInt(1, id);
			ResultSet res = stat.executeQuery();
			
			return res;
		}catch(Exception e){
			System.out.println(e.toString());
			return null;
		}
		}
	
	public static ResultSet viewEmployeeCount(String shift) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("select count(*) from employee where shift=?");
			stat.setString(1, shift);
			ResultSet res = stat.executeQuery();
			
			return res;
		}catch(Exception e){
			System.out.println(e.toString());
			return null;
		}
		}
	
	public static ResultSet viewPurchase(int id) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("select c.customerid,c.cu_name,p.product_name from buys b JOIN customer c ON b.customer_customerid=c.customerid JOIN products p ON b.products_product_id=p.product_id where b.customer_customerid=?");
			stat.setInt(1, id);
			ResultSet res = stat.executeQuery();
			
			return res;
		}catch(Exception e){
			System.out.println(e.toString());
			return null;
		}
		}
	
	public static ResultSet viewSupplier(int id) {
		try {
			Connection conn = getconn();
			PreparedStatement stat = conn.prepareStatement("select * from supplier s where s.supplierid=?");
			stat.setInt(1, id);
			ResultSet res = stat.executeQuery();
			
			return res;
		}catch(Exception e){
			System.out.println(e.toString());
			return null;
		}
		}
	
	public static Connection getconn() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			
			
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}

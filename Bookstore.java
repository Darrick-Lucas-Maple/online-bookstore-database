package DataBaseQuery;


import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Redux {

	
	static boolean running = true;
    static boolean idle = false;
    
	static int menuStage;
	static String userInput;
	static Scanner sc= new Scanner(System.in);
	static String driver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/onlinebookstore";
	static String Username = "root";
	static String Password = "Nedac20182018*";
	
	
	
	
	public static void mainMenu() throws SQLException {
		
		
		while (running == true) {
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("            -= Online Book Store =-    ");
        System.out.println("=================================================");
        System.out.println("1. Author");
        System.out.println("2: Book");
        System.out.println("3: Customer");
        System.out.println("4: Order");
        System.out.println("5: Publisher");
        System.out.println("6: Shopping Cart");
        System.out.println("7: Stock");
        System.out.println("8: Warehouse");
        System.out.println("=================================================");
        
        
        System.out.println("Please select a Menu: ");
        
        userInput = sc.nextLine();
       OUTER:
        switch(userInput) {
        case "1":
        	Author();
        	break;
        		
        case "2":
        	Book();
        	break;
        
        
        case "3":
        	Customer();
        	break;
        
        	
        case "4":
        	Order();
        	break;
        
        case "5":
        	Publisher();
        	break;
      
        case "6":
        	ShoppingCart();
        	break;
        	
        case "7":
        	Stock();
        	break;
        	
        case "8":
        	Warehouse();
        	break;
		}
        }

}
	
	
	public static void main(String[] args) throws SQLException {
		
		mainMenu();
}
	
	public static void Author() throws SQLException{
		
		 System.out.println("            -= Author Menu =-    ");
	        System.out.println("=================================================");
	        System.out.println("1. Add");
	        System.out.println("2: Delete");
	        System.out.println("3: View");
	        System.out.println("4: Return");
	        System.out.println("=================================================");
	        
	        System.out.println("What would you like to do?");
	        
	        
	        userInput = sc.nextLine();
	        
	        switch(userInput) {
	        
	        case "1":
	        	addAuthor();
	        	Author();
	        case "2":
	        	deleteAuthor();
	        	Author();
	        case "3":
	        	viewAuthor();
	        	Author();
	        case "4":
	        	System.out.println(" ");
	        	System.out.println("Returning to Main Menu");
	        	System.out.println(" ");
	        	break;
	        	
	        }
	        
	}
	
	public static void Publisher() throws SQLException{
		
		 System.out.println("            -= Publisher Menu =-    ");
	        System.out.println("=================================================");
	        System.out.println("1. Add");
	        System.out.println("2: Delete");
	        System.out.println("3: View");
	        System.out.println("4: Return");
	        System.out.println("=================================================");
	        
	        System.out.println("What would you like to do?");
	        
	        
	        userInput = sc.nextLine();
	        
	        switch(userInput) {
	        
	        case "1":
	        	addPublisher();
	        	Publisher();
	        case "2":
	        	deletePublisher();
	        	Publisher();
	        case "3":
	        	viewPublisher();
	        	Publisher();
	        case "4":
	        	System.out.println(" ");
	        	System.out.println("Returning to Main Menu");
	        	System.out.println(" ");
	        	break;
	        	
	        }
	        
	}
	
	public static void Book() throws SQLException{
		
		 System.out.println("            -= Book Menu =-    ");
	        System.out.println("=================================================");
	        System.out.println("1. Add");
	        System.out.println("2: Delete");
	        System.out.println("3: View");
	        System.out.println("4: Return");
	        System.out.println("=================================================");
	        
	        System.out.println("What would you like to do?");
	        
	        
	        userInput = sc.nextLine();
	        
	        switch(userInput) {
	        
	        case "1":
	        	addBook();
	        	Book();
	        case "2":
	        	deleteBook();
	        	Book();
	        case "3":
	        	viewBook();
	        	Book();
	        case "4":
	        	System.out.println(" ");
	        	System.out.println("Returning to Main Menu");
	        	System.out.println(" ");
	        	break;
	        	
	        }
	        
	}
	
	public static void Customer() throws SQLException{
		
		 System.out.println("            -= Customer Menu =-    ");
	        System.out.println("=================================================");
	        System.out.println("1. Register");
	        System.out.println("2: Delete");
	        System.out.println("3: View");
	        System.out.println("4: Return");
	        System.out.println("=================================================");
	        
	        System.out.println("What would you like to do?");
	        
	        
	        userInput = sc.nextLine();
	        
	        switch(userInput) {
	        
	        case "1":
	        	addCustomer();
	        	Customer();
	        case "2":
	        	deleteCustomer();
	        	Customer();
	        case "3":
	        	viewCustomer();
	        	Customer();
	        case "4":
	        	System.out.println(" ");
	        	System.out.println("Returning to Main Menu");
	        	System.out.println(" ");
	        	mainMenu();
	        	
	        }
	        
	}
	
	public static void ShoppingCart() throws SQLException{
		
		 System.out.println("            -= Shopping Cart Menu =-    ");
	        System.out.println("=================================================");
	        System.out.println("1. Add");
	        System.out.println("2: Delete");
	        System.out.println("3: View");
	        System.out.println("4: Return");
	        System.out.println("=================================================");
	        
	        System.out.println("What would you like to do?");
	        
	        
	        userInput = sc.nextLine();
	        
	        switch(userInput) {
	        
	        case "1":
	        	addShoppingCart();
	        	ShoppingCart();
	        case "2":
	        	deleteShoppingCart();
	        	ShoppingCart();
	        case "3":
	        	viewShoppingCart();
	        	ShoppingCart();
	        case "4":
	        	System.out.println(" ");
	        	System.out.println("Returning to Main Menu");
	        	System.out.println(" ");
	        	break;
	        	
	        }
	        
	}
	
	public static void Order() throws SQLException{
		
		 System.out.println("            -= Order Menu =-    ");
	        System.out.println("=================================================");
	        System.out.println("1. Register");
	        System.out.println("2: Delete");
	        System.out.println("3: View");
	        System.out.println("4: Return");
	        System.out.println("=================================================");
	        
	        System.out.println("What would you like to do?");
	        
	        
	        userInput = sc.nextLine();
	        
	        switch(userInput) {
	        
	        case "1":
	        	addOrder();
	        	Order();
	        case "2":
	        	deleteOrder();
	        	Order();
	        case "3":
	        	viewOrder();
	        	Order();
	        case "4":
	        	System.out.println(" ");
	        	System.out.println("Returning to Main Menu");
	        	System.out.println(" ");
	        	break;
	        	
	        }
	        
	}
	
	public static void Stock() throws SQLException{
		
		 System.out.println("            -= Stock Menu =-    ");
	        System.out.println("=================================================");
	        System.out.println("1. View");
	        System.out.println("2: Return");
	        System.out.println("=================================================");
	        
	        System.out.println("What would you like to do?");
	        
	        
	        userInput = sc.nextLine();
	        
	        switch(userInput) {
	        
	        case "2":
	        	mainMenu();
	        	
	        case "1":
	        	viewStock();
	        	Stock();
	      
	        	
	        }
	        
	}
	
	public static void Warehouse() throws SQLException{
		
		 System.out.println("            -= Stock Menu =-    ");
	        System.out.println("=================================================");
	        System.out.println("1. View");
	        System.out.println("2: Return");
	        System.out.println("=================================================");
	        
	        System.out.println("What would you like to do?");
	        
	        
	        userInput = sc.nextLine();
	        
	        switch(userInput) {
	        
	        case "2":
	        	mainMenu();
	        	
	        case "1":
	        	viewWarehouse();
	        	Warehouse();
	      
	        	
	        }
	        
	}
	public static void viewPublisher() throws SQLException{
		
		ResultSet resultSet = null;
		Statement statement = null;
		boolean notVerified = true;
		Connection conn = DriverManager.getConnection(url, Username, Password);
		
		System.out.println(" ");
		System.out.println("Connected!");
		System.out.println(" ");
		
		statement = conn.createStatement();
		while(notVerified = true) {
		String view = "select * from onlinebookstore.publisher";
		
		resultSet = statement.executeQuery(view);
		
		while(resultSet.next()) {
		String Name = resultSet.getString("Name");
		String Address = resultSet.getString("Address");
		String Phone = resultSet.getString("Phone");

		System.out.println("=================================================");
		System.out.println(Name + " " + Address + " " + Phone);
		System.out.println("=================================================");
		}
		
		System.out.println(" ");
		System.out.println("Entries Currently in Author Table");
		System.out.println(" ");
		System.out.println("Press any button to continue: ");
		System.out.println(" ");
		
		userInput = sc.nextLine();
		notVerified = false;
	break;	
		}
	}
	
public static void viewStock() throws SQLException{
		
		ResultSet resultSet = null;
		Statement statement = null;
		boolean notVerified = true;
		Connection conn = DriverManager.getConnection(url, Username, Password);
		
		System.out.println(" ");
		System.out.println("Connected!");
		System.out.println(" ");
		
		statement = conn.createStatement();
		while(notVerified = true) {
		String view = "select * from onlinebookstore.stock";
		
		resultSet = statement.executeQuery(view);
		
		while(resultSet.next()) {
		String ISBN = resultSet.getString("ISBN");
		String WarehouseID = resultSet.getString("WarehouseID");
		String Quantity = resultSet.getString("Quantity");

		System.out.println("=================================================");
		System.out.println(ISBN + " " + WarehouseID + " " + Quantity);
		System.out.println("=================================================");
		}
		
		System.out.println(" ");
		System.out.println("Entries Currently in Stock Table");
		System.out.println(" ");
		System.out.println("Press any button to continue: ");
		System.out.println(" ");
		
		userInput = sc.nextLine();
		notVerified = false;
	break;	
		}
	}
public static void viewWarehouse() throws SQLException{
	
	ResultSet resultSet = null;
	Statement statement = null;
	boolean notVerified = true;
	Connection conn = DriverManager.getConnection(url, Username, Password);
	
	System.out.println(" ");
	System.out.println("Connected!");
	System.out.println(" ");
	
	statement = conn.createStatement();
	while(notVerified = true) {
	String view = "select * from onlinebookstore.warehouse";
	
	resultSet = statement.executeQuery(view);
	
	while(resultSet.next()) {
	String Phone = resultSet.getString("Phone");
	String WarehouseID = resultSet.getString("WarehouseID");
	String Address = resultSet.getString("Address");

	System.out.println("=================================================");
	System.out.println(WarehouseID + " " + Phone + " " + Address);
	System.out.println("=================================================");
	}
	
	System.out.println(" ");
	System.out.println("Entries Currently in Warehouse Table");
	System.out.println(" ");
	System.out.println("Press any button to continue: ");
	System.out.println(" ");
	
	userInput = sc.nextLine();
	notVerified = false;
break;	
	}
}
	
public static void addShoppingCart() throws SQLException {
		
		boolean notVerified;
		String Email = null;
		String CartID = null;
		int emailLen = 20;
		int cartLen = 100;
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
				
		while (notVerified = true) {
		System.out.println("Enter Your Email: ");
		
		Email = sc.nextLine();
		
		Boolean b = Email.matches(EMAIL_REGEX);
		if(b == true) {
			System.out.println("ID is set");
			notVerified = false;
			break;
		}
		else {
			System.out.println("Invalid format. Email Example: cade17@gmail.com");
		}
		
		}
		
		
		while (notVerified = true) {
			System.out.println("Please Enter CartID: ");
			
			CartID = sc.nextLine();
			
			
			if(CartID.length() <= cartLen) {
				System.out.println("CartID is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is Invalid! Please enter 10 digits!");
			}
		}
		
		Auth:
		while(notVerified = true) {
		System.out.println("Your CartID is: " + CartID + " and your Email is: " + Email);
		System.out.println(" ");
		System.out.println("Would you like to confirm entry?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		
		userInput = sc.nextLine();
		
		switch(userInput) {
		case "1":
			Connection conn = DriverManager.getConnection(url, Username, Password);
			
			System.out.println(" ");
			System.out.println("Connected!");
			System.out.println(" ");
			
			String result = "INSERT into onlinebookstore.shoppingcart" 
					+ "(CartID, CustomerEmail)" 
					+ " values(?, ?)";
			//String number = Phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
			PreparedStatement statement = conn.prepareStatement(result);
			statement.setString(1, CartID);
			statement.setString(2, Email);
			
			System.out.println(" ");
			System.out.println(statement);
			System.out.println(" ");
			statement.executeUpdate();
			
			System.out.println(" ");
			System.out.println("Database Updated!");
			System.out.println(" ");
			break Auth;
			
		case "2":
			System.out.println(" ");
			System.out.println("Returning to Main Menu");
			System.out.println(" ");
			addCustomer();
			
			default:
				System.out.println(" ");
				System.out.println("Please Enter valid Number");
				System.out.println(" ");
			}
		}
	}

public static void deleteShoppingCart() throws SQLException{
	
	ResultSet resultSet = null;
	Statement statement = null;
	boolean notVerified = true;
	String Email2 = null;
	Connection conn = DriverManager.getConnection(url, Username, Password);
	
	System.out.println(" ");
	System.out.println("Connected!");
	System.out.println(" ");
	
	statement = conn.createStatement();
	
	String view = "select * from onlinebookstore.shoppingcart";
	
	resultSet = statement.executeQuery(view);
	
	while(resultSet.next()) {
	String CartID = resultSet.getString("CartID");
	String Email = resultSet.getString("CustomerEmail");
	System.out.println("=================================================");
	System.out.println(CartID + " " + Email);
	System.out.println("=================================================");
	
	
	}
	auth:
	while(notVerified = true) {
	System.out.println(" ");
	System.out.println("Please enter the email of the Entry you want to delete: ");
	System.out.println(" ");
	
	userInput = sc.nextLine();
	
	
	String sql = "DELETE from onlinebookstore.shoppingcart where CustomerEmail = '" + userInput + "'";
	PreparedStatement statement2 = conn.prepareStatement(sql);
	int ent = statement2.executeUpdate(sql);
	
	if (ent > 0) {
		System.out.println(" ");
		System.out.println("Entry has been Deleted");
		break auth;
	}
	else {
		System.out.println("Invalid Entry, Please select valid Email");
	}
	}
}
	
public static void addOrder() throws SQLException {
		
		boolean notVerified;
		String ISBN = null;
		String CartID = null;
		int Quantity = 0;
		int ISBNLen = 10;
		int cartLen = 250;
		int quanLen = 999;
		String alt = "SELECT ISBN FROM book";
		Statement statement1 = null;
		ResultSet resultSet1 = null;
		ResultSet resultSet2 = null;
		String alt2 = "SELECT CartID FROM ShoppingCart WHERE CartID = " + CartID;
		Connection conn1 = DriverManager.getConnection(url, Username, Password);
		while(notVerified = true) {
		
		
		System.out.println("Enter a Preexisting ISBN: ");
		
		
		statement1 = conn1.createStatement();
		resultSet1 = statement1.executeQuery("SELECT ISBN from onlinebookstore.book where ISBN = " + ISBN);
		
		ISBN = sc.nextLine();
		
		
		}
		

		
		

		
		
		
Connection conn2 = DriverManager.getConnection(url, Username, Password);
		
		System.out.println(" ");
		System.out.println("Connected!");
		System.out.println(" ");
		
		statement1 = conn2.createStatement();
		resultSet2 = statement1.executeQuery(alt2);
		
		while(resultSet2.next()) {
			if (CartID == "4") {
				System.out.println("CartID Set");
				break;
			}
			else {
				System.out.println("CartID doesn't Match result");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter CartID: ");
			
			CartID = sc.nextLine();
			
			if(CartID.length() <= cartLen) {
				System.out.println("Enter your Cart ID is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Character Number is too large!");
			}
		}
		
		/*while (notVerified = true) {
			System.out.println("Enter Quantity: ");
			
			Quantity = sc.nextInt();
			
			if(Quantity < quanLen) {
				System.out.println("Quanityt is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is Invalid! Please enter a number between 1-999");
			}
		}*/
		
		
		Auth:
		while(notVerified = true) {
		System.out.println("Your ISBN is: " + ISBN + " your CartID is: " + CartID);
		System.out.println("Your Quantity is: " + Quantity);
		System.out.println(" ");
		System.out.println("Would you like to confirm entry?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		
		userInput = sc.nextLine();
		
		switch(userInput) {
		case "1":
			Connection conn = DriverManager.getConnection(url, Username, Password);
			
			System.out.println(" ");
			System.out.println("Connected!");
			System.out.println(" ");
			
			String result = "INSERT into onlinebookstore.order" 
					+ "(ISBN, CartID, Quantity)" 
					+ " values(?, ?, ?)";
			String number = ISBN.replaceFirst("(\\d{1})(\\d{4})(\\d{4})(\\d{1})", "$1-$2-$3-$4");
			PreparedStatement statement = conn.prepareStatement(result);
			statement.setString(1, number);
			statement.setString(2, CartID);
			
			System.out.println(" ");
			System.out.println(statement);
			System.out.println(" ");
			System.out.println("Press enter");
			userInput = sc.nextLine();
			statement.executeUpdate();
			
			System.out.println(" ");
			System.out.println("Database Updated!");
			System.out.println(" ");
			break Auth;
			
		case "2":
			System.out.println(" ");
			System.out.println("Returning to Main Menu");
			System.out.println(" ");
			break Auth;
			
			default:
				System.out.println(" ");
				System.out.println("Please Enter valid Number");
				System.out.println(" ");
			}
		}
		}

public static void addCustomer() throws SQLException {
		
		boolean notVerified;
		String Email = null;
		String Name = null;
		String Phone = null;
		String Address = null;
		int emailLen = 20;
		int nameLen = 10;
		int phoneLen = 45;
		int addressLen = 100;
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
				
		while (notVerified = true) {
		System.out.println("Enter Your Email: ");
		
		Email = sc.nextLine();
		
		Boolean b = Email.matches(EMAIL_REGEX);
		if(b == true) {
			System.out.println("Email is set");
			notVerified = false;
			break;
		}
		else {
			System.out.println("Invalid format. Email Example: cade17@gmail.com");
		}
		
		}
		
		while (notVerified = true) {
			System.out.println("Enter Name: ");
			
			Name = sc.nextLine();
			
			if(Name.length() <= nameLen) {
				System.out.println("Name is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Character Number is too large!");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter Phone Number: ");
			
			Phone = sc.nextLine();
			
			
			if(Phone.length() <= phoneLen) {
				System.out.println("Phone number is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is Invalid! Please enter 10 digits!");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter Address: ");
			
			Address = sc.nextLine();
			
			if(Address.length() <= addressLen) {
				System.out.println("Address is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is too large!");
			}
		}
		
		Auth:
		while(notVerified = true) {
		System.out.println("Your Email is: " + Email + " and your Name is: " + Name);
		System.out.println("Your Phone Number is: " + Phone + " and your address is: " + Address);
		System.out.println(" ");
		System.out.println("Would you like to confirm entry?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		
		userInput = sc.nextLine();
		
		switch(userInput) {
		case "1":
			Connection conn = DriverManager.getConnection(url, Username, Password);
			
			System.out.println(" ");
			System.out.println("Connected!");
			System.out.println(" ");
			
			String result = "INSERT into onlinebookstore.customer" 
					+ "(Email, Name, Phone, Address)" 
					+ " values(?, ?, ?, ?)";
			String number = Phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
			PreparedStatement statement = conn.prepareStatement(result);
			statement.setString(1, Email);
			statement.setString(2, Name);
			statement.setString(3, number);
			statement.setString(4, Address);
			
			System.out.println(" ");
			System.out.println(statement);
			System.out.println(" ");
			statement.executeUpdate();
			
			System.out.println(" ");
			System.out.println("Database Updated!");
			System.out.println(" ");
			break Auth;
			
		case "2":
			System.out.println(" ");
			System.out.println("Returning to Main Menu");
			System.out.println(" ");
			addCustomer();
			
			default:
				System.out.println(" ");
				System.out.println("Please Enter valid Number");
				System.out.println(" ");
			}
		}
	}

public static void deleteOrder() throws SQLException{
	
	ResultSet resultSet = null;
	Statement statement = null;
	boolean notVerified = true;
	Connection conn = DriverManager.getConnection(url, Username, Password);
	
	System.out.println(" ");
	System.out.println("Connected!");
	System.out.println(" ");
	
	statement = conn.createStatement();
	
	String view = "select * from onlinebookstore.order";
	
	resultSet = statement.executeQuery(view);
	
	while(resultSet.next()) {
	String ISBN = resultSet.getString("ISBN");
	String CartID = resultSet.getString("CartID");
	String Quantity = resultSet.getString("Quantity");
	System.out.println("=================================================");
	System.out.println(ISBN + " " + CartID + " " + Quantity);
	System.out.println("=================================================");
	
	}
	auth:
	while(notVerified = true) {
	System.out.println(" ");
	System.out.println("Please enter the CartID of the Entry you want to delete: ");
	System.out.println(" ");
	
	userInput = sc.nextLine();
	
	
	String sql = "DELETE from onlinebookstore.order where CartID = '" + userInput + "'";
	statement = conn.createStatement();
	int ent = statement.executeUpdate(sql);
	
	if (ent > 0) {
		System.out.println(" ");
		System.out.println("Entry has been Deleted");
		break auth;
	}
	else {
		System.out.println("Invalid Entry, Please select valid Email");
	}
	}
}

public static void viewOrder() throws SQLException{
	
	ResultSet resultSet = null;
	Statement statement = null;
	boolean notVerified = true;
	Connection conn = DriverManager.getConnection(url, Username, Password);
	
	System.out.println(" ");
	System.out.println("Connected!");
	System.out.println(" ");
	
	statement = conn.createStatement();
	while(notVerified = true) {
	String view = "select * from onlinebookstore.order";
	
	resultSet = statement.executeQuery(view);
	
	while(resultSet.next()) {
	String ISBN = resultSet.getString("ISBN");
	String CartID = resultSet.getString("CartID");
	String Quantity = resultSet.getString("Quantity");
	
	System.out.println(ISBN + " " + CartID + " " + Quantity);
	}
	
	System.out.println(" ");
	System.out.println("Entries Currently in Author Table");
	System.out.println(" ");
	System.out.println("Press any button to continue: ");
	System.out.println(" ");
	
	userInput = sc.nextLine();
	notVerified = false;
break;	
	}
}
	
public static void deleteCustomer() throws SQLException{
	
	ResultSet resultSet = null;
	Statement statement = null;
	boolean notVerified = true;
	String Email2 = null;
	Connection conn = DriverManager.getConnection(url, Username, Password);
	
	System.out.println(" ");
	System.out.println("Connected!");
	System.out.println(" ");
	
	statement = conn.createStatement();
	
	String view = "select * from onlinebookstore.customer";
	
	resultSet = statement.executeQuery(view);
	
	while(resultSet.next()) {
	String Email = resultSet.getString("Email");
	String Name = resultSet.getString("Name");
	String Phone = resultSet.getString("Phone");
	String Address = resultSet.getString("Address");
	
	System.out.println(Email + " " + Name + " " + Phone + " " + Address);
	
	
	}
	auth:
	while(notVerified = true) {
	System.out.println(" ");
	System.out.println("Please enter the Name of the Entry you want to delete: ");
	System.out.println(" ");
	
	userInput = sc.nextLine();
	
	
	String sql = "DELETE from onlinebookstore.customer where Name = '" + userInput + "'";
	statement = conn.createStatement();
	int ent = statement.executeUpdate(sql);
	
	if (ent > 0) {
		System.out.println(" ");
		System.out.println("Entry has been Deleted");
		break auth;
	}
	else {
		System.out.println("Invalid Entry, Please select valid Email");
	}
	}
}
public static void viewCustomer() throws SQLException{
	
	ResultSet resultSet = null;
	Statement statement = null;
	boolean notVerified = true;
	Connection conn = DriverManager.getConnection(url, Username, Password);
	
	System.out.println(" ");
	System.out.println("Connected!");
	System.out.println(" ");
	
	statement = conn.createStatement();
	while(notVerified = true) {
	String view = "select * from onlinebookstore.customer";
	
	resultSet = statement.executeQuery(view);
	
	while(resultSet.next()) {
	String Email = resultSet.getString("Email");
	String Name = resultSet.getString("Name");
	String Phone = resultSet.getString("Phone");
	String Address = resultSet.getString("Address");
	System.out.println("=================================================");
	System.out.println(Email + " " + Name + " " + Phone + " " + Address);
	System.out.println("=================================================");
	}
	
	System.out.println(" ");
	System.out.println("Entries Currently in Customer Table");
	System.out.println(" ");
	System.out.println("Press any button to continue: ");
	System.out.println(" ");
	
	userInput = sc.nextLine();
	notVerified = false;
break;	
	}
}

public static void viewShoppingCart() throws SQLException{
	
	ResultSet resultSet = null;
	Statement statement = null;
	boolean notVerified = true;
	Connection conn = DriverManager.getConnection(url, Username, Password);
	
	System.out.println(" ");
	System.out.println("Connected!");
	System.out.println(" ");
	
	statement = conn.createStatement();
	while(notVerified = true) {
	String view = "select * from onlinebookstore.shoppingcart";
	
	resultSet = statement.executeQuery(view);
	
	while(resultSet.next()) {
	String CartID = resultSet.getString("CartID");
	String CustomerEmail = resultSet.getString("CustomerEmail");

	System.out.println("=================================================");
	System.out.println(CartID + " " + CustomerEmail);
	System.out.println("=================================================");
	}
	
	System.out.println(" ");
	System.out.println("Entries Currently in Shopping Cart Table");
	System.out.println(" ");
	System.out.println("Press any button to continue: ");
	System.out.println(" ");
	
	userInput = sc.nextLine();
	notVerified = false;
break;	
	}
}
public static void addBook() throws SQLException {
		
		boolean notVerified;
		String ISBN = null;
		String Title = null;
		String date = null;
		String price = null;
		String PublisherName = null;
		String AuthorID = null;
		int ISBNLen = 10;
		int TitleLen = 250;
		int MaxAddressID = 100;
		int nameLen = 100;
		int authLen = 20;
		int dateLen = 8;
		
		
		while (notVerified = true) {
		System.out.println("Enter the ISBN: ");
		
		ISBN = sc.nextLine();
		
		
		if(ISBN.length() == ISBNLen) {
			System.out.println("ISBN is set");
			notVerified = false;
			break;
		}
		else {
			System.out.println("Number is invalid!");
		}
		
		}
		
		while (notVerified = true) {
			System.out.println("Enter Title: ");
			
			Title = sc.nextLine();
			
			if(Title.length() <= TitleLen) {
				System.out.println("Title is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Character Number is too large!");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter Date YYYYMMDD: ");
			
			date = sc.nextLine();
			
			if(date.length() == dateLen) {
				System.out.println("Date is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is Invalid! Please enter 8 digits!");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter Price: ");
			
			price = sc.nextLine();
			
			if (price.matches("[-+]?[0-9]*\\.?[0-9]+")) {
				System.out.println("Address is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is too large!");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter Publisher Name: ");
			
			PublisherName = sc.nextLine();
			
			if(PublisherName.length() <= nameLen) {
				System.out.println("Publisher Name is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Character Number is too large!");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter the Author's ID: ");
			
			AuthorID = sc.nextLine();
			
			
			if(AuthorID.length() <= authLen) {
				System.out.println("ID is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is too large!");
			}
			
			}
		
		Auth:
		while(notVerified = true) {
		System.out.println("Your ISBN is: " + ISBN + " your title is: " + Title);
		System.out.println("Your date is: " + date + " Your Price is: " + price);
		System.out.println("Your Publisher Name is: " + PublisherName + " and Your Author ID is: " + AuthorID);
		System.out.println(" ");
		System.out.println("Would you like to confirm entry?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		
		userInput = sc.nextLine();
		
		switch(userInput) {
		case "1":
			Connection conn = DriverManager.getConnection(url, Username, Password);
			
			System.out.println(" ");
			System.out.println("Connected!");
			System.out.println(" ");
			
			String result = "INSERT into onlinebookstore.book" 
					+ "(ISBN, Title, Date, price, PublisherName, AuthorID)" 
					+ " values(?, ?, ?, ?, ?, ?)";
			String number = date.replaceFirst("(\\d{4})(\\d{2})(\\d{2})", "$1-$2-$3");
			PreparedStatement statement = conn.prepareStatement(result);
			statement.setString(1, ISBN);
			statement.setString(2, Title);
			statement.setString(4, price);
			statement.setString(3, number);
			statement.setString(5, PublisherName);
			statement.setString(6, AuthorID);
			
			System.out.println(" ");
			System.out.println(statement);
			System.out.println(" ");
			System.out.println("Press enter");
			userInput = sc.nextLine();
			statement.executeUpdate();
			
			System.out.println(" ");
			System.out.println("Database Updated!");
			System.out.println(" ");
			break Auth;
			
		case "2":
			System.out.println(" ");
			System.out.println("Returning to Main Menu");
			System.out.println(" ");
			break Auth;
			
			default:
				System.out.println(" ");
				System.out.println("Please Enter valid Number");
				System.out.println(" ");
			}
		}
}
public static void viewBook() throws SQLException{
		
		ResultSet resultSet = null;
		Statement statement = null;
		boolean notVerified = true;
		Connection conn = DriverManager.getConnection(url, Username, Password);
		
		System.out.println(" ");
		System.out.println("Connected!");
		System.out.println(" ");
		
		statement = conn.createStatement();
		while(notVerified = true) {
		String view = "select * from onlinebookstore.book";
		
		resultSet = statement.executeQuery(view);
		
		while(resultSet.next()) {
		String ISBN = resultSet.getString("ISBN");
		String Title = resultSet.getString("Title");
		Date date = resultSet.getDate("Date");
		Float Price = resultSet.getFloat("Price");
		String PublisherName = resultSet.getString("PublisherName");
		String AuthorID = resultSet.getString("AuthorID");
		System.out.println("=========================================================================================");
		System.out.println(ISBN + "|" + Title + "|" + date + "|" + Price + "|" + PublisherName + "|" + AuthorID);
		System.out.println("=========================================================================================");
		}
		
		System.out.println(" ");
		System.out.println("Entries Currently in Book Table");
		System.out.println(" ");
		System.out.println("Press any button to continue: ");
		System.out.println(" ");
		
		userInput = sc.nextLine();
		notVerified = false;
	break;	
		}
	}

public static void deleteBook() throws SQLException{
	
	ResultSet resultSet = null;
	Statement statement = null;
	boolean notVerified = true;
	Connection conn = DriverManager.getConnection(url, Username, Password);
	
	System.out.println(" ");
	System.out.println("Connected!");
	System.out.println(" ");
	
	statement = conn.createStatement();
	
	String view = "select * from onlinebookstore.book";
	
	resultSet = statement.executeQuery(view);
	
	while(resultSet.next()) {
		String ISBN = resultSet.getString("ISBN");
		String Title = resultSet.getString("Title");
		Date date = resultSet.getDate("Date");
		Float Price = resultSet.getFloat("Price");
		String PublisherName = resultSet.getString("PublisherName");
		String AuthorID = resultSet.getString("AuthorID");
	
	System.out.println("=========================================================================================");
	System.out.println(ISBN + "|" + Title + "|" + date + "|" + Price + "|" + PublisherName + "|" + AuthorID);
	System.out.println("=========================================================================================");
	}
	auth:
	while(notVerified = true) {
	System.out.println(" ");
	System.out.println("Please enter the Title of the Entry you want to delete: ");
	System.out.println(" ");
	
	String userInput = sc.nextLine();
	
	//ver:
	//while(notVerified = true) {
	//if(userInput.length() < 10) {
		//System.out.println("Please enter 10 digits");
		//userInput = sc.nextLine();
	//}
	//else {
		//break ver;
	//}
	//}
	//String IS = "?-?-?-?"
	
	//String number = userInput.replaceFirst("(\\d{1})(\\d{4})(\\d{4})(\\d{1})", "$1-$2-$3-$4");
	
	String sql = "DELETE from onlinebookstore.book where Title = '" + userInput + "'";
	statement = conn.createStatement();
	int ent = statement.executeUpdate(sql);
	
	if (ent > 0) {
		System.out.println(" ");
		System.out.println("Entry has been Deleted");
		break auth;
	}
	else {
		System.out.println("Invalid Entry, Please Enter valid Title");
	}
	}
}
	public static void viewAuthor() throws SQLException{
		
		ResultSet resultSet = null;
		Statement statement = null;
		boolean notVerified = true;
		Connection conn = DriverManager.getConnection(url, Username, Password);
		
		System.out.println(" ");
		System.out.println("Connected!");
		System.out.println(" ");
		
		statement = conn.createStatement();
		while(notVerified = true) {
		String view = "select * from onlinebookstore.author";
		
		resultSet = statement.executeQuery(view);
		
		while(resultSet.next()) {
		String AuthorID = resultSet.getString("AuthorID");
		String Name = resultSet.getString("Name");
		String Phone = resultSet.getString("Phone");
		String Address = resultSet.getString("Address");
		System.out.println("=================================================");
		System.out.println(AuthorID + " " + Name + " " + Phone + " " + Address);
		System.out.println("=================================================");
		}
		
		System.out.println(" ");
		System.out.println("Entries Currently in Author Table");
		System.out.println(" ");
		System.out.println("Press any button to continue: ");
		System.out.println(" ");
		
		userInput = sc.nextLine();
		notVerified = false;
	break;	
		}
	}
	public static void deleteAuthor() throws SQLException{
		
		ResultSet resultSet = null;
		Statement statement = null;
		boolean notVerified = true;
		Connection conn = DriverManager.getConnection(url, Username, Password);
		
		System.out.println(" ");
		System.out.println("Connected!");
		System.out.println(" ");
		
		statement = conn.createStatement();
		
		String view = "select * from onlinebookstore.author";
		
		resultSet = statement.executeQuery(view);
		
		while(resultSet.next()) {
		String AuthorID = resultSet.getString("AuthorID");
		String Name = resultSet.getString("Name");
		String Phone = resultSet.getString("Phone");
		String Address = resultSet.getString("Address");
		System.out.println("=================================================");
		System.out.println(AuthorID + " " + Name + " " + Phone + " " + Address);
		System.out.println("=================================================");
		
		
		}
		auth:
		while(notVerified = true) {
		System.out.println(" ");
		System.out.println("Please enter the account ID of the Entry you want to delete: ");
		System.out.println(" ");
		
		String userInput = sc.nextLine();
		
		String sql = "DELETE from onlinebookstore.author where AuthorID = " + userInput;
		statement = conn.createStatement();
		int ent = statement.executeUpdate(sql);
		
		if (ent > 0) {
			System.out.println(" ");
			System.out.println("Entry has been Deleted");
			break auth;
		}
		else {
			System.out.println("Invalid Entry, Please select valid Author ID");
		}
		}
	}
	
public static void deletePublisher() throws SQLException{
		
		ResultSet resultSet = null;
		Statement statement = null;
		boolean notVerified = true;
		Connection conn = DriverManager.getConnection(url, Username, Password);
		
		System.out.println(" ");
		System.out.println("Connected!");
		System.out.println(" ");
		
		statement = conn.createStatement();
		
		String view = "select name from onlinebookstore.publisher";
		
		resultSet = statement.executeQuery(view);
		
		while(resultSet.next()) {
		String Name = resultSet.getString("Name");
		//String Address = resultSet.getString("Address");
		//String Phone = resultSet.getString("Phone");
		
		System.out.println(Name);
		
		
		}
		auth:
		while(notVerified = true) {
		System.out.println(" ");
		System.out.println("Please enter the Name of the Entry you want to delete: ");
		System.out.println(" ");
		
		String userInput = sc.nextLine();
		
		String sql = "DELETE from onlinebookstore.publisher where Name = '" + userInput + "'";
		statement = conn.createStatement();
		int ent = statement.executeUpdate(sql);
		
		if (ent > 0) {
			System.out.println(" ");
			System.out.println("Entry has been Deleted");
			break auth;
		}
		else {
			System.out.println("Invalid Entry, Please select valid Author ID");
		}
		}
	}
	
	public static void addAuthor() throws SQLException {
		
		boolean notVerified;
		String AuthorID = null;
		String AuthName = null;
		String PhoneNumber = null;
		String Address = null;
		int AuthLengthID = 20;
		int MaxPhoneID = 10;
		int MaxNameID = 45;
		int MaxAddressID = 100;
		
		
		while (notVerified = true) {
		System.out.println("Enter the Author's ID: ");
		
		AuthorID = sc.nextLine();
		
		
		if(AuthorID.length() <= AuthLengthID) {
			System.out.println("ID is set");
			notVerified = false;
			break;
		}
		else {
			System.out.println("Number is too large!");
		}
		
		}
		
		while (notVerified = true) {
			System.out.println("Enter Name: ");
			
			AuthName = sc.nextLine();
			
			if(AuthName.length() <= MaxNameID) {
				System.out.println("Name is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Character Numberis too large!");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter Phone Number: ");
			
			PhoneNumber = sc.nextLine();
			
			
			if(PhoneNumber.length() <= MaxPhoneID) {
				System.out.println("Phone number is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is Invalid! Please enter 10 digits!");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter Address: ");
			
			Address = sc.nextLine();
			
			if(Address.length() <= MaxAddressID) {
				System.out.println("Address is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is too large!");
			}
		}
		
		Auth:
		while(notVerified = true) {
		System.out.println("Your Author ID is: " + AuthorID + " and your author's name is: " + AuthName);
		System.out.println("Your Phone Number is: " + PhoneNumber + " and your address is: " + Address);
		System.out.println(" ");
		System.out.println("Would you like to confirm entry?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		
		userInput = sc.nextLine();
		
		switch(userInput) {
		case "1":
			Connection conn = DriverManager.getConnection(url, Username, Password);
			
			System.out.println(" ");
			System.out.println("Connected!");
			System.out.println(" ");
			
			String result = "INSERT into onlinebookstore.author" 
					+ "(AuthorID, Name, Phone, Address)" 
					+ " values(?, ?, ?, ?)";
			String number = PhoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
			PreparedStatement statement = conn.prepareStatement(result);
			statement.setString(1, AuthorID);
			statement.setString(2, AuthName);
			statement.setString(3, number);
			statement.setString(4, Address);
			
			System.out.println(" ");
			System.out.println(statement);
			System.out.println(" ");
			statement.executeUpdate();
			
			System.out.println(" ");
			System.out.println("Database Updated!");
			System.out.println(" ");
			break Auth;
			
		case "2":
			System.out.println(" ");
			System.out.println("Returning to Main Menu");
			System.out.println(" ");
			break Auth;
			
			default:
				System.out.println(" ");
				System.out.println("Please Enter valid Number");
				System.out.println(" ");
			}
		}
	}
	
public static void addPublisher() throws SQLException {
		
		boolean notVerified;
		String Name = null;
		String Address = null;
		String PhoneNumber = null;
		int MaxPhoneID = 10;
		int MaxNameID = 45;
		int MaxAddressID = 100;
		
		
		while (notVerified = true) {
			System.out.println("Enter Name: ");
			
			Name = sc.nextLine();
			
			if(Name.length() <= MaxNameID) {
				System.out.println("Name is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Character Numberis too large!");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter Phone Number: ");
			
			PhoneNumber = sc.nextLine();
			
			
			if(PhoneNumber.length() <= MaxPhoneID) {
				System.out.println("Phone number is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is Invalid! Please enter 10 digits!");
			}
		}
		
		while (notVerified = true) {
			System.out.println("Enter Address: ");
			
			Address = sc.nextLine();
			
			if(Address.length() <= MaxAddressID) {
				System.out.println("Address is set");
				notVerified = false;
				break;
			}
			else {
				System.out.println("Number is too large!");
			}
		}
		
		Auth:
		while(notVerified = true) {
		System.out.println("Your author's name is: " + Name);
		System.out.println("Phone Number is: " + PhoneNumber + " and address is: " + Address);
		System.out.println(" ");
		System.out.println("Would you like to confirm entry?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		
		userInput = sc.nextLine();
		
		switch(userInput) {
		case "1":
			Connection conn = DriverManager.getConnection(url, Username, Password);
			
			System.out.println(" ");
			System.out.println("Connected!");
			System.out.println(" ");
			
			String result = "INSERT into onlinebookstore.publisher" 
					+ "(Name, Address, Phone)" 
					+ " values(?, ?, ?)";
			String number = PhoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
			PreparedStatement statement = conn.prepareStatement(result);
			
			statement.setString(1, Name);
			statement.setString(3, number);
			statement.setString(2, Address);
			
			System.out.println(" ");
			System.out.println(statement);
			System.out.println(" ");
			statement.executeUpdate();
			
			System.out.println(" ");
			System.out.println("Database Updated!");
			System.out.println(" ");
			break Auth;
			
		case "2":
			System.out.println(" ");
			System.out.println("Returning to Main Menu");
			System.out.println(" ");
			break Auth;
			
			default:
				System.out.println(" ");
				System.out.println("Please Enter valid Number");
				System.out.println(" ");
			}
		}
	}
}


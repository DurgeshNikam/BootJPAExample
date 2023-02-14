package com.jpa.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepositary;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
	UserRepositary userRepositary = context.getBean(UserRepositary.class);
		
//		User user = new User();
//		
//		
//		user.setName("Ram");
//		user.setCity("Pune");
//		user.setStatus("I am a Java Developer");
//		
//		User user2 = userRepositary.save(user);
//		
//		System.out.println(user2);
//====================================================================================
																										//#Topic-1#//
//---------------------------------------------------------------------------------------------------------------------------------------------
	//saving single user...............................
//						User user1 = new User();
//						user1.setName("sumit");
//						user1.setCity("pcmc");
//						user1.setStatus("c++ programmer");
//						
//						User user2 = new User();
//						user2.setName("Durgesh");
//						user2.setCity("pcmc");
//						user2.setStatus("python programmer");
						
						
						//User user = userRepositary.save(user1);
//------------------------------------------------------------------------------------------------------------------------------------------------						
						//To save all list of user........................
//						List<User> list = Arrays.asList(new User (6, "krishna","latur","java Developer") , 
//																			new User (7,"om","satara","java coder"),
//																			new User (8,"saurabh","Nagar","System Developer"));
//						Iterable<User> iterable = userRepositary.saveAll(list);
//						
//						iterable.forEach(User->{System.out.println(User);});
//						System.out.println("list added");
						
						
						
//-------------------------------------------------------------------------------------------------------------------------------------------------
						
						//Update User data by Id...................... 
//						Optional<User> findById = userRepositary.findById(3);
//						User user = findById.get();
//						
//						user.setCity("Nasik");
//						user.setName("Ankit");
//						user.setStatus(".Net developer");
//						
//						userRepositary.save(user);
//						
//						System.out.println(user);
				
//--------------------------------------------------------------------------------------------------------------------------------------------------
						//By using Findbyid method............
	
	
//						Optional<User> id = userRepositary.findById(5);
//						
//						User user = id.get();
//						
//						System.out.println(user);
//--------------------------------------------------------------------------------------------------------------------------------------------------
	
		//Using FindAll() Method..............
			Iterable<User> itr = userRepositary.findAll();
//					
//					Iterator<User> iterator = itr.iterator();
//					
//					while(iterator.hasNext())
//					{
//						User user = iterator.next();
//						
//						System.out.println(user);
//					}
			
			
			
			//.................................................OR----------------- (we can use ForEach Method to print or get all users list)............................................
			
			
			//itr.forEach(user->{System.out.println(user);});	
//---------------------------------------------------------------------------------------------------------------------------------------------------
	
			
			//delete user by id.............................
			
			
			
//			userRepositary.deleteById(2);
//			
//			System.out.println("deleted");
	
//=========================================================================================
			
			
			
																																//#Topic 2#//
			
			
			//By USING -----Derived Query Method (Custom Finder Method)-(DSL)------------------
			// findByName Method
			//List<User> name = userRepositary.findByName("Durgesh");
			
			//name.forEach(e->{System.out.println(e );});
	//----------------------------------------------------------------------------------------------------------------------------------------------
			
			// Find by Name And City........
			
//			List<User> nameAndCity = userRepositary.findByNameAndCity("Durgesh", "pcmc");
//			
//			nameAndCity.forEach(e->{System.out.println(e);});
			
	//-----------------------------------------------------------------------------------------------------------------------------------------------

		/*
		 * #you can also use these cases like given below..:-
		 * findByNameStartingWith(String perfix); findByNameEndingWith(String suffix);
		 * findByNameContaining(String words); findByNameLike(String likePattern);
		 * findByAgeLessThan(int number);
		 */
	//=========================================================================================
																													//#Topic - 3#//
																									//@Query Annotation //
			//JPQL(Java Persistence Query Language) where indirectly fired HQL Query (Hibernate Query Language)//
			
//			List<User> allUsers = userRepositary.getAllUsers();
//			
//			allUsers.forEach(e->{System.out.println(e);});
			//-------------------------------------------------------------------------------------------------------------------------------
	
	
//			List<User> userByName = userRepositary.getUserByName("Durgesh");
//			
//			userByName.forEach(e->{System.out.println(e);});
			
			//-------------------------------------------------------------------------------------------------------------------------
			
			userRepositary.getUser().forEach(e->{System.out.println(e);});
	}

}
















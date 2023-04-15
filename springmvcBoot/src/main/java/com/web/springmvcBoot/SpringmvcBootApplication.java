package com.web.springmvcBoot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.web.springmvcBoot.dao.UserRepository;
import com.web.springmvcBoot.entities.User;

@SpringBootApplication
public class SpringmvcBootApplication {

	public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(SpringmvcBootApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
//		
//		User user = new User();
//		user.setName("prasha");
//		user.setStatus("java");
//		
//		User user2 = userRepository.save(user);
//		System.out.println(user2);
		
		//create object of User
		User user1 = new User();
		user1.setName("prashant");
		user1.setCity("mum");
		user1.setStatus("Active");
		
		User user2 = new User();
		user2.setName("Don");
		user2.setCity("mumbai");
		user2.setStatus("dead");
		
		//Saving Single User
//		User resultUser = userRepository.save(user2);
//		System.out.println(resultUser);
//		System.out.println("done");
		
		//saving for Multiple Users
//		List<User> users = new ArrayList<User>();
//		users.add(user1);
//		users.add(user2);
//		
//		Iterable<User> result = userRepository.saveAll(users);
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
		//update
//		Optional<User> optional = userRepository.findById(2);
//		User user = optional.get();
//		System.out.println(user);
//		
//		user.setName("Hello");
//		User result = userRepository.save(user);
//		System.out.println(result);\
		
		//how to get the data
		//findById(id) - return Optional Containing your data. if the is no data then it will return no such exception.
		//
//		Iterable<User> itr = userRepository.findAll();
		//old way
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext())
//		{
//			User user = new User();
//			System.out.println(user);
//		}
		//tricky way
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User t) {
//				System.out.println(t);
//			};
//		});
		
		//by using lambda expression
//		 for single user
//		itr.forEach(user->System.out.println(user));
//		itr.forEach(user->{System.out.println(user);});
		
		
		//deleting the User elements
//		userRepository.deleteById(52);
//		System.out.println("deleted");
		
//		Iterable<User> allUsers = userRepository.findAll();
//		
//		allUsers.forEach(user->System.out.println(user));
//		userRepository.deleteAll(allUsers);
//		
		
		//custom derived method
//		List<User> findByName = userRepository.findByName("mum");
//		findByName.forEach(e->System.out.println(e));
//		
		List<User> findByName = userRepository.findByNameAndCity("prasha","mum");
		findByName.forEach(e->System.out.println(e));
		
		

		
		
		
		
	}

}

package day16;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String name=getUserName(1);System.out.println(name.toUpperCase());
		Optional<String> name1=getUserNameinJava(1);
		
		System.out.println(name1.orElse("Name not found"));

	}
	public static String getUserName(int n) {
		if(n==1) {
			return "nk";	
			}
		else {
			return "alice";
		}
		}

	public static Optional<String> getUserNameinJava(int n) {
		if(n==1) {
			return Optional.of("nk");	
			}
		else {
			return Optional.of("alice");
		}
		}
}

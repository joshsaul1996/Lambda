package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaExercises {

	public static void main(final String[] args) {
//			List<String> hello = Arrays.asList("hi", "my", "name", "is", "josh");
//			
//			hello.stream().map(greeting -> greeting.toUpperCase())
//			.forEach(greeting -> System.out.print(greeting +" "));
//			
//			List<Integer> primeNumbers = Arrays.asList(1,13,7,9,14,3,19,11,42,77);
//			System.out.print(primeNumbers.stream().filter(number -> prime(number)).sorted().collect(Collectors.toList()));
//			
//		}		
//			
//		public static boolean prime(Integer x) {
//				if (x==1) {
//					return false;
//				} else {
//					for(int i =2; i < x/2; i++) {
//						if (x % i == 0) {
//							return false;
//						}		
//					}
//					return true;
//				}
//			}
			
				List<String> joinStrings = Arrays.asList("Isn't", "the", "join", "method", "wonderful");
				Optional<String> phrase = joinStrings.stream().reduce((str1, str2) -> str1 + " " + str2);
				phrase.ifPresent(System.out::print);
	}

}

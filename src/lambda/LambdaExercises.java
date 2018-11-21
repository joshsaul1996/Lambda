package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExercises {
		
		public static void main(final String[] args) {
			List<String> hello = Arrays.asList("hi", "my", "name", "is", "josh");
			
			hello.stream().map(greeting -> greeting.toUpperCase())
			.forEach(greeting -> System.out.print(greeting +" "));
			
			
		
		
		
		}
	}
package interfaces_basico;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainInterfacesFuncionales {

	public static void main(String[] args) {
		Supplier<Integer> numeroaleatorio100 = () -> {
			Random rd = new Random();
			int numero  = rd.nextInt(1,100);
			return numero;
			
		};
		
		System.out.println(numeroaleatorio100.get());
		
		numeroaleatorio100 = new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				Random rd = new Random();
				int numero  = rd.nextInt(1,100);
				return numero;	
			}
			
			Consumer<String>
		};

	}

}

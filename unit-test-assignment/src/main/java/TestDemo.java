import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
	int sum = a + b;
		if(a > 0 && b > 0) {
		return sum;
		}
		else {
			System.out.println("Both parameters must be positive!");
			throw new IllegalArgumentException();
		}
	}
	
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	
	int randomNumberSquared() {
		return getRandomInt() * getRandomInt();
	}
	
	
	
	
}


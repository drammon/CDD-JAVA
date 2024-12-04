package fundamentos_2;

public class loops {
	public static void main(String[] args) {
		for (int i = 1; i < 50+1; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}

// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		// קלט מהמשתמש
		int N = Integer.parseInt(args[0]);
		double pi = Math.PI;
		double numerator = 1;
		double denominator = 1;
		double piApproximated = 0;

		// חישוב לפי הנוסחה
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				piApproximated += (numerator / denominator);
			} else {
				piApproximated -= (numerator / denominator);
			}
			// נוסיף למכנה ונגדיל את איי
			denominator += 2;
		}
		piApproximated *= 4;
		System.out.println("pi according to Java: " + pi);
		System.out.println("pi, approximated:     " + piApproximated);

	}
}

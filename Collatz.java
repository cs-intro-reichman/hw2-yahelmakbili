public class Collatz {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]); // highest seed
		String mode = args[1]; // "v" (verbose) or "c" (concise)

		for (int seed = 1; seed <= N; seed++) {
			int n = seed;
			int length = 1; // מספר הערכים שמודפסים, כולל 1

			if (mode.equals("v")) {
				// מדפיסים את כל ערכי הרצף עד 1 (כולל)
				while (true) {
					System.out.print(n + " ");
					length++;

					if (n == 1)
						break;
					if (n % 2 == 0) {
						n = n / 2;
					} else {
						n = 3 * n + 1;
					}
				}
				// רווח ואז הסוגריים עם האורך
				System.out.println("(" + length + ")");
			} else {
				// מצב "c" – רק מחשבים, בלי להדפיס את הרצף
				while (n != 1) {
					if (n % 2 == 0)
						n = n / 2;
					else
						n = 3 * n + 1;
				}
			}
		}

		// שורת הסיכום – בדיוק כפי שמופיע בדוגמה
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}

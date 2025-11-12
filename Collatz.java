public class Collatz {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		String mode = args.length > 1 ? args[1] : "v";
		mode = mode.trim().toLowerCase();

		for (int seed = 1; seed <= N; seed++) {
			int n = seed;
			int length = 0;

			if (mode.equals("v")) {
				while (true) {
					System.out.print(n + " ");
					length++;

					// עוצרים רק אם הדפסנו לפחות איבר אחד לפני ה-1 הנוכחי
					if (n == 1 && length > 1)
						break;

					// ממשיכים את כלל קולץ
					n = (n % 2 == 0) ? (n / 2) : (3 * n + 1);
				}
				System.out.println("(" + length + ")");
			} else { // concise
				// כאן לא מדפיסים, רק מבצעים את הצעדים עד שחוזרים ל-1
				int tmp = n;
				int printed = 0; // לא חובה, רק כדי להיות סימטריים ללוגיקה
				while (true) {
					if (tmp == 1 && printed > 0)
						break;
					tmp = (tmp % 2 == 0) ? (tmp / 2) : (3 * tmp + 1);
					printed++;
				}
			}
		}

		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}

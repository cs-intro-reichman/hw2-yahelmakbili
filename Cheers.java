public class Cheers {
        public static void main(String[] args) {
                // קלט מילה ומספר
                String word = args[0];
                int N = Integer.parseInt(args[1]);
                String vowels = "AEOIU";
                int i = 0;
                // מדפיסה כל אות
                while (i < word.length()) {
                        char o = word.charAt(i);
                        if (vowels.indexOf(o) == -1) {
                                System.out.println("Give me a  " + o + ":" + o + "!");
                        } else {
                                System.out.println("Give me an " + o + ":" + o + "!");
                        }
                        i++;
                }
                int t = 0;
                for (t = 0; t < N; t++) {
                        System.out.println(word + "!!!");
                }

        }
}

public class TimeCalc {
    public static void main(String[] args) {
        // נקבל ערך של שעה
        String time = args[0];
        // נקבל ערך של דקות
        int minutesToAdd = Integer.parseInt(args[1]);
        // נפצל לשעות ודקות
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        // נמיר שעה מוחלטת לדקות ונוסיף דקות
        int newNum = ((hour * 60) + minutes + minutesToAdd);
        int newHour = (newNum / 60) % 24;
        int newMinutes = (newNum % 60);
        // נדפיס את השעה הנכונה
        System.out.printf("%02d:%02d%n", newHour, newMinutes);
    }
}

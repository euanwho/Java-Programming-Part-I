import java.util.ArrayList;
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (day == 30) {
            if (month == 12) {
                year++;
                month = 0;
            } 
            month++;
            day = 0;
        }
        day++;
    }

    public void advance(int numberOfDays) {
        int counter = 0;
        while (counter < numberOfDays) {
            this.advance();
            counter++;
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(day, month, year);
        newMyDate.advance(days);
        
        return newMyDate;
    }
}

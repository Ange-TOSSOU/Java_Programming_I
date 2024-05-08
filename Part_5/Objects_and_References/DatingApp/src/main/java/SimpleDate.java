
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    private void advanceDay() {
        this.day = (this.day + 1) % 31;
    }
    
    private void advanceMonth() {
        this.month = (this.month + 1) % 13;
    }
    
    private void advanceYear() {
        this.year = this.year + 1;
    }
    
    public void advance() {
        this.advanceDay();
        
        if (this.day == 0) {
            this.day = 1;
            this.advanceMonth();
        }
        
        if (this.month == 0) {
            this.month = 1;
            this.advanceYear();
        }
    }
    
    public void advance(int howManyDays) {
        while (howManyDays > 0) {
            this.advance();
            howManyDays--;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        newDate.advance(days);

        return newDate;
    }
}

package TaskManager;

public class Date implements Comparable<Date> {
    private short day;
    private short month;
    private short year;

    @Override
    public int compareTo(Date o) {
        if(this.year!=o.year)
            return Integer.compare(this.year,o.year);
        else if (this.month!=o.month)
            return Integer.compare(this.month,o.month);
        else
            return Integer.compare(this.day,o.month);

    }

    public Date(short day, short month, short year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

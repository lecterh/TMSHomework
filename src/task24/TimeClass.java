package Task24;

public class TimeClass {
    private Integer sec;
    private Integer min;
    private Integer hour;

    public TimeClass() {

    }

    public TimeClass(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getTimeInSecond(TimeClass time) {
        return (time.hour*3600 + time.min*60 + time.sec);
    }

    public int compareTo(TimeClass time) {
        return (this.getTimeInSecond(this) - time.getTimeInSecond(time));
    }

    @Override
    public String toString() {
        return "TimeClass {" +
                "sec=" + sec +
                ", min=" + min +
                ", hour=" + hour +
                '}';
    }
}

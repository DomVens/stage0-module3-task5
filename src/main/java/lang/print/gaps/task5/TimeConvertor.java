package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        int seconds= (int) Math.floor(minutes)*60;
        seconds += (int) minutes-Math.floor(minutes);
        System.out.println(seconds);
    }
}

public class Time
{
    public int hours;
    public int minutes;
    Time otherTime=new Time();
    Time AddTime(Time otherTime)
    {
        otherTime.minutes+=this.minutes;
        if(otherTime.minutes>60)
        {
            otherTime.minutes=otherTime.minutes%60;
            otherTime.hours++;
        }
      otherTime.hours+=this.hours;
        if(otherTime.hours>24)
            otherTime.hours= otherTime.hours%24;
        return otherTime;
    }
}

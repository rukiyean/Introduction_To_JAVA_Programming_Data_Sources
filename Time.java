package Bolum10;

public class Time {
    
	private int hour, minute,  second  ;
	
	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		Time time3 = new Time(5, 23, 55);
		
		System.out.println("Time1 (current): " + time1.gethour() + ":" + time1.getminute() + ":" + time1.getsecond());
        System.out.println("Time2 (from ms): " + time2.gethour() + ":" + time2.getminute() + ":" + time2.getsecond());
        System.out.println("Time3 (manual) : " + time3.gethour() + ":" + time3.getminute() + ":" + time3.getsecond());
  

	}
	public Time()
	{
		setTime(System.currentTimeMillis());
	}
	
	public Time(long elapsedTime)
	{
        setTime(elapsedTime);
    }
	
	public Time(int hour,int minute, int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	 public int gethour() {
		    return hour;
	 }
	 public int getminute() {
		    return minute;
	 }
	 public int getsecond() {
		    return second;
	 }
	 
	 public void setTime(long elapsedTime) {
	        long totalSeconds = elapsedTime / 1000;
	        second = (int)(totalSeconds % 60);

	        long totalMinutes = totalSeconds / 60;
	        minute = (int)(totalMinutes % 60);

	        long totalHours = totalMinutes / 60;
	        hour = (int)(totalHours % 24); // GMT saatine göre
	}
}

package freddy;
public class Frog{

public String name;
int totalDistance;
double totalTime;
 //Freddy class


	public void setHop1(int distance1, double restTime1)
	{
		totalDistance=distance1;
		totalTime=restTime1;
	}

	public void setHop2(int distance2, double restTime2)
	{
		totalDistance=totalDistance+distance2;
		totalTime=totalTime+restTime2;
	}


	public void setHop3(int distance3, double restTime3)
	{
		totalDistance=totalDistance+distance3;
		totalTime=totalTime+restTime3;
	}

	public int getDistance()
	{
		return totalDistance;
		
	}
	
	public double getTime()
	{
		return totalTime;
	}
}
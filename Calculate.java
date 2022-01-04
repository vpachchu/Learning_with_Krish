package freddy;
import freddy.Frog;

public class Calculate{
			
		double totalTime=0,t1=1,t2=2,t3=3.5;
		int totalDistance=0,d1=5,d2=3,d3=1;
		int hopCount=0;
		
					
			Frog f1=new Frog();
				
				//System.out.println("Total Distance "+f1.getDistance()+"m");
				//System.out.print("Total Time "+f1.getTime()+"Sec");
				//System.out.print("Total Time "+f1.getTime()+"Sec");
				
				public int getUserInput(int distanceToDestination)
				{
					
					
					while(totalDistance<distanceToDestination)
					{
						if(totalDistance<distanceToDestination)
						{f1.setHop1(d1,t1);
						hopCount+=1;
						totalTime=f1.getTime();
						}
					
						//System.out.println("t1 "+t1 +" d1 "+d1 );
						//System.out.println("Hop count " +hopCount+" totalTime "+totalTime +" totalDistance "+totalDistance );

							
						if(totalDistance<distanceToDestination)				
						{f1.setHop2(d2,t2);
						hopCount+=1;
						totalTime=f1.getTime();
						
						}
						
						//System.out.println("t2 "+t2 +" d2 "+d2 );
						//System.out.println("Hop count " +hopCount+" totalTime "+totalTime +" totalDistance "+totalDistance );

						
						if(totalDistance<distanceToDestination)
						{f1.setHop3(d3,t3);
						hopCount+=1;
						totalTime=f1.getTime();
						}
						
						//System.out.println("t3 "+t3 +" d3 "+d3 );
						//System.out.println("Hop count " +hopCount+" totalTime "+totalTime +" totalDistance "+totalDistance );


						
						
						
						totalDistance=f1.getDistance()+totalDistance;
						totalTime=f1.getTime()+totalTime;
					}
					System.out.println(" Hop count " +hopCount+"\n Total time required "+ totalTime +" sec");
					return hopCount;
					
				}
}
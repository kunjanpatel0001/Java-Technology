class RacingCircuit
{
  public void busyTracks()
  {
     Thread t = Thread.currentThread();
     System.out.println(t.getName() + " Enters busyTracks");
     int lap = 0;
     for(lap=0;lap<5;lap++)
     {
         String str = String.format(
                         "%s in Lap %d %s",
                         t.getName(),
                         lap,
                         t.getName().equals("Car")?"brrrrooms":"vrrrrooms"
                      );
         System.out.println(str);
         try
         {
             Thread.sleep(1000);
         }
         catch(InterruptedException e)
         {
             System.out.println("Thread interrupted");
         }
     }
     System.out.println(t.getName() + " Leaves busyTracks");
  }
}
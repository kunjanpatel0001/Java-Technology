class Bike extends Thread
{
   @Override
   public void run()
   {
       System.out.println("Bike Starts Journey");
       RacingCircuit venus = new RacingCircuit());
       venus.busyLanes();
       System.out.println("Bike Ends Journey");
   }
}
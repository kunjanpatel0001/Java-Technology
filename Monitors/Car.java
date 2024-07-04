class Car extends Thread
{
   @Override
   public void run()
   {
       System.out.println("Car Starts Journey");
       RacingCircuit mars = new RacingCircuit();
       mars.busyTracks();
       System.out.println("Car Ends Journey");
   }
}
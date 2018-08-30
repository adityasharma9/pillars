import java.lang.util;
class twowheeler extends vehicle
{
	void start()
	{
		 System.out.println("Start");
	}
}

class fourwheeler extends vehicle
{
	void start()
	{
		 System.out.println("Start");
	}
}

class abstract vehicle
{
			void abstract start();
			void stop()
			{
				System.out.println("Stop");
			}
}
class vehicleinheritance
{
	public static void main(Strings args[])
	{
		twowheeler s=new twowheeler();
		s.start();
		s.stop();

	    fourwheeler r=new twowheeler();
	    r.start();
	    r.stop();

	}
}
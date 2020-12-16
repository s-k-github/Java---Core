interface printable
{
    void start();
	void stop();
	int off=0;
	void pressed(int key);
}
class InterfaceExample implements printable
{
	int off=1;
	@Override
	public void start()
	{
		System.out.println("Started");
	}
	@Override
    public void stop()
	{
		System.out.println("\nvariable from interface : "+printable.off+"\nStopped ");
	}
	@Override
	public void pressed(int key)
	{
		//printable.off=1;
		System.out.println("\nvariable from interface : "+off+"\nPressed key number "+key);
	}
	public static void main(String args[])
	{
		InterfaceExample obj = new InterfaceExample();
		obj.start();obj.pressed(23);
		obj.stop();
		
	}
}
/*Started

variable from interface : 1
Pressed key number 23

variable from interface : 0
Stopped*/
abstract class Animal
{
	public abstract void Like();
	public void doTheyHaveLegs()
	{
		System.out.println("Yes, animals have legs");
	}
}

class Dog extends Animal
{
	@Override
	public void Like()
	{
		System.out.println("Dog like to cuddle.");
	}
}

class Lion extends Animal
{
	@Override
	public void Like()
	{
		System.out.println("Lion like to Growl");
	}
}



class TestAnimal
{
	public static void main(String[] args)
	{
		Animal Dog = new Dog();
		Dog.Like();
		
		Animal Lion = new Lion();
		Lion.Like();
		Dog.doTheyHaveLegs();
		Lion.doTheyHaveLegs();
	}
}
/*
Dog like to cuddle.
Lion like to Growl
Yes, animals have legs
Yes, animals have legs
*/
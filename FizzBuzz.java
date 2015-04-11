public class FizzBuzz
{

	public void fizzBuzz()
	{
		for (int currNum = 1; currNum <= 100; currNum++)
		{
			if (currNum % 3 == 0)
				System.out.print("Fizz");
			if (currNum % 5 == 0)
				System.out.print("Buzz");
			if (currNum % 3 != 0 && currNum % 5 != 0)
				System.out.print(currNum);
			System.out.println();
		}
	}
}

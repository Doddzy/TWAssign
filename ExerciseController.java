public class ExerciseController
{
	public static void main(String args[])
	{
		System.out.println(new DiamondExercises().createIsoscelesTriangle(3));
		System.out.println(new DiamondExercises().createDiamond(3));
		System.out.println(new DiamondExercises().createDiamondWithName(3,
				"Claire"));
		new FizzBuzz().fizzBuzz();
		System.out.println("Prime result: " + new PrimeFactors().generate(24));

	}
}

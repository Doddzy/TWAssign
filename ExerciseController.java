public class ExerciseController
{
	public static void main(String args[])
	{
		System.out.println("Easiest Exercise: \n"
				+ new TriangleExercises().easiestExceriseEver() + "\n");
		System.out.println("Horizontal line: \n"
				+ new TriangleExercises().createHorizontalLine(3) + "\n");
		System.out.println("Vertical line: \n"
				+ new TriangleExercises().createVerticalLine(3) + "\n");
		System.out.println("Right triangle: \n"
				+ new TriangleExercises().createRightTriangle(3) + "\n");
		
		System.out.println("Isosceles triangle: \n"
				+ new DiamondExercises().createIsoscelesTriangle(3) + "\n");
		System.out.println("Diamond: \n"
				+ new DiamondExercises().createDiamond(3) + "\n");
		System.out.println("Diamond with name: \n"
				+ new DiamondExercises().createDiamondWithName(3, "Claire")
				+ "\n");
		System.out.println("FizzBuzz exercise: \n");
		
		new FizzBuzz().fizzBuzz();
		System.out.println();
		
		System.out
				.println("Prime result: \n" + new PrimeFactors().generate(24));

	}
}

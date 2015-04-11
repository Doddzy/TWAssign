public class TriangleExercises
{

	public String easiestExceriseEver()
	{
		return "*";
	}

	public String createVerticalLine(int height)
	{
		String result = "";
		for (int currLen = 0; currLen < height; currLen++)
			result += "*\n";
		return result;
	}

	public String createRightTriangle(int size)
	{
		String triangle = "";
		for (int currHeight = 1; currHeight <= size; currHeight++)
		{
			triangle += createHorizontalLine(currHeight) + "\n";
		}
		return triangle;
	}
	public String createHorizontalLine(int length)
	{
		String result = "";
		for (int currLen = 0; currLen < length; currLen++)
			result += "*";
		return result;
	}
}

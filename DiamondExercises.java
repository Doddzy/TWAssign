public class DiamondExercises
{

	public String createIsoscelesTriangle(int size)
	{
		String triangle = createIsoscelesWithoutLastLine(size);
		String middle = createHorizontalLine((size - 1) * 2 + 1);
		return triangle + middle;
	}

	public String createIsoscelesWithoutLastLine(int size)
	{
		String triangle = "";

		for (int currTier = 1; currTier < size; currTier++)
		{
			int numSpaces = size - currTier;
			int numAsterisks = currTier * 2 - 1;
			triangle += createMixedLine(numSpaces, numAsterisks) + "\n";
		}
		return triangle;
	}

	public String createDiamond(int size)
	{
		String top = "", bottom = "", middle = "";
		top = createIsoscelesWithoutLastLine(size);
		middle = createHorizontalLine((size - 1) * 2 + 1);
		bottom = invertTriangle(top);
		return top + middle + bottom;
	}

	public String createDiamondWithName(int size, String name)
	{
		String top = "", bottom = "", middle = "";
		top = createIsoscelesWithoutLastLine(size);
		middle = name;
		bottom = invertTriangle(top);
		return top + middle + bottom;
	}

	public String invertTriangle(String triangle)
	{
		return new StringBuilder(triangle).reverse().toString();
	}

	public String createMixedLine(int spaces, int asterisks)
	{
		String line = "";
		line += createSpaces(spaces);
		line += createHorizontalLine(asterisks);
		line += createSpaces(spaces);
		return line;
	}

	public String createSpaces(int length)
	{
		String spaces = "";
		for (int numSpaces = 0; numSpaces < length; numSpaces++)
			spaces += " ";
		return spaces;
	}

	public String createHorizontalLine(int length)
	{
		String result = "";
		for (int currLen = 0; currLen < length; currLen++)
			result += "*";
		return result;
	}

}

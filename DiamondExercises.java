public class DiamondExercises
{

	public String createIsoscelesTriangle(int size)
	{
		String triangle = "";

		for (int currTier = 1; currTier <= size; currTier++)
		{
			triangle += createSpaces(size - currTier);
			triangle += createHorizontalLine(currTier * 2 - 1);
			triangle += createSpaces(size - currTier);
			triangle += "\n";
		}
		return triangle;
	}

	public String createDiamond(int size)
	{
		String top = "", bottom = "", middle = "";
		for (int currTier = 1; currTier < size; currTier++)
		{
			int numSpaces = size - currTier;
			int numAsterisks = currTier * 2 - 1;
			top += createMixedLine(numSpaces, numAsterisks) + "\n";
		}
		middle = createHorizontalLine((size - 1) * 2 + 1);
		bottom = new StringBuilder(top).reverse().toString();
		return top + middle + bottom;
	}
	public String createDiamondWithName(int size,String name)
	{
		String top = "", bottom = "", middle = "";
		for (int currTier = 1; currTier < size; currTier++)
		{
			int numSpaces = size - currTier;
			int numAsterisks = currTier * 2 - 1;
			top += createMixedLine(numSpaces, numAsterisks) + "\n";
		}
		middle = name;
		bottom = new StringBuilder(top).reverse().toString();
		return top + middle + bottom;
	}

//	public String createInvertedIsoscelesTriangle(int size)
//	{
//		String triangle = "";
//		for (int currTier = size - 2; currTier >= 0; currTier--)
//		{
//			int numSpaces = size - currTier;
//			int numAsterisks = currTier * 2 + 1;
//			triangle += createMixedLine(numSpaces, numAsterisks) + "\n";
//		}
//		return triangle;
//	}
//
//	public String createDiamond(int size)
//	{
//		String diamond = "";
//		diamond += createIsoscelesTriangle(size);
//		diamond += createInvertedIsoscelesTriangle(size - 1);
//		return diamond;
//	}
//
//	public String createDiamondWithName(int size, String name)
//	{
//		String diamond = "";
//		diamond += createIsoscelesTriangle(size);
//		diamond += name + "\n";
//		for (int currTier = size - 2; currTier >= 0; currTier--)
//		{
//			int numSpaces = size - currTier;
//			int numAsterisks = currTier * 2 + 1;
//			diamond += createMixedLine(numSpaces, numAsterisks) + "\n";
//		}
//		return diamond;
//	}

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

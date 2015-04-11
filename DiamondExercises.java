public class DiamondExercises
{

	public String createIsoscelesTriangle(int size)
	{
		String triangle = "";

		for (int currTier = 0; currTier < size; currTier++)
		{
			triangle += createSpaces(size - currTier);
			triangle += createHorizontalLine(currTier * 2 + 1);
			triangle += createSpaces(size - currTier);
			triangle += "\n";
		}
		return triangle;

	}

	public String createDiamond(int size)
	{
		String diamond = "";
		diamond += createIsoscelesTriangle(size);
		for (int currTier = size - 2; currTier >= 0; currTier--)
		{
			diamond+= createMixedLine(size-currTier,currTier*2 +1)+"\n";
		}
		return diamond;
	}
	
	public String createMixedLine(int spaces,int asterisks)
	{
		String line="";
		line += createSpaces(spaces);
		line += createHorizontalLine(asterisks);
		line += createSpaces(spaces);
		return line;
	}

	public String createSpaces(int length)
	{
		String spaces = "";
		for (int numSpaces = 0; numSpaces < length; numSpaces++)
		{
			spaces += " ";
		}
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

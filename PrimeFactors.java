public class PrimeFactors
{
	public String generate(int n)
	{
		String factors = "";
		for (int curr = 2; curr < n / 2; curr++)
		{
			if (n % curr == 0)
			{
				if (generate(curr).length() == 0)
					factors += curr + ",";
			}
		}
		if(factors.endsWith(","))
		factors = factors.substring(0,factors.length()-1 );
		return factors;
	}
}

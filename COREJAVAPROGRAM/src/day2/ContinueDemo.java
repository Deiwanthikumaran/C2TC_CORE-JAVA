package day2;

public class ContinueDemo {
	for (int k = 5; k < 15; k++)
	{
	// Odd numbers are skipped
	if (k%2 != 0)
	continue;
	// Even numbers are printed
	System.out.print(k + " ");

}

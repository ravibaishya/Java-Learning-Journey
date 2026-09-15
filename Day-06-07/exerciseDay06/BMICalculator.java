/* 20. **BMI Calculator**
Formula:
BMI = weight / (height × height)
*/
class BMICalculator
{
	public static void main(String args[])
	{
		float weight = 96f;
		float heightInFeet = 5.11f;
		float heightInMetres = heightInFeet * 0.3048f;
		float BMI = weight / (heightInMetres * heightInMetres);
        //System.out.println("BMI is : "+BMI);
        System.out.printf("Weight: %.1f kg%n", weight);
        System.out.printf("Height: %.2f feet (%.2f m)%n", heightInFeet, heightInMetres);
        System.out.printf("Your BMI is: %.2f%n", BMI);
	}
}

/*  float weight = 85.7f; // in kilograms
        float heightInFeet = 5.7f; // in feet
        
        // 1. Convert feet to metres (1 foot = 0.3048 metres)
        float heightInMetres = heightInFeet * 0.3048f;
        
        // 2. Calculate BMI using metres
        float BMI = weight / (heightInMetres * heightInMetres);
        
        // 3. Print the result cleanly using printf to 2 decimal places
        System.out.printf("Weight: %.1f kg%n", weight);
        System.out.printf("Height: %.1f feet (%.2f m)%n", heightInFeet, heightInMetres);
        System.out.printf("Your BMI is: %.2f%n", BMI);
*/
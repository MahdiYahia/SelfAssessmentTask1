package self_assessment_task1;

public class ProblemOne {

	public static void main(String[] args) {
		//Defining the diameters of Earth and Sun to be used in calculating the volumes
		double earthDiameter = 7600.0;
		double sunDiameter =865000.0;
		//Extracting the radii
		double earthRadius = earthDiameter/2;
		double sunRadius = sunDiameter/2;
		//Calculating the volumes
		double earthVolume= (4.0/3.0) * Math.PI *Math.pow(earthRadius, 3);
		double sunVolume= (4.0/3.0) * Math.PI *Math.pow(sunRadius, 3);
		//Calculating the ratio of the volume of Sun to the volume of Earth  
		double volumeRatio = sunVolume/earthVolume;
		
		System.out.printf("The volume of the earth is %.2f cubic miles. \n", earthVolume);
		System.out.printf("The volume of the sun is %.2f cubic miles. \n", sunVolume);
		System.out.printf("The ratio of the volume of the Sun to the volume of the Earth is %.2f", volumeRatio);


	}

}


/**
 * 
 * File name: [CovidStatistics.java ]
 * 
 * @author Mark Aguado<br>
 *         Course: CST8132 � OOP<br>
 * @version 1.0<br>
 * @since openjdk version "11.0.15" 2022-04-19 LTS
 */

public class CovidStatistics {

	/**
	 * Program that shows 2 dimensional arrays of Covid statistics data for each
	 * provinces and computes the total recovered patients each month.
	 * The program also is formatted in the way that is easy to read
	 * 
	 * @param args The Main Method
	 */

	public static void main(String[] args) {

		// declarations
		final int ROWS = 7;
		final int COLUMNS = 8;

		int total;

		// 2 dimensional patients array
		int[][] patients = {
				{ 2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
				{ 5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 },
				{ 1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 },
				{ 1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
				{ 1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
				{ 1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
				{ 1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }

		};

		// provinces array
		String[] provinces = {
				"Ontario",
				"Quebec",
				"Nova Scotia",
				"New Brunswick",
				"Manitoba",
				"British Columbia",
				"Prince Edward Island"
		};

		System.out.println(
				"                 Month     Feb      March   April     May      June     July     Aug      Sept");
		System.out.println();

		// fetching the data from the ROW of array
		for (int i = 0; i < ROWS; i++) {
			System.out.printf("%22s", provinces[i]);
			// fetching the data from the COLUMN of array
			for (int k = 0; k < COLUMNS; k++) {
				System.out.printf("%9d", patients[i][k]);
			}
			System.out.println();
		}

		System.out.println();

		System.out.printf("%22s", "Recovered Patients");

		// counts the total recovered each month
		for (int j = 0; j < COLUMNS; j++) {
			// resets the count to 0
			total = 0;
			for (int z = 0; z < ROWS; z++) {
				total = total + patients[z][j];
			}
			System.out.printf("%9d", total);
		}

		System.out.println();

		System.out.println();
		System.out.println();
		System.out.printf("%72s", "Vaccinate and maintain good health practices!");

	}

}

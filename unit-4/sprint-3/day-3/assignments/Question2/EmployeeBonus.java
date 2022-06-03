package Question2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus {
	
	public double getBonus(String doj) throws InvalidAge {
		
		
		double bonus=0;
		
		try {
			
			LocalDate old = LocalDate.parse(doj,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
			LocalDate currDate = LocalDate.now();
			
			if(old.isBefore(currDate)) {
				
				long yearDiff = ChronoUnit.YEARS.between(old, currDate);
				long monDiff = ChronoUnit.MONTHS.between(old, currDate);
				
				//System.out.println(yearDiff);
				
				if(monDiff <= 12) {
					bonus = 5000;
				}
				
				else if(yearDiff > 1 && yearDiff <= 2) {
					bonus = 8000;
				}
				else if(yearDiff > 2) {
					bonus = 10000;
				}
				
			}
			
			else {
				InvalidAge ia = new InvalidAge("Age should not be in the future");
				throw ia;
			}
			
			
		} 
		
		catch (Exception e) {
			InvalidAge  ia = new InvalidAge("Please pass the date in the correct format");
			throw ia;
		}

		return bonus;
	}

}

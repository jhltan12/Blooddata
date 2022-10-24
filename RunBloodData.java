import java.util.Scanner;

public class RunBloodData{  
public static void main (String[] args) {
    	Scanner s = new Scanner(System.in);
    	BloodData bd = new BloodData();
    	String data;
    	
    	System.out.print("Enter Blood Type of Patient: ");
    	String BT = s.nextLine();
		bd.setBloodType("O");
    	
    	System.out.print("Enter the Rhesus Factor( + or - ):  ");
    	String RF = s.nextLine();
		bd.setRhFactor("+");
		
		data = BT+RF;

    	if(data.equals("A+") || data.equals("a-") || data.equals("b+") || data.equals("b-")||data.equals("ab+")||data.equals("ab-")||data.equals("o+")||data.equals("o-")){
		bd.setBloodType(BT);
		bd.setRhFactor(RF);
		System.out.println(bd.getBloodType()+bd.getRhFactor()+" is added to the Blood Bank.");	
		
    	}
    	else if(data.isEmpty()){
		System.out.println(bd.getBloodType()+bd.getRhFactor()+" is added to the Blood Bank.");	
    	
    	}
    	
    	else{
    	System.out.println("O+ is added to the blood bank.");
    	}
    	
    	s.close();	
    }
}
package ToDoAutomation;

import java.util.Random;

public class MyData {

	Random rand = new Random();

	String [] myFirstName = {"Leen" , "Tamer" , "Tamara" , "Mostafa" , "Mamdooh" , "Ahmad"};
	
	String [] myLastName = {"Kareem" , "Sharif" , "Mohammad" , "Saleh" , "Ali" , "Moayad"};
	
	int randomNumberForTheEmail = rand.nextInt(19845);
	
	String Domain = "@gmail.com";
	
	int randomFirstNameIndex = rand.nextInt(myFirstName.length);
	int randomLastNameIndex = rand.nextInt(myLastName.length);
	
	String TheFirstName = myFirstName[randomFirstNameIndex];
	String TheLastName = myLastName[randomLastNameIndex];
	
	String TheEmail = TheFirstName + TheLastName + randomNumberForTheEmail + Domain;
	
	String ThePassword = "p@$$w0rd";
	
	String [] ToDo = {"I have to study" , "Finish Presentation" , "Email John about the report" , "Schedule dentist appointment" , "Research vacation spots for July"};
	
	int randomToDo = rand.nextInt(ToDo.length);
	
	String TheToDo = ToDo[randomToDo];
	
	
}

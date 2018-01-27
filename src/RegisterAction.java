import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	String  firstName;
	String  lastName;
	Integer age;
	String  email;
	String  gender;
	String  address;
	String  selectedColor;
	
	List<String> colors;
	boolean subscription;
	
	List<String> hobbies;
	
	String selectedHobbies;
	
	public String initializeFormFields() {
		initializeColors();
		initializeHobbies();
		return "input";
	}
	
	public String execute() {
		
		if(subscription == true) {
			System.out.print("True");
		} else {
			System.out.println("False");
		}
		return "success";
	}
	
	public void initializeColors() {
		colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("White");
	}
	
	public void initializeHobbies() {
		hobbies = new ArrayList<String>();
		hobbies.add("Violin");
		hobbies.add("Electronics");
		hobbies.add("Programming");
		hobbies.add("Web Design");
	}
	
	public String getSelectedHobbies() {
		return selectedHobbies;
	}


	public void setSelectedHobbies(String selectedHobbies) {
		this.selectedHobbies = selectedHobbies;
	}
	
	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public boolean isSubscription() {
		return subscription;
	}


	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}

	
	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*public void validate() 
	{
		if(firstName.equals("")) {
			addFieldError("firstName", "First name is required");
		}
		if(lastName.equals("")) {
			addFieldError("lastName", "Last name is required");
		}
		if(gender == null) {
			addFieldError("gender", "Gender is required");
		}
		if(email.equals("")) {
			addFieldError("email", "Age is required");
		}
		if(age ==null) {
			addFieldError("age", "Age is required");
		}
		else 
		if(age < 18) {
			addFieldError("age", "Age must be 18 or more");
		}
	}*/

}

public class Employee{
	private String name;
	private int idNumber;
	private String department;
	private String position;

	Employee(){

	}

	Employee(String n, int id, String dept, String pos){
		name = n;
		idNumber = id;
		department = dept;
		position = pos;
	}

	Employee(String n, int id){
		name = n;
		idNumber = id;
	}

	public void setName(String n){
		name = n;
	}

	public void setIdNumber(int num){
		idNumber = num;
	}
	public void setDepartment(String d){
		department = d;
	}
	public void setPosition(String p){
		position = p;
	}

	public String getName(){
		return name;
	}
	public int getIdNumber(){
		return idNumber;
	}
	public String getDepartment(){
		return department;
	}
	public String getPosition(){
		return position;
	}

	@Override
	public String toString(){
		return (name +" "+ idNumber +" "+ department +" "+ position);
	}

}
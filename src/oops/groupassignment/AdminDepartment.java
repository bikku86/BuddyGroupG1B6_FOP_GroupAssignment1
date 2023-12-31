package oops.groupassignment;

public class AdminDepartment extends SuperDepartment{
	
	public AdminDepartment(){}
	
	@Override
	public String departmentName() {
		return "Admin Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}

package oops.groupassignment;

public class HrDepartment extends SuperDepartment {
	
	public HrDepartment(){}
	
	@Override
	public String departmentName() {
		return "HR Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendence";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
}

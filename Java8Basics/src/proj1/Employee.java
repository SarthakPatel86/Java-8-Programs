package proj1;

import java.util.List;

public class Employee {

	private int eid;
	private String ename;
	private String dsgn;
	private double sal;
	private int age;
	private List<String> skills;

	public Employee(int eid, String ename, String dsgn, double sal, int age, List<String> skills) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dsgn = dsgn;
		this.sal = sal;
		this.age = age;
		this.skills = skills;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDsgn() {
		return dsgn;
	}

	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dsgn=" + dsgn + ", sal=" + sal + ", age=" + age
				+ ", skills=" + skills + "]";
	}

}

package Collection3;

public class Players {
    private String name;
    private int age;
    private int jercyNo;
    private String team;
    private int runs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJercyNo() {
		return jercyNo;
	}
	public void setTeam(String team) {
		this.team=team;
	}
	public String getTeam() {
		return team;
	}
	public void setJercyNo(int jercyNo) {
		this.jercyNo = jercyNo;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public Players(String name, int age,String team, int jercyNo, int runs) {
		super();
		this.name = name;
		this.age = age;
		this.team=team;
		this.jercyNo = jercyNo;
		this.runs = runs;
	}

	public String toString() {
		return "name=" + name + ", age=" + age + ", jercyNo=" + jercyNo + ", runs=" + runs+",Team= "+team ;
	}
  }

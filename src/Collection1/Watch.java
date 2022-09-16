package Collection1;

public class Watch {
    private String name;
    private int price;
    private boolean isSmart;
    private boolean isWaterProf;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getIsSmart() {
		return isSmart;
	}
	public void setIsSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	public boolean getIsWaterProf() {
		return isWaterProf;
	}
	public void setIsWaterProf(boolean isWaterProf) {
		this.isWaterProf = isWaterProf;
	}
	public Watch(String name, int price, boolean isSmart, boolean isWaterProf) {
		super();
		this.name = name;
		this.price = price;
		this.isSmart = isSmart;
		this.isWaterProf = isWaterProf;
	}

	public String toString() {
		return "name=" + name + ", price=" + price + ", isSmart=" + isSmart + ", isWaterProf=" + isWaterProf;
	}
    
	

}

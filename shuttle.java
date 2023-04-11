public class shuttle implements Comparable<shuttle> {
    private String name;
    private int size;
	public int time;
    
    public shuttle(String name, int size) {
        this.name = name;
        this.size = size;
		time = 30;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int compareTo(shuttle o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		if (this.size == 1){
			return "Small Shuttle: " + this.name + " | Break time: " + time + " minutes left.\n";
		} else{
			return "Big Shuttle: " + this.name + " | Break time: " + time + " minutes left.\n";
		}
		
	}
}

public class TheaterList {
	
	private Theater[] tlist;
	private int max;
	private int numberof;
	
	public TheaterList(int number){
		tlist = new Theater[number];
		max = number;
		numberof = 0;
	}
	public void addTheater(String city, String name, int screens){
		numberof++;
		Theater t = new Theater(city, name, screens);
		tlist = ensurecapacity(tlist);
		tlist[numberof-1] = t;
		
	}
	public Theater[] ensurecapacity(Theater[] tlist){
		if(numberof>max){
			Theater[] theaterlist = new Theater[max*2];
			for(int k = 0;k<max;k++){
				theaterlist[k] = tlist[k];
			}
			max = max*2;
			return theaterlist;
		}else{
			return tlist;
		}
	}

	public int getMax() {
		return max;
	}
	public int getNumberof() {
		return numberof;
	}
	public Theater gettheater(int index){
		return tlist[index];
	}
	public Theater gettheater(String name){
		for(int i = 0;i<numberof;i++){
			if(tlist[i].getName()==name){
				return tlist[i];
			}
		}
		return null;
	}
}

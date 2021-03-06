import java.util.ArrayList;

//Creates Monster Objects
public class Monster {
	public String name;
	public String month;
	public String fight;
	public String[] options;
	public String winCondition;
	public ArrayList<String> paths;
	public ArrayList<Integer> selectTree;
	
	public Monster(String name) {
		this.paths = new ArrayList<String>();
		this.selectTree = new ArrayList<Integer>();
		this.options = new String[4];
		this.name = name;
	}
	
	public void setMonth(String month){
		this.month = month;
	}
		
	public void setFight(String fight, String option1, String option2, String option3, String option4){
		this.fight = fight;
		this.options[0] = option1;
		this.options[1] = option2;
		this.options[2] = option3;
		this.options[3] = option4;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPaths(String[] path){
		for(int i = 0; i < path.length; i++){
			paths.add(path[i]);
		}
	}
	
	public void setTree(int order){
		selectTree.add(order);
	}

	public void setPaths(String path){
		paths.add(path);
	}
	
	public void setWin(String winCondition) {
		this.winCondition = winCondition;
	}
	
	public int getTree(int position){ 
		return selectTree.get(position);
	}
	
	public String getEncounter(){
		return paths.get(0);
	}
	
	public String getHarmedPath(){
		return paths.get(1);
	}
	
	public String getSafePath(){
		return paths.get(2);
	}
	
	public String getSafePassage(){
		//implement SafePassage count 
		return paths.get(3);
	}
	
	public String getFightPath(){
		return paths.get(4);
	}
	
	public String getRun(){
		return "You have successfully ran.";
	}
	
	public String getFightWin(){
		return "You have successfully won the fight.";
	}
	
	public String getFightLose(){
		//implement health
		return "You have been gravely injured but must continue the quest.";
		
	}
	
	public String getMonth() {
		return this.month;
	}

	public String getName() {
		return this.name;
	}

	public String getFight() {
		 String fightMenu = "";
		 fightMenu = fight;
		 for(int i = 0; i < options.length; i++){
			 fightMenu += "\n";
			 fightMenu += options[i];
			 fightMenu += " (" + (i+1) + ")";
		 }
		 return fightMenu;
	}

	public String getFightOption(int i){
		return options[i-1];
	}
	
	public String getWinCondition(){
		return winCondition;
	}
	

}


public class Position {

	public PageEntry pe;
	public int i;
	
	public Position(PageEntry p,int wordIndex){
		pe =p;
		i =wordIndex;
	}
	
	public PageEntry getPageEntry(){
		return pe;		
	}
	
	public int getWordIndex(){
		return i;
	}
}

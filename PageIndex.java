
public class PageIndex {

	MyLinkedList<WordEntry> l;
	public PageIndex(){
		l= new MyLinkedList<WordEntry>();
	}
	
	public boolean exist(String e) throws Exception{
		
		for(int i=0;i<l.getsize();i++){
	    	if(l.data(i).giveWord().equals(e.toLowerCase())){		
	    		return true;
	    		}	   
	    	}
		return false;
	}
	
	public void addPositionForWord(String str,Position p) throws Exception{
		if(exist(str)==true){		
		for(int i=0;i<l.getsize();i++){
			    	if(l.data(i).giveWord().equals(str.toLowerCase())){			    	 
			    	 l.data(i).addPosition(p);
			    	}
			  }
		}
		else{
			WordEntry w= new WordEntry(str);
			w.addPosition(p);
			l.add(w);
		}
	}
	
	public MyLinkedList<WordEntry> getWordEntries(){
		return l;
	}
	
	
}

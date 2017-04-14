
public class SearchEngine {

	InvertedPageIndex i;
	public SearchEngine(){
		i = new InvertedPageIndex();

	}
	
	public void addPage(String x) throws Exception{
		PageEntry p = new PageEntry(x);
		i.addPage(p);
	}
	
	public void queryFindPagesWhichContainWord(String x) throws Exception{
		 MySet<PageEntry> m =  i.getPagesWhichContainWord(x);
		if(m.IsEmpty()==true){
			throw new Exception ("No webpage contains word"+ x);
		}		
		else {
			for(int a=0;a<m.sizeM() ;a++){
				if(a==m.sizeM()-1){
				System.out.println(m.member(a).name());}
				else{
					System.out.print(m.member(a).name()+", ");
			}
     	}
	}
}
	
	
	public void queryFindPositionsOfWordInAPage(String x,String y) throws Exception{
		int q =1;
		MyLinkedList<Position> m = new MyLinkedList<Position>();
		WordEntry w= i.hashtable.search(x);
		for(int i=0;i<w.getAllPositionsForThisWord().getsize();i++){
		if(w.getAllPositionsForThisWord().data(i).getPageEntry().name().equals(y)){
		  m.add(w.getAllPositionsForThisWord().data(i));
		  q=0;
		}	
	   }
		for(int j =0;j<m.getsize();j++){
		   if(j==m.getsize()-1){
			   System.out.println(m.data(j));
		   }
		   else{
		    System.out.print(m.data(j) + ", ");
	      }
	   }
		if(q==1)
		{System.out.println("No such case");}
	}
	
	public void performAction(String actionMessage) throws Exception{
		String[] a = actionMessage.split(" ");
	    switch(a[0]){
	    case "addPage":
	    	try {	
				this.addPage(a[1]);
			  break;
			} 
	    	catch (Exception e) {
				System.out.println("Error");
				break;
			}
	    	
	    case "queryFindPagesWhichContainWord":
	    	try {
				this.queryFindPagesWhichContainWord(a[1]);
			break;
	    	} catch (Exception e) {
				System.out.println(a[1] + " does not exist");
				break;	
			}
	    	
	    case "queryFindPositionsOfWordInAPage":
	    	try {
				this.queryFindPositionsOfWordInAPage(a[1], a[2]);
			break;
	    	} catch (Exception e) {
				System.out.println("Error3");
				break;
			}
	    }  	
	}
}

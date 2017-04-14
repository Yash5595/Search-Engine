
public class InvertedPageIndex {

   MyHashTable hashtable;
   public InvertedPageIndex(){
	   hashtable= new MyHashTable();
   }
	
	public void addPage(PageEntry p) throws Exception {
		for(int i=0;i<(p.getPageindex().getWordEntries().getsize());i++){
	  hashtable.addPositionsForWord(p.getPageindex().getWordEntries().data(i));
	  }
	}
	
	public MySet<PageEntry> getPagesWhichContainWord(String str) throws Exception{
		MySet<PageEntry> m =new MySet<PageEntry>();
		WordEntry w = hashtable.search(str);
		if(hashtable.search(str)==null){
			throw new Exception ("Word not Found");
		}
		else{
		for(int i=0;i<w.getAllPositionsForThisWord().getsize();i++){
		 m.addElement(w.getAllPositionsForThisWord().data(i).getPageEntry());
		}
		return m;
		}
	}
}

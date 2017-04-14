
public class WordEntry {

   MyLinkedList<Position> l ;
   public String str;
  
  public WordEntry(String word){
	  str= word;
	  l = new MyLinkedList<Position>();
    } 
	
  public void addPosition(Position position){
	   l.add(position);
  }
  
  public void addPositions(MyLinkedList<Position> positions){
	  Node<Position> x= positions.head;
	  while(x!=null){
		  l.addl(x.getElement());
	  x = x.getnext();
	  }
  }
  
  public MyLinkedList<Position> getAllPositionsForThisWord(){
	  return l;
  }
  
  public String giveWord(){
	  return str.toLowerCase();
  } 
 
}

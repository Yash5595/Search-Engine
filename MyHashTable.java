
public class MyHashTable {

	MyLinkedList<WordEntry>[] array = new MyLinkedList[101];
	

	private int getHashIndex(String str){
		int x =0;
		for(int i =0; i<str.length();i++){
			x =x + str.charAt(i);
		}
		return (x%101);
	}	
	
	public void addPositionsForWord(WordEntry w) throws Exception{
		int key = getHashIndex(w.giveWord());
		int t =0;
		int temp =0;
		if(array[key]==null){
			array[key]=new MyLinkedList<WordEntry>();
			array[key].add(w);
		}
		else{
		    for(int i=0; i<array[key].getsize();i++){
				if(array[key].data(i).giveWord().equals(w.giveWord())){
			    	t=i;
			    	temp=1;
			    	break;
				}
			}
			if(temp==0){
					array[key].add(w);	
		   	}
			else{
				array[key].data(t).addPositions(w.getAllPositionsForThisWord());
		    }
		}
	}
  
  	public WordEntry search(String str) throws Exception{
	 	int y = getHashIndex(str);
	  	int t=0;
		WordEntry w = null;
		for(int i=0;i<array[y].getsize();i++)
		{
			if(array[y].data(i).giveWord().equals(str.toLowerCase())){
		 		w =array[y].data(i);	
		 		t=1;
	  		}
   		}
		if(t==1){ return w;}
		else{
			throw new Exception ("WordEntry "+ str + " does not exist");
		}
  	} 

 }

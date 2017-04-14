
public class HashMap {	
   
   private final static int size = 101;

   NodeHashTable[] table;

   HashMap() {
         table = new NodeHashTable[size];
         for (int i = 0; i < size; i++)
               table[i] = null;
   }
   
   
   private int getHashIndex(String str){
		int x =0;
		for(int i =0; i<str.length();i++){
			x = (x + str.charAt(i));
		}
		return x;
	}


	public WordEntry get(int key) {
	     int hash = (key % size);
	     if (table[hash] == null)
	           return null;
		else{
		   NodeHashTable entry = table[hash];
		   	while (entry != null && entry.getKey() != key){
		     	entry = entry.getNext();
		 	}
		   	if (entry == null)
		         return null;
		   	else{
		 		return entry.getValue();
		   	}
		}
	}

   public void put(int key, WordEntry value) {
         int hash = (key % size);
         if (table[hash] == null)
               table[hash] = new NodeHashTable(key, value);
         else {
               NodeHashTable entry = table[hash];
               while (entry.getNext() != null && entry.getKey() != key)
                     entry = entry.getNext();
               if (entry.getKey() == key)
                     entry.setValue(value);
               else
                     entry.setNext(new NodeHashTable(key, value));
         }
   }

   public void remove(int key) {
         int hash = (key % size);
         if (table[hash] != null) {
               NodeHashTable prevEntry = null;
               NodeHashTable entry = table[hash];
               while (entry.getNext() != null && entry.getKey() != key) {
                     prevEntry = entry;
                     entry = entry.getNext();
               }
               if (entry.getKey() == key) {
                     if (prevEntry == null)
                          table[hash] = entry.getNext();
                     else
                          prevEntry.setNext(entry.getNext());
               }
         }
   }
}

import java.io.*;
import java.util.*;
public class PageEntry {
	protected String pn;
	PageIndex pi;
	public PageEntry(String pageName)throws IOException{
		pi=new PageIndex();
		pn=pageName;
		try { 
			 
			FileInputStream fstream = new FileInputStream(pageName);
			Scanner s=new Scanner(fstream);
			String str="";
			while(s.hasNextLine()){
				str+=s.nextLine()+" ";
			}
			String str2=change(str).toLowerCase();
			String[] array=str2.split("\\s+");
			int i=0;
			for(i=0;i<array.length;i++){
				if((array[i].equals("a")||array[i].equals("an")||array[i].equals("the")||array[i].equals("they")||array[i].equals("these")||array[i].equals("for")||array[i].equals("is")
				||array[i].equals("are")||array[i].equals("of")||array[i].equals("or")||array[i].equals("and")||array[i].equals("does")||array[i].equals("will")||array[i].equals("whose")))
				{
					continue;
				}
				else if(array[i].equals("stacks")||array[i].equals("structures")||array[i].equals("applications")){
					Position p = new Position(this,i+1);
					pi.addPositionForWord(array[i].substring(0,array[i].length()-1), p);
					
				}
				else{
					Position p=new Position(this, i+1);
					pi.addPositionForWord(array[i],p);			
				}						
			}
			s.close();
		
		}
		catch (Exception e) {
			System.out.println("File "+pageName+" not found");
		} 
	}

	public String change(String str){
		String s="";
		for(int i=0;i<str.length();i++){
			if (str.charAt(i)=='{'||str.charAt(i)==';'||str.charAt(i)=='\''||str.charAt(i)=='-'||str.charAt(i)=='}'||str.charAt(i)=='['||str.charAt(i)==']'||str.charAt(i)=='<'||str.charAt(i)=='>'||str.charAt(i)=='('||str.charAt(i)==')'||str.charAt(i)==','||str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)=='#'||str.charAt(i)=='!'||str.charAt(i)=='"'||str.charAt(i)==':'){
				s=s+" ";
			}
			else{
				s=s+str.charAt(i);
			}
		}return s;
	}
	public PageIndex getPageindex()
	{
		return pi;
	}
	public String name(){
		return pn;
	}
	
}

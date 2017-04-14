
public class Node2 {

	protected Object element;
	protected Node2 next;

	public Node2(Object s,Node2 n){
	   element = s;
	   next = n;
	}    
	public Object getElement()
	{return element;}
	public void setElement(Object newElem)
	{element = newElem; }
	public Node2 getnext()
	{return next;}
	public void setnext(Node2 newNext)
	{next = newNext;}
	     

}


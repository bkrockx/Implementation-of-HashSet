import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class Hashset
{
	public static void main (String[] args) throws java.lang.Exception
	{
		HashSet<student>hs = new HashSet<student>();
		hs.add(new student("xx", 20));
        	hs.add(new student("yy", 40));
        	hs.add(new student("yy", 40));
        	hs.add(new student("zz", 30));
 
 
        	TreeSet<student>std = new TreeSet<student>(new Myclass());
        	std.addAll(hs);
 
        	Iterator itr = std.iterator();
        	while(itr.hasNext()){
        		System.out.println(itr.next()+" ");
        	}
	}
}
 
class Myclass implements Comparator<student>{
 
	public int compare(student s1,student s2){
		if(s1.getMarks()>s2.getMarks()){
			return 1;
		}
		else{
			return -1;
		}
	}
}
 
class student
{
	private String name;
	private int marks;
 
	public student(String s,int m){
		this.name = s;
		this.marks = m;
	}
 
	public int hashCode(){
		int hashcode = 0;
		hashcode = marks*10;
		return hashcode;
	}
 
	public boolean equals(Object obj){
		if(obj instanceof student){
			student ss = (student)obj;
			return ( (ss.name.equals(this.name)&& ss.marks==this.marks ) );
		}
		else{
			return false;
		}
	}
 
	public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getMarks() {
        return marks;
    }
 
    public void setMarks(int marks) {
        this.marks = marks;
    }
 
    public String toString(){
        return "name: "+name+"  marks: "+marks;
    }
 
}

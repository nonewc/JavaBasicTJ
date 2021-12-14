package javaStudy;

public class AccessObjExam {

	public static void main(String[] args) {
		
		AccessObj obj = new AccessObj();
		
		System.out.println(obj.p); // public
		System.out.println(obj.p2); // protected
		System.out.println(obj.k); // default
//		System.out.println(obj.i); // private
		
		
		
	}
	
}

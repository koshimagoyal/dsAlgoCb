package lec15;

public class StringBuilderDemo {

	public static void main(String[] args) {
		//Initialisation
		String str = "Hello";
		String str1 = new String("Hello");
		StringBuilder sb = new StringBuilder();
		System.out.println("-------");
		System.out.println(sb);
		
		//insert -> adding at last position
		sb.append(false); //false -> "false"
		sb.append(123); //123 -> "123"
		sb.append(str);
		//add at index
		sb.insert(3, true);
		
		System.out.println(sb);
		
		//indexing
		System.out.println(sb.charAt(0));
		System.out.println(sb.charAt(10));
		

		System.out.println(sb.charAt(12));
		
		//update
		sb.setCharAt(3, 't');
		
		//substring -> ditto as string
		System.out.println(sb.substring(0,7));
		
		//delete
		sb.deleteCharAt(0);
		sb.delete(0, 3);
		
		//length
		sb.length();
		
		//reverse
		sb.reverse();
		
		System.out.println(sb);
		
		
//		String st = "";
//		long start = System.currentTimeMillis();
//		for(int i=0;i<10000000;i++) {
//			st+="Hello";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		
		
		StringBuilder sb2 = new StringBuilder();
		long start = System.currentTimeMillis();
		for(int i=0;i<10000000;i++) {
			sb2.append("Hello");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}

package comparablesAndComparators;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		List<Student> students=new ArrayList<>();
		
		students.add(new Student(23, "Ram"));
		students.add(new Student(35, "Shyam"));
		students.add(new Student(83, "Aman"));
		students.add(new Student(13, "Ram"));
		students.add(new Student(13, "Anuj"));
		
		//Collections.sort(students);
		//Collections.sort(students, new SortByNameThenMarks()); ->MY Built class
//		Collections.sort(students, new Comparator<Student>() {  //By Anonymous class
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.name.equals(o2.name)) {
//					return o1.marks-o2.marks;
//				}else {
//					return o1.name.compareTo(o2.name);
//				}
//			}
//		});
//				Collections.sort(students, (o1, o2)->{ //Using Lamda
//						if(o1.name.equals(o2.name)) {
//							return o1.marks-o2.marks;
//						}else {
//							return o1.name.compareTo(o2.name);
//						}
//				});
		//Collections.sort(students,(o1, o2)->o1.name.compareTo(o2.name)); //Dekha one line mein ho gaya
		//or
		//Collections.sort(students, Comparator.comparing(Student::getName));
		//or
		//Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
		//or
		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		students.forEach(System.out::println); //Lamda
	}
}
class SortByNameThenMarks implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)) {
			return o1.marks-o2.marks;
		}else {
			return o1.name.compareTo(o2.name);
		}
	}
}
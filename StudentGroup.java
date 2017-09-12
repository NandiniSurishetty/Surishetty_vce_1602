import java.util.Scanner;
import java.util.Date;
import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
        private int l;
      
	public StudentGroup(int length) {
                 l=length;
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
                
                for(int i=0;i<l;i++)
               {
                 students[i].getId();
                 students[i].getFullName();
                 students[i].getBirthDate();
                  students[i].getAvgMark();
               }
                
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
               //Scanner sc=new Scanner(System.in);
               for(int i=0;i<l;i++)
               {
                 students[i].setId(students[i].getId());
                 students[i].setFullName(students[i].getFullName());
                
		
	
                 students[i].setBirthDate(students[i].getBirthDate());
                  students[i].setAvgMark(students[i].getAvgMark());
               }
                
               
	}

	@Override
	public Student getStudent(int index)  {
		// Add your implementation here
                Student s=new Student();
                try
               {
                 if(index<0 || index>=l)
                 throw new IllegalArgumentException();
                else
                {
                 s.setId(students[index].getId());
                 s.setFullName(students[index].getFullName());
                 s.setBirthDate(students[index].getBirthDate());
                 s.setAvgMark(students[index].getAvgMark());
                }
		}
               catch(Exception e)
               {
}
   
		return s;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
                int id=student.getId();
                String fullName=student.getFullName();
                Date birthDate=student.getBirthDate();
                double avgMark=student.getAvgMark();
                students[index].setId(id);
		students[index].setFullName(fullName);
		students[index].setBirthDate(birthDate);
		students[index].setAvgMark(avgMark);
       
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
                //Scanner sc=new Scanner(System.in);
                int j=1;
                Student a[]=new Student[l+1];
                a[0].setId(student.getId());
                a[0].setFullName(student.getFullName());
                a[0].setBirthDate(student.getBirthDate());
                a[0].setAvgMark(student.getAvgMark());
                for(int i=0;j<l+1||i<l;i++)
                {
                   a[j].setId(students[i].getId());
                a[j].setFullName(students[i].getFullName());
                a[j].setBirthDate(students[i].getBirthDate());
                a[j].setAvgMark(students[i].getAvgMark());
                 j++;
		}
                students=a;
 
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
                int j=0;
                Student a[]=new Student[l+1];
                a[l].setId(student.getId());
                a[l].setFullName(student.getFullName());
                a[l].setBirthDate(student.getBirthDate());
                a[l].setAvgMark(student.getAvgMark());
                for(int i=0;j<l;i++)
                {
                   a[j].setId(students[i].getId());
                a[j].setFullName(students[i].getFullName());
                a[j].setBirthDate(students[i].getBirthDate());
                a[j].setAvgMark(students[i].getAvgMark());j++;
		}
                students=a;
     
                
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
               
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
                 
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}

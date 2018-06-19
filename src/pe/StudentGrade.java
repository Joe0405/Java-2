package pe;

public class StudentGrade {
	private int[] grade;
	public StudentGrade() {
		super();
	}
	
	public StudentGrade(int[] grade) {
		this.grade = grade;
	}
	public int[] getGrade() {
		return grade;
	}

	public void setGrade(int[] grade) {
		this.grade = grade;
	}

	
	public boolean isInRange() {
		int length = grade.length;
		for(int i=0; i<length ;i++) {
			if(!(grade[i]>=0 && grade[i]<=100))
				return false;
		}	
		return true;
		
	}
	public int[] computeAverage() {
		if(isInRange()) {
		int length =grade.length, maximum = 0, minimum = 100, average=0, sum=0, i;
		int[] returnArray = new int[3];
		for(i=0; i<length ;i++) {
			if(grade[i]>maximum)
				maximum = grade[i];
			if(grade[i]<minimum)
				minimum = grade[i];
			sum+=grade[i];
		}
		average = sum/length;
		returnArray[0] = maximum;
		returnArray[1] = minimum;
		returnArray[2] = average;
		return returnArray;
			
	}
		return null;
	}

}

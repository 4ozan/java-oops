 class Student extends Person {
     int studentId;
     double grade;

     public Student(String name, String role, int studentId, double grade) {
         super(name, role);
         this.studentId = studentId;
         this.grade = grade;
     }


     public void studentId () {
         this.studentId = studentId;
     }

     public int getStudentId() {
         return studentId;
     }

 }
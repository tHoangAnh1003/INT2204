import java.util.HashSet;
import java.util.Set;

public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    Student[] students = new Student[100];
    int index = 0;

    /**
     * Bool.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup()); // xoa dong nay sau khi cai dat
    }

    /**
     * Add.
     */
    public void addStudent(Student newStudent) {
        // TODO:
        students[index] = newStudent;
        index += 1;
    }

    /**
     * Convert.
     */
    public String studentsByGroup() {
        // TODO:
        StringBuilder sbuilder = new StringBuilder();
        Set<String> checkSet = new HashSet<>();

        for (int i = 0; i < index; ++i) {
            String studentGroup = students[i].getGroup();
            if (!checkSet.contains(studentGroup)) {
                sbuilder.append(studentGroup).append("\n");
                checkSet.add(studentGroup);
                for (int j = 0; j < index; ++j) {
                    if (students[j].getGroup().equals(studentGroup)) {
                        sbuilder.append(students[j].getInfo()).append("\n");
                    }
                }
            }
        }
        return sbuilder.toString();
    }

    /**
     * Delete.
     */
    public void removeStudent(String id) {
        // TODO:
        if (index != 0) {
            int indexTemp = -1;
            for (int i = 0; i < index; i++) {
                if (students[i].getId().equals(id)) {
                    indexTemp = i;
                    break;
                }
            }

            if (indexTemp != -1) {
                for (int i = indexTemp; i < index - 1; ++i) {
                    students[i] = students[i + 1];
                }
                index -= 1;
            }
        }
    }
} 
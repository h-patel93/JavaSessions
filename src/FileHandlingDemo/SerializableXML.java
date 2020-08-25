package FileHandlingDemo;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableXML {

    public static void main(String[] args) {

        Student st1 = new Student();

st1.setRollNo(101);
st1.setName("Harsh");
        Student st2= new Student();
        st2.setRollNo(102);
st2.setName("Vrajesh");
List<Student> s = new ArrayList<>();
s.add(st1);
s.add(st2);

College c = new College();
c.setStudents(s);

        try {
            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
            x.writeObject(c);
            x.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}

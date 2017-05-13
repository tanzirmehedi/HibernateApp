import com.mbstu.entity.Connector;
import com.mbstu.entity.Student;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * Created by Shawon on 5/10/17.
 */
public class Executor {

    public static void main(String[] args) {

//        Connector conn = new Connector();

        Session session = Connector.getSession();
        session.beginTransaction();

        // insert
        Student student = new Student();
        student.setName("SK.Tanzir Mehedi");
        student.setfName("Shohidul Islam2");
        student.setRoll("IT-14013");
        session.save(student);



        Student student1 = (Student) session.load(Student.class,7l);
        //FOR DELETE
        // session.delete(student);
        // FOR UPDATE
        session.update(student);
        session.getTransaction().commit(); // for only delete or update
        //System.out.println(student);
    }
}

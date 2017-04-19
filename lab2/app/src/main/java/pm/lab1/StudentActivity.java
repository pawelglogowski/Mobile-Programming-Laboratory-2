package pm.lab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {

    private ListView studentsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        studentsListView = (ListView) findViewById(R.id.student_list);
        ArrayList<Student> arrayOfStudents = new ArrayList<>();

        for(int i= 1; i<15; i++) {
            arrayOfStudents.add(new Student(i+" Paweł", "Głogowski"));
        }

        ArrayAdapter<Student> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, arrayOfStudents);

        studentsListView.setAdapter(adapter);

    }
}

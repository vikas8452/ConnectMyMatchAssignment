package kick.career.connectmymatchassignment;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kick.career.connectmymatchassignment.Adapter.UserAdapter;
import kick.career.connectmymatchassignment.ModelClasses.SubjectBean;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                   // mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                   // mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                   // mTextMessage.setText(R.string.title_notifications);
                    return true;

            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.hamburger);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



        // Construct the data source
        List<SubjectBean> rowItems;
        rowItems = new ArrayList<SubjectBean>();

        SubjectBean bean=new SubjectBean("Mental Ability");
        rowItems.add(bean);
        SubjectBean bean1 =new SubjectBean("Physics");
        rowItems.add(bean1);
        SubjectBean bean2=new SubjectBean("Mathematics");
        rowItems.add(bean2);
        SubjectBean bean3=new SubjectBean("Chemistery");
        rowItems.add(bean3);
        SubjectBean bean4=new SubjectBean("Data Structure");
        rowItems.add(bean4);
        SubjectBean bean5=new SubjectBean("Compiler Design");
        rowItems.add(bean5);
        SubjectBean bean6=new SubjectBean("Computer Networks");
        rowItems.add(bean6);

        ListView listView = (ListView) findViewById(R.id.sub_list);
        ArrayAdapter_For_College_List adapter = new ArrayAdapter_For_College_List(this,
                R.layout.subject_list, rowItems);
        listView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    //and this to handle actions
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

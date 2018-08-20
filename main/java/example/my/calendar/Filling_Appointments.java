package example.my.calendar;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

public class Filling_Appointments extends AppCompatActivity {


    MyService myService;
    Boolean is;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filling__appointments);

        Intent i= new Intent(this,MyService.class);
        bindService(i,serviceConnection, Context.BIND_AUTO_CREATE);


    }
    public void gb(View view){
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void addRemainder(View view){
        EditText t1=(EditText)findViewById(R.id.editText2);
        EditText t2=(EditText)findViewById(R.id.editText3);
        Bundle data=getIntent().getExtras();
        String button="";

        if (data!=null) {
             button = (data.getString("id"));
        }
        myService.add_appointment(button,String.valueOf(t1.getText()),String.valueOf(t2.getText()));

        t1.setText("");
        t2.setText("");

        Toast.makeText(this,"Added the remainder",Toast.LENGTH_LONG).show();

    }

    public void showRemainder(View view){

        Bundle data=getIntent().getExtras();
        String button="";

        if (data!=null){
            button = (data.getString("id"));
        }


        Intent i=new Intent(this,show.class);
        i.putExtra("id",button);

        List<String> appointements=myService.return_Appointements(button);


        String display="";

        int ap_num=1;

        if (appointements!=null) {

            for (String ap : appointements) {
                display = display.concat(ap_num + ". " + ap + "\n");
                ap_num+=1;

            }

        }

        else{
            display="none so far";

        }


        i.putExtra("app",display);



        startActivity(i);

    }


    private ServiceConnection serviceConnection=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyService.local bind=(MyService.local)iBinder;
            myService=bind.service();
            is=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            is=false;
        }


    };






}

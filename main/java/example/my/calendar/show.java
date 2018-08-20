package example.my.calendar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

public class show  extends AppCompatActivity implements Serializable  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Bundle data=getIntent().getExtras();

        String button =data.getString("id");

        String display= data.getString("app");


        TextView et=(TextView) findViewById(R.id.et);
        et.setText(display);

        //fill_text(button);
    }

    public void back(View view){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void fill_text(String id,MyService myService){

        List<String> appointements=myService.return_Appointements(id);

        String display="";

        int ap_num=1;

        for (String ap:appointements){
            display=display.concat(ap_num+". "+" ap"+"\n");

        }
        EditText et=(EditText) findViewById(R.id.et);
        et.setText(display);
    }
}

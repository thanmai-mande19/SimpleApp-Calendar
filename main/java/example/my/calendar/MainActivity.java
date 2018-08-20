package example.my.calendar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent i=new Intent(this,Filling_Appointments.class);

        switch (view.getId()){
            case R.id.b1:
                i.putExtra("id","b1");
                break;

            case R.id.b2:
                i.putExtra("id","b2");
                break;
            case R.id.b3:
                i.putExtra("id","b3");
                break;
            case R.id.b4:
                i.putExtra("id","b4");
                break;
            case R.id.b5:
                i.putExtra("id","b5");
                break;
            case R.id.b6:
                i.putExtra("id","b6");
                break;

            case R.id.b7:
                i.putExtra("id","b7");
                break;

            case R.id.b8:
                i.putExtra("id","b8");
                break;
            case R.id.b9:
                i.putExtra("id","b9");
                break;

            case R.id.b10:
                i.putExtra("id","b10");
                break;

            case R.id.b11:
                i.putExtra("id","b11");
                break;

            case R.id.b12:
                i.putExtra("id","b12");
                break;

            case R.id.b13:
                i.putExtra("id","b13");
                break;

            case R.id.b14:
                i.putExtra("id","b14");
                break;


            case R.id.b15:
                i.putExtra("id","b15");
                break;

            case R.id.b16:
                i.putExtra("id","b16");
                break;

            case R.id.b17:
                i.putExtra("id","b17");
                break;

            case R.id.b18:
                i.putExtra("id","b18");
                break;

            case R.id.b19:
                i.putExtra("id","b19");
                break;

            case R.id.b20:
                i.putExtra("id","b20");
                break;

            case R.id.b21:
                i.putExtra("id","b21");
                break;

            case R.id.b22:
                i.putExtra("id","b22");
                break;

            case R.id.b23:
                i.putExtra("id","b23");
                break;

            case R.id.b24:
                i.putExtra("id","b24");
                break;

            case R.id.b25:
                i.putExtra("id","b25");
                break;

            case R.id.b26:
                i.putExtra("id","b26");
                break;
            case R.id.b27:
                i.putExtra("id","b27");
                break;

            case R.id.b28:
                i.putExtra("id","b28");
                break;

            case R.id.b29:
                i.putExtra("id","b29");
                break;

            case R.id.b30:
                i.putExtra("id","b30");
                break;

            case R.id.b31:
                i.putExtra("id","b31");
                break;






        }
        startActivity(i);

    }
}

package example.my.calendar;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyService extends Service{

    private final IBinder binder=new local();

    Map<String,List<String>> appointements = new HashMap<>();





    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return binder;
    }


    public String huhu(){
        return "hllo";
    }


    public void add_appointment(String id,String desc,String time){

        if (appointements.containsKey(id)){
            List<String> list=appointements.get(id);

            list.add("desc"+" "+" at"+" "+time);

            appointements.put(id,list);

        }
        else{
            List<String> list=new ArrayList<>();
            list.add(desc+" "+"at"+" "+time);
            appointements.put(id,list);
        }

    }

    public List<String> return_Appointements(String id){

        List<String> ls=appointements.get(id);
        return appointements.get(id);

    }






    public class local extends Binder{

        public MyService service(){
            return MyService.this;

        }



    }
}

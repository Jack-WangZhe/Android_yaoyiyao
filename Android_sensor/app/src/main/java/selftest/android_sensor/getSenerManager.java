package selftest.android_sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class getSenerManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_sener_manager);
        getSenorManager();
    }

    public void getSenorManager(){
        SensorManager sm=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> sensors=sm.getSensorList(Sensor.TYPE_ALL);
        for(Sensor s:sensors)
        {
            Log.i("传感器类型:",sensors.toString());
        }
    }

}

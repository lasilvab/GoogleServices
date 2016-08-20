package silvanet.com.mx.google_services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int PLACEPICKER_REQUEST = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnMaps:

                break;
            case R.id.btnAdmov:
                startActivity(new Intent(MainActivity.this,AdmonActivity.class));
                break;
            case R.id.btnPicker:
                try {
                    startActivityForResult(new PlacePicker.IntentBuilder().build(MainActivity.this), PLACE_PICKER_REQUEST);
                }catch (Google)
                }

                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==PLACEPICKER_REQUEST){
            if(data != null){
                Place place = PlacePicker.getPlace(MainActivity.this,data);
                Toast.makeText(MainActivity.this, place.getAddress(), Toast.LENGTH_SHORT).show();
        }

        }
    }
}

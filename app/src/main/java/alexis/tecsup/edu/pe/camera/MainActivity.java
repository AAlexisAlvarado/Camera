package alexis.tecsup.edu.pe.camera;

import android.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button boton;

        boton = (Button)findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                FragmentManager manager=getSupportFragmentManager();
                DialogFragmentGaleria galeria=new DialogFragmentGaleria();
                galeria.setStyle(DialogFragment.STYLE_NO_FRAME,R.style.transparente);
                galeria.show(manager,"");
            }
        });
    }
}

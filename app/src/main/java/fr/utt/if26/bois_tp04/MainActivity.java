package fr.utt.if26.bois_tp04;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private TextView txtnom, txtprenom;
    private int count_btn1;
    private int count_btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.B01);
        btn1.setBackgroundColor(Color.GREEN);
        count_btn1 = 0;
        btn1.setOnClickListener(this);
        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(v.getContext(), ResultActivity.class);
                Bundle extras = new Bundle();
                extras.putString("nom", txtnom.toString());
                extras.putString("prenom", txtprenom.toString());
                startActivity(intent);
                return true;}
        });

        btn2=(Button)findViewById(R.id.B02);
        btn2.setBackgroundColor(Color.GREEN);
        count_btn2 = 0;
        btn2.setOnClickListener(this);
        btn2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(v.getContext(), GridActivity.class);
                startActivity(intent);
            return true;}
        });

        txtnom = (TextView)findViewById(R.id.editText);
        txtprenom = (TextView)findViewById(R.id.editText2);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.B01:
                count_btn1++;
                if (count_btn1%2==0) {
                    btn1.setBackgroundColor(Color.GREEN);
                } else {
                    btn1.setBackgroundColor(Color.RED);
                }
                break;

            case R.id.B02:
                count_btn2++;
                if (count_btn2%2==0) {
                    btn2.setBackgroundColor(Color.GREEN);
                } else {
                    btn2.setBackgroundColor(Color.RED);
                }                break;


            default:
                break;
        }
    }


}

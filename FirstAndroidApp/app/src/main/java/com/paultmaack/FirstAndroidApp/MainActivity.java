package com.paultmaack.FirstAndroidApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Resources buttonResources = getResources();
    String[] buttonArray = {"Order", "Chaos", "Good", "Evil"};
    //String[] buttonArray = buttonResources.getStringArray(R.array.buttons_array);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //GridView gridview = (GridView) findViewById(R.id.gridView);
        Button loginConfirmButton = findViewById(R.id.button);
        loginConfirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();

                CharSequence text = loginConfirmButton.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button goodButton = findViewById(R.id.goodButton);
        goodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();

                CharSequence text = goodButton.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button evilButton = findViewById(R.id.evilButton);
        evilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();

                CharSequence text = evilButton.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });Button chaosButton = findViewById(R.id.chaosButton);
        chaosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();

                CharSequence text = chaosButton.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button orderButton = findViewById(R.id.orderButton);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();

                CharSequence text = orderButton.getText();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        //gridview.setAdapter(new ButtonAdapter(this));




    }
    public class ButtonAdapter extends BaseAdapter {
        private Context memberContext;

        public ButtonAdapter(Context c) {
            memberContext = c;
        }

        @Override
        public int getCount() {
            return buttonArray.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            Button button;
            if (view == null){
                button = new Button(memberContext);
            }
            else{
                button = (Button) view;
            }
            button.setText(buttonArray[i]);
            button.setId(i);
            button.setOnClickListener(new ButtonOnClickListener());
            return button;
        }
        public class ButtonOnClickListener implements View.OnClickListener{
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "SampleText";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }
    }

}
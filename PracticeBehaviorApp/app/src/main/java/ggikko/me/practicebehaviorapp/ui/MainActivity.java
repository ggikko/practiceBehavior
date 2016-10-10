package ggikko.me.practicebehaviorapp.ui;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import butterknife.ButterKnife;
import butterknife.OnClick;
import ggikko.me.practicebehaviorapp.R;

public class MainActivity extends AppCompatActivity {

    private String TEST = "test7";

    @OnClick({R.id.fab, R.id.goToSub})
    void callOnClick(View view){
        switch (view.getId()){
            case R.id.fab:
                Snackbar.make(findViewById(R.id.container), "Hey ggikko!", Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.goToSub:
                startActivity(new Intent(this, CustomActivity.class));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        float ratio = 1.000000f;

        Log.e("ggikko", "test0 : " +  Float.compare(ratio, 0.0f));
        Log.e("ggikko", "test1 : " +  Float.compare(ratio, 1.0f));
        Log.e("ggikko", "test2 : " +  Float.compare(ratio, 2.0f));
    }
}

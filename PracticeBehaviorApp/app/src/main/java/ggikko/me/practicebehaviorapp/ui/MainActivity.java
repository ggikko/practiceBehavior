package ggikko.me.practicebehaviorapp.ui;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import ggikko.me.practicebehaviorapp.R;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.fab)
    void callOnClick(View view){
        switch (view.getId()){
            case R.id.fab:
                Snackbar.make(findViewById(R.id.container), "Hey ggikko!", Snackbar.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }
}

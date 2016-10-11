package ggikko.me.practicebehaviorapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ggikko.me.practicebehaviorapp.R;

public class MainActivity extends AppCompatActivity {

    private boolean flag = true;

    @OnClick({R.id.fab, R.id.goToSub, R.id.appbar})
    void callOnClick(View view){
        switch (view.getId()){
            case R.id.fab:
//                Snackbar.make(findViewById(R.id.container), "Hey ggikko!", Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.goToSub:
//                Snackbar.make(findViewById(R.id.container), "Hey ggikko!", Snackbar.LENGTH_SHORT).show();
                startActivity(new Intent(this, CustomActivity.class));
                break;
            case R.id.appbar:
//                Snackbar.make(findViewById(R.id.container), "Hey ggikko!", Snackbar.LENGTH_SHORT).show();
                Log.e("ggikko", "appbar clicked");
                if(flag) {
                    appbar.setExpanded(true);
                    flag = false;
                }else{
                    appbar.setExpanded(false);
                    flag = true;
                }
                break;
        }
    }

    @BindView(R.id.appbar) AppBarLayout appbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        float ratio = 1.000000f;
    }
}

package ggikko.me.practicebehaviorapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import ggikko.me.practicebehaviorapp.R;

public class CustomActivity extends AppCompatActivity {

    public static String TAG = "CustomActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()){
            case MotionEvent.ACTION_UP:
                Log.d(TAG, TAG + "dispatchTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, TAG + "dispatchTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, TAG + "dispatchTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, TAG + "dispatchTouchEvent() ACTION_CANCEL");
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()){
            case MotionEvent.ACTION_UP:
                Log.d(TAG, TAG + "onTouchEvent() ACTION_UP");
                break;
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, TAG + "onTouchEvent() ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, TAG + "onTouchEvent() ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, TAG + "onTouchEvent() ACTION_CANCEL");
                break;
        }
        return super.onTouchEvent(event);
    }
}

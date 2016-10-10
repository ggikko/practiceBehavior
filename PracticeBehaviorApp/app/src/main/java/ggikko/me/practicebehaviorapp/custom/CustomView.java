package ggikko.me.practicebehaviorapp.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ggikko on 2016. 10. 9..
 */

public class CustomView extends TextView {

    public static String TAG = "CustomView";

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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

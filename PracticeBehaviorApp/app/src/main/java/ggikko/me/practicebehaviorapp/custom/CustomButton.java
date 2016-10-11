package ggikko.me.practicebehaviorapp.custom;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.widget.Button;

import ggikko.me.practicebehaviorapp.util.CustomButtonBehavior;

/**
 * Created by ggikko on 2016. 10. 11..
 */

@CoordinatorLayout.DefaultBehavior(CustomButtonBehavior.class)
public class CustomButton extends Button {

    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}

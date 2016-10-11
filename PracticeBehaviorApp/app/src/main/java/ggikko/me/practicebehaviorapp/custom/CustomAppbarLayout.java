package ggikko.me.practicebehaviorapp.custom;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;


/**
 * Created by ggikko on 2016. 10. 11..
 */
//@CoordinatorLayout.DefaultBehavior(CustomAppbarLayout.Behavior.class)
public class CustomAppbarLayout extends AppBarLayout {

    public CustomAppbarLayout(Context context) {
        super(context);
    }

    public CustomAppbarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
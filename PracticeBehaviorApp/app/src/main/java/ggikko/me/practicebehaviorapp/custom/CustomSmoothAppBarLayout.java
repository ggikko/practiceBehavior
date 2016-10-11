package ggikko.me.practicebehaviorapp.custom;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;

/**
 * Created by ggikko on 2016. 10. 11..
 */

@CoordinatorLayout.DefaultBehavior(CustomSmoothAppBarLayout.Behavior.class)
public class CustomSmoothAppBarLayout extends AppBarLayout {


    public CustomSmoothAppBarLayout(Context context) {
        super(context);
    }

    public CustomSmoothAppBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


}
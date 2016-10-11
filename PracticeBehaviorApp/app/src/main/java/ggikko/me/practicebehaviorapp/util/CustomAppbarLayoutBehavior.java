package ggikko.me.practicebehaviorapp.util;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.List;

/**
 * Created by ggikko on 2016. 10. 9..
 */

//custom behavior,  This source refer to Bignerdranch's tutorial
public class CustomAppbarLayoutBehavior extends CoordinatorLayout.Behavior<AppBarLayout> {

    private boolean flag = true;

    public CustomAppbarLayoutBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, AppBarLayout child, View dependency) {
        if(dependency instanceof Snackbar.SnackbarLayout){
            Log.e("ggikko", "CustomAppbarLayoutBehavior SnackbarLayout");
        }else{
            Log.e("ggikko", "CustomAppbarLayoutBehavior others");
        }
        return dependency instanceof Snackbar.SnackbarLayout;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, AppBarLayout child, View dependency) {
        if(flag) {
            CoordinatorLayout.LayoutParams lp = (CoordinatorLayout.LayoutParams)child.getLayoutParams();
            lp.height = 300;
            flag = false;
        }else {
            CoordinatorLayout.LayoutParams lp = (CoordinatorLayout.LayoutParams)child.getLayoutParams();
            lp.height = 500;
            child.setExpanded(false);
            flag = true;
        }
        Log.e("ggikko", "CustomAppbarLayoutBehavior onDependentViewChanged");
        return false;
    }

    @Override
    public boolean onMeasureChild(CoordinatorLayout parent, AppBarLayout child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        Log.e("ggikko", "CustomAppbarLayoutBehavior onMeasureChild");
        return super.onMeasureChild(parent, child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    @Override
    public boolean onLayoutChild(CoordinatorLayout parent, AppBarLayout child, int layoutDirection) {
        Log.e("ggikko", "CustomAppbarLayoutBehavior onLayoutChild");
        return super.onLayoutChild(parent, child, layoutDirection);
    }
}

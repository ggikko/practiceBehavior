package ggikko.me.practicebehaviorapp.util;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;


/**
 * Created by ggikko on 2016. 10. 9..
 */

//custom behavior,  This source refer to Bignerdranch's tutorial
public class CustomButtonBehavior extends CoordinatorLayout.Behavior<Button> {

    public CustomButtonBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, Button child, View dependency) {
        if(dependency instanceof Snackbar.SnackbarLayout){
            Log.e("ggikko", "CustomButtonBehavior snack");
        }else{
            Log.e("ggikko", "CustomButtonBehavior others");
        }
        return dependency instanceof Button;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, Button child, View dependency) {
        Log.e("ggikko", "CustomButtonBehavior onDependentViewChanged");
        float translationY = getFabTranslationYForSnackBar(parent, child); // fab transition Y 값 구함
        float percentComplete = -translationY / dependency.getHeight(); //percent로 관리
        float scaleFactor = 1 - percentComplete;

        child.setScaleX(scaleFactor); // set X
        child.setScaleY(scaleFactor); // set Y
        return false;
    }

    /**
     * Snack bar의
     * @param parent
     * @param fab
     * @return
     */
    private float getFabTranslationYForSnackBar(CoordinatorLayout parent, Button fab) {
        float minOffset = 0;
        final List<View> dependencies = parent.getDependencies(fab); // the list of views which the provided view depends on
        for (int i = 0, z = dependencies.size(); i < z; i++) {
            final View view = dependencies.get(i);
            if (view instanceof Snackbar.SnackbarLayout && parent.doViewsOverlap(fab, view)) // 두개의 뷰가 overlap 되었는지 판별
            //view가 snackbar layout이고 두 뷰가 visible 이고 overlap이 되어있으면
            //ViewCompat.getTranslationY : The vertical location of this view relative to its top position.
                minOffset = Math.min(minOffset, ViewCompat.getTranslationY(view) - view.getHeight());
        }

        return minOffset;
    }

    @Override
    public boolean onMeasureChild(CoordinatorLayout parent, Button child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        Log.e("ggikko", "CustomButtonBehavior  : onMeasureChild");
        return super.onMeasureChild(parent, child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    @Override
    public boolean onLayoutChild(CoordinatorLayout parent, Button child, int layoutDirection) {
        Log.e("ggikko", "v  : onLayoutChild");
        return super.onLayoutChild(parent, child, layoutDirection);
    }
}

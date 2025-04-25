package com.glority.camera.markers;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.glority.camera.R;

/* loaded from: classes6.dex */
public class FocusMarkerLayout extends BaseMarkerLayout {
    private final ImageView mFill;
    private final FrameLayout mFocusMarkerContainer;

    public FocusMarkerLayout(Context context) {
        this(context, null);
    }

    public FocusMarkerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_focus_marker, this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.focusMarkerContainer);
        this.mFocusMarkerContainer = frameLayout;
        this.mFill = (ImageView) findViewById(R.id.fill);
        frameLayout.setAlpha(0.0f);
    }

    @Override // com.glority.camera.markers.BaseMarkerLayout
    public void focus(float f, float f2, float f3, float f4) {
        this.mFocusMarkerContainer.setTranslationX((int) (f - (this.mFocusMarkerContainer.getWidth() / 2)));
        this.mFocusMarkerContainer.setTranslationY((int) (f2 - (this.mFocusMarkerContainer.getWidth() / 2)));
        this.mFocusMarkerContainer.animate().setListener(null).cancel();
        this.mFill.animate().setListener(null).cancel();
        this.mFill.setScaleX(0.0f);
        this.mFill.setScaleY(0.0f);
        this.mFill.setAlpha(1.0f);
        this.mFocusMarkerContainer.setScaleX(1.36f);
        this.mFocusMarkerContainer.setScaleY(1.36f);
        this.mFocusMarkerContainer.setAlpha(1.0f);
        this.mFocusMarkerContainer.animate().scaleX(1.0f).scaleY(1.0f).setStartDelay(0L).setDuration(330L).setListener(new AnimatorListenerAdapter() { // from class: com.glority.camera.markers.FocusMarkerLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                FocusMarkerLayout.this.mFocusMarkerContainer.animate().alpha(0.0f).setStartDelay(50L).setDuration(100L).setListener(null).start();
            }
        }).start();
        this.mFill.animate().scaleX(1.0f).scaleY(1.0f).setDuration(330L).setListener(new AnimatorListenerAdapter() { // from class: com.glority.camera.markers.FocusMarkerLayout.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                FocusMarkerLayout.this.mFill.animate().alpha(0.0f).setDuration(100L).setListener(null).start();
            }
        }).start();
    }
}

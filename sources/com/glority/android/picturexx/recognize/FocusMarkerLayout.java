package com.glority.android.picturexx.recognize;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusFrameLayout.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/recognize/FocusMarkerLayout;", "Lcom/glority/android/picturexx/recognize/AbsFocusView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mFill", "Landroid/widget/ImageView;", "initFocusView", "", "absFocusView", "parent", "Landroid/widget/FrameLayout;", "onClickToFocus", "touchPoint", "Landroid/graphics/PointF;", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class FocusMarkerLayout extends AbsFocusView {
    private final ImageView mFill;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FocusMarkerLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FocusMarkerLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusMarkerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_focus_marker, this);
        View findViewById = findViewById(R.id.fill);
        Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.mFill = (ImageView) findViewById;
    }

    @Override // com.glority.android.picturexx.recognize.OnCameraxFocusClickListener
    public void initFocusView(AbsFocusView absFocusView, FrameLayout parent) {
        Intrinsics.checkNotNullParameter(absFocusView, "absFocusView");
        Intrinsics.checkNotNullParameter(parent, "parent");
        absFocusView.setAlpha(0.0f);
    }

    @Override // com.glority.android.picturexx.recognize.OnCameraxFocusClickListener
    public void onClickToFocus(final AbsFocusView absFocusView, FrameLayout parent, PointF touchPoint) {
        Intrinsics.checkNotNullParameter(absFocusView, "absFocusView");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
        int width = (int) (touchPoint.x - (absFocusView.getWidth() / 2));
        int height = (int) (touchPoint.y - (absFocusView.getHeight() / 2));
        absFocusView.setTranslationX(width);
        absFocusView.setTranslationY(height);
        absFocusView.animate().setListener(null).cancel();
        this.mFill.animate().setListener(null).cancel();
        this.mFill.setScaleX(0.0f);
        this.mFill.setScaleY(0.0f);
        this.mFill.setAlpha(1.0f);
        absFocusView.setScaleX(1.36f);
        absFocusView.setScaleY(1.36f);
        absFocusView.setAlpha(1.0f);
        absFocusView.animate().scaleX(1.0f).scaleY(1.0f).setStartDelay(0L).setDuration(330L).setListener(new AnimatorListenerAdapter() { // from class: com.glority.android.picturexx.recognize.FocusMarkerLayout$onClickToFocus$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                AbsFocusView.this.animate().alpha(0.0f).setStartDelay(50L).setDuration(100L).setListener(null).start();
            }
        }).start();
        this.mFill.animate().scaleX(1.0f).scaleY(1.0f).setDuration(330L).setListener(new AnimatorListenerAdapter() { // from class: com.glority.android.picturexx.recognize.FocusMarkerLayout$onClickToFocus$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                ImageView imageView;
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                imageView = FocusMarkerLayout.this.mFill;
                imageView.animate().alpha(0.0f).setDuration(100L).setListener(null).start();
            }
        }).start();
    }
}

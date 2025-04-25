package com.glority.android.adapterhelper.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlideInLeftAnimation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/glority/android/adapterhelper/animation/SlideInLeftAnimation;", "Lcom/glority/android/adapterhelper/animation/BaseAnimation;", "()V", "getAnimators", "", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "(Landroid/view/View;)[Landroid/animation/Animator;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SlideInLeftAnimation implements BaseAnimation {
    @Override // com.glority.android.adapterhelper.animation.BaseAnimation
    public Animator[] getAnimators(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", -view.getRootView().getWidth(), 0.0f);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(view, \"translati…View.width.toFloat(), 0f)");
        return new Animator[]{ofFloat};
    }
}

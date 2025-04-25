package com.glority.android.adapterhelper.animation;

import android.animation.Animator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: BaseAnimation.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/adapterhelper/animation/BaseAnimation;", "", "getAnimators", "", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "(Landroid/view/View;)[Landroid/animation/Animator;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface BaseAnimation {
    Animator[] getAnimators(View view);
}

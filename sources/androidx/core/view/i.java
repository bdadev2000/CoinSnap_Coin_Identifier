package androidx.core.view;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18862c;

    public /* synthetic */ i(int i2, Object obj, Object obj2) {
        this.f18860a = i2;
        this.f18861b = obj;
        this.f18862c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.f18860a;
        Object obj = this.f18862c;
        Object obj2 = this.f18861b;
        switch (i2) {
            case 0:
                ((ViewPropertyAnimatorUpdateListener) obj2).a();
                return;
            case 1:
                AppBarLayout.b((AppBarLayout) obj2, (MaterialShapeDrawable) obj, valueAnimator);
                return;
            default:
                ExpandCollapseAnimationHelper.a((ExpandCollapseAnimationHelper) obj2, (Rect) obj, valueAnimator);
                return;
        }
    }
}

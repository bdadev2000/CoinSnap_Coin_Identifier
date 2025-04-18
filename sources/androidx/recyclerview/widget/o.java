package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ p a;

    public o(p pVar) {
        this.a = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        p pVar = this.a;
        pVar.f1984c.setAlpha(floatValue);
        pVar.f1985d.setAlpha(floatValue);
        pVar.f2000s.invalidate();
    }
}

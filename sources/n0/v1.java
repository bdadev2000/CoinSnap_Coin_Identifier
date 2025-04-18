package n0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class v1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ c2 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r2 f22352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r2 f22353c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f22355e;

    public v1(c2 c2Var, r2 r2Var, r2 r2Var2, int i10, View view) {
        this.a = c2Var;
        this.f22352b = r2Var;
        this.f22353c = r2Var2;
        this.f22354d = i10;
        this.f22355e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        c2 c2Var = this.a;
        c2Var.a.d(animatedFraction);
        float b3 = c2Var.a.b();
        PathInterpolator pathInterpolator = y1.f22370e;
        r2 r2Var = this.f22352b;
        kc.c cVar = new kc.c(r2Var);
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((this.f22354d & i10) == 0) {
                ((i2) cVar.f20640c).c(i10, r2Var.a(i10));
            } else {
                g0.f a = r2Var.a(i10);
                g0.f a10 = this.f22353c.a(i10);
                float f10 = 1.0f - b3;
                ((i2) cVar.f20640c).c(i10, r2.f(a, (int) (((a.a - a10.a) * f10) + 0.5d), (int) (((a.f17910b - a10.f17910b) * f10) + 0.5d), (int) (((a.f17911c - a10.f17911c) * f10) + 0.5d), (int) (((a.f17912d - a10.f17912d) * f10) + 0.5d)));
            }
        }
        y1.g(this.f22355e, cVar.n(), Collections.singletonList(c2Var));
    }
}

package T;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class m0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f2906a;
    public final /* synthetic */ G0 b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G0 f2907c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f2909e;

    public m0(t0 t0Var, G0 g02, G0 g03, int i9, View view) {
        this.f2906a = t0Var;
        this.b = g02;
        this.f2907c = g03;
        this.f2908d = i9;
        this.f2909e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y0 v0Var;
        float f9;
        t0 t0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        t0 t0Var2 = this.f2906a;
        t0Var2.f2928a.d(animatedFraction);
        float b = t0Var2.f2928a.b();
        PathInterpolator pathInterpolator = p0.f2918e;
        int i9 = Build.VERSION.SDK_INT;
        G0 g02 = this.b;
        if (i9 >= 30) {
            v0Var = new x0(g02);
        } else if (i9 >= 29) {
            v0Var = new w0(g02);
        } else {
            v0Var = new v0(g02);
        }
        int i10 = 1;
        while (i10 <= 256) {
            if ((this.f2908d & i10) == 0) {
                v0Var.c(i10, g02.f2863a.f(i10));
                f9 = b;
                t0Var = t0Var2;
            } else {
                L.e f10 = g02.f2863a.f(i10);
                L.e f11 = this.f2907c.f2863a.f(i10);
                int i11 = (int) (((f10.f1669a - f11.f1669a) * r10) + 0.5d);
                int i12 = (int) (((f10.b - f11.b) * r10) + 0.5d);
                f9 = b;
                int i13 = (int) (((f10.f1670c - f11.f1670c) * r10) + 0.5d);
                float f12 = (f10.f1671d - f11.f1671d) * (1.0f - b);
                t0Var = t0Var2;
                v0Var.c(i10, G0.e(f10, i11, i12, i13, (int) (f12 + 0.5d)));
            }
            i10 <<= 1;
            b = f9;
            t0Var2 = t0Var;
        }
        p0.g(this.f2909e, v0Var.b(), Collections.singletonList(t0Var2));
    }
}

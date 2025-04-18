package androidx.core.app;

import android.graphics.PointF;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class t0 {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1249b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1250c;

    /* renamed from: d, reason: collision with root package name */
    public final se.c f1251d;

    public t0(com.google.common.collect.c1 c1Var, int i10) {
        this.f1251d = c1Var;
        this.f1250c = new PointF[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            ((PointF[]) this.f1250c)[i11] = new PointF(0.0f, 0.0f);
        }
    }

    public void a(Bundle bundle) {
        if (this.a) {
            bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, (CharSequence) this.f1251d);
        }
        CharSequence charSequence = (CharSequence) this.f1250c;
        if (charSequence != null) {
            bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
        }
        String d10 = d();
        if (d10 != null) {
            bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, d10);
        }
    }

    public abstract void b(c1 c1Var);

    public final float c(float f10, float f11, float f12) {
        float f13 = f(f10, f11, f12);
        if (f13 < f11) {
            f13 = f11;
        }
        if (f13 > f12) {
            f13 = f12;
        }
        float f14 = ((f12 - f11) / 50.0f) / 2.0f;
        return (f13 < f10 - f14 || f13 > f14 + f10) ? f13 : f10;
    }

    public abstract String d();

    public final PointF e(int i10) {
        return ((PointF[]) this.f1250c)[i10];
    }

    public abstract float f(float f10, float f11, float f12);

    public t0() {
        this.a = false;
    }
}

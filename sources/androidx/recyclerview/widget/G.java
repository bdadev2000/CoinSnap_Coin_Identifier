package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class G implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4934a;

    public /* synthetic */ G(int i9) {
        this.f4934a = i9;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        switch (this.f4934a) {
            case 0:
                float f10 = f9 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            case 1:
                float f11 = f9 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            default:
                float f12 = f9 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }
}

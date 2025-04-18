package i1;

import android.view.animation.Interpolator;
import vd.e;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {
    public final float[] a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19139b;

    public d(float[] fArr) {
        this.a = fArr;
        this.f19139b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f19139b;
        float f12 = (f10 - (min * f11)) / f11;
        float f13 = fArr[min];
        return e.b(fArr[min + 1], f13, f12, f13);
    }
}

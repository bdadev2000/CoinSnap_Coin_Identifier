package androidx.interpolator.view.animation;

import android.support.v4.media.d;
import android.view.animation.Interpolator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class LookupTableInterpolator implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f19927a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19928b;

    public LookupTableInterpolator(float[] fArr) {
        this.f19927a = fArr;
        this.f19928b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f19927a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f19928b;
        float f4 = (f2 - (min * f3)) / f3;
        float f5 = fArr[min];
        return d.a(fArr[min + 1], f5, f4, f5);
    }
}

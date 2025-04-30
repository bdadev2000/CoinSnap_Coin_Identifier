package T;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2925a;
    public float b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f2926c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2927d;

    public s0(int i9, Interpolator interpolator, long j7) {
        this.f2925a = i9;
        this.f2926c = interpolator;
        this.f2927d = j7;
    }

    public long a() {
        return this.f2927d;
    }

    public float b() {
        Interpolator interpolator = this.f2926c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.b);
        }
        return this.b;
    }

    public int c() {
        return this.f2925a;
    }

    public void d(float f9) {
        this.b = f9;
    }
}

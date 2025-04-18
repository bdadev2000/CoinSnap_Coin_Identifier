package n0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class b2 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public float f22248b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f22249c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22250d;

    public b2(int i10, Interpolator interpolator, long j3) {
        this.a = i10;
        this.f22249c = interpolator;
        this.f22250d = j3;
    }

    public long a() {
        return this.f22250d;
    }

    public float b() {
        Interpolator interpolator = this.f22249c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f22248b);
        }
        return this.f22248b;
    }

    public int c() {
        return this.a;
    }

    public void d(float f10) {
        this.f22248b = f10;
    }
}

package T;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class r0 extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f2924e;

    public r0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2924e = windowInsetsAnimation;
    }

    @Override // T.s0
    public final long a() {
        long durationMillis;
        durationMillis = this.f2924e.getDurationMillis();
        return durationMillis;
    }

    @Override // T.s0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f2924e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // T.s0
    public final int c() {
        int typeMask;
        typeMask = this.f2924e.getTypeMask();
        return typeMask;
    }

    @Override // T.s0
    public final void d(float f9) {
        this.f2924e.setFraction(f9);
    }
}

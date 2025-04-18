package n0;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class a2 extends b2 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f22245e;

    public a2(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f22245e = windowInsetsAnimation;
    }

    @Override // n0.b2
    public final long a() {
        long durationMillis;
        durationMillis = this.f22245e.getDurationMillis();
        return durationMillis;
    }

    @Override // n0.b2
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f22245e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // n0.b2
    public final int c() {
        int typeMask;
        typeMask = this.f22245e.getTypeMask();
        return typeMask;
    }

    @Override // n0.b2
    public final void d(float f10) {
        this.f22245e.setFraction(f10);
    }
}

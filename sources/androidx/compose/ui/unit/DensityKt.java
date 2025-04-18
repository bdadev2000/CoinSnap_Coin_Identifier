package androidx.compose.ui.unit;

/* loaded from: classes2.dex */
public final class DensityKt {
    public static final Density a(float f2, float f3) {
        return new DensityImpl(f2, f3);
    }

    public static Density b() {
        return new DensityImpl(1.0f, 1.0f);
    }
}

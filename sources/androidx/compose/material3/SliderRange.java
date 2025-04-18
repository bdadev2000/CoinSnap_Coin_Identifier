package androidx.compose.material3;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class SliderRange {

    /* renamed from: b, reason: collision with root package name */
    public static final long f11484b = SliderKt.g(Float.NaN, Float.NaN);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11485c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f11486a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final float a(long j2) {
        if (j2 != f11484b) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        throw new IllegalStateException("SliderRange is unspecified".toString());
    }

    public static final float b(long j2) {
        if (j2 != f11484b) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified".toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SliderRange) {
            return this.f11486a == ((SliderRange) obj).f11486a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11486a);
    }

    public final String toString() {
        float f2 = SliderKt.f11297a;
        long j2 = f11484b;
        long j3 = this.f11486a;
        if (j3 == j2) {
            return "FloatRange.Unspecified";
        }
        return b(j3) + ".." + a(j3);
    }
}

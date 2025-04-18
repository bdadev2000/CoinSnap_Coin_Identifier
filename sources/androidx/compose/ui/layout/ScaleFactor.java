package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.internal.InlineClassHelperKt;

@Immutable
/* loaded from: classes2.dex */
public final class ScaleFactor {

    /* renamed from: a, reason: collision with root package name */
    public static final long f15837a = ScaleFactorKt.a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15838b = 0;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final float a(long j2) {
        if (j2 != f15837a) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        InlineClassHelperKt.b("ScaleFactor is unspecified");
        throw null;
    }

    public static final float b(long j2) {
        if (j2 != f15837a) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        InlineClassHelperKt.b("ScaleFactor is unspecified");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScaleFactor)) {
            return false;
        }
        ((ScaleFactor) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScaleFactor(");
        float f2 = 10;
        float a2 = a(0L) * f2;
        int i2 = (int) a2;
        if (a2 - i2 >= 0.5f) {
            i2++;
        }
        sb.append(i2 / f2);
        sb.append(", ");
        float b2 = b(0L) * f2;
        int i3 = (int) b2;
        if (b2 - i3 >= 0.5f) {
            i3++;
        }
        sb.append(i3 / f2);
        sb.append(')');
        return sb.toString();
    }
}

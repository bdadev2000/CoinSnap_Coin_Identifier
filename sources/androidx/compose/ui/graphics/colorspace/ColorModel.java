package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;

@Immutable
/* loaded from: classes2.dex */
public final class ColorModel {

    /* renamed from: a, reason: collision with root package name */
    public static final long f15067a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f15068b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f15069c;
    public static final long d;
    public static final /* synthetic */ int e = 0;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    static {
        long j2 = 3;
        long j3 = j2 << 32;
        f15067a = (0 & 4294967295L) | j3;
        f15068b = (1 & 4294967295L) | j3;
        f15069c = j3 | (2 & 4294967295L);
        d = (j2 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j2, long j3) {
        return j2 == j3;
    }

    public static String b(long j2) {
        return a(j2, f15067a) ? "Rgb" : a(j2, f15068b) ? "Xyz" : a(j2, f15069c) ? "Lab" : a(j2, d) ? "Cmyk" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ColorModel)) {
            return false;
        }
        ((ColorModel) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return b(0L);
    }
}

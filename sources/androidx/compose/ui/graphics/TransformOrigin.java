package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes4.dex */
public final class TransformOrigin {

    /* renamed from: b, reason: collision with root package name */
    public static final long f15059b = TransformOriginKt.a(0.5f, 0.5f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15060c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f15061a;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public static final boolean a(long j2, long j3) {
        return j2 == j3;
    }

    public static final float b(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float c(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static String d(long j2) {
        return "TransformOrigin(packedValue=" + j2 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransformOrigin) {
            return this.f15061a == ((TransformOrigin) obj).f15061a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15061a);
    }

    public final String toString() {
        return d(this.f15061a);
    }
}

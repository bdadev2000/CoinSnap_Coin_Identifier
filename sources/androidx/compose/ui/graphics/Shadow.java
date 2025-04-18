package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;

@Immutable
/* loaded from: classes2.dex */
public final class Shadow {
    public static final Shadow d = new Shadow();

    /* renamed from: a, reason: collision with root package name */
    public final long f15039a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15040b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15041c;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public Shadow(long j2, long j3, float f2) {
        this.f15039a = j2;
        this.f15040b = j3;
        this.f15041c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.c(this.f15039a, shadow.f15039a) && Offset.d(this.f15040b, shadow.f15040b) && this.f15041c == shadow.f15041c;
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Float.hashCode(this.f15041c) + android.support.v4.media.d.d(this.f15040b, Long.hashCode(this.f15039a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        android.support.v4.media.d.z(this.f15039a, sb, ", offset=");
        sb.append((Object) Offset.m(this.f15040b));
        sb.append(", blurRadius=");
        return android.support.v4.media.d.n(sb, this.f15041c, ')');
    }

    public /* synthetic */ Shadow() {
        this(ColorKt.d(4278190080L), 0L, 0.0f);
    }
}

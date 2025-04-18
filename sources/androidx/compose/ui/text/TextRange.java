package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class TextRange {

    /* renamed from: b, reason: collision with root package name */
    public static final long f17056b = TextRangeKt.a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17057c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f17058a;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public /* synthetic */ TextRange(long j2) {
        this.f17058a = j2;
    }

    public static final boolean a(long j2, long j3) {
        return f(j2) <= f(j3) && e(j3) <= e(j2);
    }

    public static final boolean b(long j2, long j3) {
        return j2 == j3;
    }

    public static final boolean c(long j2) {
        return ((int) (j2 >> 32)) == ((int) (j2 & 4294967295L));
    }

    public static final int d(long j2) {
        return e(j2) - f(j2);
    }

    public static final int e(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return i2 > i3 ? i2 : i3;
    }

    public static final int f(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return i2 > i3 ? i3 : i2;
    }

    public static final boolean g(long j2) {
        return ((int) (j2 >> 32)) > ((int) (j2 & 4294967295L));
    }

    public static String h(long j2) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j2 >> 32));
        sb.append(", ");
        return d.o(sb, (int) (j2 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextRange) {
            return this.f17058a == ((TextRange) obj).f17058a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17058a);
    }

    public final String toString() {
        return h(this.f17058a);
    }
}

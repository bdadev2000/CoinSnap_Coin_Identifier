package androidx.compose.ui.unit;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class IntRect {
    public static final IntRect e = new IntRect(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f17490a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17491b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17492c;
    public final int d;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public IntRect(int i2, int i3, int i4, int i5) {
        this.f17490a = i2;
        this.f17491b = i3;
        this.f17492c = i4;
        this.d = i5;
    }

    public final long a() {
        return IntOffsetKt.a((c() / 2) + this.f17490a, (b() / 2) + this.f17491b);
    }

    public final int b() {
        return this.d - this.f17491b;
    }

    public final int c() {
        return this.f17492c - this.f17490a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.f17490a == intRect.f17490a && this.f17491b == intRect.f17491b && this.f17492c == intRect.f17492c && this.d == intRect.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + d.c(this.f17492c, d.c(this.f17491b, Integer.hashCode(this.f17490a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f17490a);
        sb.append(", ");
        sb.append(this.f17491b);
        sb.append(", ");
        sb.append(this.f17492c);
        sb.append(", ");
        return d.o(sb, this.d, ')');
    }
}

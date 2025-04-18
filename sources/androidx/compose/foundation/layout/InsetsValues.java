package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class InsetsValues {

    /* renamed from: a, reason: collision with root package name */
    public final int f4022a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4023b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4024c;
    public final int d;

    public InsetsValues(int i2, int i3, int i4, int i5) {
        this.f4022a = i2;
        this.f4023b = i3;
        this.f4024c = i4;
        this.d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsValues)) {
            return false;
        }
        InsetsValues insetsValues = (InsetsValues) obj;
        return this.f4022a == insetsValues.f4022a && this.f4023b == insetsValues.f4023b && this.f4024c == insetsValues.f4024c && this.d == insetsValues.d;
    }

    public final int hashCode() {
        return (((((this.f4022a * 31) + this.f4023b) * 31) + this.f4024c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f4022a);
        sb.append(", top=");
        sb.append(this.f4023b);
        sb.append(", right=");
        sb.append(this.f4024c);
        sb.append(", bottom=");
        return d.o(sb, this.d, ')');
    }
}

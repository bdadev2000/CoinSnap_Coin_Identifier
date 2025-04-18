package androidx.compose.ui.geometry;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class Rect {
    public static final Rect e = new Rect(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f14914a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14915b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14916c;
    public final float d;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public Rect(float f2, float f3, float f4, float f5) {
        this.f14914a = f2;
        this.f14915b = f3;
        this.f14916c = f4;
        this.d = f5;
    }

    public static Rect b(Rect rect, float f2, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f2 = rect.f14914a;
        }
        float f5 = (i2 & 2) != 0 ? rect.f14915b : 0.0f;
        if ((i2 & 4) != 0) {
            f3 = rect.f14916c;
        }
        if ((i2 & 8) != 0) {
            f4 = rect.d;
        }
        return new Rect(f2, f5, f3, f4);
    }

    public final boolean a(long j2) {
        return Offset.g(j2) >= this.f14914a && Offset.g(j2) < this.f14916c && Offset.h(j2) >= this.f14915b && Offset.h(j2) < this.d;
    }

    public final long c() {
        return OffsetKt.a((h() / 2.0f) + this.f14914a, this.d);
    }

    public final long d() {
        return OffsetKt.a((h() / 2.0f) + this.f14914a, (e() / 2.0f) + this.f14915b);
    }

    public final float e() {
        return this.d - this.f14915b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.f14914a, rect.f14914a) == 0 && Float.compare(this.f14915b, rect.f14915b) == 0 && Float.compare(this.f14916c, rect.f14916c) == 0 && Float.compare(this.d, rect.d) == 0;
    }

    public final long f() {
        return SizeKt.a(h(), e());
    }

    public final long g() {
        return OffsetKt.a(this.f14914a, this.f14915b);
    }

    public final float h() {
        return this.f14916c - this.f14914a;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + d.b(this.f14916c, d.b(this.f14915b, Float.hashCode(this.f14914a) * 31, 31), 31);
    }

    public final Rect i(Rect rect) {
        return new Rect(Math.max(this.f14914a, rect.f14914a), Math.max(this.f14915b, rect.f14915b), Math.min(this.f14916c, rect.f14916c), Math.min(this.d, rect.d));
    }

    public final boolean j() {
        return this.f14914a >= this.f14916c || this.f14915b >= this.d;
    }

    public final boolean k(Rect rect) {
        return this.f14916c > rect.f14914a && rect.f14916c > this.f14914a && this.d > rect.f14915b && rect.d > this.f14915b;
    }

    public final Rect l(float f2, float f3) {
        return new Rect(this.f14914a + f2, this.f14915b + f3, this.f14916c + f2, this.d + f3);
    }

    public final Rect m(long j2) {
        return new Rect(Offset.g(j2) + this.f14914a, Offset.h(j2) + this.f14915b, Offset.g(j2) + this.f14916c, Offset.h(j2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.a(this.f14914a) + ", " + GeometryUtilsKt.a(this.f14915b) + ", " + GeometryUtilsKt.a(this.f14916c) + ", " + GeometryUtilsKt.a(this.d) + ')';
    }
}

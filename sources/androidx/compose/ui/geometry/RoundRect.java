package androidx.compose.ui.geometry;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class RoundRect {

    /* renamed from: a, reason: collision with root package name */
    public final float f14917a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14918b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14919c;
    public final float d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14920f;

    /* renamed from: g, reason: collision with root package name */
    public final long f14921g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14922h;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    static {
        long j2 = CornerRadius.f14908a;
        CornerRadiusKt.a(CornerRadius.b(j2), CornerRadius.c(j2));
    }

    public RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5) {
        this.f14917a = f2;
        this.f14918b = f3;
        this.f14919c = f4;
        this.d = f5;
        this.e = j2;
        this.f14920f = j3;
        this.f14921g = j4;
        this.f14922h = j5;
    }

    public final float a() {
        return this.d - this.f14918b;
    }

    public final float b() {
        return this.f14919c - this.f14917a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.f14917a, roundRect.f14917a) == 0 && Float.compare(this.f14918b, roundRect.f14918b) == 0 && Float.compare(this.f14919c, roundRect.f14919c) == 0 && Float.compare(this.d, roundRect.d) == 0 && CornerRadius.a(this.e, roundRect.e) && CornerRadius.a(this.f14920f, roundRect.f14920f) && CornerRadius.a(this.f14921g, roundRect.f14921g) && CornerRadius.a(this.f14922h, roundRect.f14922h);
    }

    public final int hashCode() {
        int b2 = d.b(this.d, d.b(this.f14919c, d.b(this.f14918b, Float.hashCode(this.f14917a) * 31, 31), 31), 31);
        int i2 = CornerRadius.f14909b;
        return Long.hashCode(this.f14922h) + d.d(this.f14921g, d.d(this.f14920f, d.d(this.e, b2, 31), 31), 31);
    }

    public final String toString() {
        String str = GeometryUtilsKt.a(this.f14917a) + ", " + GeometryUtilsKt.a(this.f14918b) + ", " + GeometryUtilsKt.a(this.f14919c) + ", " + GeometryUtilsKt.a(this.d);
        long j2 = this.e;
        long j3 = this.f14920f;
        boolean a2 = CornerRadius.a(j2, j3);
        long j4 = this.f14921g;
        long j5 = this.f14922h;
        if (!a2 || !CornerRadius.a(j3, j4) || !CornerRadius.a(j4, j5)) {
            StringBuilder v2 = d.v("RoundRect(rect=", str, ", topLeft=");
            v2.append((Object) CornerRadius.d(j2));
            v2.append(", topRight=");
            v2.append((Object) CornerRadius.d(j3));
            v2.append(", bottomRight=");
            v2.append((Object) CornerRadius.d(j4));
            v2.append(", bottomLeft=");
            v2.append((Object) CornerRadius.d(j5));
            v2.append(')');
            return v2.toString();
        }
        if (CornerRadius.b(j2) == CornerRadius.c(j2)) {
            StringBuilder v3 = d.v("RoundRect(rect=", str, ", radius=");
            v3.append(GeometryUtilsKt.a(CornerRadius.b(j2)));
            v3.append(')');
            return v3.toString();
        }
        StringBuilder v4 = d.v("RoundRect(rect=", str, ", x=");
        v4.append(GeometryUtilsKt.a(CornerRadius.b(j2)));
        v4.append(", y=");
        v4.append(GeometryUtilsKt.a(CornerRadius.c(j2)));
        v4.append(')');
        return v4.toString();
    }
}

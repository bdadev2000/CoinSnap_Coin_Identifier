package androidx.compose.ui.graphics.drawscope;

import android.support.v4.media.d;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import p0.a;

/* loaded from: classes3.dex */
public final class Stroke extends DrawStyle {

    /* renamed from: a, reason: collision with root package name */
    public final float f15147a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15148b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15149c;
    public final int d;
    public final PathEffect e;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public Stroke(float f2, float f3, int i2, int i3, int i4) {
        f2 = (i4 & 1) != 0 ? 0.0f : f2;
        f3 = (i4 & 2) != 0 ? 4.0f : f3;
        i2 = (i4 & 4) != 0 ? 0 : i2;
        i3 = (i4 & 8) != 0 ? 0 : i3;
        this.f15147a = f2;
        this.f15148b = f3;
        this.f15149c = i2;
        this.d = i3;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        return this.f15147a == stroke.f15147a && this.f15148b == stroke.f15148b && StrokeCap.a(this.f15149c, stroke.f15149c) && StrokeJoin.a(this.d, stroke.d) && a.g(this.e, stroke.e);
    }

    public final int hashCode() {
        int c2 = d.c(this.d, d.c(this.f15149c, d.b(this.f15148b, Float.hashCode(this.f15147a) * 31, 31), 31), 31);
        PathEffect pathEffect = this.e;
        return c2 + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public final String toString() {
        return "Stroke(width=" + this.f15147a + ", miter=" + this.f15148b + ", cap=" + ((Object) StrokeCap.b(this.f15149c)) + ", join=" + ((Object) StrokeJoin.b(this.d)) + ", pathEffect=" + this.e + ')';
    }
}

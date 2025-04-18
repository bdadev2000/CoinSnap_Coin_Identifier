package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class SolidColor extends Brush {

    /* renamed from: a, reason: collision with root package name */
    public final long f15055a;

    public SolidColor(long j2) {
        this.f15055a = j2;
    }

    @Override // androidx.compose.ui.graphics.Brush
    public final void a(float f2, long j2, Paint paint) {
        paint.c(1.0f);
        long j3 = this.f15055a;
        if (f2 != 1.0f) {
            j3 = Color.b(j3, Color.d(j3) * f2);
        }
        paint.v(j3);
        if (paint.y() != null) {
            paint.x(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SolidColor) {
            return Color.c(this.f15055a, ((SolidColor) obj).f15055a);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f15055a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) Color.i(this.f15055a)) + ')';
    }
}

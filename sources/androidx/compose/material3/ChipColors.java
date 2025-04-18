package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes3.dex */
public final class ChipColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f8233a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8234b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8235c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8236f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8237g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8238h;

    public ChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f8233a = j2;
        this.f8234b = j3;
        this.f8235c = j4;
        this.d = j5;
        this.e = j6;
        this.f8236f = j7;
        this.f8237g = j8;
        this.f8238h = j9;
    }

    public final long a(boolean z2) {
        return z2 ? this.f8234b : this.f8236f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) obj;
        return Color.c(this.f8233a, chipColors.f8233a) && Color.c(this.f8234b, chipColors.f8234b) && Color.c(this.f8235c, chipColors.f8235c) && Color.c(this.d, chipColors.d) && Color.c(this.e, chipColors.e) && Color.c(this.f8236f, chipColors.f8236f) && Color.c(this.f8237g, chipColors.f8237g) && Color.c(this.f8238h, chipColors.f8238h);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f8238h) + d.d(this.f8237g, d.d(this.f8236f, d.d(this.e, d.d(this.d, d.d(this.f8235c, d.d(this.f8234b, Long.hashCode(this.f8233a) * 31, 31), 31), 31), 31), 31), 31);
    }
}

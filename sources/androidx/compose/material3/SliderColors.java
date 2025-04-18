package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes3.dex */
public final class SliderColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f11210a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11211b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11212c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11213f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11214g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11215h;

    /* renamed from: i, reason: collision with root package name */
    public final long f11216i;

    /* renamed from: j, reason: collision with root package name */
    public final long f11217j;

    public SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f11210a = j2;
        this.f11211b = j3;
        this.f11212c = j4;
        this.d = j5;
        this.e = j6;
        this.f11213f = j7;
        this.f11214g = j8;
        this.f11215h = j9;
        this.f11216i = j10;
        this.f11217j = j11;
    }

    public final long a(boolean z2, boolean z3) {
        return z2 ? z3 ? this.f11212c : this.e : z3 ? this.f11215h : this.f11217j;
    }

    public final long b(boolean z2, boolean z3) {
        return z2 ? z3 ? this.f11211b : this.d : z3 ? this.f11214g : this.f11216i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) obj;
        return Color.c(this.f11210a, sliderColors.f11210a) && Color.c(this.f11211b, sliderColors.f11211b) && Color.c(this.f11212c, sliderColors.f11212c) && Color.c(this.d, sliderColors.d) && Color.c(this.e, sliderColors.e) && Color.c(this.f11213f, sliderColors.f11213f) && Color.c(this.f11214g, sliderColors.f11214g) && Color.c(this.f11215h, sliderColors.f11215h) && Color.c(this.f11216i, sliderColors.f11216i) && Color.c(this.f11217j, sliderColors.f11217j);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f11217j) + d.d(this.f11216i, d.d(this.f11215h, d.d(this.f11214g, d.d(this.f11213f, d.d(this.e, d.d(this.d, d.d(this.f11212c, d.d(this.f11211b, Long.hashCode(this.f11210a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}

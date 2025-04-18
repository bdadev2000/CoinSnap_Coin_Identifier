package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes4.dex */
public final class NavigationBarItemColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f9964a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9965b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9966c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9967f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9968g;

    public NavigationBarItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f9964a = j2;
        this.f9965b = j3;
        this.f9966c = j4;
        this.d = j5;
        this.e = j6;
        this.f9967f = j7;
        this.f9968g = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationBarItemColors)) {
            return false;
        }
        NavigationBarItemColors navigationBarItemColors = (NavigationBarItemColors) obj;
        return Color.c(this.f9964a, navigationBarItemColors.f9964a) && Color.c(this.d, navigationBarItemColors.d) && Color.c(this.f9965b, navigationBarItemColors.f9965b) && Color.c(this.e, navigationBarItemColors.e) && Color.c(this.f9966c, navigationBarItemColors.f9966c) && Color.c(this.f9967f, navigationBarItemColors.f9967f) && Color.c(this.f9968g, navigationBarItemColors.f9968g);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f9968g) + d.d(this.f9967f, d.d(this.f9966c, d.d(this.e, d.d(this.f9965b, d.d(this.d, Long.hashCode(this.f9964a) * 31, 31), 31), 31), 31), 31);
    }
}

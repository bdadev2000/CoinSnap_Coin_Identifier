package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes.dex */
public final class NavigationRailItemColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f10316a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10317b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10318c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10319f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10320g;

    public NavigationRailItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f10316a = j2;
        this.f10317b = j3;
        this.f10318c = j4;
        this.d = j5;
        this.e = j6;
        this.f10319f = j7;
        this.f10320g = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationRailItemColors)) {
            return false;
        }
        NavigationRailItemColors navigationRailItemColors = (NavigationRailItemColors) obj;
        return Color.c(this.f10316a, navigationRailItemColors.f10316a) && Color.c(this.d, navigationRailItemColors.d) && Color.c(this.f10317b, navigationRailItemColors.f10317b) && Color.c(this.e, navigationRailItemColors.e) && Color.c(this.f10318c, navigationRailItemColors.f10318c) && Color.c(this.f10319f, navigationRailItemColors.f10319f) && Color.c(this.f10320g, navigationRailItemColors.f10320g);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f10320g) + d.d(this.f10319f, d.d(this.f10318c, d.d(this.e, d.d(this.f10317b, d.d(this.d, Long.hashCode(this.f10316a) * 31, 31), 31), 31), 31), 31);
    }
}

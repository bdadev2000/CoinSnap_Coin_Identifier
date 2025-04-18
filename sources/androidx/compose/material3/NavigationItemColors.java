package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes3.dex */
public final class NavigationItemColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f10230a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10231b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10232c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10233f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10234g;

    public NavigationItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f10230a = j2;
        this.f10231b = j3;
        this.f10232c = j4;
        this.d = j5;
        this.e = j6;
        this.f10233f = j7;
        this.f10234g = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationItemColors)) {
            return false;
        }
        NavigationItemColors navigationItemColors = (NavigationItemColors) obj;
        return Color.c(this.f10230a, navigationItemColors.f10230a) && Color.c(this.d, navigationItemColors.d) && Color.c(this.f10231b, navigationItemColors.f10231b) && Color.c(this.e, navigationItemColors.e) && Color.c(this.f10232c, navigationItemColors.f10232c) && Color.c(this.f10233f, navigationItemColors.f10233f) && Color.c(this.f10234g, navigationItemColors.f10234g);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f10234g) + d.d(this.f10233f, d.d(this.f10232c, d.d(this.e, d.d(this.f10231b, d.d(this.d, Long.hashCode(this.f10230a) * 31, 31), 31), 31), 31), 31);
    }
}

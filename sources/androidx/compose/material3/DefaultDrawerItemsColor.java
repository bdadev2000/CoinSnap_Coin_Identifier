package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.Color;

/* loaded from: classes3.dex */
final class DefaultDrawerItemsColor implements NavigationDrawerItemColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f9209a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9210b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9211c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9212f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9213g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9214h;

    public DefaultDrawerItemsColor(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f9209a = j2;
        this.f9210b = j3;
        this.f9211c = j4;
        this.d = j5;
        this.e = j6;
        this.f9212f = j7;
        this.f9213g = j8;
        this.f9214h = j9;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public final MutableState a(boolean z2, Composer composer) {
        composer.J(1275109558);
        MutableState k2 = SnapshotStateKt.k(new Color(z2 ? this.f9211c : this.d), composer);
        composer.D();
        return k2;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public final MutableState b(boolean z2, Composer composer) {
        composer.J(-433512770);
        MutableState k2 = SnapshotStateKt.k(new Color(z2 ? this.e : this.f9212f), composer);
        composer.D();
        return k2;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public final MutableState c(boolean z2, Composer composer) {
        composer.J(-561675044);
        MutableState k2 = SnapshotStateKt.k(new Color(z2 ? this.f9213g : this.f9214h), composer);
        composer.D();
        return k2;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public final MutableState d(boolean z2, Composer composer) {
        composer.J(1141354218);
        MutableState k2 = SnapshotStateKt.k(new Color(z2 ? this.f9209a : this.f9210b), composer);
        composer.D();
        return k2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDrawerItemsColor)) {
            return false;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = (DefaultDrawerItemsColor) obj;
        if (Color.c(this.f9209a, defaultDrawerItemsColor.f9209a) && Color.c(this.f9210b, defaultDrawerItemsColor.f9210b) && Color.c(this.f9211c, defaultDrawerItemsColor.f9211c) && Color.c(this.d, defaultDrawerItemsColor.d) && Color.c(this.e, defaultDrawerItemsColor.e) && Color.c(this.f9212f, defaultDrawerItemsColor.f9212f) && Color.c(this.f9213g, defaultDrawerItemsColor.f9213g)) {
            return Color.c(this.f9214h, defaultDrawerItemsColor.f9214h);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f9214h) + d.d(this.f9213g, d.d(this.f9212f, d.d(this.e, d.d(this.d, d.d(this.f9211c, d.d(this.f9210b, Long.hashCode(this.f9209a) * 31, 31), 31), 31), 31), 31), 31);
    }
}

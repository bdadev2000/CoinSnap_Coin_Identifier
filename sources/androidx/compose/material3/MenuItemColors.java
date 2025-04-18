package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes3.dex */
public final class MenuItemColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f9733a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9734b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9735c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9736f;

    public MenuItemColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f9733a = j2;
        this.f9734b = j3;
        this.f9735c = j4;
        this.d = j5;
        this.e = j6;
        this.f9736f = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) obj;
        return Color.c(this.f9733a, menuItemColors.f9733a) && Color.c(this.f9734b, menuItemColors.f9734b) && Color.c(this.f9735c, menuItemColors.f9735c) && Color.c(this.d, menuItemColors.d) && Color.c(this.e, menuItemColors.e) && Color.c(this.f9736f, menuItemColors.f9736f);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f9736f) + d.d(this.e, d.d(this.d, d.d(this.f9735c, d.d(this.f9734b, Long.hashCode(this.f9733a) * 31, 31), 31), 31), 31);
    }
}

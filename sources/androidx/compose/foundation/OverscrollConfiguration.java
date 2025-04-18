package androidx.compose.foundation;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import p0.a;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public final class OverscrollConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final long f2836a;

    /* renamed from: b, reason: collision with root package name */
    public final PaddingValues f2837b;

    public OverscrollConfiguration() {
        long d = ColorKt.d(4284900966L);
        PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
        this.f2836a = d;
        this.f2837b = a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.g(OverscrollConfiguration.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        a.q(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
        return Color.c(this.f2836a, overscrollConfiguration.f2836a) && a.g(this.f2837b, overscrollConfiguration.f2837b);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return this.f2837b.hashCode() + (Long.hashCode(this.f2836a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        d.z(this.f2836a, sb, ", drawPadding=");
        sb.append(this.f2837b);
        sb.append(')');
        return sb.toString();
    }
}

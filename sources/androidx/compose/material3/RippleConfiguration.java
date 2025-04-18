package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes4.dex */
public final class RippleConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final long f10780a = Color.f14962i;

    /* renamed from: b, reason: collision with root package name */
    public final RippleAlpha f10781b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleConfiguration)) {
            return false;
        }
        RippleConfiguration rippleConfiguration = (RippleConfiguration) obj;
        return Color.c(this.f10780a, rippleConfiguration.f10780a) && p0.a.g(this.f10781b, rippleConfiguration.f10781b);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        int hashCode = Long.hashCode(this.f10780a) * 31;
        RippleAlpha rippleAlpha = this.f10781b;
        return hashCode + (rippleAlpha != null ? rippleAlpha.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        d.z(this.f10780a, sb, ", rippleAlpha=");
        sb.append(this.f10781b);
        sb.append(')');
        return sb.toString();
    }
}

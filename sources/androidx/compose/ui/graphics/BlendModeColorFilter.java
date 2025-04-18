package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class BlendModeColorFilter extends ColorFilter {

    /* renamed from: b, reason: collision with root package name */
    public final long f14942b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14943c;

    public BlendModeColorFilter(long j2, int i2, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.f14942b = j2;
        this.f14943c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.c(this.f14942b, blendModeColorFilter.f14942b) && BlendMode.a(this.f14943c, blendModeColorFilter.f14943c);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Integer.hashCode(this.f14943c) + (Long.hashCode(this.f14942b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        android.support.v4.media.d.z(this.f14942b, sb, ", blendMode=");
        sb.append((Object) BlendMode.b(this.f14943c));
        sb.append(')');
        return sb.toString();
    }
}

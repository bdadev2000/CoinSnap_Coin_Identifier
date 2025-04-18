package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes4.dex */
public final class IconButtonColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f9511a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9512b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9513c;
    public final long d;

    public IconButtonColors(long j2, long j3, long j4, long j5) {
        this.f9511a = j2;
        this.f9512b = j3;
        this.f9513c = j4;
        this.d = j5;
    }

    public static IconButtonColors a(IconButtonColors iconButtonColors, long j2, long j3) {
        long j4 = iconButtonColors.f9511a;
        long j5 = iconButtonColors.f9513c;
        if (j2 == 16) {
            j2 = iconButtonColors.f9512b;
        }
        if (j3 == 16) {
            j3 = iconButtonColors.d;
        }
        return new IconButtonColors(j4, j2, j5, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconButtonColors)) {
            return false;
        }
        IconButtonColors iconButtonColors = (IconButtonColors) obj;
        return Color.c(this.f9511a, iconButtonColors.f9511a) && Color.c(this.f9512b, iconButtonColors.f9512b) && Color.c(this.f9513c, iconButtonColors.f9513c) && Color.c(this.d, iconButtonColors.d);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.d) + d.d(this.f9513c, d.d(this.f9512b, Long.hashCode(this.f9511a) * 31, 31), 31);
    }
}

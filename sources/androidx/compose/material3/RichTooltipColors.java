package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;

@Stable
@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class RichTooltipColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f10777a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10778b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10779c;
    public final long d;

    public RichTooltipColors(long j2, long j3, long j4, long j5) {
        this.f10777a = j2;
        this.f10778b = j3;
        this.f10779c = j4;
        this.d = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTooltipColors)) {
            return false;
        }
        RichTooltipColors richTooltipColors = (RichTooltipColors) obj;
        return Color.c(this.f10777a, richTooltipColors.f10777a) && Color.c(this.f10778b, richTooltipColors.f10778b) && Color.c(this.f10779c, richTooltipColors.f10779c) && Color.c(this.d, richTooltipColors.d);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.d) + d.d(this.f10779c, d.d(this.f10778b, Long.hashCode(this.f10777a) * 31, 31), 31);
    }
}

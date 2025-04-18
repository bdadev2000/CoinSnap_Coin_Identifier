package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes4.dex */
public final class CardColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f8114a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8115b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8116c;
    public final long d;

    public CardColors(long j2, long j3, long j4, long j5) {
        this.f8114a = j2;
        this.f8115b = j3;
        this.f8116c = j4;
        this.d = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CardColors)) {
            return false;
        }
        CardColors cardColors = (CardColors) obj;
        return Color.c(this.f8114a, cardColors.f8114a) && Color.c(this.f8115b, cardColors.f8115b) && Color.c(this.f8116c, cardColors.f8116c) && Color.c(this.d, cardColors.d);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.d) + d.d(this.f8116c, d.d(this.f8115b, Long.hashCode(this.f8114a) * 31, 31), 31);
    }
}

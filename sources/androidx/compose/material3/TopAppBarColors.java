package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes4.dex */
public final class TopAppBarColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f12603a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12604b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12605c;
    public final long d;
    public final long e;

    public TopAppBarColors(long j2, long j3, long j4, long j5, long j6) {
        this.f12603a = j2;
        this.f12604b = j3;
        this.f12605c = j4;
        this.d = j5;
        this.e = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) obj;
        return Color.c(this.f12603a, topAppBarColors.f12603a) && Color.c(this.f12604b, topAppBarColors.f12604b) && Color.c(this.f12605c, topAppBarColors.f12605c) && Color.c(this.d, topAppBarColors.d) && Color.c(this.e, topAppBarColors.e);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.e) + d.d(this.d, d.d(this.f12605c, d.d(this.f12604b, Long.hashCode(this.f12603a) * 31, 31), 31), 31);
    }
}

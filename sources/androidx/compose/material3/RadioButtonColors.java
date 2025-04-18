package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes.dex */
public final class RadioButtonColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f10737a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10738b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10739c;
    public final long d;

    public RadioButtonColors(long j2, long j3, long j4, long j5) {
        this.f10737a = j2;
        this.f10738b = j3;
        this.f10739c = j4;
        this.d = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) obj;
        return Color.c(this.f10737a, radioButtonColors.f10737a) && Color.c(this.f10738b, radioButtonColors.f10738b) && Color.c(this.f10739c, radioButtonColors.f10739c) && Color.c(this.d, radioButtonColors.d);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.d) + d.d(this.f10739c, d.d(this.f10738b, Long.hashCode(this.f10737a) * 31, 31), 31);
    }
}

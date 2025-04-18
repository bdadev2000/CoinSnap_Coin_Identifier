package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

@Immutable
@d0.a
/* loaded from: classes3.dex */
public final class ChipBorder {

    /* renamed from: a, reason: collision with root package name */
    public final long f8230a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8231b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8232c;

    public ChipBorder(long j2, long j3, float f2) {
        this.f8230a = j2;
        this.f8231b = j3;
        this.f8232c = f2;
    }

    public final MutableState a(boolean z2, Composer composer) {
        return SnapshotStateKt.k(BorderStrokeKt.a(z2 ? this.f8230a : this.f8231b, this.f8232c), composer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) obj;
        return Color.c(this.f8230a, chipBorder.f8230a) && Color.c(this.f8231b, chipBorder.f8231b) && Dp.a(this.f8232c, chipBorder.f8232c);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Float.hashCode(this.f8232c) + d.d(this.f8231b, Long.hashCode(this.f8230a) * 31, 31);
    }
}

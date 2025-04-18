package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes2.dex */
public final class ButtonColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f8034a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8035b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8036c;
    public final long d;

    public ButtonColors(long j2, long j3, long j4, long j5) {
        this.f8034a = j2;
        this.f8035b = j3;
        this.f8036c = j4;
        this.d = j5;
    }

    public final ButtonColors a(long j2, long j3, long j4, long j5) {
        return new ButtonColors(j2 != 16 ? j2 : this.f8034a, j3 != 16 ? j3 : this.f8035b, j4 != 16 ? j4 : this.f8036c, j5 != 16 ? j5 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        return Color.c(this.f8034a, buttonColors.f8034a) && Color.c(this.f8035b, buttonColors.f8035b) && Color.c(this.f8036c, buttonColors.f8036c) && Color.c(this.d, buttonColors.d);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.d) + d.d(this.f8036c, d.d(this.f8035b, Long.hashCode(this.f8034a) * 31, 31), 31);
    }
}

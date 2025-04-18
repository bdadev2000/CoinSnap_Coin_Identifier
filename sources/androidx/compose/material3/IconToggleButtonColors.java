package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes4.dex */
public final class IconToggleButtonColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f9622a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9623b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9624c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9625f;

    public IconToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f9622a = j2;
        this.f9623b = j3;
        this.f9624c = j4;
        this.d = j5;
        this.e = j6;
        this.f9625f = j7;
    }

    public static IconToggleButtonColors c(IconToggleButtonColors iconToggleButtonColors, long j2, long j3) {
        return new IconToggleButtonColors(iconToggleButtonColors.f9622a, j2 != 16 ? j2 : iconToggleButtonColors.f9623b, iconToggleButtonColors.f9624c, j3 != 16 ? j3 : iconToggleButtonColors.d, iconToggleButtonColors.e, iconToggleButtonColors.f9625f);
    }

    public final MutableState a(boolean z2, boolean z3, Composer composer) {
        return SnapshotStateKt.k(new Color(!z2 ? this.f9624c : !z3 ? this.f9622a : this.e), composer);
    }

    public final MutableState b(boolean z2, boolean z3, Composer composer) {
        return SnapshotStateKt.k(new Color(!z2 ? this.d : !z3 ? this.f9623b : this.f9625f), composer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) obj;
        return Color.c(this.f9622a, iconToggleButtonColors.f9622a) && Color.c(this.f9623b, iconToggleButtonColors.f9623b) && Color.c(this.f9624c, iconToggleButtonColors.f9624c) && Color.c(this.d, iconToggleButtonColors.d) && Color.c(this.e, iconToggleButtonColors.e) && Color.c(this.f9625f, iconToggleButtonColors.f9625f);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f9625f) + d.d(this.e, d.d(this.d, d.d(this.f9624c, d.d(this.f9623b, Long.hashCode(this.f9622a) * 31, 31), 31), 31), 31);
    }
}

package androidx.compose.foundation.contextmenu;

import android.support.v4.media.d;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;

@Stable
@VisibleForTesting
/* loaded from: classes3.dex */
public final class ContextMenuColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f2921a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2922b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2923c;
    public final long d;
    public final long e;

    public ContextMenuColors(long j2, long j3, long j4, long j5, long j6) {
        this.f2921a = j2;
        this.f2922b = j3;
        this.f2923c = j4;
        this.d = j5;
        this.e = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ContextMenuColors)) {
            return false;
        }
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
        return Color.c(this.f2921a, contextMenuColors.f2921a) && Color.c(this.f2922b, contextMenuColors.f2922b) && Color.c(this.f2923c, contextMenuColors.f2923c) && Color.c(this.d, contextMenuColors.d) && Color.c(this.e, contextMenuColors.e);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.e) + d.d(this.d, d.d(this.f2923c, d.d(this.f2922b, Long.hashCode(this.f2921a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        d.z(this.f2921a, sb, ", textColor=");
        d.z(this.f2922b, sb, ", iconColor=");
        d.z(this.f2923c, sb, ", disabledTextColor=");
        d.z(this.d, sb, ", disabledIconColor=");
        sb.append((Object) Color.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}

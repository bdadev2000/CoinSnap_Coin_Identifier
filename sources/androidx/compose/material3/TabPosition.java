package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;

@Immutable
/* loaded from: classes2.dex */
public final class TabPosition {

    /* renamed from: a, reason: collision with root package name */
    public final float f11794a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11795b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11796c;

    public TabPosition(float f2, float f3, float f4) {
        this.f11794a = f2;
        this.f11795b = f3;
        this.f11796c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.a(this.f11794a, tabPosition.f11794a) && Dp.a(this.f11795b, tabPosition.f11795b) && Dp.a(this.f11796c, tabPosition.f11796c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f11796c) + d.b(this.f11795b, Float.hashCode(this.f11794a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f2 = this.f11794a;
        sb.append((Object) Dp.b(f2));
        sb.append(", right=");
        float f3 = this.f11795b;
        sb.append((Object) Dp.b(f2 + f3));
        sb.append(", width=");
        sb.append((Object) Dp.b(f3));
        sb.append(", contentWidth=");
        sb.append((Object) Dp.b(this.f11796c));
        sb.append(')');
        return sb.toString();
    }
}

package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;

@Stable
/* loaded from: classes4.dex */
public class FloatingActionButtonElevation {

    /* renamed from: a, reason: collision with root package name */
    public final float f9423a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9424b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9425c;
    public final float d;

    public FloatingActionButtonElevation(float f2, float f3, float f4, float f5) {
        this.f9423a = f2;
        this.f9424b = f3;
        this.f9425c = f4;
        this.d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        if (Dp.a(this.f9423a, floatingActionButtonElevation.f9423a) && Dp.a(this.f9424b, floatingActionButtonElevation.f9424b) && Dp.a(this.f9425c, floatingActionButtonElevation.f9425c)) {
            return Dp.a(this.d, floatingActionButtonElevation.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + d.b(this.f9425c, d.b(this.f9424b, Float.hashCode(this.f9423a) * 31, 31), 31);
    }
}

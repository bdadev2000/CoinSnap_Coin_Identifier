package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;

@Stable
/* loaded from: classes2.dex */
public final class ButtonElevation {

    /* renamed from: a, reason: collision with root package name */
    public final float f8040a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8041b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8042c;
    public final float d;
    public final float e;

    public ButtonElevation(float f2, float f3, float f4, float f5, float f6) {
        this.f8040a = f2;
        this.f8041b = f3;
        this.f8042c = f4;
        this.d = f5;
        this.e = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) obj;
        return Dp.a(this.f8040a, buttonElevation.f8040a) && Dp.a(this.f8041b, buttonElevation.f8041b) && Dp.a(this.f8042c, buttonElevation.f8042c) && Dp.a(this.d, buttonElevation.d) && Dp.a(this.e, buttonElevation.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + d.b(this.d, d.b(this.f8042c, d.b(this.f8041b, Float.hashCode(this.f8040a) * 31, 31), 31), 31);
    }
}

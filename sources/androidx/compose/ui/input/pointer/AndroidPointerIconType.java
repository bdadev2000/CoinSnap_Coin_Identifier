package androidx.compose.ui.input.pointer;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AndroidPointerIconType implements PointerIcon {

    /* renamed from: b, reason: collision with root package name */
    public final int f15544b;

    public AndroidPointerIconType(int i2) {
        this.f15544b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.g(AndroidPointerIconType.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        a.q(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f15544b == ((AndroidPointerIconType) obj).f15544b;
    }

    public final int hashCode() {
        return this.f15544b;
    }

    public final String toString() {
        return d.o(new StringBuilder("AndroidPointerIcon(type="), this.f15544b, ')');
    }
}

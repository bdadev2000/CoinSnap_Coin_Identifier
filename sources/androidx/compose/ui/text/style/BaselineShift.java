package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class BaselineShift {

    /* renamed from: a, reason: collision with root package name */
    public final float f17447a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BaselineShift) {
            return Float.compare(this.f17447a, ((BaselineShift) obj).f17447a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17447a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f17447a + ')';
    }
}

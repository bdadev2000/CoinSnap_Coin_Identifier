package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;

@Immutable
/* loaded from: classes2.dex */
public final class Role {

    /* renamed from: a, reason: collision with root package name */
    public final int f16789a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Role) {
            return this.f16789a == ((Role) obj).f16789a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16789a);
    }

    public final String toString() {
        int i2 = this.f16789a;
        return a(i2, 0) ? "Button" : a(i2, 1) ? "Checkbox" : a(i2, 2) ? "Switch" : a(i2, 3) ? "RadioButton" : a(i2, 4) ? "Tab" : a(i2, 5) ? "Image" : a(i2, 6) ? "DropdownList" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}

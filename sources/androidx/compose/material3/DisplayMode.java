package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes3.dex */
public final class DisplayMode {

    /* renamed from: a, reason: collision with root package name */
    public final int f9223a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DisplayMode) {
            return this.f9223a == ((DisplayMode) obj).f9223a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9223a);
    }

    public final String toString() {
        int i2 = this.f9223a;
        return a(i2, 0) ? "Picker" : a(i2, 1) ? "Input" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}

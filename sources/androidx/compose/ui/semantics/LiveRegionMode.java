package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;

@Immutable
/* loaded from: classes2.dex */
public final class LiveRegionMode {

    /* renamed from: a, reason: collision with root package name */
    public final int f16785a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LiveRegionMode) {
            return this.f16785a == ((LiveRegionMode) obj).f16785a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16785a);
    }

    public final String toString() {
        int i2 = this.f16785a;
        return i2 == 0 ? "Polite" : i2 == 1 ? "Assertive" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}

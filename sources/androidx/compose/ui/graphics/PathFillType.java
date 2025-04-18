package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;

@Immutable
/* loaded from: classes3.dex */
public final class PathFillType {

    /* renamed from: a, reason: collision with root package name */
    public final int f15006a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PathFillType) {
            return this.f15006a == ((PathFillType) obj).f15006a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15006a);
    }

    public final String toString() {
        int i2 = this.f15006a;
        return i2 == 0 ? "NonZero" : i2 == 1 ? "EvenOdd" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}

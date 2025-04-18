package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;

@Immutable
/* loaded from: classes3.dex */
public final class StrokeCap {

    /* renamed from: a, reason: collision with root package name */
    public final int f15056a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 0) ? "Butt" : a(i2, 1) ? "Round" : a(i2, 2) ? "Square" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StrokeCap) {
            return this.f15056a == ((StrokeCap) obj).f15056a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15056a);
    }

    public final String toString() {
        return b(this.f15056a);
    }
}

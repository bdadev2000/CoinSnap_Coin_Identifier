package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.facebook.internal.AnalyticsEvents;

@Immutable
/* loaded from: classes2.dex */
public final class ImageBitmapConfig {

    /* renamed from: a, reason: collision with root package name */
    public final int f14986a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ImageBitmapConfig) {
            return this.f14986a == ((ImageBitmapConfig) obj).f14986a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14986a);
    }

    public final String toString() {
        int i2 = this.f14986a;
        return a(i2, 0) ? "Argb8888" : a(i2, 1) ? "Alpha8" : a(i2, 2) ? "Rgb565" : a(i2, 3) ? "F16" : a(i2, 4) ? "Gpu" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}

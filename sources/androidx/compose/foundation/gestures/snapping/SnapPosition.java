package androidx.compose.foundation.gestures.snapping;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;

@Stable
/* loaded from: classes2.dex */
public interface SnapPosition {

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Center implements SnapPosition {

        /* renamed from: a, reason: collision with root package name */
        public static final Center f3717a = new Object();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public final int a(int i2, int i3, int i4, int i5, int i6, int i7) {
            return (((i2 - i4) - i5) / 2) - (i3 / 2);
        }

        public final String toString() {
            return "Center";
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class End implements SnapPosition {
        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public final int a(int i2, int i3, int i4, int i5, int i6, int i7) {
            return ((i2 - i4) - i5) - i3;
        }

        public final String toString() {
            return "End";
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Start implements SnapPosition {

        /* renamed from: a, reason: collision with root package name */
        public static final Start f3718a = new Object();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public final int a(int i2, int i3, int i4, int i5, int i6, int i7) {
            return 0;
        }

        public final String toString() {
            return "Start";
        }
    }

    int a(int i2, int i3, int i4, int i5, int i6, int i7);
}

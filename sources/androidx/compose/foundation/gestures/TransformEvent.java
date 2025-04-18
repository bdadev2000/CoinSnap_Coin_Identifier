package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;

/* loaded from: classes.dex */
abstract class TransformEvent {

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TransformDelta extends TransformEvent {
        public TransformDelta(float f2, long j2, float f3) {
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TransformStarted extends TransformEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final TransformStarted f3585a = new Object();
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TransformStopped extends TransformEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final TransformStopped f3586a = new Object();
    }
}

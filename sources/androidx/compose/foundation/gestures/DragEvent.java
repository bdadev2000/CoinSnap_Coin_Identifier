package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public abstract class DragEvent {

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DragCancelled extends DragEvent {

        /* renamed from: a, reason: collision with root package name */
        public static final DragCancelled f3170a = new Object();
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DragDelta extends DragEvent {

        /* renamed from: a, reason: collision with root package name */
        public final long f3171a;

        public DragDelta(long j2) {
            this.f3171a = j2;
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DragStarted extends DragEvent {

        /* renamed from: a, reason: collision with root package name */
        public final long f3172a;

        public DragStarted(long j2) {
            this.f3172a = j2;
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DragStopped extends DragEvent {

        /* renamed from: a, reason: collision with root package name */
        public final long f3173a;

        public DragStopped(long j2) {
            this.f3173a = j2;
        }
    }
}

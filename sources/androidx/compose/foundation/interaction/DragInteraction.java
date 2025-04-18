package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;

/* loaded from: classes.dex */
public interface DragInteraction extends Interaction {

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Cancel implements DragInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Start f3720a;

        public Cancel(Start start) {
            this.f3720a = start;
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Start implements DragInteraction {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Stop implements DragInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Start f3721a;

        public Stop(Start start) {
            this.f3721a = start;
        }
    }
}

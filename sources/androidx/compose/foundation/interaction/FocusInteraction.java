package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;

/* loaded from: classes3.dex */
public interface FocusInteraction extends Interaction {

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Focus implements FocusInteraction {
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Unfocus implements FocusInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Focus f3727a;

        public Unfocus(Focus focus) {
            this.f3727a = focus;
        }
    }
}

package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;

/* loaded from: classes.dex */
public interface HoverInteraction extends Interaction {

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Enter implements HoverInteraction {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class Exit implements HoverInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Enter f3733a;

        public Exit(Enter enter) {
            this.f3733a = enter;
        }
    }
}

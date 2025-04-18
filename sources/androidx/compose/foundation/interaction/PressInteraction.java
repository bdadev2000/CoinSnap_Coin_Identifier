package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;

/* loaded from: classes3.dex */
public interface PressInteraction extends Interaction {

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Cancel implements PressInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Press f3740a;

        public Cancel(Press press) {
            this.f3740a = press;
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Press implements PressInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final long f3741a;

        public Press(long j2) {
            this.f3741a = j2;
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Release implements PressInteraction {

        /* renamed from: a, reason: collision with root package name */
        public final Press f3742a;

        public Release(Press press) {
            this.f3742a = press;
        }
    }
}

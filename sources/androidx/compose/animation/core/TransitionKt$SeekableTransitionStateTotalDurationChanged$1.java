package androidx.compose.animation.core;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class TransitionKt$SeekableTransitionStateTotalDurationChanged$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final TransitionKt$SeekableTransitionStateTotalDurationChanged$1 f2322a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj;
        long j2 = seekableTransitionState.f2167f;
        ((SnapshotStateObserver) TransitionKt.f2311a.getValue()).e(seekableTransitionState, f2322a, seekableTransitionState.f2168g);
        long j3 = seekableTransitionState.f2167f;
        if (j2 != j3) {
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = seekableTransitionState.f2175n;
            if (seekingAnimationState != null) {
                seekingAnimationState.f2183g = j3;
                if (seekingAnimationState.f2180b == null) {
                    seekingAnimationState.f2184h = p0.a.u0((1.0d - seekingAnimationState.e.a(0)) * seekableTransitionState.f2167f);
                }
            } else if (j3 != 0) {
                seekableTransitionState.o();
            }
        }
        return b0.f30125a;
    }
}

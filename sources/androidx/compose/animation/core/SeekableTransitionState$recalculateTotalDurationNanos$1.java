package androidx.compose.animation.core;

import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SeekableTransitionState$recalculateTotalDurationNanos$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f2197a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$recalculateTotalDurationNanos$1(SeekableTransitionState seekableTransitionState) {
        super(0);
        this.f2197a = seekableTransitionState;
    }

    @Override // q0.a
    public final Object invoke() {
        SeekableTransitionState seekableTransitionState = this.f2197a;
        Transition transition = seekableTransitionState.e;
        seekableTransitionState.f2167f = transition != null ? ((Number) transition.f2277m.getValue()).longValue() : 0L;
        return b0.f30125a;
    }
}

package androidx.compose.animation.core;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import b1.d0;
import b1.k;
import d0.b0;
import h0.g;
import i1.d;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2191}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransitionKt$rememberTransition$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public d f2329a;

    /* renamed from: b, reason: collision with root package name */
    public TransitionState f2330b;

    /* renamed from: c, reason: collision with root package name */
    public int f2331c;
    public final /* synthetic */ TransitionState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$rememberTransition$1$1(TransitionState transitionState, g gVar) {
        super(2, gVar);
        this.d = transitionState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new TransitionKt$rememberTransition$1$1(this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TransitionKt$rememberTransition$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        d dVar;
        TransitionState transitionState;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f2331c;
        if (i2 == 0) {
            q.m(obj);
            TransitionState transitionState2 = this.d;
            SeekableTransitionState seekableTransitionState = (SeekableTransitionState) transitionState2;
            seekableTransitionState.getClass();
            ((SnapshotStateObserver) TransitionKt.f2311a.getValue()).e(seekableTransitionState, TransitionKt$SeekableTransitionStateTotalDurationChanged$1.f2322a, seekableTransitionState.f2168g);
            dVar = seekableTransitionState.f2171j;
            this.f2329a = dVar;
            this.f2330b = transitionState2;
            this.f2331c = 1;
            if (dVar.d(null, this) == aVar) {
                return aVar;
            }
            transitionState = transitionState2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transitionState = this.f2330b;
            dVar = this.f2329a;
            q.m(obj);
        }
        try {
            ((SeekableTransitionState) transitionState).d = transitionState.b();
            k kVar = ((SeekableTransitionState) transitionState).f2170i;
            if (kVar != null) {
                kVar.resumeWith(transitionState.b());
            }
            ((SeekableTransitionState) transitionState).f2170i = null;
            dVar.f(null);
            return b0.f30125a;
        } catch (Throwable th) {
            dVar.f(null);
            throw th;
        }
    }
}

package androidx.compose.animation.core;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {477}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SeekableTransitionState$snapTo$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f2214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f2215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2216c;
    public final /* synthetic */ Transition d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$snapTo$2(SeekableTransitionState seekableTransitionState, Object obj, Transition transition, g gVar) {
        super(1, gVar);
        this.f2215b = seekableTransitionState;
        this.f2216c = obj;
        this.d = transition;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new SeekableTransitionState$snapTo$2(this.f2215b, this.f2216c, this.d, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((SeekableTransitionState$snapTo$2) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f2214a;
        Transition transition = this.d;
        if (i2 == 0) {
            q.m(obj);
            SeekableTransitionState seekableTransitionState = this.f2215b;
            seekableTransitionState.m();
            seekableTransitionState.f2173l = Long.MIN_VALUE;
            seekableTransitionState.p(0.0f);
            Object value = seekableTransitionState.f2166c.getValue();
            Object obj2 = this.f2216c;
            boolean g2 = p0.a.g(obj2, value);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = seekableTransitionState.f2165b;
            float f2 = g2 ? -4.0f : p0.a.g(obj2, parcelableSnapshotMutableState.getValue()) ? -5.0f : -3.0f;
            transition.q(obj2);
            transition.o(0L);
            parcelableSnapshotMutableState.setValue(obj2);
            seekableTransitionState.p(0.0f);
            seekableTransitionState.c(obj2);
            transition.j(f2);
            if (f2 == -3.0f) {
                this.f2214a = 1;
                if (SeekableTransitionState.j(seekableTransitionState, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        transition.i();
        return b0.f30125a;
    }
}

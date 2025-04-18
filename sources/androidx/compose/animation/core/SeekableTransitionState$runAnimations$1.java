package androidx.compose.animation.core;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {370, 373}, m = "runAnimations")
/* loaded from: classes2.dex */
public final class SeekableTransitionState$runAnimations$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public SeekableTransitionState f2198a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f2200c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$runAnimations$1(SeekableTransitionState seekableTransitionState, g gVar) {
        super(gVar);
        this.f2200c = seekableTransitionState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f2199b = obj;
        this.d |= Integer.MIN_VALUE;
        return SeekableTransitionState.h(this.f2200c, this);
    }
}

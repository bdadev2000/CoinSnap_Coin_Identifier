package androidx.compose.animation.core;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {566, 2186}, m = "waitForComposition")
/* loaded from: classes.dex */
public final class SeekableTransitionState$waitForComposition$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public SeekableTransitionState f2217a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2218b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2219c;
    public final /* synthetic */ SeekableTransitionState d;

    /* renamed from: f, reason: collision with root package name */
    public int f2220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$waitForComposition$1(SeekableTransitionState seekableTransitionState, g gVar) {
        super(gVar);
        this.d = seekableTransitionState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f2219c = obj;
        this.f2220f |= Integer.MIN_VALUE;
        return SeekableTransitionState.i(this.d, this);
    }
}

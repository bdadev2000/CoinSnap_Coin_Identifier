package androidx.compose.foundation.gestures;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {370}, m = "tryAwaitRelease")
/* loaded from: classes4.dex */
public final class PressGestureScopeImpl$tryAwaitRelease$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public PressGestureScopeImpl f3406a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PressGestureScopeImpl f3408c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$tryAwaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
        super(gVar);
        this.f3408c = pressGestureScopeImpl;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f3407b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3408c.y0(this);
    }
}

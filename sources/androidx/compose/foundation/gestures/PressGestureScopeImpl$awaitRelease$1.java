package androidx.compose.foundation.gestures;

import d0.b0;
import h0.g;
import i0.a;
import j0.c;
import j0.e;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.q;

@e(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {363}, m = "awaitRelease")
/* loaded from: classes3.dex */
final class PressGestureScopeImpl$awaitRelease$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PressGestureScopeImpl f3401b;

    /* renamed from: c, reason: collision with root package name */
    public int f3402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressGestureScopeImpl$awaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, g gVar) {
        super(gVar);
        this.f3401b = pressGestureScopeImpl;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        PressGestureScopeImpl$awaitRelease$1 pressGestureScopeImpl$awaitRelease$1;
        this.f3400a = obj;
        this.f3402c |= Integer.MIN_VALUE;
        PressGestureScopeImpl pressGestureScopeImpl = this.f3401b;
        pressGestureScopeImpl.getClass();
        int i2 = this.f3402c;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f3402c = i2 - Integer.MIN_VALUE;
            pressGestureScopeImpl$awaitRelease$1 = this;
        } else {
            pressGestureScopeImpl$awaitRelease$1 = new PressGestureScopeImpl$awaitRelease$1(pressGestureScopeImpl, this);
        }
        Object obj2 = pressGestureScopeImpl$awaitRelease$1.f3400a;
        a aVar = a.f30806a;
        int i3 = pressGestureScopeImpl$awaitRelease$1.f3402c;
        if (i3 == 0) {
            q.m(obj2);
            pressGestureScopeImpl$awaitRelease$1.f3402c = 1;
            obj2 = pressGestureScopeImpl.y0(pressGestureScopeImpl$awaitRelease$1);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            return b0.f30125a;
        }
        throw new CancellationException("The press gesture was canceled.");
    }
}

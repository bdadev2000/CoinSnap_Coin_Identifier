package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", l = {1312}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ScrollableTabData$onLaidOut$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f10853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScrollableTabData f10854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTabData$onLaidOut$1$1(ScrollableTabData scrollableTabData, int i2, g gVar) {
        super(2, gVar);
        this.f10854b = scrollableTabData;
        this.f10855c = i2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ScrollableTabData$onLaidOut$1$1(this.f10854b, this.f10855c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableTabData$onLaidOut$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f10853a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            ScrollState scrollState = this.f10854b.f10850a;
            TweenSpec tweenSpec = TabRowKt.f11819b;
            this.f10853a = 1;
            Object a2 = ScrollExtensionsKt.a(scrollState, this.f10855c - scrollState.f2865a.g(), tweenSpec, this);
            if (a2 != aVar) {
                a2 = b0Var;
            }
            if (a2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0Var;
    }
}

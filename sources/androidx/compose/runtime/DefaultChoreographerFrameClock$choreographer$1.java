package androidx.compose.runtime;

import android.view.Choreographer;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultChoreographerFrameClock$choreographer$1 extends i implements p {
    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new i(2, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultChoreographerFrameClock$choreographer$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        return Choreographer.getInstance();
    }
}

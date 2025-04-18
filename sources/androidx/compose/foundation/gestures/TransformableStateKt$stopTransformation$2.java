package androidx.compose.foundation.gestures;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TransformableStateKt$stopTransformation$2 extends i implements p {
    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new i(2, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        TransformableStateKt$stopTransformation$2 transformableStateKt$stopTransformation$2 = (TransformableStateKt$stopTransformation$2) create((TransformScope) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        transformableStateKt$stopTransformation$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        return b0.f30125a;
    }
}

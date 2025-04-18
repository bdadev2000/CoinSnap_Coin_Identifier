package androidx.compose.foundation.gestures;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", f = "ScrollExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ScrollExtensionsKt$stopScroll$2 extends i implements p {
    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new i(2, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ScrollExtensionsKt$stopScroll$2 scrollExtensionsKt$stopScroll$2 = (ScrollExtensionsKt$stopScroll$2) create((ScrollScope) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        scrollExtensionsKt$stopScroll$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        return b0.f30125a;
    }
}

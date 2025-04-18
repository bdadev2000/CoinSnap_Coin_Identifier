package androidx.compose.ui.platform;

import android.view.Choreographer;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.q;

@j0.e(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends j0.i implements q0.p {
    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new j0.i(2, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        return Choreographer.getInstance();
    }
}

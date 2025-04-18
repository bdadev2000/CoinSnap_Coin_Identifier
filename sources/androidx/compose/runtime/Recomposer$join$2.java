package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Recomposer$join$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13909a;

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.i, h0.g, androidx.compose.runtime.Recomposer$join$2] */
    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ?? iVar = new i(2, gVar);
        iVar.f13909a = obj;
        return iVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Recomposer$join$2) create((Recomposer.State) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        return Boolean.valueOf(((Recomposer.State) this.f13909a) == Recomposer.State.f13898a);
    }
}

package androidx.compose.material3.internal;

import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.r;

@e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AnchoredDraggableKt$snapTo$2 extends i implements r {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ AnchoredDragScope f12817a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ DraggableAnchors f12818b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12819c;

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.i, androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2] */
    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? iVar = new i(4, (g) obj4);
        iVar.f12817a = (AnchoredDragScope) obj;
        iVar.f12818b = (DraggableAnchors) obj2;
        iVar.f12819c = obj3;
        b0 b0Var = b0.f30125a;
        iVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        AnchoredDragScope anchoredDragScope = this.f12817a;
        float e = this.f12818b.e(this.f12819c);
        if (!Float.isNaN(e)) {
            anchoredDragScope.a(e, 0.0f);
        }
        return b0.f30125a;
    }
}

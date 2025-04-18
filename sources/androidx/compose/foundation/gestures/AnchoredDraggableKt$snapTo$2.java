package androidx.compose.foundation.gestures;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.r;

@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AnchoredDraggableKt$snapTo$2 extends i implements r {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ AnchoredDragScope f3043a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ DraggableAnchors f3044b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3045c;

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.i, androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2] */
    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? iVar = new i(4, (g) obj4);
        iVar.f3043a = (AnchoredDragScope) obj;
        iVar.f3044b = (DraggableAnchors) obj2;
        iVar.f3045c = obj3;
        b0 b0Var = b0.f30125a;
        iVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        AnchoredDragScope anchoredDragScope = this.f3043a;
        float e = this.f3044b.e(this.f3045c);
        if (!Float.isNaN(e)) {
            anchoredDragScope.a(e, 0.0f);
        }
        return b0.f30125a;
    }
}

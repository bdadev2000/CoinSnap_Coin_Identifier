package androidx.compose.foundation.gestures;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TransformableStateKt$zoomBy$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f3656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$zoomBy$2(float f2, g gVar) {
        super(2, gVar);
        this.f3656b = f2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TransformableStateKt$zoomBy$2 transformableStateKt$zoomBy$2 = new TransformableStateKt$zoomBy$2(this.f3656b, gVar);
        transformableStateKt$zoomBy$2.f3655a = obj;
        return transformableStateKt$zoomBy$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        TransformableStateKt$zoomBy$2 transformableStateKt$zoomBy$2 = (TransformableStateKt$zoomBy$2) create((TransformScope) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        transformableStateKt$zoomBy$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        ((TransformScope) this.f3655a).a();
        return b0.f30125a;
    }
}

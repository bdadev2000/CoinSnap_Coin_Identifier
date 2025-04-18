package androidx.activity.compose;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PredictiveBackHandlerKt$PredictiveBackHandler$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 f236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$1(PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, boolean z2, g gVar) {
        super(2, gVar);
        this.f236a = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
        this.f237b = z2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new PredictiveBackHandlerKt$PredictiveBackHandler$1(this.f236a, this.f237b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        PredictiveBackHandlerKt$PredictiveBackHandler$1 predictiveBackHandlerKt$PredictiveBackHandler$1 = (PredictiveBackHandlerKt$PredictiveBackHandler$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        predictiveBackHandlerKt$PredictiveBackHandler$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 = this.f236a;
        predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1.f163a = this.f237b;
        q0.a aVar2 = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1.f165c;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return b0.f30125a;
    }
}

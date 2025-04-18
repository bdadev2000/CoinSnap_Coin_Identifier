package i0;

import j0.g;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.q;
import q0.p;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public int f30809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f30810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, h0.g gVar, p pVar) {
        super(gVar);
        this.f30810b = pVar;
        this.f30811c = obj;
        p0.a.q(gVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f30809a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f30809a = 2;
            q.m(obj);
            return obj;
        }
        this.f30809a = 1;
        q.m(obj);
        p pVar = this.f30810b;
        p0.a.q(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        e.g(2, pVar);
        return pVar.invoke(this.f30811c, this);
    }
}

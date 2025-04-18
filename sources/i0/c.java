package i0;

import h0.g;
import h0.l;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.q;
import q0.p;

/* loaded from: classes.dex */
public final class c extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public int f30812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f30813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, l lVar, p pVar, Object obj) {
        super(gVar, lVar);
        this.f30813b = pVar;
        this.f30814c = obj;
        p0.a.q(gVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f30812a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f30812a = 2;
            q.m(obj);
            return obj;
        }
        this.f30812a = 1;
        q.m(obj);
        p pVar = this.f30813b;
        p0.a.q(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        e.g(2, pVar);
        return pVar.invoke(this.f30814c, this);
    }
}

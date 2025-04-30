package x7;

import F7.p;
import G7.j;
import G7.v;
import t7.AbstractC2712a;
import w7.f;
import w7.k;
import y7.AbstractC2954c;

/* renamed from: x7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2930c extends AbstractC2954c {

    /* renamed from: f, reason: collision with root package name */
    public int f24246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f24247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f24248h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2930c(f fVar, k kVar, p pVar, Object obj) {
        super(fVar, kVar);
        this.f24247g = pVar;
        this.f24248h = obj;
        j.c(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        int i9 = this.f24246f;
        if (i9 != 0) {
            if (i9 == 1) {
                this.f24246f = 2;
                AbstractC2712a.f(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f24246f = 1;
        AbstractC2712a.f(obj);
        p pVar = this.f24247g;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        v.b(2, pVar);
        return pVar.g(this.f24248h, this);
    }
}

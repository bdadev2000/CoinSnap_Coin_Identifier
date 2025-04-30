package x7;

import F7.p;
import G7.j;
import G7.v;
import t7.AbstractC2712a;
import w7.f;
import y7.AbstractC2958g;

/* renamed from: x7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2929b extends AbstractC2958g {

    /* renamed from: c, reason: collision with root package name */
    public int f24243c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f24244d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24245f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2929b(p pVar, Object obj, f fVar) {
        super(fVar);
        this.f24244d = pVar;
        this.f24245f = obj;
        j.c(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        int i9 = this.f24243c;
        if (i9 != 0) {
            if (i9 == 1) {
                this.f24243c = 2;
                AbstractC2712a.f(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f24243c = 1;
        AbstractC2712a.f(obj);
        p pVar = this.f24244d;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        v.b(2, pVar);
        return pVar.g(this.f24245f, this);
    }
}

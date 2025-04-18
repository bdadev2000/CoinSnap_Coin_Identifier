package sc;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24982c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1.e f24983d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f24984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c1.e eVar, p pVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f24982c = obj;
        this.f24983d = eVar;
        this.f24984f = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        o oVar = new o(this.f24983d, this.f24984f, this.f24982c, continuation);
        oVar.f24981b = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((c1.a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        c1.a aVar = (c1.a) this.f24981b;
        c1.e key = this.f24983d;
        Object obj2 = this.f24982c;
        if (obj2 != null) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            aVar.d(key, obj2);
        } else {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            aVar.c();
            aVar.a.remove(key);
        }
        p.a(this.f24984f, aVar);
        return Unit.INSTANCE;
    }
}

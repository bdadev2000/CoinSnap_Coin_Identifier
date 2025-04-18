package qc;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String str, Continuation continuation) {
        super(2, continuation);
        this.f23790c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e0 e0Var = new e0(this.f23790c, continuation);
        e0Var.f23789b = obj;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((c1.a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        c1.a aVar = (c1.a) this.f23789b;
        c1.e key = z.a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        aVar.d(key, this.f23790c);
        return Unit.INSTANCE;
    }
}

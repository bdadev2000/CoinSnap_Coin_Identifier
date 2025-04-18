package qc;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class x extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f23889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g0 g0Var, Continuation continuation) {
        super(2, continuation);
        this.f23889c = g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new x(this.f23889c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23888b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            g0 g0Var = this.f23889c;
            d0 d0Var = g0Var.f23805d;
            y0.s sVar = new y0.s(g0Var, 3);
            this.f23888b = 1;
            if (d0Var.collect(sVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

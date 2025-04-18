package y0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class n0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f27811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f27812c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.f27812c = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n0(this.f27812c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27811b;
        u0 u0Var = this.f27812c;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            o oVar = u0Var.f27857h;
            this.f27811b = 1;
            Object await = oVar.f27693b.await(this);
            if (await != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                await = Unit.INSTANCE;
            }
            if (await == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Flow conflate = FlowKt.conflate(u0Var.e().f27768c);
        s sVar = new s(u0Var, i11);
        this.f27811b = 2;
        if (conflate.collect(sVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

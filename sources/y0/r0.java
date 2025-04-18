package y0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f27832b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27833c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f27834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.f27834d = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        r0 r0Var = new r0(this.f27834d, continuation);
        r0Var.f27833c = obj;
        return r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((x0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27832b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            x0 x0Var = (x0) this.f27833c;
            this.f27832b = 1;
            if (u0.b(this.f27834d, x0Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

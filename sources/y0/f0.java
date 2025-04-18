package y0;

import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f0 extends SuspendLambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public Throwable f27728b;

    /* renamed from: c, reason: collision with root package name */
    public int f27729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f27730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(u0 u0Var, Continuation continuation) {
        super(1, continuation);
        this.f27730d = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new f0(this.f27730d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f0) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        j1 j1Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27729c;
        u0 u0Var = this.f27730d;
        try {
        } catch (Throwable th3) {
            i1 e2 = u0Var.e();
            this.f27728b = th3;
            this.f27729c = 2;
            Integer a = e2.a();
            if (a == coroutine_suspended) {
                return coroutine_suspended;
            }
            th2 = th3;
            obj = a;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    th2 = this.f27728b;
                    ResultKt.throwOnFailure(obj);
                    j1Var = new y0(th2, ((Number) obj).intValue());
                    return TuplesKt.to(j1Var, Boxing.boxBoolean(true));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            this.f27729c = 1;
            obj = u0.d(u0Var, true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        j1Var = (j1) obj;
        return TuplesKt.to(j1Var, Boxing.boxBoolean(true));
    }
}

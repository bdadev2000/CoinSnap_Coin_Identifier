package y0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class k0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f27778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f27779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f27780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(u0 u0Var, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f27779c = u0Var;
        this.f27780d = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k0(this.f27779c, this.f27780d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27778b;
        u0 u0Var = this.f27779c;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return (j1) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                if (u0Var.f27856g.q() instanceof v0) {
                    return u0Var.f27856g.q();
                }
                this.f27778b = 1;
                if (u0Var.f(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f27778b = 2;
            obj = u0.c(u0Var, this.f27780d, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (j1) obj;
        } catch (Throwable th2) {
            return new y0(th2, -1);
        }
    }
}

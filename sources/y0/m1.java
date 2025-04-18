package y0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public final class m1 extends SuspendLambda implements Function3 {

    /* renamed from: b, reason: collision with root package name */
    public int f27800b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ z0 f27801c;

    public m1(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        m1 m1Var = new m1((Continuation) obj3);
        m1Var.f27801c = (z0) obj;
        return m1Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27800b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            z0 z0Var = this.f27801c;
            this.f27800b = 1;
            a1.b bVar = (a1.b) z0Var;
            bVar.getClass();
            obj = a1.b.a(bVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}

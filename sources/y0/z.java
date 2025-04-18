package y0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f27879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(j1 j1Var, Continuation continuation) {
        super(2, continuation);
        this.f27879c = j1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        z zVar = new z(this.f27879c, continuation);
        zVar.f27878b = obj;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((j1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        j1 j1Var = (j1) this.f27878b;
        if ((j1Var instanceof d) && j1Var.a <= this.f27879c.a) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boxing.boxBoolean(z10);
    }
}

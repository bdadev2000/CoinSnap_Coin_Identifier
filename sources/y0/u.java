package y0;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f27849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f27850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.f27850c = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.f27850c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27849b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            SharedFlow sharedFlow = this.f27850c.f27853d;
            t tVar = t.f27841b;
            this.f27849b = 1;
            if (sharedFlow.collect(tVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}

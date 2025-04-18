package y0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w extends SuspendLambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public int f27865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f27866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.f27866c = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new w(this.f27866c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((w) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27865b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f27865b = 1;
            obj = this.f27866c.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}

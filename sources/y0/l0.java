package y0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class l0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f27789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f27790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f27791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Function2 function2, d dVar, Continuation continuation) {
        super(2, continuation);
        this.f27790c = function2;
        this.f27791d = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l0(this.f27790c, this.f27791d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27789b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.f27791d.f27701b;
            this.f27789b = 1;
            obj = this.f27790c.invoke(obj2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}

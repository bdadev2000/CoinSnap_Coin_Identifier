package y0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f27861b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f27863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.f27863d = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(this.f27863d, continuation);
        vVar.f27862c = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27861b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.f27862c;
            CoroutineStart coroutineStart = CoroutineStart.LAZY;
            u0 u0Var = this.f27863d;
            launch$default = BuildersKt__Builders_commonKt.launch$default(producerScope, null, coroutineStart, new u(u0Var, null), 1, null);
            Flow onCompletion = FlowKt.onCompletion(FlowKt.onStart(u0Var.f27854e, new q(launch$default, null)), new r(launch$default, null));
            s sVar = new s(producerScope, 0);
            this.f27861b = 1;
            if (onCompletion.collect(sVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

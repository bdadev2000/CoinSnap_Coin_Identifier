package ug;

import com.plantcare.ai.identifier.plantid.ui.component.ring.NotifyFullScreenActivity;
import com.plantcare.ai.identifier.plantid.ui.component.ring.NotifyViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotifyFullScreenActivity f25813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NotifyFullScreenActivity notifyFullScreenActivity, Continuation continuation) {
        super(2, continuation);
        this.f25813c = notifyFullScreenActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f25813c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25812b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            NotifyFullScreenActivity notifyFullScreenActivity = this.f25813c;
            StateFlow stateFlow = ((NotifyViewModel) notifyFullScreenActivity.f16717j.getValue()).f16721g;
            c cVar = new c(notifyFullScreenActivity, null);
            this.f25812b = 1;
            if (FlowKt.collectLatest(stateFlow, cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

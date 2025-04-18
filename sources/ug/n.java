package ug;

import androidx.lifecycle.e0;
import com.plantcare.ai.identifier.plantid.ui.component.ring.RingViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public e0 f25828b;

    /* renamed from: c, reason: collision with root package name */
    public int f25829c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RingViewModel f25830d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f25831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(RingViewModel ringViewModel, long j3, Continuation continuation) {
        super(2, continuation);
        this.f25830d = ringViewModel;
        this.f25831f = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f25830d, this.f25831f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25829c;
        if (i10 != 0) {
            if (i10 == 1) {
                e0Var = this.f25828b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            RingViewModel ringViewModel = this.f25830d;
            e0 e0Var2 = ringViewModel.f16732e;
            this.f25828b = e0Var2;
            this.f25829c = 1;
            obj = ringViewModel.f16731d.searchAlarmById(this.f25831f, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            e0Var = e0Var2;
        }
        e0Var.postValue(obj);
        return Unit.INSTANCE;
    }
}

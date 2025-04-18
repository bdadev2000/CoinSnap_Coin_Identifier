package ug;

import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.data.database.repository.AlarmRepository;
import com.plantcare.ai.identifier.plantid.ui.component.ring.RingViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RingViewModel f25834c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlarmEntity f25835d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f25836f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(RingViewModel ringViewModel, AlarmEntity alarmEntity, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f25834c = ringViewModel;
        this.f25835d = alarmEntity;
        this.f25836f = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f25834c, this.f25835d, this.f25836f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25833b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            AlarmRepository alarmRepository = this.f25834c.f16731d;
            this.f25833b = 1;
            if (alarmRepository.updateRecord(this.f25835d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CoroutineDispatcher io = Dispatchers.getIO();
        o oVar = new o(this.f25836f, null);
        this.f25833b = 2;
        if (BuildersKt.withContext(io, oVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

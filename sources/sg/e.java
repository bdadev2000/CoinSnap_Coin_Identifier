package sg;

import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.data.database.repository.AlarmRepository;
import com.plantcare.ai.identifier.plantid.ui.component.remind.RemindViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes4.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RemindViewModel f25072c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlarmEntity f25073d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f25074f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RemindViewModel remindViewModel, AlarmEntity alarmEntity, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f25072c = remindViewModel;
        this.f25073d = alarmEntity;
        this.f25074f = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f25072c, this.f25073d, this.f25074f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25071b;
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
            AlarmRepository alarmRepository = this.f25072c.f16708d;
            this.f25071b = 1;
            if (alarmRepository.updateRecord(this.f25073d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        d dVar = new d(this.f25074f, null);
        this.f25071b = 2;
        if (BuildersKt.withContext(main, dVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

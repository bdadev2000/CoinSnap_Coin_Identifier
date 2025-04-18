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
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RemindViewModel f25067c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlarmEntity f25068d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f25069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RemindViewModel remindViewModel, AlarmEntity alarmEntity, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f25067c = remindViewModel;
        this.f25068d = alarmEntity;
        this.f25069f = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f25067c, this.f25068d, this.f25069f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25066b;
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
            AlarmRepository alarmRepository = this.f25067c.f16708d;
            this.f25066b = 1;
            if (alarmRepository.saveRecordAlarm(this.f25068d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        b bVar = new b(this.f25069f, null);
        this.f25066b = 2;
        if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

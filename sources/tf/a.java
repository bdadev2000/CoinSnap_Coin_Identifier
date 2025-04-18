package tf;

import com.plantcare.ai.identifier.plantid.data.database.repository.HistoryRepository;
import com.plantcare.ai.identifier.plantid.ui.component.history.HistoryViewModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f25396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HistoryViewModel f25397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f25398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HistoryViewModel historyViewModel, List list, Continuation continuation) {
        super(2, continuation);
        this.f25397c = historyViewModel;
        this.f25398d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f25397c, this.f25398d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25396b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            HistoryRepository historyRepository = this.f25397c.f16614d;
            this.f25396b = 1;
            if (historyRepository.deleteListRecordRemind(this.f25398d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

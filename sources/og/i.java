package og;

import com.plantcare.ai.identifier.plantid.data.database.entities.HistoryEntity;
import com.plantcare.ai.identifier.plantid.data.database.repository.HistoryRepository;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PreviewModel f23335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HistoryEntity f23336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PreviewModel previewModel, HistoryEntity historyEntity, Continuation continuation) {
        super(2, continuation);
        this.f23335c = previewModel;
        this.f23336d = historyEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f23335c, this.f23336d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23334b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            HistoryRepository historyRepository = this.f23335c.f16687e;
            this.f23334b = 1;
            if (historyRepository.saveHistory(this.f23336d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

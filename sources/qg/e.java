package qg;

import com.plantcare.ai.identifier.plantid.data.database.entities.PlantEntity;
import com.plantcare.ai.identifier.plantid.data.database.repository.PlantRepository;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.result.id.SearchPlantResultViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchPlantResultViewModel f23912c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PlantEntity f23913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SearchPlantResultViewModel searchPlantResultViewModel, PlantEntity plantEntity, Continuation continuation) {
        super(2, continuation);
        this.f23912c = searchPlantResultViewModel;
        this.f23913d = plantEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f23912c, this.f23913d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23911b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            PlantRepository plantRepository = this.f23912c.f16707d;
            this.f23911b = 1;
            if (plantRepository.saveRecord(this.f23913d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

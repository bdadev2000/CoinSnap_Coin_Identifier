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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchPlantResultViewModel f23909c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PlantEntity f23910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SearchPlantResultViewModel searchPlantResultViewModel, PlantEntity plantEntity, Continuation continuation) {
        super(2, continuation);
        this.f23909c = searchPlantResultViewModel;
        this.f23910d = plantEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f23909c, this.f23910d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23908b;
        PlantEntity plantEntity = this.f23910d;
        SearchPlantResultViewModel searchPlantResultViewModel = this.f23909c;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            PlantRepository plantRepository = searchPlantResultViewModel.f16707d;
            String scientificName = plantEntity.getScientificName();
            this.f23908b = 1;
            obj = plantRepository.isPlantExists(scientificName, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (((Number) obj).intValue() == 0) {
            BuildersKt__Builders_commonKt.launch$default(searchPlantResultViewModel.f22242c, null, null, new e(searchPlantResultViewModel, plantEntity, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}

package jg;

import com.plantcare.ai.identifier.plantid.data.database.entities.PlantEntity;
import com.plantcare.ai.identifier.plantid.data.database.repository.PlantRepository;
import com.plantcare.ai.identifier.plantid.ui.component.main.bottom_bar.viewmodel.MyPlantViewModel;
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
    public int f20023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MyPlantViewModel f20024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PlantEntity f20025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MyPlantViewModel myPlantViewModel, PlantEntity plantEntity, Continuation continuation) {
        super(2, continuation);
        this.f20024c = myPlantViewModel;
        this.f20025d = plantEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f20024c, this.f20025d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f20023b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            PlantRepository plantRepository = this.f20024c.f16662d;
            this.f20023b = 1;
            if (plantRepository.deleteOneRecordPlant(this.f20025d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}

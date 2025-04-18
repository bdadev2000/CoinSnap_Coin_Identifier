package com.plantcare.ai.identifier.plantid.data.network.repository;

import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponsePlantDto;
import com.plantcare.ai.identifier.plantid.data.network.service.PlantService;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wh.i0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponsePlantDto;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plantcare.ai.identifier.plantid.data.network.repository.PlantRepository$fetchInformationPlant$2", f = "PlantRepository.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class PlantRepository$fetchInformationPlant$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResultWrapper<? extends ResponsePlantDto>>, Object> {
    final /* synthetic */ i0 $image;
    final /* synthetic */ String $internalKey;
    final /* synthetic */ String $packageName;
    final /* synthetic */ String $secretKey;
    final /* synthetic */ String $versionCode;
    int label;
    final /* synthetic */ PlantRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlantRepository$fetchInformationPlant$2(PlantRepository plantRepository, String str, String str2, String str3, String str4, i0 i0Var, Continuation<? super PlantRepository$fetchInformationPlant$2> continuation) {
        super(2, continuation);
        this.this$0 = plantRepository;
        this.$packageName = str;
        this.$versionCode = str2;
        this.$internalKey = str3;
        this.$secretKey = str4;
        this.$image = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlantRepository$fetchInformationPlant$2(this.this$0, this.$packageName, this.$versionCode, this.$internalKey, this.$secretKey, this.$image, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResultWrapper<? extends ResponsePlantDto>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResultWrapper<ResponsePlantDto>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PlantService plantService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            plantService = this.this$0.plantService;
            String str = this.$packageName;
            String str2 = this.$versionCode;
            String str3 = this.$internalKey;
            String str4 = this.$secretKey;
            i0 i0Var = this.$image;
            this.label = 1;
            obj = plantService.fetchInformationPlant(str, str2, str3, str4, i0Var, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResultWrapper<ResponsePlantDto>> continuation) {
        return ((PlantRepository$fetchInformationPlant$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

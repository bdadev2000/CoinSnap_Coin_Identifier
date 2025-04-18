package com.plantcare.ai.identifier.plantid.data.database.repository;

import com.plantcare.ai.identifier.plantid.data.database.daos.PlantDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plantcare.ai.identifier.plantid.data.database.repository.PlantRepository$isPlantExists$2", f = "PlantRepository.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class PlantRepository$isPlantExists$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ String $scientificName;
    int label;
    final /* synthetic */ PlantRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlantRepository$isPlantExists$2(PlantRepository plantRepository, String str, Continuation<? super PlantRepository$isPlantExists$2> continuation) {
        super(2, continuation);
        this.this$0 = plantRepository;
        this.$scientificName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlantRepository$isPlantExists$2(this.this$0, this.$scientificName, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PlantDao plantDao;
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
            plantDao = this.this$0.dao;
            String str = this.$scientificName;
            this.label = 1;
            obj = plantDao.isPlantExists(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((PlantRepository$isPlantExists$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

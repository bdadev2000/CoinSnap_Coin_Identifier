package com.plantcare.ai.identifier.plantid.data.network.repository;

import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponsePlantDto;
import com.plantcare.ai.identifier.plantid.data.network.service.PlantService;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import wh.i0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/repository/PlantRepository;", "", "", "packageName", "versionCode", "internalKey", "secretKey", "Lwh/i0;", "image", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponsePlantDto;", "fetchInformationPlant", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwh/i0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/plantcare/ai/identifier/plantid/data/network/service/PlantService;", "plantService", "Lcom/plantcare/ai/identifier/plantid/data/network/service/PlantService;", "<init>", "(Lcom/plantcare/ai/identifier/plantid/data/network/service/PlantService;)V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PlantRepository {
    private final PlantService plantService;

    public PlantRepository(PlantService plantService) {
        Intrinsics.checkNotNullParameter(plantService, "plantService");
        this.plantService = plantService;
    }

    public final Object fetchInformationPlant(String str, String str2, String str3, String str4, i0 i0Var, Continuation<? super ResultWrapper<ResponsePlantDto>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PlantRepository$fetchInformationPlant$2(this, str, str2, str3, str4, i0Var, null), continuation);
    }
}

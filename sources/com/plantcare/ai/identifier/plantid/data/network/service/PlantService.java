package com.plantcare.ai.identifier.plantid.data.network.service;

import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponsePlantDto;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import pi.i;
import pi.l;
import pi.o;
import pi.q;
import wh.i0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JK\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/service/PlantService;", "", "", "packageName", "versionCode", "internalKey", "secretKey", "Lwh/i0;", "file", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponsePlantDto;", "fetchInformationPlant", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwh/i0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface PlantService {
    @o("api/v2/plants")
    @l
    Object fetchInformationPlant(@i("x-package-name") String str, @i("x-version-code") String str2, @i("x-internal-key") String str3, @i("x-secret-key") String str4, @q i0 i0Var, Continuation<? super ResultWrapper<ResponsePlantDto>> continuation);
}

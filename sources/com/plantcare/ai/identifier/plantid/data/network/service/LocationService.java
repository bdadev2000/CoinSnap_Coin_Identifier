package com.plantcare.ai.identifier.plantid.data.network.service;

import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponseLocationDto;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import pi.f;
import pi.t;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/service/LocationService;", "", "fetchDataLocation", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseLocationDto;", "lat", "", "lon", "localityLang", "", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LocationService {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object fetchDataLocation$default(LocationService locationService, double d10, double d11, String str, Continuation continuation, int i10, Object obj) {
            double d12;
            double d13;
            String str2;
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    d12 = 0.0d;
                } else {
                    d12 = d10;
                }
                if ((i10 & 2) != 0) {
                    d13 = 0.0d;
                } else {
                    d13 = d11;
                }
                if ((i10 & 4) != 0) {
                    str2 = "en";
                } else {
                    str2 = str;
                }
                return locationService.fetchDataLocation(d12, d13, str2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchDataLocation");
        }
    }

    @f("/data/reverse-geocode-client")
    Object fetchDataLocation(@t("latitude") double d10, @t("longitude") double d11, @t("localityLanguage") String str, Continuation<? super ResultWrapper<ResponseLocationDto>> continuation);
}

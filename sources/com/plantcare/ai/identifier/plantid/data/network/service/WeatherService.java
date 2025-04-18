package com.plantcare.ai.identifier.plantid.data.network.service;

import com.adjust.sdk.Constants;
import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponseWeatherDto;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import pi.f;
import pi.t;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/service/WeatherService;", "", "fetchDataWeather", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto;", "cityCode", "", "lat", "", Constants.LONG, "(Ljava/lang/String;DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WeatherService {
    @f("api/weathers?")
    Object fetchDataWeather(@t("cityCode") String str, @t("lat") double d10, @t("long") double d11, Continuation<? super ResultWrapper<ResponseWeatherDto>> continuation);
}

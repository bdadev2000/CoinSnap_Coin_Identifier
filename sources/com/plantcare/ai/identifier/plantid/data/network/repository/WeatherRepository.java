package com.plantcare.ai.identifier.plantid.data.network.repository;

import com.adjust.sdk.Constants;
import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponseWeatherDto;
import com.plantcare.ai.identifier.plantid.data.network.service.WeatherService;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/data/network/repository/WeatherRepository;", "", "weatherService", "Lcom/plantcare/ai/identifier/plantid/data/network/service/WeatherService;", "(Lcom/plantcare/ai/identifier/plantid/data/network/service/WeatherService;)V", "fetchDataWeather", "Lcom/plantcare/ai/identifier/plantid/utils/network_adapter_factory/ResultWrapper;", "Lcom/plantcare/ai/identifier/plantid/data/network/dto/res/ResponseWeatherDto;", "cityCode", "", "lat", "", Constants.LONG, "(Ljava/lang/String;DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WeatherRepository {
    private final WeatherService weatherService;

    public WeatherRepository(WeatherService weatherService) {
        Intrinsics.checkNotNullParameter(weatherService, "weatherService");
        this.weatherService = weatherService;
    }

    public final Object fetchDataWeather(String str, double d10, double d11, Continuation<? super ResultWrapper<ResponseWeatherDto>> continuation) {
        return this.weatherService.fetchDataWeather(str, d10, d11, continuation);
    }
}

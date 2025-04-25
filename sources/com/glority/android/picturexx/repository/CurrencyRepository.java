package com.glority.android.picturexx.repository;

import androidx.lifecycle.LiveData;
import com.glority.android.picturexx.utils.CoinSPUtils;
import com.glority.android.repository.BaseRepository;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.picturecoin.generatedAPI.kotlinAPI.config.CountryInfo;
import com.picturecoin.generatedAPI.kotlinAPI.config.GetAllCountriesMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyRepository.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00060\u0005¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/repository/CurrencyRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "getExpertPicksMessage", "Landroidx/lifecycle/LiveData;", "Lcom/glority/base/server/CacheThenNetworkRequest$ResultData;", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/config/CountryInfo;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CurrencyRepository extends BaseRepository {
    public static final int $stable = 0;
    public static final CurrencyRepository INSTANCE = new CurrencyRepository();

    private CurrencyRepository() {
    }

    public final LiveData<CacheThenNetworkRequest.ResultData<List<CountryInfo>>> getExpertPicksMessage() {
        return new CacheThenNetworkRequest<GetAllCountriesMessage, List<? extends CountryInfo>>() { // from class: com.glority.android.picturexx.repository.CurrencyRepository$getExpertPicksMessage$request$1
            @Override // com.glority.base.server.CacheThenNetworkRequest
            public LiveData<CacheThenNetworkRequest.ResultData<List<? extends CountryInfo>>> doRequest() {
                return CacheThenNetworkRequest.DefaultImpls.doRequest(this);
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public Resource<GetAllCountriesMessage> networkRequest() {
                return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetAllCountriesMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode()));
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public List<? extends CountryInfo> cacheRequest() {
                try {
                    return CoinSPUtils.INSTANCE.getGetAllCountriesMessage();
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public List<CountryInfo> updateCache(GetAllCountriesMessage resource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                CoinSPUtils.INSTANCE.setGetAllCountriesMessage(resource.getCountries());
                return resource.getCountries();
            }
        }.doRequest();
    }
}

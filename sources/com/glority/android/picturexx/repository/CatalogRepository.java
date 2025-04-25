package com.glority.android.picturexx.repository;

import androidx.lifecycle.LiveData;
import com.glority.android.repository.BaseRepository;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.base.server.SpCacheThenNetworkRequest;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogCountryListMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogDetailMessage;
import com.picturecoin.generatedAPI.kotlinAPI.series.CatalogListMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CatalogRepository.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\n2\u0006\u0010\f\u001a\u00020\bJ\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\n¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/repository/CatalogRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "requestCatalogListMessage", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogListMessage;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "requestCatalogDetailMessage", "Landroidx/lifecycle/LiveData;", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogDetailMessage;", "catalogUid", "requestCatalogCountryListMessage", "Lcom/glority/base/server/CacheThenNetworkRequest$ResultData;", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/CatalogCountryListMessage;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CatalogRepository extends BaseRepository {
    public static final int $stable = 0;
    public static final CatalogRepository INSTANCE = new CatalogRepository();

    private CatalogRepository() {
    }

    public final Resource<CatalogListMessage> requestCatalogListMessage(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new CatalogListMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), countryCode));
    }

    public final LiveData<Resource<CatalogDetailMessage>> requestCatalogDetailMessage(String catalogUid) {
        Intrinsics.checkNotNullParameter(catalogUid, "catalogUid");
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new CatalogDetailMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), catalogUid));
    }

    public final LiveData<CacheThenNetworkRequest.ResultData<CatalogCountryListMessage>> requestCatalogCountryListMessage() {
        return new SpCacheThenNetworkRequest(new CatalogCountryListMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode())).doRequest();
    }
}

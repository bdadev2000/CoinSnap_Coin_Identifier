package com.glority.android.picturexx.repository;

import androidx.lifecycle.LiveData;
import com.glority.android.picturexx.utils.CoinSPUtils;
import com.glority.android.repository.BaseRepository;
import com.glority.android.xx.constants.Args;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.network.model.Resource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.picturecoin.generatedAPI.kotlinAPI.article.ExpertPick;
import com.picturecoin.generatedAPI.kotlinAPI.article.ListExpertPicksMessage;
import com.picturecoin.generatedAPI.kotlinAPI.cmsconsumer.CoinHomeGetMessage;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeRepository.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007J,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0087@¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f0\u00130\r¨\u0006\u0015"}, d2 = {"Lcom/glority/android/picturexx/repository/HomeRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "getCoinListBlocking", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/cmsconsumer/CoinHomeGetMessage;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", Args.indexListUid, "getCoinList", "Landroidx/lifecycle/LiveData;", "getCoinTalkListSync", "", "Lcom/glority/android/database/entities/ArticleNewEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExpertPicksMessage", "Lcom/glority/base/server/CacheThenNetworkRequest$ResultData;", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class HomeRepository extends BaseRepository {
    public static final int $stable = 0;
    public static final HomeRepository INSTANCE = new HomeRepository();

    private HomeRepository() {
    }

    public final Resource<CoinHomeGetMessage> getCoinListBlocking(LanguageCode languageCode, String countryCode, String indexListUid) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new CoinHomeGetMessage(languageCode, countryCode, indexListUid));
    }

    public final LiveData<Resource<CoinHomeGetMessage>> getCoinList(LanguageCode languageCode, String countryCode, String indexListUid) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(indexListUid, "indexListUid");
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new CoinHomeGetMessage(languageCode, countryCode, indexListUid));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3 A[LOOP:0: B:13:0x00dd->B:15:0x00e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCoinTalkListSync(kotlin.coroutines.Continuation<? super java.util.List<com.glority.android.database.entities.ArticleNewEntity>> r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.repository.HomeRepository.getCoinTalkListSync(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final LiveData<CacheThenNetworkRequest.ResultData<List<ExpertPick>>> getExpertPicksMessage() {
        return new CacheThenNetworkRequest<ListExpertPicksMessage, List<? extends ExpertPick>>() { // from class: com.glority.android.picturexx.repository.HomeRepository$getExpertPicksMessage$request$1
            @Override // com.glority.base.server.CacheThenNetworkRequest
            public LiveData<CacheThenNetworkRequest.ResultData<List<? extends ExpertPick>>> doRequest() {
                return CacheThenNetworkRequest.DefaultImpls.doRequest(this);
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public Resource<ListExpertPicksMessage> networkRequest() {
                return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new ListExpertPicksMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode(), CoinSPUtils.INSTANCE.getExpertPickListUpdateTime()));
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public List<? extends ExpertPick> cacheRequest() {
                try {
                    return CoinSPUtils.INSTANCE.getExpertPickList();
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.glority.base.server.CacheThenNetworkRequest
            public List<ExpertPick> updateCache(ListExpertPicksMessage resource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                Date lastPublishedAt = resource.getLastPublishedAt();
                if (lastPublishedAt != null) {
                    CoinSPUtils.INSTANCE.setExpertPickListUpdateTime(lastPublishedAt);
                }
                CoinSPUtils.INSTANCE.setExpertPickList(resource.getList());
                return resource.getList();
            }
        }.doRequest();
    }
}

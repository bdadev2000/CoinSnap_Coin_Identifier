package com.glority.android.picturexx.repository;

import com.glority.android.core.app.AppContext;
import com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.CmsSearchMessage;
import com.glority.cmssearch.generatedAPI.kotlinAPI.enums.EntranceType;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.network.ApiServer;
import com.glority.network.model.Resource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0007R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/repository/SearchRepository;", "", "<init>", "()V", "appServer", "Lcom/glority/network/ApiServer;", "getAppServer", "()Lcom/glority/network/ApiServer;", "appServer$delegate", "Lkotlin/Lazy;", "cmsSearchBlocking", "Lcom/glority/network/model/Resource;", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/CmsSearchMessage;", "searchKey", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SearchRepository {
    public static final SearchRepository INSTANCE = new SearchRepository();

    /* renamed from: appServer$delegate, reason: from kotlin metadata */
    private static final Lazy appServer = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ApiServer>() { // from class: com.glority.android.picturexx.repository.SearchRepository$appServer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ApiServer invoke() {
            return new ApiServer.Builder().host(AppContext.INSTANCE.getConfig("CMS_SEARCH_HOST")).build();
        }
    });
    public static final int $stable = 8;

    private SearchRepository() {
    }

    private final ApiServer getAppServer() {
        return (ApiServer) appServer.getValue();
    }

    public final Resource<CmsSearchMessage> cmsSearchBlocking(String searchKey, LanguageCode languageCode, String countryCode) {
        Intrinsics.checkNotNullParameter(searchKey, "searchKey");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return getAppServer().sendMessageBlocking(new CmsSearchMessage(searchKey, languageCode, countryCode, EntranceType.PLANTS));
    }
}

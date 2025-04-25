package com.glority.android.picturexx.splash.repository;

import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.network.model.Resource;
import com.picturecoin.generatedAPI.kotlinAPI.collection.GetCollectionListPaginateMessage;
import kotlin.Metadata;

/* compiled from: SplashRestoreRepository.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/android/picturexx/splash/repository/SplashRestoreRepository;", "", "<init>", "()V", "getCollectionListMessageSync", "Lcom/glority/network/model/Resource;", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/GetCollectionListPaginateMessage;", "pageSize", "", "lastId", "(ILjava/lang/Integer;)Lcom/glority/network/model/Resource;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashRestoreRepository {
    public static final int $stable = 0;
    public static final SplashRestoreRepository INSTANCE = new SplashRestoreRepository();

    private SplashRestoreRepository() {
    }

    public static /* synthetic */ Resource getCollectionListMessageSync$default(SplashRestoreRepository splashRestoreRepository, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        return splashRestoreRepository.getCollectionListMessageSync(i, num);
    }

    public final Resource<GetCollectionListPaginateMessage> getCollectionListMessageSync(int pageSize, Integer lastId) {
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetCollectionListPaginateMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode(), Integer.valueOf(pageSize), lastId));
    }
}

package com.glority.android.picturexx.splash;

import com.glority.android.core.utils.data.EventLiveData;
import com.glority.base.entity.OnActivityResultEntity;
import kotlin.Metadata;

/* compiled from: SplashGlobalLiveData.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/splash/SplashGlobalLiveData;", "", "<init>", "()V", "onMainActivityResult", "Lcom/glority/android/core/utils/data/EventLiveData;", "Lcom/glority/base/entity/OnActivityResultEntity;", "getOnMainActivityResult", "()Lcom/glority/android/core/utils/data/EventLiveData;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SplashGlobalLiveData {
    public static final SplashGlobalLiveData INSTANCE = new SplashGlobalLiveData();
    private static final EventLiveData<OnActivityResultEntity> onMainActivityResult = new EventLiveData<>();
    public static final int $stable = 8;

    private SplashGlobalLiveData() {
    }

    public final EventLiveData<OnActivityResultEntity> getOnMainActivityResult() {
        return onMainActivityResult;
    }
}

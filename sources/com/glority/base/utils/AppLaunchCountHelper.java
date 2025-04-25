package com.glority.base.utils;

import com.glority.android.core.utils.data.PersistData;
import com.glority.base.storage.PersistKey;
import kotlin.Metadata;

/* compiled from: AppLaunchCountHelper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/base/utils/AppLaunchCountHelper;", "", "<init>", "()V", "value", "", "appLaunchCount", "getAppLaunchCount", "()I", "setAppLaunchCount", "(I)V", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class AppLaunchCountHelper {
    public static final int $stable = 0;
    public static final AppLaunchCountHelper INSTANCE = new AppLaunchCountHelper();

    private AppLaunchCountHelper() {
    }

    public final int getAppLaunchCount() {
        return ((Number) PersistData.INSTANCE.get(PersistKey.KEY_APP_LAUNCH_COUNT, 0)).intValue();
    }

    public final void setAppLaunchCount(int i) {
        PersistData.INSTANCE.set(PersistKey.KEY_APP_LAUNCH_COUNT, Integer.valueOf(i));
    }
}

package com.facebook.bolts;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class AppLinks {

    @NotNull
    public static final AppLinks INSTANCE = new AppLinks();

    @NotNull
    public static final String KEY_NAME_APPLINK_DATA = "al_applink_data";

    @NotNull
    public static final String KEY_NAME_EXTRAS = "extras";

    private AppLinks() {
    }

    @Nullable
    public static final Bundle getAppLinkData(@NotNull Intent intent) {
        p0.a.s(intent, SDKConstants.PARAM_INTENT);
        return intent.getBundleExtra(KEY_NAME_APPLINK_DATA);
    }

    @Nullable
    public static final Bundle getAppLinkExtras(@NotNull Intent intent) {
        p0.a.s(intent, SDKConstants.PARAM_INTENT);
        Bundle appLinkData = getAppLinkData(intent);
        if (appLinkData == null) {
            return null;
        }
        return appLinkData.getBundle("extras");
    }
}

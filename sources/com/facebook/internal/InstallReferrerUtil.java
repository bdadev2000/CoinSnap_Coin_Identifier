package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.m;

/* loaded from: classes2.dex */
public final class InstallReferrerUtil {

    @NotNull
    public static final InstallReferrerUtil INSTANCE = new InstallReferrerUtil();

    @NotNull
    private static final String IS_REFERRER_UPDATED = "is_referrer_updated";

    /* loaded from: classes2.dex */
    public interface Callback {
        void onReceiveReferrerUrl(@Nullable String str);
    }

    private InstallReferrerUtil() {
    }

    private final boolean isUpdated() {
        return FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).getBoolean(IS_REFERRER_UPDATED, false);
    }

    private final void tryConnectReferrerInfo(final Callback callback) {
        final InstallReferrerClient build = InstallReferrerClient.newBuilder(FacebookSdk.getApplicationContext()).build();
        try {
            build.startConnection(new InstallReferrerStateListener() { // from class: com.facebook.internal.InstallReferrerUtil$tryConnectReferrerInfo$installReferrerStateListener$1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(int i2) {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        if (i2 == 0) {
                            try {
                                ReferrerDetails installReferrer = InstallReferrerClient.this.getInstallReferrer();
                                p0.a.r(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null && (m.M0(installReferrer2, "fb", false) || m.M0(installReferrer2, AccessToken.DEFAULT_GRAPH_DOMAIN, false))) {
                                    callback.onReceiveReferrerUrl(installReferrer2);
                                }
                                InstallReferrerUtil.INSTANCE.updateReferrer();
                            } catch (RemoteException unused) {
                                return;
                            }
                        } else if (i2 == 2) {
                            InstallReferrerUtil.INSTANCE.updateReferrer();
                        }
                        try {
                            InstallReferrerClient.this.endConnection();
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public static final void tryUpdateReferrerInfo(@NotNull Callback callback) {
        p0.a.s(callback, "callback");
        InstallReferrerUtil installReferrerUtil = INSTANCE;
        if (installReferrerUtil.isUpdated()) {
            return;
        }
        installReferrerUtil.tryConnectReferrerInfo(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateReferrer() {
        FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0).edit().putBoolean(IS_REFERRER_UPDATED, true).apply();
    }
}

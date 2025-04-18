package com.vungle.ads.internal.platform;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import bh.a0;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.executor.l;
import com.vungle.ads.internal.util.v;
import jb.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements d {
    public static final a Companion = new a(null);
    private static final String TAG = "AndroidPlatform";
    private a0 advertisingInfo;
    private String appSetId;
    private final Context context;
    private final boolean isSideLoaded;
    private final PowerManager powerManager;
    private final l uaExecutor;
    private String userAgent;

    public b(Context context, l uaExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uaExecutor, "uaExecutor");
        this.context = context;
        this.uaExecutor = uaExecutor;
        updateAppSetID();
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.powerManager = (PowerManager) systemService;
    }

    public static /* synthetic */ void a(b bVar, m0.a aVar) {
        m44getUserAgentLazy$lambda0(bVar, aVar);
    }

    /* renamed from: getUserAgentLazy$lambda-0 */
    public static final void m44getUserAgentLazy$lambda0(b this$0, m0.a consumer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        new f(this$0.context).getUserAgent(consumer);
    }

    private final void updateAppSetID() {
        try {
            AppSetIdClient client = AppSet.getClient(this.context);
            Intrinsics.checkNotNullExpressionValue(client, "getClient(context)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "client.appSetIdInfo");
            appSetIdInfo.addOnSuccessListener(new gb.d(this, 13));
        } catch (NoClassDefFoundError e2) {
            v.Companion.e(TAG, "Required libs to get AppSetID Not available: " + e2.getLocalizedMessage());
        }
    }

    /* renamed from: updateAppSetID$lambda-1 */
    public static final void m45updateAppSetID$lambda1(b this$0, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.appSetId = appSetIdInfo.getId();
        }
    }

    @Override // com.vungle.ads.internal.platform.d
    public a0 getAdvertisingInfo() {
        boolean z10;
        a0 a0Var = this.advertisingInfo;
        boolean z11 = false;
        if (a0Var != null) {
            String advertisingId = a0Var.getAdvertisingId();
            if (advertisingId != null && advertisingId.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return a0Var;
            }
        }
        a0 a0Var2 = new a0();
        try {
        } catch (Exception unused) {
            v.Companion.e(TAG, "Cannot load Advertising ID");
        }
        if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
            try {
                ContentResolver contentResolver = this.context.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 1) {
                    z11 = true;
                }
                a0Var2.setLimitAdTracking(z11);
                a0Var2.setAdvertisingId(Settings.Secure.getString(contentResolver, "advertising_id"));
            } catch (Settings.SettingNotFoundException e2) {
                v.Companion.w(TAG, "Error getting Amazon advertising info", e2);
            }
            this.advertisingInfo = a0Var2;
            return a0Var2;
        }
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            a0Var2.setAdvertisingId(advertisingIdInfo.getId());
            a0Var2.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (GooglePlayServicesNotAvailableException e10) {
            v.Companion.e(TAG, "Play services Not available: " + e10.getLocalizedMessage());
        } catch (NoClassDefFoundError e11) {
            v.Companion.e(TAG, "Play services Not available: " + e11.getLocalizedMessage());
            a0Var2.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
        }
        this.advertisingInfo = a0Var2;
        return a0Var2;
        v.Companion.e(TAG, "Cannot load Advertising ID");
        this.advertisingInfo = a0Var2;
        return a0Var2;
    }

    @Override // com.vungle.ads.internal.platform.d
    @SuppressLint({"HardwareIds"})
    public String getAndroidId() {
        if (fh.c.INSTANCE.getPublishAndroidId()) {
            return Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        }
        return "";
    }

    @Override // com.vungle.ads.internal.platform.d
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override // com.vungle.ads.internal.platform.d
    public String getCarrierName() {
        String carrierName$vungle_ads_release = Companion.getCarrierName$vungle_ads_release(this.context);
        Intrinsics.checkNotNullExpressionValue(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.platform.d
    public String getUserAgent() {
        String str = this.userAgent;
        return str == null ? System.getProperty("http.agent") : str;
    }

    @Override // com.vungle.ads.internal.platform.d
    public void getUserAgentLazy(m0.a consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.uaExecutor.execute(new j(15, this, consumer));
    }

    @Override // com.vungle.ads.internal.platform.d
    public float getVolumeLevel() {
        try {
            Object systemService = this.context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.vungle.ads.internal.platform.d
    public boolean isAtLeastMinimumSDK() {
        return true;
    }

    @Override // com.vungle.ads.internal.platform.d
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    @Override // com.vungle.ads.internal.platform.d
    public boolean isSdCardPresent() {
        try {
            return Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e2) {
            v.Companion.e(TAG, "Acquiring external storage state failed", e2);
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.d
    public boolean isSideLoaded() {
        return this.isSideLoaded;
    }

    @Override // com.vungle.ads.internal.platform.d
    public boolean isSoundEnabled() {
        try {
            Object systemService = this.context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            if (((AudioManager) systemService).getStreamVolume(3) > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }
}

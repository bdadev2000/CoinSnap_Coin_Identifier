package com.vungle.ads.internal.platform;

import G7.j;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import c7.C0615A;
import com.facebook.appevents.k;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.executor.l;
import com.vungle.ads.internal.util.v;
import g7.C2309c;

/* loaded from: classes3.dex */
public final class b implements d {
    public static final a Companion = new a(null);
    private static final String TAG = "AndroidPlatform";
    private C0615A advertisingInfo;
    private String appSetId;
    private final Context context;
    private final boolean isSideLoaded;
    private final PowerManager powerManager;
    private final l uaExecutor;
    private String userAgent;

    public b(Context context, l lVar) {
        j.e(context, "context");
        j.e(lVar, "uaExecutor");
        this.context = context;
        this.uaExecutor = lVar;
        updateAppSetID();
        Object systemService = context.getSystemService("power");
        j.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.powerManager = (PowerManager) systemService;
    }

    public static /* synthetic */ void a(b bVar, S.a aVar) {
        m64getUserAgentLazy$lambda0(bVar, aVar);
    }

    public static /* synthetic */ void b(b bVar, AppSetIdInfo appSetIdInfo) {
        m65updateAppSetID$lambda1(bVar, appSetIdInfo);
    }

    /* renamed from: getUserAgentLazy$lambda-0 */
    public static final void m64getUserAgentLazy$lambda0(b bVar, S.a aVar) {
        j.e(bVar, "this$0");
        j.e(aVar, "$consumer");
        new f(bVar.context).getUserAgent(aVar);
    }

    private final void updateAppSetID() {
        try {
            AppSetIdClient client = AppSet.getClient(this.context);
            j.d(client, "getClient(context)");
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            j.d(appSetIdInfo, "client.appSetIdInfo");
            appSetIdInfo.addOnSuccessListener(new F2.d(this, 15));
        } catch (NoClassDefFoundError e4) {
            v.Companion.e(TAG, "Required libs to get AppSetID Not available: " + e4.getLocalizedMessage());
        }
    }

    /* renamed from: updateAppSetID$lambda-1 */
    public static final void m65updateAppSetID$lambda1(b bVar, AppSetIdInfo appSetIdInfo) {
        j.e(bVar, "this$0");
        if (appSetIdInfo != null) {
            bVar.appSetId = appSetIdInfo.getId();
        }
    }

    @Override // com.vungle.ads.internal.platform.d
    public C0615A getAdvertisingInfo() {
        String advertisingId;
        C0615A c0615a = this.advertisingInfo;
        if (c0615a != null && (advertisingId = c0615a.getAdvertisingId()) != null && advertisingId.length() != 0) {
            return c0615a;
        }
        C0615A c0615a2 = new C0615A();
        try {
        } catch (Exception unused) {
            v.Companion.e(TAG, "Cannot load Advertising ID");
        }
        if ("Amazon".equals(Build.MANUFACTURER)) {
            try {
                ContentResolver contentResolver = this.context.getContentResolver();
                boolean z8 = true;
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                    z8 = false;
                }
                c0615a2.setLimitAdTracking(z8);
                c0615a2.setAdvertisingId(Settings.Secure.getString(contentResolver, "advertising_id"));
            } catch (Settings.SettingNotFoundException e4) {
                v.Companion.w(TAG, "Error getting Amazon advertising info", e4);
            }
            this.advertisingInfo = c0615a2;
            return c0615a2;
        }
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            j.d(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            c0615a2.setAdvertisingId(advertisingIdInfo.getId());
            c0615a2.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (GooglePlayServicesNotAvailableException e9) {
            v.Companion.e(TAG, "Play services Not available: " + e9.getLocalizedMessage());
        } catch (NoClassDefFoundError e10) {
            v.Companion.e(TAG, "Play services Not available: " + e10.getLocalizedMessage());
            c0615a2.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
        }
        this.advertisingInfo = c0615a2;
        return c0615a2;
        v.Companion.e(TAG, "Cannot load Advertising ID");
        this.advertisingInfo = c0615a2;
        return c0615a2;
    }

    @Override // com.vungle.ads.internal.platform.d
    @SuppressLint({"HardwareIds"})
    public String getAndroidId() {
        if (C2309c.INSTANCE.getPublishAndroidId()) {
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
        j.d(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.platform.d
    public String getUserAgent() {
        String str = this.userAgent;
        if (str == null) {
            return System.getProperty("http.agent");
        }
        return str;
    }

    @Override // com.vungle.ads.internal.platform.d
    public void getUserAgentLazy(S.a aVar) {
        j.e(aVar, "consumer");
        this.uaExecutor.execute(new k(8, this, aVar));
    }

    @Override // com.vungle.ads.internal.platform.d
    public float getVolumeLevel() {
        try {
            Object systemService = this.context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            j.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
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
            return j.a(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e4) {
            v.Companion.e(TAG, "Acquiring external storage state failed", e4);
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
            j.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
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

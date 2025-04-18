package com.safedk.android.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.i;
import com.safedk.android.utils.k;

/* loaded from: classes.dex */
public class DeviceData implements AppLovinCommunicatorSubscriber {
    private static final String A = "is_ad_tracking_enabled";
    private static final String B = "enduser_id";
    private static final String C = "app_version_name";
    private static final String D = "app_version";
    private static final String E = "init_success";
    private static final String F = "value";
    private static final String G = "user_id";

    /* renamed from: a, reason: collision with root package name */
    public static final String f29866a = "sdk_key";

    /* renamed from: l, reason: collision with root package name */
    private static final String f29867l = "DeviceData";

    /* renamed from: m, reason: collision with root package name */
    private static final String f29868m = "values";

    /* renamed from: n, reason: collision with root package name */
    private static final String f29869n = "operator";

    /* renamed from: o, reason: collision with root package name */
    private static final String f29870o = "lte";

    /* renamed from: p, reason: collision with root package name */
    private static final String f29871p = "gte";

    /* renamed from: q, reason: collision with root package name */
    private static final String f29872q = "deactivationPercentage";

    /* renamed from: r, reason: collision with root package name */
    private static final String f29873r = "device_type";

    /* renamed from: s, reason: collision with root package name */
    private static final String f29874s = "applovin_random_token";

    /* renamed from: t, reason: collision with root package name */
    private static final String f29875t = "device_brand";

    /* renamed from: u, reason: collision with root package name */
    private static final String f29876u = "device_model";

    /* renamed from: v, reason: collision with root package name */
    private static final String f29877v = "device_revision";
    private static final String w = "os_version";
    private static final String x = "safedk_version";

    /* renamed from: y, reason: collision with root package name */
    private static final String f29878y = "applovin_version";

    /* renamed from: z, reason: collision with root package name */
    private static final String f29879z = "from_store";
    private i H;

    /* renamed from: b, reason: collision with root package name */
    String f29880b;

    /* renamed from: c, reason: collision with root package name */
    String f29881c;
    int d;
    int e;

    /* renamed from: f, reason: collision with root package name */
    String f29882f;

    /* renamed from: g, reason: collision with root package name */
    String f29883g;

    /* renamed from: h, reason: collision with root package name */
    String f29884h;

    /* renamed from: i, reason: collision with root package name */
    String f29885i;

    /* renamed from: j, reason: collision with root package name */
    String f29886j;

    /* renamed from: k, reason: collision with root package name */
    boolean f29887k = false;

    /* loaded from: classes.dex */
    private enum CriteriaField {
        deviceModel,
        manufacturer,
        country,
        appVersionCode,
        androidVersion,
        osVersion,
        appDeviceIDs,
        age,
        region
    }

    private DeviceData() {
    }

    public DeviceData(final Context context, i prefs) {
        Logger.d(f29867l, "DeviceData started");
        this.H = prefs;
        this.f29880b = Build.MODEL;
        this.f29881c = Build.MANUFACTURER.toLowerCase();
        this.e = Build.VERSION.SDK_INT;
        try {
            new Thread(new Runnable() { // from class: com.safedk.android.internal.DeviceData.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        DeviceData.this.f29887k = DeviceData.this.a(context);
                    } catch (Throwable th) {
                    }
                }
            }).start();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f29882f = packageInfo.versionName;
            this.d = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.e(f29867l, "Error getting device data", e);
        } catch (Throwable th) {
            Logger.e(f29867l, "Error getting device data", th);
        }
        AppLovinBridge.registerToReceiveSafeDKSettings(this);
        AppLovinBridge.registerToReceiveUserInfo(this);
    }

    public String a() {
        if (this.f29885i != null) {
            return this.f29885i;
        }
        if (this.H != null && this.H.n() == this.d) {
            return this.H.m();
        }
        return null;
    }

    public String b() {
        if (this.f29884h != null) {
            return this.f29884h;
        }
        if (this.H != null && this.H.n() == this.d) {
            return this.H.o();
        }
        return null;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        Logger.d(f29867l, "message received " + message.getMessageData());
        Bundle messageData = message.getMessageData();
        if (messageData.containsKey(E)) {
            if (this.H != null) {
                this.f29884h = messageData.getString(f29874s);
                this.f29885i = messageData.getString("sdk_key");
                this.H.a(this.d, this.f29884h, this.f29885i);
                this.f29883g = messageData.getString(f29873r);
                SdksMapping.setMaxAdapterVersions(messageData);
                if (Boolean.parseBoolean(messageData.getString(E))) {
                    Logger.d(f29867l, "AppLovinSdk reported success to retrieve settings");
                    SafeDK.getInstance().a(messageData, true);
                } else {
                    SafeDK.getInstance().a(true);
                    Logger.d(f29867l, "AppLovinSdk reported a failure to retrieve settings. The saved settings from a previous session will be used.");
                }
            } else {
                Logger.d(f29867l, "AppLovinSdk prefs is null");
            }
        } else if (messageData.containsKey("value")) {
            this.f29886j = messageData.getString("value");
        } else if (messageData.containsKey("user_id")) {
            this.f29886j = messageData.getString("user_id");
        }
        SafeDK.X();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f29081a;
    }

    public static float a(String str, String str2) {
        return (Math.abs((str + str2).hashCode()) % 100000) / 1000;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("package", SafeDK.getInstance().l().getPackageName());
        bundle.putString(AppLovinBridge.e, "android");
        bundle.putString(f29874s, b());
        bundle.putString(f29878y, k.a());
        bundle.putString("safedk_version", com.safedk.android.a.f29059a);
        bundle.putString(f29873r, this.f29883g);
        bundle.putString(f29876u, Build.MODEL);
        bundle.putString(f29875t, Build.MANUFACTURER);
        bundle.putString(f29877v, Build.DEVICE);
        bundle.putString(w, Build.VERSION.RELEASE);
        bundle.putString(D, String.valueOf(this.d));
        bundle.putString(C, this.f29882f);
        SafeDK.getInstance();
        bundle.putBoolean(f29879z, SafeDK.a());
        bundle.putString(B, this.f29886j);
        bundle.putBoolean(A, this.f29887k);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo == null) {
                return false;
            }
            Logger.d(f29867l, "Ad Tracking id is " + advertisingIdInfo.getId());
            return !advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Throwable th) {
            return false;
        }
    }
}

package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.b;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f16052a = null;
    public static String b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f16053c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f16054d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static String f16055e = "";

    /* renamed from: f, reason: collision with root package name */
    private static boolean f16056f = false;

    /* renamed from: g, reason: collision with root package name */
    private static String f16057g = "";

    public static int a() {
        return f16054d;
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
            return TextUtils.isEmpty(b) ? "" : b;
        }
        if (TextUtils.isEmpty(b)) {
            if (!f16053c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                f16053c = true;
            }
            return "";
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
            return b;
        }
        return f16054d == 0 ? b : "";
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
            if (TextUtils.isEmpty(f16052a)) {
                return "";
            }
            return f16052a;
        }
        if (TextUtils.isEmpty(f16052a)) {
            z.j();
            if (!f16053c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                f16053c = true;
            }
            if (TextUtils.isEmpty(f16052a)) {
                return "";
            }
            return f16052a;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
            if (f16054d != 0) {
                return "";
            }
            return f16052a;
        }
        return f16052a;
    }

    public static String d() {
        if (TextUtils.isEmpty(f16057g) && !f16056f) {
            e();
        }
        return f16057g;
    }

    public static String e() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f16056f) {
            return f16055e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.m().c().getContentResolver();
                int i9 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, i9);
                jSONObject.put("amazonId", string);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    f16057g = jSONObject2;
                    f16055e = x.b(jSONObject2);
                }
            } catch (Settings.SettingNotFoundException e4) {
                ad.b("DomainSameDiTool", e4.getMessage());
            }
        } catch (Throwable th) {
            ad.b("DomainSameDiTool", th.getMessage());
        }
        f16056f = true;
        return f16055e;
    }

    public static void a(int i9) {
        f16054d = i9;
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.e.1
            @Override // java.lang.Runnable
            public final void run() {
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        e.a(advertisingIdInfo.getId());
                        e.f16054d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                        e.a(context, advertisingIdInfo.getId(), e.f16054d);
                    } catch (Exception unused) {
                        ad.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                        try {
                            b.a a6 = new b().a(context);
                            e.a(a6.a());
                            e.f16054d = a6.b() ? 1 : 0;
                            e.a(context, a6.a(), e.f16054d);
                        } catch (Exception unused2) {
                            ad.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                        }
                    } catch (Throwable th) {
                        ad.b("DomainSameDiTool", th.getMessage());
                    }
                }
            }
        }).start();
    }

    public static void a(String str) {
        b = x.b(str);
        f16052a = str;
    }

    public static /* synthetic */ void a(Context context, String str, int i9) {
        try {
            if (an.b(str)) {
                al.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            al.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i9));
        } catch (Exception e4) {
            ad.b("DomainSameDiTool", e4.getMessage());
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}

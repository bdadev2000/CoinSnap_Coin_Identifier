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

/* loaded from: classes4.dex */
public class e {
    public static volatile String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f13610b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f13611c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f13612d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static String f13613e = "";

    /* renamed from: f, reason: collision with root package name */
    private static boolean f13614f = false;

    /* renamed from: g, reason: collision with root package name */
    private static String f13615g = "";

    public static int a() {
        return f13612d;
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
            return TextUtils.isEmpty(f13610b) ? "" : f13610b;
        }
        if (TextUtils.isEmpty(f13610b)) {
            if (!f13611c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                f13611c = true;
            }
            return "";
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
            return f13610b;
        }
        return f13612d == 0 ? f13610b : "";
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
            if (TextUtils.isEmpty(a)) {
                return "";
            }
            return a;
        }
        if (TextUtils.isEmpty(a)) {
            z.j();
            if (!f13611c) {
                a(com.mbridge.msdk.foundation.controller.c.m().c());
                f13611c = true;
            }
            if (TextUtils.isEmpty(a)) {
                return "";
            }
            return a;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
            if (f13612d != 0) {
                return "";
            }
            return a;
        }
        return a;
    }

    public static String d() {
        if (TextUtils.isEmpty(f13615g) && !f13614f) {
            e();
        }
        return f13615g;
    }

    public static String e() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.k() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f13614f) {
            return f13613e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.m().c().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
                jSONObject.put("amazonId", string);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    f13615g = jSONObject2;
                    f13613e = x.b(jSONObject2);
                }
            } catch (Settings.SettingNotFoundException e2) {
                ad.b("DomainSameDiTool", e2.getMessage());
            }
        } catch (Throwable th2) {
            ad.b("DomainSameDiTool", th2.getMessage());
        }
        f13614f = true;
        return f13613e;
    }

    public static void a(int i10) {
        f13612d = i10;
    }

    public static void a(final Context context) {
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.e.1
            @Override // java.lang.Runnable
            public final void run() {
                int i10;
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                    int i11 = 1;
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        e.a(advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        e.f13612d = i10;
                        e.a(context, advertisingIdInfo.getId(), e.f13612d);
                    } catch (Exception unused) {
                        ad.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                        try {
                            b.a a10 = new b().a(context);
                            e.a(a10.a());
                            if (!a10.b()) {
                                i11 = 0;
                            }
                            e.f13612d = i11;
                            e.a(context, a10.a(), e.f13612d);
                        } catch (Exception unused2) {
                            ad.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                        }
                    } catch (Throwable th2) {
                        ad.b("DomainSameDiTool", th2.getMessage());
                    }
                }
            }
        }).start();
    }

    public static void a(String str) {
        f13610b = x.b(str);
        a = str;
    }

    public static /* synthetic */ void a(Context context, String str, int i10) {
        try {
            if (an.b(str)) {
                al.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            al.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i10));
        } catch (Exception e2) {
            ad.b("DomainSameDiTool", e2.getMessage());
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

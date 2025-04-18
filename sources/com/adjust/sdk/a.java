package com.adjust.sdk;

import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.GooglePlayServicesClient;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {
    public String A;
    public String B;
    public int C;
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f2871b;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f2873d;

    /* renamed from: f, reason: collision with root package name */
    public String f2875f;

    /* renamed from: g, reason: collision with root package name */
    public String f2876g;

    /* renamed from: h, reason: collision with root package name */
    public String f2877h;

    /* renamed from: i, reason: collision with root package name */
    public String f2878i;

    /* renamed from: j, reason: collision with root package name */
    public String f2879j;

    /* renamed from: k, reason: collision with root package name */
    public String f2880k;

    /* renamed from: l, reason: collision with root package name */
    public String f2881l;

    /* renamed from: m, reason: collision with root package name */
    public String f2882m;

    /* renamed from: n, reason: collision with root package name */
    public String f2883n;

    /* renamed from: o, reason: collision with root package name */
    public String f2884o;

    /* renamed from: p, reason: collision with root package name */
    public String f2885p;

    /* renamed from: q, reason: collision with root package name */
    public String f2886q;

    /* renamed from: r, reason: collision with root package name */
    public String f2887r;

    /* renamed from: s, reason: collision with root package name */
    public String f2888s;

    /* renamed from: t, reason: collision with root package name */
    public String f2889t;
    public String u;

    /* renamed from: v, reason: collision with root package name */
    public String f2890v;

    /* renamed from: w, reason: collision with root package name */
    public String f2891w;

    /* renamed from: x, reason: collision with root package name */
    public String f2892x;

    /* renamed from: y, reason: collision with root package name */
    public String f2893y;

    /* renamed from: z, reason: collision with root package name */
    public String f2894z;

    /* renamed from: c, reason: collision with root package name */
    public int f2872c = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2874e = false;

    public a(Context context, String str) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        Locale locale = Util.getLocale(configuration);
        int i10 = configuration.screenLayout;
        this.f2878i = e(context);
        this.f2879j = c(context);
        this.f2880k = a(configuration);
        e();
        this.f2881l = Build.MODEL;
        d();
        this.f2882m = Build.MANUFACTURER;
        this.f2883n = "android";
        g();
        this.f2884o = Build.VERSION.RELEASE;
        this.f2885p = b();
        this.f2886q = b(locale);
        this.f2887r = a(locale);
        this.f2888s = b(i10);
        this.f2889t = a(i10);
        this.u = c(displayMetrics);
        this.f2890v = b(displayMetrics);
        this.f2891w = a(displayMetrics);
        this.f2877h = a(str);
        this.f2876g = d(context);
        f();
        this.f2892x = Build.DISPLAY;
        this.f2893y = a();
        this.f2894z = c();
        this.A = a(context);
        this.B = b(context);
        this.C = b(configuration);
    }

    public final String a() {
        String[] supportedAbis = Util.getSupportedAbis();
        return (supportedAbis == null || supportedAbis.length == 0) ? Util.getCpuAbi() : supportedAbis[0];
    }

    public final int b(Configuration configuration) {
        return configuration.uiMode & 15;
    }

    public final String c() {
        return Build.ID;
    }

    public final String d(Context context) {
        Cursor query;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(FbValidationUtils.FB_PACKAGE, 64).signatures;
            if (signatureArr == null || signatureArr.length != 1 || !"30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2".equals(signatureArr[0].toCharsString()) || (query = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null)) == null) {
                return null;
            }
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            String string = query.getString(query.getColumnIndex("aid"));
            query.close();
            return string;
        } catch (Exception unused) {
        }
        return null;
    }

    public final String e(Context context) {
        return context.getPackageName();
    }

    public final void f() {
        String str = Build.DISPLAY;
    }

    public final void g() {
        String str = Build.VERSION.RELEASE;
    }

    public final String a(int i10) {
        int i11 = i10 & 48;
        if (i11 == 16) {
            return Constants.NORMAL;
        }
        if (i11 != 32) {
            return null;
        }
        return Constants.LONG;
    }

    public final String b() {
        return "" + Build.VERSION.SDK_INT;
    }

    public final String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void d() {
        String str = Build.MANUFACTURER;
    }

    public final void e() {
        String str = Build.MODEL;
    }

    public final String a(Context context) {
        try {
            return Util.dateFormatter.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).firstInstallTime));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String b(int i10) {
        int i11 = i10 & 15;
        if (i11 == 1) {
            return Constants.SMALL;
        }
        if (i11 == 2) {
            return Constants.NORMAL;
        }
        if (i11 == 3) {
            return Constants.LARGE;
        }
        if (i11 != 4) {
            return null;
        }
        return Constants.XLARGE;
    }

    public final String c(DisplayMetrics displayMetrics) {
        int i10 = displayMetrics.densityDpi;
        if (i10 == 0) {
            return null;
        }
        return i10 < 140 ? Constants.LOW : i10 > 200 ? Constants.HIGH : Constants.MEDIUM;
    }

    public final String a(Configuration configuration) {
        if ((configuration.uiMode & 15) == 4) {
            return "tv";
        }
        int i10 = configuration.screenLayout & 15;
        if (i10 == 1 || i10 == 2) {
            return "phone";
        }
        if (i10 == 3 || i10 == 4) {
            return "tablet";
        }
        return null;
    }

    public final String b(Context context) {
        try {
            return Util.dateFormatter.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).lastUpdateTime));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String a(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.heightPixels);
    }

    public final String b(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.widthPixels);
    }

    public final String a(String str) {
        return str == null ? Constants.CLIENT_SDK : Util.formatString("%s@%s", str, Constants.CLIENT_SDK);
    }

    public final String b(Locale locale) {
        return locale.getLanguage();
    }

    public final String a(Locale locale) {
        return locale.getCountry();
    }

    public final void b(AdjustConfig adjustConfig) {
        if (Util.canReadPlayIds(adjustConfig)) {
            Context context = adjustConfig.context;
            String str = this.a;
            Boolean bool = this.f2873d;
            this.a = null;
            this.f2873d = null;
            this.f2871b = null;
            this.f2872c = -1;
            for (int i10 = 1; i10 <= 3; i10++) {
                try {
                    GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo = GooglePlayServicesClient.getGooglePlayServicesInfo(context, i10 * 3000);
                    if (this.a == null) {
                        this.a = googlePlayServicesInfo.getGpsAdid();
                    }
                    if (this.f2873d == null) {
                        this.f2873d = googlePlayServicesInfo.isTrackingEnabled();
                    }
                    if (this.a != null && this.f2873d != null) {
                        this.f2871b = NotificationCompat.CATEGORY_SERVICE;
                        this.f2872c = i10;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            for (int i11 = 1; i11 <= 3; i11++) {
                Object advertisingInfoObject = Util.getAdvertisingInfoObject(context, 11000L);
                if (advertisingInfoObject != null) {
                    if (this.a == null) {
                        this.a = Util.getPlayAdId(context, advertisingInfoObject, 1000L);
                    }
                    if (this.f2873d == null) {
                        this.f2873d = Util.isPlayTrackingEnabled(context, advertisingInfoObject, 1000L);
                    }
                    if (this.a != null && this.f2873d != null) {
                        this.f2871b = "library";
                        this.f2872c = i11;
                        return;
                    }
                }
            }
            if (this.a == null) {
                this.a = str;
            }
            if (this.f2873d == null) {
                this.f2873d = bool;
            }
        }
    }

    public final void a(AdjustConfig adjustConfig) {
        if (Util.canReadNonPlayIds(adjustConfig) && !this.f2874e) {
            this.f2875f = Util.getAndroidId(adjustConfig.context);
            this.f2874e = true;
        }
    }
}

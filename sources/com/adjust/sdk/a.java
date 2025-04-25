package com.adjust.sdk;

import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.GooglePlayServicesClient;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class a {
    public String A;
    public String B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public String f260a;
    public String b;
    public Boolean d;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;
    public int c = -1;
    public boolean e = false;

    public a(Context context, String str) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        Locale locale = Util.getLocale(configuration);
        int i = configuration.screenLayout;
        this.i = e(context);
        this.j = c(context);
        this.k = a(configuration);
        e();
        this.l = Build.MODEL;
        d();
        this.m = Build.MANUFACTURER;
        this.n = "android";
        g();
        this.o = Build.VERSION.RELEASE;
        this.p = b();
        this.q = b(locale);
        this.r = a(locale);
        this.s = b(i);
        this.t = a(i);
        this.u = c(displayMetrics);
        this.v = b(displayMetrics);
        this.w = a(displayMetrics);
        this.h = a(str);
        this.g = d(context);
        f();
        this.x = Build.DISPLAY;
        this.y = a();
        this.z = c();
        this.A = a(context);
        this.B = b(context);
        this.C = b(configuration);
    }

    public final String a() {
        String[] supportedAbis = Util.getSupportedAbis();
        return (supportedAbis == null || supportedAbis.length == 0) ? Util.getCpuAbi() : supportedAbis[0];
    }

    public final String a(int i) {
        int i2 = i & 48;
        if (i2 == 16) {
            return Constants.NORMAL;
        }
        if (i2 != 32) {
            return null;
        }
        return Constants.LONG;
    }

    public final String a(Context context) {
        try {
            return Util.dateFormatter.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).firstInstallTime));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String a(Configuration configuration) {
        if ((configuration.uiMode & 15) == 4) {
            return "tv";
        }
        int i = configuration.screenLayout & 15;
        if (i == 1 || i == 2) {
            return HintConstants.AUTOFILL_HINT_PHONE;
        }
        if (i == 3 || i == 4) {
            return "tablet";
        }
        return null;
    }

    public final String a(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.heightPixels);
    }

    public final String a(String str) {
        return str == null ? Constants.CLIENT_SDK : Util.formatString("%s@%s", str, Constants.CLIENT_SDK);
    }

    public final String a(Locale locale) {
        return locale.getCountry();
    }

    public final void a(AdjustConfig adjustConfig) {
        if (Util.canReadNonPlayIds(adjustConfig) && !this.e) {
            this.f = Util.getAndroidId(adjustConfig.context);
            this.e = true;
        }
    }

    public final int b(Configuration configuration) {
        return configuration.uiMode & 15;
    }

    public final String b() {
        return "" + Build.VERSION.SDK_INT;
    }

    public final String b(int i) {
        int i2 = i & 15;
        if (i2 == 1) {
            return Constants.SMALL;
        }
        if (i2 == 2) {
            return Constants.NORMAL;
        }
        if (i2 == 3) {
            return Constants.LARGE;
        }
        if (i2 != 4) {
            return null;
        }
        return Constants.XLARGE;
    }

    public final String b(Context context) {
        try {
            return Util.dateFormatter.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).lastUpdateTime));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String b(DisplayMetrics displayMetrics) {
        return String.valueOf(displayMetrics.widthPixels);
    }

    public final String b(Locale locale) {
        return locale.getLanguage();
    }

    public final void b(AdjustConfig adjustConfig) {
        if (Util.canReadPlayIds(adjustConfig)) {
            Context context = adjustConfig.context;
            String str = this.f260a;
            Boolean bool = this.d;
            this.f260a = null;
            this.d = null;
            this.b = null;
            this.c = -1;
            for (int i = 1; i <= 3; i++) {
                try {
                    GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo = GooglePlayServicesClient.getGooglePlayServicesInfo(context, i * 3000);
                    if (this.f260a == null) {
                        this.f260a = googlePlayServicesInfo.getGpsAdid();
                    }
                    if (this.d == null) {
                        this.d = googlePlayServicesInfo.isTrackingEnabled();
                    }
                    if (this.f260a != null && this.d != null) {
                        this.b = NotificationCompat.CATEGORY_SERVICE;
                        this.c = i;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            for (int i2 = 1; i2 <= 3; i2++) {
                Object advertisingInfoObject = Util.getAdvertisingInfoObject(context, 11000L);
                if (advertisingInfoObject != null) {
                    if (this.f260a == null) {
                        this.f260a = Util.getPlayAdId(context, advertisingInfoObject, 1000L);
                    }
                    if (this.d == null) {
                        this.d = Util.isPlayTrackingEnabled(context, advertisingInfoObject, 1000L);
                    }
                    if (this.f260a != null && this.d != null) {
                        this.b = "library";
                        this.c = i2;
                        return;
                    }
                }
            }
            if (this.f260a == null) {
                this.f260a = str;
            }
            if (this.d == null) {
                this.d = bool;
            }
        }
    }

    public final String c() {
        return Build.ID;
    }

    public final String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String c(DisplayMetrics displayMetrics) {
        int i = displayMetrics.densityDpi;
        if (i == 0) {
            return null;
        }
        return i < 140 ? Constants.LOW : i > 200 ? Constants.HIGH : "medium";
    }

    public final String d(Context context) {
        Cursor query;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.facebook.katana", 64).signatures;
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

    public final void d() {
        String str = Build.MANUFACTURER;
    }

    public final String e(Context context) {
        return context.getPackageName();
    }

    public final void e() {
        String str = Build.MODEL;
    }

    public final void f() {
        String str = Build.DISPLAY;
    }

    public final void g() {
        String str = Build.VERSION.RELEASE;
    }
}

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

    /* renamed from: A, reason: collision with root package name */
    public String f5557A;

    /* renamed from: B, reason: collision with root package name */
    public String f5558B;

    /* renamed from: C, reason: collision with root package name */
    public int f5559C;

    /* renamed from: a, reason: collision with root package name */
    public String f5560a;
    public String b;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f5562d;

    /* renamed from: f, reason: collision with root package name */
    public String f5564f;

    /* renamed from: g, reason: collision with root package name */
    public String f5565g;

    /* renamed from: h, reason: collision with root package name */
    public String f5566h;

    /* renamed from: i, reason: collision with root package name */
    public String f5567i;

    /* renamed from: j, reason: collision with root package name */
    public String f5568j;

    /* renamed from: k, reason: collision with root package name */
    public String f5569k;
    public String l;
    public String m;

    /* renamed from: n, reason: collision with root package name */
    public String f5570n;

    /* renamed from: o, reason: collision with root package name */
    public String f5571o;

    /* renamed from: p, reason: collision with root package name */
    public String f5572p;

    /* renamed from: q, reason: collision with root package name */
    public String f5573q;

    /* renamed from: r, reason: collision with root package name */
    public String f5574r;

    /* renamed from: s, reason: collision with root package name */
    public String f5575s;

    /* renamed from: t, reason: collision with root package name */
    public String f5576t;

    /* renamed from: u, reason: collision with root package name */
    public String f5577u;

    /* renamed from: v, reason: collision with root package name */
    public String f5578v;

    /* renamed from: w, reason: collision with root package name */
    public String f5579w;

    /* renamed from: x, reason: collision with root package name */
    public String f5580x;

    /* renamed from: y, reason: collision with root package name */
    public String f5581y;

    /* renamed from: z, reason: collision with root package name */
    public String f5582z;

    /* renamed from: c, reason: collision with root package name */
    public int f5561c = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5563e = false;

    public a(Context context, String str) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        Locale locale = Util.getLocale(configuration);
        int i9 = configuration.screenLayout;
        this.f5567i = e(context);
        this.f5568j = c(context);
        this.f5569k = a(configuration);
        e();
        this.l = Build.MODEL;
        d();
        this.m = Build.MANUFACTURER;
        this.f5570n = "android";
        g();
        this.f5571o = Build.VERSION.RELEASE;
        this.f5572p = b();
        this.f5573q = b(locale);
        this.f5574r = a(locale);
        this.f5575s = b(i9);
        this.f5576t = a(i9);
        this.f5577u = c(displayMetrics);
        this.f5578v = b(displayMetrics);
        this.f5579w = a(displayMetrics);
        this.f5566h = a(str);
        this.f5565g = d(context);
        f();
        this.f5580x = Build.DISPLAY;
        this.f5581y = a();
        this.f5582z = c();
        this.f5557A = a(context);
        this.f5558B = b(context);
        this.f5559C = b(configuration);
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

    public final String a(int i9) {
        int i10 = i9 & 48;
        if (i10 == 16) {
            return Constants.NORMAL;
        }
        if (i10 != 32) {
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

    public final String b(int i9) {
        int i10 = i9 & 15;
        if (i10 == 1) {
            return Constants.SMALL;
        }
        if (i10 == 2) {
            return Constants.NORMAL;
        }
        if (i10 == 3) {
            return Constants.LARGE;
        }
        if (i10 != 4) {
            return null;
        }
        return Constants.XLARGE;
    }

    public final String c(DisplayMetrics displayMetrics) {
        int i9 = displayMetrics.densityDpi;
        if (i9 == 0) {
            return null;
        }
        return i9 < 140 ? Constants.LOW : i9 > 200 ? Constants.HIGH : Constants.MEDIUM;
    }

    public final String a(Configuration configuration) {
        if ((configuration.uiMode & 15) == 4) {
            return "tv";
        }
        int i9 = configuration.screenLayout & 15;
        if (i9 == 1 || i9 == 2) {
            return "phone";
        }
        if (i9 == 3 || i9 == 4) {
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
            String str = this.f5560a;
            Boolean bool = this.f5562d;
            this.f5560a = null;
            this.f5562d = null;
            this.b = null;
            this.f5561c = -1;
            for (int i9 = 1; i9 <= 3; i9++) {
                try {
                    GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo = GooglePlayServicesClient.getGooglePlayServicesInfo(context, i9 * 3000);
                    if (this.f5560a == null) {
                        this.f5560a = googlePlayServicesInfo.getGpsAdid();
                    }
                    if (this.f5562d == null) {
                        this.f5562d = googlePlayServicesInfo.isTrackingEnabled();
                    }
                    if (this.f5560a != null && this.f5562d != null) {
                        this.b = NotificationCompat.CATEGORY_SERVICE;
                        this.f5561c = i9;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            for (int i10 = 1; i10 <= 3; i10++) {
                Object advertisingInfoObject = Util.getAdvertisingInfoObject(context, 11000L);
                if (advertisingInfoObject != null) {
                    if (this.f5560a == null) {
                        this.f5560a = Util.getPlayAdId(context, advertisingInfoObject, 1000L);
                    }
                    if (this.f5562d == null) {
                        this.f5562d = Util.isPlayTrackingEnabled(context, advertisingInfoObject, 1000L);
                    }
                    if (this.f5560a != null && this.f5562d != null) {
                        this.b = "library";
                        this.f5561c = i10;
                        return;
                    }
                }
            }
            if (this.f5560a == null) {
                this.f5560a = str;
            }
            if (this.f5562d == null) {
                this.f5562d = bool;
            }
        }
    }

    public final void a(AdjustConfig adjustConfig) {
        if (Util.canReadNonPlayIds(adjustConfig) && !this.f5563e) {
            this.f5564f = Util.getAndroidId(adjustConfig.context);
            this.f5563e = true;
        }
    }
}

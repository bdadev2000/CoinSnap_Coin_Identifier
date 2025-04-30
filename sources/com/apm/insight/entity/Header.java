package com.apm.insight.entity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.apm.insight.i;
import com.apm.insight.l.p;
import com.apm.insight.l.q;
import com.apm.insight.runtime.s;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Header {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f5753a = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: d, reason: collision with root package name */
    private static String f5754d = null;

    /* renamed from: e, reason: collision with root package name */
    private static int f5755e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static int f5756f = -1;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f5757c = new JSONObject();

    public Header(Context context) {
        this.b = context;
    }

    public static Header a(Context context) {
        Header header = new Header(context);
        header.e(header.f());
        return header;
    }

    @Keep
    public static void addOtherHeader(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        h(jSONObject);
        f(jSONObject);
        g(jSONObject);
        try {
            jSONObject.put("os", "Android");
            jSONObject.put("device_id", i.c().a());
            jSONObject.put("os_version", h());
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str = Build.MODEL;
            String str2 = Build.BRAND;
            if (str == null) {
                str = str2;
            } else if (str2 != null && !str.contains(str2)) {
                str = str2 + ' ' + str;
            }
            jSONObject.put("device_model", str);
            jSONObject.put("device_brand", str2);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("cpu_abi", g());
            Context g9 = i.g();
            String packageName = g9.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = g9.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i9 = applicationInfo.labelRes;
                jSONObject.put("display_name", i9 > 0 ? g9.getString(i9) : g9.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d.a(jSONObject);
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        i(jSONObject);
        j(jSONObject);
    }

    public static Header b(Context context) {
        Header a6 = a(context);
        a(a6);
        b(a6);
        a6.c();
        a6.d();
        a6.e();
        return a6;
    }

    private static String g() {
        if (f5754d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    int i9 = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i9 >= strArr.length) {
                            break;
                        }
                        sb.append(strArr[i9]);
                        if (i9 != strArr.length - 1) {
                            sb.append(", ");
                        }
                        i9++;
                    }
                } else {
                    sb = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f5754d = AppLovinMediationProvider.UNKNOWN;
                }
                f5754d = sb.toString();
            } catch (Exception e4) {
                q.b((Throwable) e4);
                f5754d = AppLovinMediationProvider.UNKNOWN;
            }
        }
        return f5754d;
    }

    private static String h() {
        String str = Build.VERSION.RELEASE;
        return str.contains(".") ? str : str.concat(".0");
    }

    private static void i(JSONObject jSONObject) {
        try {
            jSONObject.put("access", p.a(i.g()));
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    private static void j(JSONObject jSONObject) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) i.g().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put("carrier", networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public JSONObject c() {
        return a(i.a().a());
    }

    public JSONObject d() {
        try {
            this.f5757c.put("device_id", i.c().a());
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return this.f5757c;
    }

    public JSONObject e() {
        try {
            long f9 = i.a().f();
            if (f9 > 0) {
                this.f5757c.put("user_id", f9);
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return this.f5757c;
    }

    public JSONObject f() {
        return this.f5757c;
    }

    public static Header a(Context context, long j7) {
        Header a6;
        s a9 = s.a();
        if (j7 == 0) {
            j7 = System.currentTimeMillis();
        }
        JSONObject a10 = a9.a(j7);
        if (a10 == null || a10.length() == 0) {
            a6 = a(i.g());
            a6.c();
            try {
                a6.f().put("errHeader", 1);
            } catch (Throwable unused) {
            }
        } else {
            a6 = new Header(i.g());
        }
        b(a6);
        a6.a(a10);
        return a6;
    }

    public static void b(Header header) {
        if (header == null) {
            return;
        }
        addOtherHeader(header.f());
    }

    public static boolean c(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0 || (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    public static boolean d(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String optString = jSONObject.optString("aid");
            if (TextUtils.isEmpty(optString)) {
                return true;
            }
            try {
                return Integer.parseInt(optString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    private void e(JSONObject jSONObject) {
        try {
            jSONObject.put("sdk_version", 1030839);
            jSONObject.put("sdk_version_name", "1.3.8.nourl-alpha.19");
        } catch (Exception unused) {
        }
    }

    private static void f(JSONObject jSONObject) {
        try {
            DisplayMetrics displayMetrics = i.g().getResources().getDisplayMetrics();
            int i9 = displayMetrics.densityDpi;
            String str = i9 != 120 ? i9 != 240 ? i9 != 320 ? "mdpi" : "xhdpi" : "hdpi" : "ldpi";
            jSONObject.put("density_dpi", i9);
            jSONObject.put("display_density", str);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused) {
        }
    }

    private static void g(JSONObject jSONObject) {
        try {
            String language = i.g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x0005, B:6:0x000d, B:7:0x0035, B:9:0x0040, B:10:0x0049, B:14:0x0011, B:17:0x001a, B:19:0x0024, B:20:0x0029, B:22:0x002f), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(org.json.JSONObject r3) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = com.apm.insight.l.d.c()     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L11
            java.lang.String r1 = "MIUI-"
        Ld:
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            goto L35
        L11:
            boolean r1 = com.apm.insight.l.d.d()     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L1a
            java.lang.String r1 = "FLYME-"
            goto Ld
        L1a:
            java.lang.String r1 = com.apm.insight.l.d.a()     // Catch: java.lang.Throwable -> L52
            boolean r2 = com.apm.insight.l.d.a(r1)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L29
            java.lang.String r2 = "EMUI-"
            r0.append(r2)     // Catch: java.lang.Throwable -> L52
        L29:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L35
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "-"
            goto Ld
        L35:
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL     // Catch: java.lang.Throwable -> L52
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L52
            if (r1 <= 0) goto L49
            java.lang.String r1 = "rom"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L52
        L49:
            java.lang.String r0 = "rom_version"
            java.lang.String r1 = com.apm.insight.l.t.a()     // Catch: java.lang.Throwable -> L52
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L52
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.entity.Header.h(org.json.JSONObject):void");
    }

    public static Header a(Header header) {
        addRuntimeHeader(header.f());
        return header;
    }

    public static boolean b() {
        if (f5756f == -1) {
            f5756f = g().contains("86") ? 1 : 0;
        }
        return f5756f == 1;
    }

    public static boolean b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    public JSONObject a(@Nullable Map<String, Object> map) {
        if (map == null) {
            return this.f5757c;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!this.f5757c.has(entry.getKey())) {
                this.f5757c.put(entry.getKey(), entry.getValue());
            }
        }
        for (String str : f5753a) {
            if (map.containsKey(str)) {
                try {
                    this.f5757c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Throwable unused) {
                    this.f5757c.put(str, map.get(str));
                }
            }
        }
        if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
            try {
                this.f5757c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
            } catch (Throwable unused2) {
            }
        }
        if (map.containsKey("iid")) {
            this.f5757c.put("udid", map.get("iid"));
            this.f5757c.remove("iid");
        }
        if (map.containsKey("version_name")) {
            this.f5757c.put("app_version", map.get("version_name"));
            this.f5757c.remove("version_name");
        }
        return this.f5757c;
    }

    public JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f5757c;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                this.f5757c.put(next, jSONObject.opt(next));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        return this.f5757c;
    }

    public static boolean a() {
        if (f5755e == -1) {
            f5755e = g().contains("64") ? 1 : 0;
        }
        return f5755e == 1;
    }
}

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u0 {
    public static final u0 a = new u0();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f11413b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f11414c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final t0 f11415d = new t0(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e, reason: collision with root package name */
    public static final t0 f11416e = new t0(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f, reason: collision with root package name */
    public static final t0 f11417f = new t0(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g, reason: collision with root package name */
    public static final t0 f11418g = new t0(false, "auto_event_setup_enabled");

    /* renamed from: h, reason: collision with root package name */
    public static final t0 f11419h = new t0(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i, reason: collision with root package name */
    public static SharedPreferences f11420i;

    public static final boolean a() {
        if (m6.a.b(u0.class)) {
            return false;
        }
        try {
            a.d();
            return f11417f.a();
        } catch (Throwable th2) {
            m6.a.a(u0.class, th2);
            return false;
        }
    }

    public static final boolean b() {
        if (m6.a.b(u0.class)) {
            return false;
        }
        try {
            a.d();
            return f11416e.a();
        } catch (Throwable th2) {
            m6.a.a(u0.class, th2);
            return false;
        }
    }

    public final void c() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            t0 t0Var = f11418g;
            h(t0Var);
            final long currentTimeMillis = System.currentTimeMillis();
            if (t0Var.f11400c != null && currentTimeMillis - t0Var.f11401d < 604800000) {
                return;
            }
            t0Var.f11400c = null;
            t0Var.f11401d = 0L;
            if (!f11414c.compareAndSet(false, true)) {
                return;
            }
            x.c().execute(new Runnable() { // from class: com.facebook.s0
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    long j3 = currentTimeMillis;
                    if (!m6.a.b(u0.class)) {
                        try {
                            if (u0.f11417f.a()) {
                                com.facebook.internal.z zVar = com.facebook.internal.z.a;
                                com.facebook.internal.x f10 = com.facebook.internal.z.f(x.b(), false);
                                if (f10 != null && f10.f11127h) {
                                    com.facebook.internal.c y4 = b.y(x.a());
                                    if (y4 != null && y4.a() != null) {
                                        str = y4.a();
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", str);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str2 = g0.f11000j;
                                        g0 y10 = c.y(null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null);
                                        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
                                        y10.f11006d = bundle;
                                        JSONObject jSONObject = y10.c().f11167b;
                                        if (jSONObject != null) {
                                            t0 t0Var2 = u0.f11418g;
                                            t0Var2.f11400c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            t0Var2.f11401d = j3;
                                            u0.a.j(t0Var2);
                                        }
                                    }
                                }
                            }
                            u0.f11414c.set(false);
                        } catch (Throwable th2) {
                            m6.a.a(u0.class, th2);
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void d() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (!x.h()) {
                return;
            }
            int i10 = 0;
            if (!f11413b.compareAndSet(false, true)) {
                return;
            }
            SharedPreferences sharedPreferences = x.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            f11420i = sharedPreferences;
            t0[] t0VarArr = {f11416e, f11417f, f11415d};
            if (!m6.a.b(this)) {
                while (i10 < 3) {
                    try {
                        t0 t0Var = t0VarArr[i10];
                        i10++;
                        if (t0Var == f11418g) {
                            c();
                        } else if (t0Var.f11400c == null) {
                            h(t0Var);
                            if (t0Var.f11400c == null) {
                                e(t0Var);
                            }
                        } else {
                            j(t0Var);
                        }
                    } catch (Throwable th2) {
                        m6.a.a(this, th2);
                    }
                }
            }
            c();
            g();
            f();
        } catch (Throwable th3) {
            m6.a.a(this, th3);
        }
    }

    public final void e(t0 t0Var) {
        String str = t0Var.f11399b;
        if (m6.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                Context a10 = x.a();
                ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.containsKey(str)) {
                    t0Var.f11400c = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, t0Var.a));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                x xVar = x.a;
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.u0.f():void");
    }

    public final void g() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            Context a10 = x.a();
            ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w("com.facebook.u0", "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w("com.facebook.u0", "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!a()) {
                    Log.w("com.facebook.u0", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void h(t0 t0Var) {
        boolean z10;
        String str = "";
        if (m6.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                SharedPreferences sharedPreferences = f11420i;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(t0Var.f11399b, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        JSONObject jSONObject = new JSONObject(str);
                        t0Var.f11400c = Boolean.valueOf(jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        t0Var.f11401d = jSONObject.getLong("last_timestamp");
                        return;
                    }
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                throw null;
            } catch (JSONException unused) {
                x xVar = x.a;
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void i() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (f11413b.get()) {
            } else {
                throw new y("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void j(t0 t0Var) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, t0Var.f11400c);
                jSONObject.put("last_timestamp", t0Var.f11401d);
                SharedPreferences sharedPreferences = f11420i;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(t0Var.f11399b, jSONObject.toString()).apply();
                    f();
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    throw null;
                }
            } catch (Exception unused) {
                x xVar = x.a;
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}

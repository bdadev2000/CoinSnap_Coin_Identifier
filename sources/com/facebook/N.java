package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.C1834c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final N f13431a = new Object();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f13432c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final M f13433d = new M(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e, reason: collision with root package name */
    public static final M f13434e = new M(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f, reason: collision with root package name */
    public static final M f13435f = new M(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g, reason: collision with root package name */
    public static final M f13436g = new M(false, "auto_event_setup_enabled");

    /* renamed from: h, reason: collision with root package name */
    public static final M f13437h = new M(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i, reason: collision with root package name */
    public static SharedPreferences f13438i;

    public static final boolean a() {
        if (O2.a.b(N.class)) {
            return false;
        }
        try {
            f13431a.d();
            return f13435f.a();
        } catch (Throwable th) {
            O2.a.a(N.class, th);
            return false;
        }
    }

    public static final boolean b() {
        if (O2.a.b(N.class)) {
            return false;
        }
        try {
            f13431a.d();
            return f13434e.a();
        } catch (Throwable th) {
            O2.a.a(N.class, th);
            return false;
        }
    }

    public final void c() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            M m = f13436g;
            h(m);
            final long currentTimeMillis = System.currentTimeMillis();
            if (m.f13429c != null && currentTimeMillis - m.f13430d < 604800000) {
                return;
            }
            m.f13429c = null;
            m.f13430d = 0L;
            if (!f13432c.compareAndSet(false, true)) {
                return;
            }
            r.c().execute(new Runnable() { // from class: com.facebook.L
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    long j7 = currentTimeMillis;
                    if (!O2.a.b(N.class)) {
                        try {
                            if (N.f13435f.a()) {
                                com.facebook.internal.w wVar = com.facebook.internal.w.f13674a;
                                com.facebook.internal.t f9 = com.facebook.internal.w.f(r.b(), false);
                                if (f9 != null && f9.f13663g) {
                                    C1834c b8 = AbstractC1839h.b(r.a());
                                    if (b8 != null && b8.a() != null) {
                                        str = b8.a();
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", str);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str2 = C.f13380j;
                                        C w2 = R3.e.w(null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null);
                                        w2.f13384d = bundle;
                                        JSONObject jSONObject = w2.c().b;
                                        if (jSONObject != null) {
                                            M m2 = N.f13436g;
                                            m2.f13429c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            m2.f13430d = j7;
                                            N.f13431a.j(m2);
                                        }
                                    }
                                }
                            }
                            N.f13432c.set(false);
                        } catch (Throwable th) {
                            O2.a.a(N.class, th);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final void d() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (!r.f13812o.get()) {
                return;
            }
            int i9 = 0;
            if (!b.compareAndSet(false, true)) {
                return;
            }
            SharedPreferences sharedPreferences = r.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            G7.j.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            f13438i = sharedPreferences;
            M[] mArr = {f13434e, f13435f, f13433d};
            if (!O2.a.b(this)) {
                while (i9 < 3) {
                    try {
                        M m = mArr[i9];
                        i9++;
                        if (m == f13436g) {
                            c();
                        } else if (m.f13429c == null) {
                            h(m);
                            if (m.f13429c == null) {
                                e(m);
                            }
                        } else {
                            j(m);
                        }
                    } catch (Throwable th) {
                        O2.a.a(this, th);
                    }
                }
            }
            c();
            g();
            f();
        } catch (Throwable th2) {
            O2.a.a(this, th2);
        }
    }

    public final void e(M m) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                Context a6 = r.a();
                ApplicationInfo applicationInfo = a6.getPackageManager().getApplicationInfo(a6.getPackageName(), 128);
                G7.j.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.containsKey(m.b)) {
                    m.f13429c = Boolean.valueOf(applicationInfo.metaData.getBoolean(m.b, m.f13428a));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                r rVar = r.f13801a;
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da A[Catch: all -> 0x00a9, TryCatch #0 {all -> 0x00a9, blocks: (B:6:0x000b, B:9:0x0014, B:12:0x001d, B:16:0x004a, B:18:0x0050, B:20:0x0054, B:22:0x005f, B:24:0x0076, B:28:0x008c, B:34:0x00b5, B:37:0x00e2, B:39:0x00da, B:48:0x00e8, B:49:0x00eb, B:51:0x00ed, B:52:0x00f0), top: B:5:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.N.f():void");
    }

    public final void g() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            Context a6 = r.a();
            ApplicationInfo applicationInfo = a6.getPackageManager().getApplicationInfo(a6.getPackageName(), 128);
            G7.j.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w("com.facebook.N", "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w("com.facebook.N", "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!a()) {
                    Log.w("com.facebook.N", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final void h(M m) {
        String str = "";
        if (O2.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                SharedPreferences sharedPreferences = f13438i;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(m.b, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        m.f13429c = Boolean.valueOf(jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        m.f13430d = jSONObject.getLong("last_timestamp");
                        return;
                    }
                    return;
                }
                G7.j.k("userSettingPref");
                throw null;
            } catch (JSONException unused) {
                r rVar = r.f13801a;
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final void i() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (b.get()) {
            } else {
                throw new C1849l("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final void j(M m) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, m.f13429c);
                jSONObject.put("last_timestamp", m.f13430d);
                SharedPreferences sharedPreferences = f13438i;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(m.b, jSONObject.toString()).apply();
                    f();
                } else {
                    G7.j.k("userSettingPref");
                    throw null;
                }
            } catch (Exception unused) {
                r rVar = r.f13801a;
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}

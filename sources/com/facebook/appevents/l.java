package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.d0;
import com.facebook.internal.m0;
import com.facebook.x;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: c */
    public static final String f10951c;

    /* renamed from: d */
    public static ScheduledThreadPoolExecutor f10952d;

    /* renamed from: e */
    public static final Object f10953e;

    /* renamed from: f */
    public static String f10954f;

    /* renamed from: g */
    public static boolean f10955g;
    public final String a;

    /* renamed from: b */
    public final b f10956b;

    static {
        new com.facebook.b(15, 0);
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f10951c = canonicalName;
        f10953e = new Object();
    }

    public l(String activityName, String str) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        x5.i.s();
        this.a = activityName;
        Date date = com.facebook.a.f10880n;
        com.facebook.a accessToken = z1.d.n();
        if (accessToken != null && !new Date().after(accessToken.f10883b) && (str == null || Intrinsics.areEqual(str, accessToken.f10890j))) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            this.f10956b = new b(accessToken.f10887g, x.b());
        } else {
            this.f10956b = new b(null, str == null ? m0.p(x.a()) : str);
        }
        com.facebook.b.J();
    }

    public static final /* synthetic */ String a() {
        if (m6.a.b(l.class)) {
            return null;
        }
        try {
            return f10954f;
        } catch (Throwable th2) {
            m6.a.a(l.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (m6.a.b(l.class)) {
            return null;
        }
        try {
            return f10952d;
        } catch (Throwable th2) {
            m6.a.a(l.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ Object c() {
        if (m6.a.b(l.class)) {
            return null;
        }
        try {
            return f10953e;
        } catch (Throwable th2) {
            m6.a.a(l.class, th2);
            return null;
        }
    }

    public final void d(Bundle bundle, String str) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, false, c6.b.a());
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void e(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        boolean z11;
        boolean z12;
        if (!m6.a.b(this) && str != null) {
            try {
                if (str.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    AtomicBoolean atomicBoolean = com.facebook.internal.w.a;
                    boolean b3 = com.facebook.internal.w.b("app_events_killswitch", x.b(), false);
                    com.facebook.m0 m0Var = com.facebook.m0.APP_EVENTS;
                    if (b3) {
                        com.facebook.internal.m mVar = d0.f11030d;
                        com.facebook.internal.m.o(m0Var, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                        return;
                    }
                    try {
                        b6.b.k(bundle, str);
                        b6.d.b(bundle);
                        String str2 = this.a;
                        if (c6.b.f2625j == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        com.facebook.b.s(new e(str2, str, d10, bundle, z10, z12, uuid), this.f10956b);
                    } catch (com.facebook.q e2) {
                        com.facebook.internal.m mVar2 = d0.f11030d;
                        com.facebook.internal.m.o(m0Var, "AppEvents", "Invalid app event: %s", e2.toString());
                    } catch (JSONException e10) {
                        com.facebook.internal.m mVar3 = d0.f11030d;
                        com.facebook.internal.m.o(m0Var, "AppEvents", "JSON encoding for app event failed: '%s'", e10.toString());
                    }
                }
            } catch (Throwable th2) {
                m6.a.a(this, th2);
            }
        }
    }

    public final void f(String str, Bundle bundle) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, true, c6.b.a());
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final void g(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10) {
        if (m6.a.b(this)) {
            return;
        }
        com.facebook.m0 m0Var = com.facebook.m0.DEVELOPER_ERRORS;
        try {
            if (bigDecimal == null) {
                com.facebook.internal.m mVar = d0.f11030d;
                com.facebook.internal.m.n(m0Var, "AppEvents", "purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                com.facebook.internal.m mVar2 = d0.f11030d;
                com.facebook.internal.m.n(m0Var, "AppEvents", "currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z10, c6.b.a());
            if (com.facebook.b.z() != j.EXPLICIT_ONLY) {
                kc.c cVar = h.a;
                h.c(p.EAGER_FLUSHING_EVENT);
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public l(Context context, String str) {
        this(m0.k(context), str);
    }
}

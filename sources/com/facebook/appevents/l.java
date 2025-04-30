package com.facebook.appevents;

import a5.C0398b;
import android.content.Context;
import android.os.Bundle;
import com.facebook.C0785a;
import com.facebook.C1849l;
import com.facebook.H;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.z;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c */
    public static final String f13492c;

    /* renamed from: d */
    public static ScheduledThreadPoolExecutor f13493d;

    /* renamed from: e */
    public static final Object f13494e;

    /* renamed from: f */
    public static String f13495f;

    /* renamed from: g */
    public static boolean f13496g;

    /* renamed from: a */
    public final String f13497a;
    public final b b;

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f13492c = canonicalName;
        f13494e = new Object();
    }

    public l(String str, String str2) {
        AbstractC1839h.k();
        this.f13497a = str;
        Date date = C0785a.f13439n;
        C0785a m = g.m();
        if (m != null && !new Date().after(m.b) && (str2 == null || str2.equals(m.f13448j))) {
            this.b = new b(m.f13445g, com.facebook.r.b());
        } else {
            if (str2 == null) {
                com.facebook.r.a();
                str2 = com.facebook.r.b();
            }
            this.b = new b(null, str2);
        }
        C0398b.y();
    }

    public static final /* synthetic */ String a() {
        if (O2.a.b(l.class)) {
            return null;
        }
        try {
            return f13495f;
        } catch (Throwable th) {
            O2.a.a(l.class, th);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (O2.a.b(l.class)) {
            return null;
        }
        try {
            return f13493d;
        } catch (Throwable th) {
            O2.a.a(l.class, th);
            return null;
        }
    }

    public static final /* synthetic */ Object c() {
        if (O2.a.b(l.class)) {
            return null;
        }
        try {
            return f13494e;
        } catch (Throwable th) {
            O2.a.a(l.class, th);
            return null;
        }
    }

    public final void d(Bundle bundle, String str) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, false, E2.d.b());
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final void e(String str, Double d2, Bundle bundle, boolean z8, UUID uuid) {
        if (!O2.a.b(this) && str != null) {
            try {
                if (str.length() != 0) {
                    AtomicBoolean atomicBoolean = com.facebook.internal.s.f13654a;
                    boolean z9 = false;
                    boolean b = com.facebook.internal.s.b("app_events_killswitch", com.facebook.r.b(), false);
                    H h6 = H.f13413f;
                    if (b) {
                        L4.f fVar = z.f13680c;
                        com.facebook.r.h(h6);
                        return;
                    }
                    try {
                        try {
                            D2.b.e(bundle, str);
                            D2.d.b(bundle);
                            String str2 = this.f13497a;
                            if (E2.d.f988j == 0) {
                                z9 = true;
                            }
                            C0398b.r(new e(str2, str, d2, bundle, z8, z9, uuid), this.b);
                        } catch (C1849l e4) {
                            L4.f fVar2 = z.f13680c;
                            e4.toString();
                            com.facebook.r.h(h6);
                        }
                    } catch (JSONException e9) {
                        L4.f fVar3 = z.f13680c;
                        e9.toString();
                        com.facebook.r.h(h6);
                    }
                }
            } catch (Throwable th) {
                O2.a.a(this, th);
            }
        }
    }

    public final void f(Bundle bundle, String str) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            e(str, null, bundle, true, E2.d.b());
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final void g(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z8) {
        if (O2.a.b(this)) {
            return;
        }
        H h6 = H.f13414g;
        try {
            if (bigDecimal == null) {
                L4.f fVar = z.f13680c;
                L4.f.l(h6, "AppEvents", "purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                L4.f fVar2 = z.f13680c;
                L4.f.l(h6, "AppEvents", "currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            e("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z8, E2.d.b());
            if (C0398b.u() != j.f13488c) {
                D0.i iVar = h.f13483a;
                h.c(o.f13508f);
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public l(Context context, String str) {
        this(com.facebook.internal.H.k(context), str);
    }
}

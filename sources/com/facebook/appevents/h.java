package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.recyclerview.widget.s0;
import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.g0;
import com.facebook.internal.d0;
import com.facebook.internal.x;
import com.facebook.internal.z;
import com.facebook.k0;
import com.facebook.m0;
import com.facebook.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: c, reason: collision with root package name */
    public static ScheduledFuture f10944c;
    public static volatile kc.c a = new kc.c(26);

    /* renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f10943b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f10945d = new g0(2);

    public static final com.facebook.g0 a(b accessTokenAppId, u appEvents, boolean z10, s0 flushState) {
        if (m6.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            String str = accessTokenAppId.f10923b;
            boolean z11 = false;
            x f10 = z.f(str, false);
            String str2 = com.facebook.g0.f11000j;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            com.facebook.g0 A = com.facebook.c.A(null, format, null, null);
            A.f11011i = true;
            Bundle bundle = A.f11006d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", accessTokenAppId.f10924c);
            com.facebook.c cVar = r.f10969b;
            synchronized (l.c()) {
                m6.a.b(l.class);
            }
            String str3 = l.f10951c;
            String A2 = com.facebook.b.A();
            if (A2 != null) {
                bundle.putString(Constants.INSTALL_REFERRER, A2);
            }
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            A.f11006d = bundle;
            if (f10 != null) {
                z11 = f10.a;
            }
            int d10 = appEvents.d(A, com.facebook.x.a(), z11, z10);
            if (d10 == 0) {
                return null;
            }
            flushState.f2031b += d10;
            A.j(new com.facebook.e(1, accessTokenAppId, A, appEvents, flushState));
            return A;
        } catch (Throwable th2) {
            m6.a.a(h.class, th2);
            return null;
        }
    }

    public static final ArrayList b(kc.c appEventCollection, s0 flushResults) {
        u uVar;
        if (m6.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            boolean f10 = com.facebook.x.f(com.facebook.x.a());
            ArrayList arrayList = new ArrayList();
            for (b accessTokenAppIdPair : appEventCollection.t()) {
                synchronized (appEventCollection) {
                    Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                    uVar = (u) ((HashMap) appEventCollection.f20640c).get(accessTokenAppIdPair);
                }
                if (uVar != null) {
                    com.facebook.g0 request = a(accessTokenAppIdPair, uVar, f10, flushResults);
                    if (request != null) {
                        arrayList.add(request);
                        if (w5.d.a) {
                            HashSet hashSet = w5.l.a;
                            Intrinsics.checkNotNullParameter(request, "request");
                            try {
                                com.facebook.x.c().execute(new androidx.activity.d(request, 18));
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            m6.a.a(h.class, th2);
            return null;
        }
    }

    public static final void c(p reason) {
        if (m6.a.b(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f10943b.execute(new androidx.activity.d(reason, 17));
        } catch (Throwable th2) {
            m6.a.a(h.class, th2);
        }
    }

    public static final void d(p reason) {
        if (m6.a.b(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            a.h(g.F());
            try {
                s0 f10 = f(reason, a);
                if (f10 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f10.f2031b);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (q) f10.f2032c);
                    m1.b.a(com.facebook.x.a()).c(intent);
                }
            } catch (Exception e2) {
                Log.w("com.facebook.appevents.h", "Caught unexpected exception while flushing app events: ", e2);
            }
        } catch (Throwable th2) {
            m6.a.a(h.class, th2);
        }
    }

    public static final void e(s0 flushState, com.facebook.g0 request, k0 response, b accessTokenAppId, u appEvents) {
        q qVar;
        if (m6.a.b(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            com.facebook.u uVar = response.f11168c;
            q qVar2 = q.SUCCESS;
            q qVar3 = q.NO_CONNECTIVITY;
            boolean z10 = true;
            if (uVar != null) {
                if (uVar.f11405c == -1) {
                    qVar = qVar3;
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), uVar.toString()}, 2)), "java.lang.String.format(format, *args)");
                    qVar = q.SERVER_ERROR;
                }
            } else {
                qVar = qVar2;
            }
            com.facebook.x xVar = com.facebook.x.a;
            com.facebook.x.i(m0.APP_EVENTS);
            if (uVar == null) {
                z10 = false;
            }
            appEvents.b(z10);
            if (qVar == qVar3) {
                com.facebook.x.c().execute(new r0(2, accessTokenAppId, appEvents));
            }
            if (qVar != qVar2 && ((q) flushState.f2032c) != qVar3) {
                Intrinsics.checkNotNullParameter(qVar, "<set-?>");
                flushState.f2032c = qVar;
            }
        } catch (Throwable th2) {
            m6.a.a(h.class, th2);
        }
    }

    public static final s0 f(p reason, kc.c appEventCollection) {
        if (m6.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            s0 s0Var = new s0(3);
            ArrayList b3 = b(appEventCollection, s0Var);
            if (!(!b3.isEmpty())) {
                return null;
            }
            com.facebook.internal.m mVar = d0.f11030d;
            m0 m0Var = m0.APP_EVENTS;
            Intrinsics.checkNotNullExpressionValue("com.facebook.appevents.h", "TAG");
            com.facebook.internal.m.o(m0Var, "com.facebook.appevents.h", "Flushing %d events due to %s.", Integer.valueOf(s0Var.f2031b), reason.toString());
            Iterator it = b3.iterator();
            while (it.hasNext()) {
                ((com.facebook.g0) it.next()).c();
            }
            return s0Var;
        } catch (Throwable th2) {
            m6.a.a(h.class, th2);
            return null;
        }
    }
}

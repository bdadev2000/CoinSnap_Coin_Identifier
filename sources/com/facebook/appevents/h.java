package com.facebook.appevents;

import a5.C0398b;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.C;
import com.facebook.C1824b;
import com.facebook.F;
import com.facebook.internal.H;
import com.facebook.internal.w;
import com.facebook.internal.z;
import com.vungle.ads.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import u0.C2747b;
import y2.AbstractC2947c;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: c, reason: collision with root package name */
    public static ScheduledFuture f13484c;

    /* renamed from: a, reason: collision with root package name */
    public static volatile D0.i f13483a = new D0.i(2);
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d, reason: collision with root package name */
    public static final C2.b f13485d = new C2.b(12);

    public static final C a(b bVar, s sVar, boolean z8, B3.g gVar) {
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            String str = bVar.b;
            boolean z9 = false;
            com.facebook.internal.t f9 = w.f(str, false);
            String str2 = C.f13380j;
            C x9 = R3.e.x(null, String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1)), null, null);
            x9.f13389i = true;
            Bundle bundle = x9.f13384d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", bVar.f13471c);
            synchronized (l.c()) {
                O2.a.b(l.class);
            }
            String str3 = l.f13492c;
            String v6 = C0398b.v();
            if (v6 != null) {
                bundle.putString(Constants.INSTALL_REFERRER, v6);
            }
            x9.f13384d = bundle;
            if (f9 != null) {
                z9 = f9.f13658a;
            }
            int d2 = sVar.d(x9, com.facebook.r.a(), z9, z8);
            if (d2 == 0) {
                return null;
            }
            gVar.f285c += d2;
            x9.j(new C1824b(bVar, x9, sVar, gVar, 1));
            return x9;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    public static final ArrayList b(D0.i iVar, B3.g gVar) {
        s sVar;
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            G7.j.e(iVar, "appEventCollection");
            boolean f9 = com.facebook.r.f(com.facebook.r.a());
            ArrayList arrayList = new ArrayList();
            for (b bVar : iVar.d()) {
                synchronized (iVar) {
                    G7.j.e(bVar, "accessTokenAppIdPair");
                    sVar = (s) iVar.f614a.get(bVar);
                }
                if (sVar != null) {
                    C a6 = a(bVar, sVar, f9, gVar);
                    if (a6 != null) {
                        arrayList.add(a6);
                        if (AbstractC2947c.f24353a) {
                            HashSet hashSet = y2.j.f24364a;
                            H.K(new L(a6, 12));
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }

    public static final void c(o oVar) {
        if (O2.a.b(h.class)) {
            return;
        }
        try {
            b.execute(new D3.b(oVar, 24));
        } catch (Throwable th) {
            O2.a.a(h.class, th);
        }
    }

    public static final void d(o oVar) {
        if (O2.a.b(h.class)) {
            return;
        }
        try {
            f13483a.a(g.v());
            try {
                B3.g f9 = f(oVar, f13483a);
                if (f9 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f9.f285c);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (p) f9.f286d);
                    C2747b.a(com.facebook.r.a()).c(intent);
                }
            } catch (Exception e4) {
                Log.w("com.facebook.appevents.h", "Caught unexpected exception while flushing app events: ", e4);
            }
        } catch (Throwable th) {
            O2.a.a(h.class, th);
        }
    }

    public static final void e(b bVar, C c9, F f9, s sVar, B3.g gVar) {
        p pVar;
        boolean z8;
        if (O2.a.b(h.class)) {
            return;
        }
        try {
            G7.j.e(bVar, "accessTokenAppId");
            G7.j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
            G7.j.e(sVar, "appEvents");
            G7.j.e(gVar, "flushState");
            com.facebook.p pVar2 = f9.f13407c;
            p pVar3 = p.b;
            p pVar4 = p.f13511d;
            if (pVar2 != null) {
                if (pVar2.f13792c == -1) {
                    pVar = pVar4;
                } else {
                    String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{f9.toString(), pVar2.toString()}, 2));
                    pVar = p.f13510c;
                }
            } else {
                pVar = pVar3;
            }
            com.facebook.r rVar = com.facebook.r.f13801a;
            com.facebook.r.h(com.facebook.H.f13413f);
            if (pVar2 != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            sVar.b(z8);
            if (pVar == pVar4) {
                com.facebook.r.c().execute(new A4.d(29, bVar, sVar));
            }
            if (pVar != pVar3 && ((p) gVar.f286d) != pVar4) {
                gVar.f286d = pVar;
            }
        } catch (Throwable th) {
            O2.a.a(h.class, th);
        }
    }

    public static final B3.g f(o oVar, D0.i iVar) {
        if (O2.a.b(h.class)) {
            return null;
        }
        try {
            G7.j.e(iVar, "appEventCollection");
            B3.g gVar = new B3.g(6, false);
            gVar.f286d = p.b;
            ArrayList b8 = b(iVar, gVar);
            if (!(!b8.isEmpty())) {
                return null;
            }
            L4.f fVar = z.f13680c;
            com.facebook.H h6 = com.facebook.H.f13413f;
            oVar.toString();
            com.facebook.r.h(h6);
            Iterator it = b8.iterator();
            while (it.hasNext()) {
                ((C) it.next()).c();
            }
            return gVar;
        } catch (Throwable th) {
            O2.a.a(h.class, th);
            return null;
        }
    }
}

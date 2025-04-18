package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b5 extends o.o {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private o.h f3836b;

    /* loaded from: classes.dex */
    public class a extends o.a {
        private final com.applovin.impl.adview.a a;

        public a(com.applovin.impl.adview.a aVar) {
            this.a = aVar;
        }

        @Override // o.a
        public void onNavigationEvent(int i10, Bundle bundle) {
            com.applovin.impl.sdk.ad.b i11 = this.a.i();
            if (i11 == null) {
                b5.this.a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    b5.this.a.L().b("CustomTabsManager", "Unable to track navigation event (" + i10 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (i11.P0()) {
                        b5.this.a.i().trackCustomTabsNavigationStarted(i11);
                        return;
                    }
                    return;
                case 2:
                    if (i11.P0()) {
                        b5.this.a.i().trackCustomTabsNavigationFinished(i11);
                        return;
                    }
                    return;
                case 3:
                    if (i11.P0()) {
                        b5.this.a.i().trackCustomTabsNavigationFailed(i11);
                        return;
                    }
                    return;
                case 4:
                    if (i11.P0()) {
                        b5.this.a.i().trackCustomTabsNavigationAborted(i11);
                        return;
                    }
                    return;
                case 5:
                    if (i11.P0()) {
                        b5.this.a.i().trackCustomTabsTabShown(i11);
                    }
                    bc.c(this.a.e(), i11, this.a.k());
                    return;
                case 6:
                    if (i11.P0()) {
                        b5.this.a.i().trackCustomTabsTabHidden(i11);
                    }
                    bc.a(this.a.e(), i11, this.a.k());
                    return;
                default:
                    b5.this.a.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        b5.this.a.L().a("CustomTabsManager", "Unknown navigation event: " + i10);
                        return;
                    }
                    return;
            }
        }

        @Override // o.a
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            b5.this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L = b5.this.a.L();
                StringBuilder sb2 = new StringBuilder("Validation ");
                sb2.append(z10 ? "succeeded" : "failed");
                sb2.append(" for session-URL relation(");
                sb2.append(i10);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                L.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public b5(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        if (((Boolean) kVar.a(oj.f6793x6)).booleanValue()) {
            Context k10 = com.applovin.impl.sdk.k.k();
            String b3 = o.h.b(k10);
            if (b3 == null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("CustomTabsManager", "Cannot find a browser that supports Custom Tabs.");
                    return;
                }
                return;
            }
            o.h.a(k10, b3, this);
        }
    }

    public static /* synthetic */ void d(b5 b5Var, com.applovin.impl.adview.a aVar, Activity activity, String str) {
        b5Var.a(aVar, activity, str);
    }

    @Override // o.o
    public void onCustomTabsServiceConnected(ComponentName componentName, o.h hVar) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("CustomTabsManager", "Custom Tabs service connected for package: " + componentName.getPackageName());
        }
        this.f3836b = hVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("CustomTabsManager", "Custom Tabs service disconnected");
        }
        this.f3836b = null;
        Long l10 = (Long) this.a.a(oj.f6800y6);
        if (l10.longValue() < 0) {
            return;
        }
        this.a.l0().a(new kn(this.a, "CustomTabsManager", new rs(8, this, componentName)), sm.b.OTHER, l10.longValue());
    }

    public void b(List list, o.s sVar) {
        if (list.isEmpty()) {
            return;
        }
        if (sVar == null) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
                return;
            }
            return;
        }
        a("warmup urls", new yv(1, this, list, sVar));
    }

    private o.m a(com.applovin.impl.adview.a aVar, Activity activity) {
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        com.applovin.impl.sdk.ad.b i10 = aVar.i();
        o.l lVar = new o.l(aVar.j());
        c5 x10 = i10 != null ? i10.x() : null;
        if (x10 != null) {
            Integer l10 = x10.l();
            if (l10 != null) {
                ic.t tVar = new ic.t(1);
                tVar.a = Integer.valueOf(l10.intValue() | ViewCompat.MEASURED_STATE_MASK);
                lVar.f22936e = tVar.e().w();
            }
            Integer a10 = x10.a();
            if (a10 != null) {
                ic.t tVar2 = new ic.t(1);
                tVar2.a = Integer.valueOf(a10.intValue() | ViewCompat.MEASURED_STATE_MASK);
                s2.h e2 = tVar2.e();
                if (lVar.f22935d == null) {
                    lVar.f22935d = new SparseArray();
                }
                lVar.f22935d.put(2, e2.w());
            }
            Integer j3 = x10.j();
            Integer k10 = x10.k();
            if (j3 != null && k10 != null) {
                lVar.f22934c = ActivityOptions.makeCustomAnimation(activity, j3.intValue(), k10.intValue());
            }
            Integer c10 = x10.c();
            Integer d10 = x10.d();
            Intent intent = lVar.a;
            if (c10 != null && d10 != null) {
                intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(activity, c10.intValue(), d10.intValue()).toBundle());
            }
            Boolean m10 = x10.m();
            if (m10 != null) {
                intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", m10.booleanValue());
            }
            Boolean i11 = x10.i();
            if (i11 != null) {
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", i11.booleanValue() ? 1 : 0);
            }
            Boolean e10 = x10.e();
            if (e10 != null) {
                lVar.f22938g = e10.booleanValue();
            }
            Integer h10 = x10.h();
            if (h10 != null) {
                lVar.b(h10.intValue());
            }
        }
        o.m a11 = lVar.a();
        if (x10 != null) {
            String f10 = x10.f();
            Intent intent2 = a11.a;
            if (f10 != null) {
                intent2.putExtra("android.intent.extra.REFERRER", Uri.parse(f10));
            }
            Bundle s5 = i10.s();
            if (!s5.isEmpty()) {
                intent2.putExtra("com.android.browser.headers", s5);
            }
        }
        return a11;
    }

    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, String str) {
        a(aVar, activity).a(activity, Uri.parse(str));
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, o.s sVar) {
        o.h hVar = this.f3836b;
        hVar.getClass();
        try {
            ((b.c) hVar.a).l();
        } catch (RemoteException unused) {
        }
        c5 x10 = bVar.x();
        if (x10 == null) {
            return;
        }
        Integer g10 = x10.g();
        String b3 = x10.b();
        if (g10 == null || TextUtils.isEmpty(b3)) {
            return;
        }
        if (sVar == null) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("CustomTabsManager", "Validating session-URL relation: " + g10 + " with digital asset link: " + b3);
        }
        int intValue = g10.intValue();
        Uri parse = Uri.parse(b3);
        if (intValue < 1 || intValue > 2) {
            return;
        }
        try {
            ((b.c) sVar.f22950b).k(sVar.f22951c, intValue, parse, sVar.a(null));
        } catch (RemoteException unused2) {
        }
    }

    public void a(List list, o.s sVar) {
        boolean z10;
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        Iterator it = list.iterator();
        String str = (String) it.next();
        it.remove();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(str2));
            arrayList.add(bundle);
        }
        try {
            z10 = ((b.c) sVar.f22950b).e(sVar.f22951c, Uri.parse(str), sVar.a(null), arrayList);
        } catch (RemoteException unused) {
            z10 = false;
        }
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("CustomTabsManager", "Warmup for URLs ".concat(z10 ? "succeeded" : "failed"));
        }
    }

    public void a(String str, com.applovin.impl.adview.a aVar, Activity activity) {
        a("launch url", new c3.b(1, this, aVar, activity, str));
    }

    private void a(String str, Runnable runnable) {
        try {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("CustomTabsManager", "Finished operation: " + str);
            }
        } catch (Throwable th2) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("CustomTabsManager", "Failed to run operation: " + str, th2);
            }
            this.a.B().a("CustomTabsManager", str, th2);
        }
    }

    public o.s a(com.applovin.impl.adview.a aVar) {
        if (this.f3836b == null) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            o.s c10 = this.f3836b.c(new a(aVar));
            a(c10, aVar.i());
            return c10;
        } catch (Exception e2) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("CustomTabsManager", "Failed to create Custom Tabs session", e2);
            }
            return null;
        }
    }

    private void a(o.s sVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.z0()) {
            return;
        }
        a("client warmup", new yv(2, this, bVar, sVar));
    }

    public /* synthetic */ void a(ComponentName componentName) {
        o.h.a(com.applovin.impl.sdk.k.k(), componentName.getPackageName(), this);
    }
}

package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import c.C0578b;
import com.applovin.impl.sm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u.AbstractC2736e;
import u.AbstractServiceConnectionC2741j;
import u.BinderC2735d;
import u.C2732a;
import u.C2738g;
import u.C2739h;
import u.C2744m;

/* loaded from: classes.dex */
public class b5 extends AbstractServiceConnectionC2741j {

    /* renamed from: a */
    private final com.applovin.impl.sdk.k f6820a;
    private AbstractC2736e b;

    /* loaded from: classes.dex */
    public class a extends C2732a {

        /* renamed from: a */
        private final com.applovin.impl.adview.a f6821a;

        public a(com.applovin.impl.adview.a aVar) {
            this.f6821a = aVar;
        }

        @Override // u.C2732a
        public void onNavigationEvent(int i9, Bundle bundle) {
            com.applovin.impl.sdk.ad.b i10 = this.f6821a.i();
            if (i10 == null) {
                b5.this.f6820a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    b5.this.f6820a.L().b("CustomTabsManager", "Unable to track navigation event (" + i9 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i9) {
                case 1:
                    if (i10.P0()) {
                        b5.this.f6820a.i().trackCustomTabsNavigationStarted(i10);
                        return;
                    }
                    return;
                case 2:
                    if (i10.P0()) {
                        b5.this.f6820a.i().trackCustomTabsNavigationFinished(i10);
                        return;
                    }
                    return;
                case 3:
                    if (i10.P0()) {
                        b5.this.f6820a.i().trackCustomTabsNavigationFailed(i10);
                        return;
                    }
                    return;
                case 4:
                    if (i10.P0()) {
                        b5.this.f6820a.i().trackCustomTabsNavigationAborted(i10);
                        return;
                    }
                    return;
                case 5:
                    if (i10.P0()) {
                        b5.this.f6820a.i().trackCustomTabsTabShown(i10);
                    }
                    bc.c(this.f6821a.e(), i10, this.f6821a.k());
                    return;
                case 6:
                    if (i10.P0()) {
                        b5.this.f6820a.i().trackCustomTabsTabHidden(i10);
                    }
                    bc.a(this.f6821a.e(), i10, this.f6821a.k());
                    return;
                default:
                    b5.this.f6820a.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        b5.this.f6820a.L().a("CustomTabsManager", "Unknown navigation event: " + i9);
                        return;
                    }
                    return;
            }
        }

        @Override // u.C2732a
        public void onRelationshipValidationResult(int i9, Uri uri, boolean z8, Bundle bundle) {
            String str;
            b5.this.f6820a.L();
            if (com.applovin.impl.sdk.t.a()) {
                com.applovin.impl.sdk.t L8 = b5.this.f6820a.L();
                StringBuilder sb = new StringBuilder("Validation ");
                if (z8) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" for session-URL relation(");
                sb.append(i9);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                L8.a("CustomTabsManager", sb.toString());
            }
        }
    }

    public b5(com.applovin.impl.sdk.k kVar) {
        String str;
        this.f6820a = kVar;
        if (((Boolean) kVar.a(oj.f9886x6)).booleanValue()) {
            Context k6 = com.applovin.impl.sdk.k.k();
            PackageManager packageManager = k6.getPackageManager();
            ArrayList arrayList = new ArrayList();
            ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
            if (resolveActivity != null) {
                String str2 = resolveActivity.activityInfo.packageName;
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(str2);
                arrayList = arrayList2;
            }
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    str = (String) it.next();
                    intent.setPackage(str);
                    if (packageManager.resolveService(intent, 0) != null) {
                        break;
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                    }
                    str = null;
                }
            }
            if (str == null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("CustomTabsManager", "Cannot find a browser that supports Custom Tabs.");
                    return;
                }
                return;
            }
            AbstractC2736e.a(k6, str, this);
        }
    }

    public static /* synthetic */ void a(b5 b5Var, com.applovin.impl.adview.a aVar, Activity activity, String str) {
        b5Var.a(aVar, activity, str);
    }

    @Override // u.AbstractServiceConnectionC2741j
    public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2736e abstractC2736e) {
        this.f6820a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f6820a.L().a("CustomTabsManager", "Custom Tabs service connected for package: " + componentName.getPackageName());
        }
        this.b = abstractC2736e;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f6820a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f6820a.L().a("CustomTabsManager", "Custom Tabs service disconnected");
        }
        this.b = null;
        Long l = (Long) this.f6820a.a(oj.y6);
        if (l.longValue() < 0) {
            return;
        }
        this.f6820a.l0().a(new kn(this.f6820a, "CustomTabsManager", new F(8, this, componentName)), sm.b.OTHER, l.longValue());
    }

    public void b(List list, C2744m c2744m) {
        if (list.isEmpty()) {
            return;
        }
        if (c2744m == null) {
            this.f6820a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6820a.L().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
                return;
            }
            return;
        }
        a("warmup urls", new O2(this, list, c2744m, 2));
    }

    private C2739h a(com.applovin.impl.adview.a aVar, Activity activity) {
        this.f6820a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f6820a.L().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        com.applovin.impl.sdk.ad.b i9 = aVar.i();
        C2738g c2738g = new C2738g(aVar.j());
        c5 x9 = i9 != null ? i9.x() : null;
        if (x9 != null) {
            Integer l = x9.l();
            if (l != null) {
                Integer valueOf = Integer.valueOf(l.intValue() | ViewCompat.MEASURED_STATE_MASK);
                Bundle bundle = new Bundle();
                bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                c2738g.f23045e = bundle;
            }
            Integer a6 = x9.a();
            if (a6 != null) {
                Integer valueOf2 = Integer.valueOf(a6.intValue() | ViewCompat.MEASURED_STATE_MASK);
                if (c2738g.f23044d == null) {
                    c2738g.f23044d = new SparseArray();
                }
                SparseArray sparseArray = c2738g.f23044d;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                sparseArray.put(2, bundle2);
            }
            Integer j7 = x9.j();
            Integer k6 = x9.k();
            if (j7 != null && k6 != null) {
                c2738g.f23043c = ActivityOptions.makeCustomAnimation(activity, j7.intValue(), k6.intValue()).toBundle();
            }
            Integer c9 = x9.c();
            Integer d2 = x9.d();
            Intent intent = c2738g.f23042a;
            if (c9 != null && d2 != null) {
                intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(activity, c9.intValue(), d2.intValue()).toBundle());
            }
            Boolean m = x9.m();
            if (m != null) {
                intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", m.booleanValue());
            }
            Boolean i10 = x9.i();
            if (i10 != null) {
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", i10.booleanValue() ? 1 : 0);
            }
            Boolean e4 = x9.e();
            if (e4 != null) {
                c2738g.f23047g = e4.booleanValue();
            }
            Integer h6 = x9.h();
            if (h6 != null) {
                c2738g.b(h6.intValue());
            }
        }
        C2739h a9 = c2738g.a();
        if (x9 != null) {
            String f9 = x9.f();
            Intent intent2 = a9.f23048a;
            if (f9 != null) {
                intent2.putExtra("android.intent.extra.REFERRER", Uri.parse(f9));
            }
            Bundle s5 = i9.s();
            if (!s5.isEmpty()) {
                intent2.putExtra("com.android.browser.headers", s5);
            }
        }
        return a9;
    }

    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, String str) {
        a(aVar, activity).a(activity, Uri.parse(str));
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, C2744m c2744m) {
        AbstractC2736e abstractC2736e = this.b;
        abstractC2736e.getClass();
        try {
            ((C0578b) abstractC2736e.f23040a).j();
        } catch (RemoteException unused) {
        }
        c5 x9 = bVar.x();
        if (x9 == null) {
            return;
        }
        Integer g9 = x9.g();
        String b = x9.b();
        if (g9 == null || TextUtils.isEmpty(b)) {
            return;
        }
        if (c2744m == null) {
            this.f6820a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6820a.L().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f6820a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f6820a.L().a("CustomTabsManager", "Validating session-URL relation: " + g9 + " with digital asset link: " + b);
        }
        int intValue = g9.intValue();
        Uri parse = Uri.parse(b);
        if (intValue < 1 || intValue > 2) {
            return;
        }
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = c2744m.f23056e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        try {
            ((C0578b) c2744m.b).i((BinderC2735d) c2744m.f23054c, intValue, parse, bundle);
        } catch (RemoteException unused2) {
        }
    }

    public void a(List list, C2744m c2744m) {
        boolean z8;
        this.f6820a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f6820a.L().a("CustomTabsManager", "Warming up URLs: " + list);
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
        Uri parse = Uri.parse(str);
        c2744m.getClass();
        Bundle bundle2 = new Bundle();
        PendingIntent pendingIntent = c2744m.f23056e;
        if (pendingIntent != null) {
            bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        try {
            z8 = ((C0578b) c2744m.b).c(c2744m.f23054c, parse, bundle2, arrayList);
        } catch (RemoteException unused) {
            z8 = false;
        }
        this.f6820a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f6820a.L().a("CustomTabsManager", "Warmup for URLs ".concat(z8 ? "succeeded" : "failed"));
        }
    }

    public void a(String str, com.applovin.impl.adview.a aVar, Activity activity) {
        a("launch url", new I2.f(this, aVar, activity, str));
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f6820a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6820a.L().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f6820a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6820a.L().a("CustomTabsManager", "Finished operation: " + str);
            }
        } catch (Throwable th) {
            this.f6820a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6820a.L().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f6820a.B().a("CustomTabsManager", str, th);
        }
    }

    public C2744m a(com.applovin.impl.adview.a aVar) {
        if (this.b == null) {
            this.f6820a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6820a.L().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f6820a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f6820a.L().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            C2744m b = this.b.b(new a(aVar));
            a(b, aVar.i());
            return b;
        } catch (Exception e4) {
            this.f6820a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f6820a.L().a("CustomTabsManager", "Failed to create Custom Tabs session", e4);
            }
            return null;
        }
    }

    private void a(C2744m c2744m, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.z0()) {
            return;
        }
        a("client warmup", new O2(this, bVar, c2744m, 1));
    }

    public /* synthetic */ void a(ComponentName componentName) {
        AbstractC2736e.a(com.applovin.impl.sdk.k.k(), componentName.getPackageName(), this);
    }
}

package com.bumptech.glide;

import J1.n;
import J1.o;
import J1.q;
import Q7.AbstractC0255x;
import T.InterfaceC0286q;
import T.n0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Z;
import androidx.lifecycle.V;
import com.android.billingclient.api.Purchase;
import com.facebook.N;
import com.facebook.r;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import e0.C2200a;
import e0.InterfaceC2201b;
import h3.C2318a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C2426o;
import o2.InterfaceC2494a;
import org.json.JSONException;
import org.json.JSONObject;
import p.C2526e;
import p.C2535n;
import p.InterfaceC2531j;
import p.MenuC2533l;
import p.ViewOnKeyListenerC2527f;
import p1.C2537a;
import p1.C2538b;
import p5.F;
import q.C2605j;
import q.D0;
import q.InterfaceC2613n;
import t4.InterfaceC2708a;
import u4.C2769n;
import u4.C2770o;
import u4.C2772q;
import u4.CallableC2767l;

/* loaded from: classes.dex */
public final class f implements InterfaceC2201b, D0, n, o, InterfaceC2531j, s4.b, InterfaceC2708a, InterfaceC2494a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12819c;

    public /* synthetic */ f(Object obj, int i9) {
        this.b = i9;
        this.f12819c = obj;
    }

    public static String l(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // J1.o
    public void a(J1.g gVar, List list) {
        int i9 = gVar.f1520a;
        C2538b c2538b = (C2538b) this.f12819c;
        if (i9 == 0 && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                Iterator it2 = c2538b.b.iterator();
                while (it2.hasNext()) {
                    q qVar = (q) it2.next();
                    if (purchase.a().contains(qVar.f1538a)) {
                        Log.d("PurchaseEG", "verifyPurchased INAPP: true");
                        c2538b.f22185o.add(qVar.f1538a);
                        c2538b.m = true;
                    }
                }
            }
            c2538b.getClass();
            return;
        }
        c2538b.getClass();
        if (!c2538b.l) {
        } else {
            throw null;
        }
    }

    @Override // p.InterfaceC2531j
    public boolean b(MenuC2533l menuC2533l, MenuItem menuItem) {
        switch (this.b) {
            case 13:
                InterfaceC2613n interfaceC2613n = ((ActionMenuView) this.f12819c).f4197C;
                if (interfaceC2613n != null && ((Toolbar) ((C2426o) interfaceC2613n).f21320c).f4285I.a(menuItem)) {
                    return true;
                }
                return false;
            default:
                ((Toolbar) this.f12819c).getClass();
                return false;
        }
    }

    @Override // q.D0
    public void c(MenuC2533l menuC2533l, C2535n c2535n) {
        ((ViewOnKeyListenerC2527f) this.f12819c).f22074i.removeCallbacksAndMessages(menuC2533l);
    }

    @Override // t4.InterfaceC2708a
    public void d(C2770o c2770o) {
        this.f12819c = c2770o;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // J1.n
    public void e(ArrayList arrayList) {
        Log.d("PurchaseEG", "onSkuINAPDetailsResponse: " + arrayList.size());
        C2538b c2538b = ((C2537a) this.f12819c).f22172a;
        c2538b.f22178f = arrayList;
        c2538b.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            J1.m mVar = (J1.m) it.next();
            c2538b.f22180h.put(mVar.f1529c, mVar);
        }
    }

    @Override // s4.b
    public void f(Bundle bundle, String str) {
        C2770o c2770o = (C2770o) this.f12819c;
        if (c2770o != null) {
            try {
                String str2 = "$A$:" + l(bundle, str);
                C2772q c2772q = c2770o.f23149a;
                c2772q.getClass();
                long currentTimeMillis = System.currentTimeMillis() - c2772q.f23153d;
                C2769n c2769n = c2772q.f23156g;
                c2769n.getClass();
                c2769n.f23138e.k(new CallableC2767l(c2769n, currentTimeMillis, str2));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // p.InterfaceC2531j
    public void g(MenuC2533l menuC2533l) {
        switch (this.b) {
            case 13:
                InterfaceC2531j interfaceC2531j = ((ActionMenuView) this.f12819c).f4204x;
                if (interfaceC2531j != null) {
                    interfaceC2531j.g(menuC2533l);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.f12819c;
                C2605j c2605j = toolbar.b.f4202v;
                if (c2605j == null || !c2605j.k()) {
                    Iterator it = toolbar.f4285I.b.iterator();
                    while (it.hasNext()) {
                        ((Z) ((InterfaceC0286q) it.next())).f4692a.dispatchPrepareOptionsMenu(menuC2533l);
                    }
                    return;
                }
                return;
        }
    }

    public void h(F f9) {
        ((k3.q) ((h3.f) ((N4.b) this.f12819c).get())).a("FIREBASE_APPQUALITY_SESSION", new h3.c("json"), new F2.d(this, 20)).a(new C2318a(f9, h3.d.b, null), new com.applovin.impl.sdk.ad.g(25));
    }

    public void i(Bundle bundle, String str) {
        r rVar = r.f13801a;
        if (N.b()) {
            ((com.facebook.appevents.l) this.f12819c).f(bundle, str);
        }
    }

    public void j(Bitmap bitmap) {
        ArRulerActivity arRulerActivity = (ArRulerActivity) this.f12819c;
        AbstractC0255x.l(V.f(arRulerActivity), null, null, new z6.g(arRulerActivity, bitmap, null), 3);
    }

    @Override // e0.InterfaceC2201b
    public Object k(C2200a c2200a) {
        return ((F7.l) this.f12819c).invoke(c2200a);
    }

    @Override // q.D0
    public void n(MenuC2533l menuC2533l, C2535n c2535n) {
        ViewOnKeyListenerC2527f viewOnKeyListenerC2527f = (ViewOnKeyListenerC2527f) this.f12819c;
        C2526e c2526e = null;
        viewOnKeyListenerC2527f.f22074i.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC2527f.f22076k;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                if (menuC2533l == ((C2526e) arrayList.get(i9)).b) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 == -1) {
            return;
        }
        int i10 = i9 + 1;
        if (i10 < arrayList.size()) {
            c2526e = (C2526e) arrayList.get(i10);
        }
        viewOnKeyListenerC2527f.f22074i.postAtTime(new n0(this, c2526e, c2535n, menuC2533l, 2), menuC2533l, SystemClock.uptimeMillis() + 200);
    }

    public f(int i9) {
        this.b = i9;
        switch (i9) {
            case 6:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                G7.j.e(timeUnit, "timeUnit");
                this.f12819c = new m8.l(l8.c.f21647h, timeUnit);
                return;
            case 15:
                return;
            default:
                this.f12819c = new ArrayList();
                return;
        }
    }

    public f(D0.i iVar) {
        this.b = 0;
        this.f12819c = Collections.unmodifiableMap(new HashMap(iVar.f614a));
    }

    public f(Context context) {
        this.b = 1;
        this.f12819c = new com.facebook.appevents.l(context, (String) null);
    }

    public f(Context context, String str) {
        this.b = 1;
        this.f12819c = new com.facebook.appevents.l(context, str);
    }

    public f(EditText editText) {
        this.b = 7;
        C2.m.h(editText, "editText cannot be null");
        this.f12819c = new a7.b(editText);
    }

    public f(j8.a aVar) {
        this.b = 8;
        this.f12819c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}

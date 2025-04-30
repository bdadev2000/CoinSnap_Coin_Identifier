package Z5;

import B3.k;
import M0.C0219j;
import R5.j;
import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import b6.C0574a;
import b6.C0575b;
import d6.AbstractC2191a;
import d6.C2193c;
import e6.AbstractC2224b;
import f6.C2272a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h extends b {

    /* renamed from: a, reason: collision with root package name */
    public final O5.d f3898a;
    public final O5.c b;

    /* renamed from: c, reason: collision with root package name */
    public final b6.e f3899c;

    /* renamed from: d, reason: collision with root package name */
    public X5.a f3900d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC2191a f3901e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3902f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3903g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3904h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3905i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3906j;

    /* JADX WARN: Type inference failed for: r0v2, types: [X5.a, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X5.a, java.lang.ref.WeakReference] */
    public h(O5.c cVar, O5.d dVar) {
        AbstractC2191a abstractC2191a;
        String uuid = UUID.randomUUID().toString();
        this.f3899c = new b6.e();
        this.f3902f = false;
        this.f3903g = false;
        this.b = cVar;
        this.f3898a = dVar;
        this.f3904h = uuid;
        this.f3900d = new WeakReference(null);
        c cVar2 = c.HTML;
        c cVar3 = (c) dVar.f2208h;
        if (cVar3 != cVar2 && cVar3 != c.JAVASCRIPT) {
            abstractC2191a = new C2193c(uuid, Collections.unmodifiableMap((HashMap) dVar.f2203c), dVar.f2204d);
        } else {
            abstractC2191a = new AbstractC2191a(uuid);
            WebView webView = (WebView) dVar.f2202a;
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            abstractC2191a.b = new WeakReference(webView);
        }
        this.f3901e = abstractC2191a;
        this.f3901e.f();
        b6.c.f5337c.f5338a.add(this);
        AbstractC2191a abstractC2191a2 = this.f3901e;
        b6.g gVar = b6.g.f5341a;
        WebView e4 = abstractC2191a2.e();
        JSONObject jSONObject = new JSONObject();
        AbstractC2224b.b(jSONObject, "impressionOwner", (f) cVar.b);
        AbstractC2224b.b(jSONObject, "mediaEventsOwner", (f) cVar.f2199c);
        AbstractC2224b.b(jSONObject, "creativeType", (d) cVar.f2200d);
        AbstractC2224b.b(jSONObject, "impressionType", (e) cVar.f2201e);
        AbstractC2224b.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(cVar.f2198a));
        gVar.a(e4, "init", jSONObject, abstractC2191a2.f19912a);
    }

    @Override // Z5.b
    public final void b() {
        if (this.f3903g) {
            return;
        }
        this.f3900d.clear();
        if (!this.f3903g) {
            this.f3899c.f5339a.clear();
        }
        boolean z8 = true;
        this.f3903g = true;
        AbstractC2191a abstractC2191a = this.f3901e;
        b6.g.f5341a.a(abstractC2191a.e(), "finishSession", abstractC2191a.f19912a);
        b6.c cVar = b6.c.f5337c;
        if (cVar.b.size() <= 0) {
            z8 = false;
        }
        cVar.f5338a.remove(this);
        ArrayList arrayList = cVar.b;
        arrayList.remove(this);
        if (z8 && arrayList.size() <= 0) {
            j c9 = j.c();
            c9.getClass();
            C2272a c2272a = C2272a.f20351g;
            c2272a.getClass();
            Handler handler = C2272a.f20353i;
            if (handler != null) {
                handler.removeCallbacks(C2272a.f20355k);
                C2272a.f20353i = null;
            }
            c2272a.f20356a.clear();
            C2272a.f20352h.post(new k(c2272a, 15));
            C0575b c0575b = C0575b.f5336g;
            c0575b.f2743c = false;
            c0575b.f2745f = null;
            Q5.a aVar = (Q5.a) c9.f2757e;
            aVar.b.getContentResolver().unregisterContentObserver(aVar);
        }
        this.f3901e.d();
        this.f3901e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X5.a, java.lang.ref.WeakReference] */
    @Override // Z5.b
    public final void c(View view) {
        if (this.f3903g) {
            return;
        }
        C0219j.b(view, "AdView is null");
        if (((View) this.f3900d.get()) == view) {
            return;
        }
        this.f3900d = new WeakReference(view);
        AbstractC2191a abstractC2191a = this.f3901e;
        abstractC2191a.getClass();
        abstractC2191a.f19915e = System.nanoTime();
        abstractC2191a.f19914d = 1;
        Collection<h> unmodifiableCollection = Collections.unmodifiableCollection(b6.c.f5337c.f5338a);
        if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
            for (h hVar : unmodifiableCollection) {
                if (hVar != this && ((View) hVar.f3900d.get()) == view) {
                    hVar.f3900d.clear();
                }
            }
        }
    }

    @Override // Z5.b
    public final void d() {
        boolean z8;
        Date date;
        if (this.f3902f) {
            return;
        }
        this.f3902f = true;
        b6.c cVar = b6.c.f5337c;
        boolean z9 = false;
        if (cVar.b.size() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        cVar.b.add(this);
        if (!z8) {
            j c9 = j.c();
            c9.getClass();
            C0575b c0575b = C0575b.f5336g;
            c0575b.f2745f = c9;
            c0575b.f2743c = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100 || c0575b.d()) {
                z9 = true;
            }
            c0575b.f2744d = z9;
            c0575b.a(z9);
            C2272a.f20351g.getClass();
            C2272a.b();
            Q5.a aVar = (Q5.a) c9.f2757e;
            aVar.f2524d = aVar.a();
            aVar.b();
            aVar.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, aVar);
        }
        float f9 = j.c().b;
        AbstractC2191a abstractC2191a = this.f3901e;
        b6.g.f5341a.a(abstractC2191a.e(), "setDeviceVolume", Float.valueOf(f9), abstractC2191a.f19912a);
        AbstractC2191a abstractC2191a2 = this.f3901e;
        Date date2 = C0574a.f5331f.b;
        if (date2 != null) {
            date = (Date) date2.clone();
        } else {
            date = null;
        }
        abstractC2191a2.c(date);
        this.f3901e.a(this, this.f3898a);
    }
}

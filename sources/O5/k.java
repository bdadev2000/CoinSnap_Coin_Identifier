package O5;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k extends b {

    /* renamed from: a, reason: collision with root package name */
    public final d f2229a;
    public final c b;

    /* renamed from: c, reason: collision with root package name */
    public final R5.g f2230c;

    /* renamed from: d, reason: collision with root package name */
    public X5.a f2231d;

    /* renamed from: e, reason: collision with root package name */
    public T5.a f2232e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2233f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2234g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2235h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2236i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2237j;

    /* JADX WARN: Type inference failed for: r0v2, types: [X5.a, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X5.a, java.lang.ref.WeakReference] */
    public k(c cVar, d dVar) {
        T5.a aVar;
        String uuid = UUID.randomUUID().toString();
        this.f2230c = new R5.g();
        this.f2233f = false;
        this.f2234g = false;
        this.b = cVar;
        this.f2229a = dVar;
        this.f2235h = uuid;
        this.f2231d = new WeakReference(null);
        e eVar = e.HTML;
        e eVar2 = (e) dVar.f2208h;
        if (eVar2 != eVar && eVar2 != e.JAVASCRIPT) {
            aVar = new T5.e(uuid, Collections.unmodifiableMap((HashMap) dVar.f2203c), dVar.f2204d);
        } else {
            aVar = new T5.a(uuid);
            WebView webView = (WebView) dVar.f2202a;
            if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            aVar.b = new WeakReference(webView);
        }
        this.f2232e = aVar;
        this.f2232e.g();
        R5.c.f2741c.f2742a.add(this);
        T5.a aVar2 = this.f2232e;
        R5.i iVar = R5.i.f2751a;
        WebView f9 = aVar2.f();
        JSONObject jSONObject = new JSONObject();
        U5.b.b(jSONObject, "impressionOwner", (i) cVar.b);
        U5.b.b(jSONObject, "mediaEventsOwner", (i) cVar.f2199c);
        U5.b.b(jSONObject, "creativeType", (f) cVar.f2200d);
        U5.b.b(jSONObject, "impressionType", (h) cVar.f2201e);
        U5.b.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(cVar.f2198a));
        iVar.a(f9, "init", jSONObject, aVar2.f3019a);
    }

    @Override // O5.b
    public final void a(View view, g gVar) {
        R5.f fVar;
        if (this.f2234g) {
            return;
        }
        R5.g gVar2 = this.f2230c;
        gVar2.getClass();
        if (view != null) {
            ArrayList arrayList = gVar2.f2749a;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    fVar = (R5.f) it.next();
                    if (fVar.f2746a.get() == view) {
                        break;
                    }
                } else {
                    fVar = null;
                    break;
                }
            }
            if (fVar == null) {
                arrayList.add(new R5.f(view, gVar));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    @Override // O5.b
    public final void c() {
        if (this.f2234g) {
            return;
        }
        this.f2231d.clear();
        e();
        boolean z8 = true;
        this.f2234g = true;
        T5.a aVar = this.f2232e;
        R5.i.f2751a.a(aVar.f(), "finishSession", aVar.f3019a);
        R5.c cVar = R5.c.f2741c;
        if (cVar.b.size() <= 0) {
            z8 = false;
        }
        cVar.f2742a.remove(this);
        ArrayList arrayList = cVar.b;
        arrayList.remove(this);
        if (z8 && arrayList.size() <= 0) {
            R5.j b = R5.j.b();
            b.getClass();
            V5.b bVar = V5.b.f3483g;
            bVar.getClass();
            Handler handler = V5.b.f3485i;
            if (handler != null) {
                handler.removeCallbacks(V5.b.f3487k);
                V5.b.f3485i = null;
            }
            bVar.f3488a.clear();
            V5.b.f3484h.post(new B3.k(bVar, 6));
            R5.b bVar2 = R5.b.f2740g;
            bVar2.f2743c = false;
            bVar2.f2745f = null;
            Q5.a aVar2 = (Q5.a) b.f2757e;
            aVar2.b.getContentResolver().unregisterContentObserver(aVar2);
        }
        this.f2232e.e();
        this.f2232e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X5.a, java.lang.ref.WeakReference] */
    @Override // O5.b
    public final void d(View view) {
        if (this.f2234g) {
            return;
        }
        R2.b.c(view, "AdView is null");
        if (((View) this.f2231d.get()) == view) {
            return;
        }
        this.f2231d = new WeakReference(view);
        T5.a aVar = this.f2232e;
        aVar.getClass();
        aVar.f3023f = System.nanoTime();
        aVar.f3022e = 1;
        Collection<k> unmodifiableCollection = Collections.unmodifiableCollection(R5.c.f2741c.f2742a);
        if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
            for (k kVar : unmodifiableCollection) {
                if (kVar != this && ((View) kVar.f2231d.get()) == view) {
                    kVar.f2231d.clear();
                }
            }
        }
    }

    @Override // O5.b
    public final void e() {
        if (this.f2234g) {
            return;
        }
        this.f2230c.f2749a.clear();
    }

    @Override // O5.b
    public final void f() {
        boolean z8;
        Date date;
        if (this.f2233f) {
            return;
        }
        this.f2233f = true;
        R5.c cVar = R5.c.f2741c;
        boolean z9 = false;
        if (cVar.b.size() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        cVar.b.add(this);
        if (!z8) {
            R5.j b = R5.j.b();
            b.getClass();
            R5.b bVar = R5.b.f2740g;
            bVar.f2745f = b;
            bVar.f2743c = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100 || bVar.d()) {
                z9 = true;
            }
            bVar.f2744d = z9;
            bVar.a(z9);
            V5.b.f3483g.getClass();
            V5.b.b();
            Q5.a aVar = (Q5.a) b.f2757e;
            aVar.f2524d = aVar.a();
            aVar.b();
            aVar.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, aVar);
        }
        float f9 = R5.j.b().b;
        T5.a aVar2 = this.f2232e;
        R5.i.f2751a.a(aVar2.f(), "setDeviceVolume", Float.valueOf(f9), aVar2.f3019a);
        T5.a aVar3 = this.f2232e;
        Date date2 = R5.a.f2735f.b;
        if (date2 != null) {
            date = (Date) date2.clone();
        } else {
            date = null;
        }
        aVar3.d(date);
        this.f2232e.a(this, this.f2229a);
    }
}

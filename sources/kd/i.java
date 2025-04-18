package kd;

import android.view.View;
import android.webkit.WebView;
import androidx.emoji2.text.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class i extends b {
    public final android.support.v4.media.d a;

    /* renamed from: b, reason: collision with root package name */
    public final t f20669b;

    /* renamed from: c, reason: collision with root package name */
    public final nd.g f20670c;

    /* renamed from: d, reason: collision with root package name */
    public ce.a f20671d;

    /* renamed from: e, reason: collision with root package name */
    public pd.a f20672e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20673f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20674g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20675h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20676i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f20677j;

    public i(t tVar, android.support.v4.media.d dVar) {
        pd.a bVar;
        WebView webView;
        String str;
        String uuid = UUID.randomUUID().toString();
        this.f20670c = new nd.g();
        this.f20673f = false;
        this.f20674g = false;
        this.f20669b = tVar;
        this.a = dVar;
        this.f20675h = uuid;
        this.f20671d = new ce.a(null);
        c cVar = (c) dVar.f529i;
        c cVar2 = c.HTML;
        int i10 = dVar.a;
        if (cVar != cVar2 && cVar != c.JAVASCRIPT) {
            Map d10 = dVar.d();
            switch (i10) {
                case 4:
                    str = (String) dVar.f522b;
                    break;
                default:
                    str = (String) dVar.f522b;
                    break;
            }
            bVar = new pd.c(uuid, d10, str);
        } else {
            switch (i10) {
                case 4:
                    webView = (WebView) dVar.f524d;
                    break;
                default:
                    webView = (WebView) dVar.f524d;
                    break;
            }
            bVar = new pd.b(uuid, webView);
        }
        this.f20672e = bVar;
        bVar.g();
        nd.c.f22727c.a.add(this);
        pd.a aVar = this.f20672e;
        b6.b.f2297i.a(aVar.f(), "init", tVar.i(), aVar.a);
    }

    @Override // kd.b
    public final void a(View view, e eVar) {
        if (this.f20674g) {
            return;
        }
        nd.g gVar = this.f20670c;
        gVar.getClass();
        if (view != null) {
            if (gVar.a(view) == null) {
                gVar.a.add(new nd.f(view, eVar));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    @Override // kd.b
    public final void c() {
        boolean z10;
        if (this.f20674g) {
            return;
        }
        this.f20671d.clear();
        e();
        boolean z11 = true;
        this.f20674g = true;
        pd.a aVar = this.f20672e;
        b6.b.f2297i.a(aVar.f(), "finishSession", aVar.a);
        nd.c cVar = nd.c.f22727c;
        if (cVar.f22728b.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.a.remove(this);
        ArrayList arrayList = cVar.f22728b;
        arrayList.remove(this);
        if (z10) {
            if (arrayList.size() <= 0) {
                z11 = false;
            }
            if (!z11) {
                nd.h.d().g();
            }
        }
        this.f20672e.e();
        this.f20672e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kd.b
    public final void d(View view) {
        if (this.f20674g) {
            return;
        }
        com.facebook.internal.i.a(view, "AdView is null");
        if (((View) this.f20671d.get()) == view) {
            return;
        }
        this.f20671d = new ce.a(view);
        pd.a aVar = this.f20672e;
        aVar.getClass();
        aVar.f23598f = System.nanoTime();
        aVar.f23597e = 1;
        Collection<i> unmodifiableCollection = Collections.unmodifiableCollection(nd.c.f22727c.a);
        if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
            for (i iVar : unmodifiableCollection) {
                if (iVar != this && ((View) iVar.f20671d.get()) == view) {
                    iVar.f20671d.clear();
                }
            }
        }
    }

    @Override // kd.b
    public final void e() {
        if (this.f20674g) {
            return;
        }
        this.f20670c.a.clear();
    }

    @Override // kd.b
    public final void f() {
        boolean z10;
        Date date;
        if (this.f20673f) {
            return;
        }
        this.f20673f = true;
        nd.c cVar = nd.c.f22727c;
        if (cVar.f22728b.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.f22728b.add(this);
        if (!z10) {
            nd.h.d().f();
        }
        float c10 = nd.h.d().c();
        pd.a aVar = this.f20672e;
        b6.b.f2297i.a(aVar.f(), "setDeviceVolume", Float.valueOf(c10), aVar.a);
        pd.a aVar2 = this.f20672e;
        Date date2 = nd.a.f22721f.f22722b;
        if (date2 != null) {
            date = (Date) date2.clone();
        } else {
            date = null;
        }
        aVar2.b(date);
        this.f20672e.c(this, this.a);
    }
}

package vd;

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
    public final t f26510b;

    /* renamed from: c, reason: collision with root package name */
    public final wd.e f26511c;

    /* renamed from: d, reason: collision with root package name */
    public ce.a f26512d;

    /* renamed from: e, reason: collision with root package name */
    public yd.a f26513e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26514f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26515g;

    /* renamed from: h, reason: collision with root package name */
    public final String f26516h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26517i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26518j;

    public i(t tVar, android.support.v4.media.d dVar) {
        yd.a bVar;
        WebView webView;
        String str;
        String uuid = UUID.randomUUID().toString();
        this.f26511c = new wd.e();
        this.f26514f = false;
        this.f26515g = false;
        this.f26510b = tVar;
        this.a = dVar;
        this.f26516h = uuid;
        this.f26512d = new ce.a(null);
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
            bVar = new yd.c(uuid, d10, str);
        } else {
            switch (i10) {
                case 4:
                    webView = (WebView) dVar.f524d;
                    break;
                default:
                    webView = (WebView) dVar.f524d;
                    break;
            }
            bVar = new yd.b(uuid, webView);
        }
        this.f26513e = bVar;
        bVar.f();
        wd.c.f26969c.a.add(this);
        yd.a aVar = this.f26513e;
        ka.e.f20531c.a(aVar.e(), "init", tVar.i(), aVar.a);
    }

    @Override // vd.b
    public final void b() {
        boolean z10;
        if (this.f26515g) {
            return;
        }
        this.f26512d.clear();
        if (!this.f26515g) {
            this.f26511c.a.clear();
        }
        boolean z11 = true;
        this.f26515g = true;
        yd.a aVar = this.f26513e;
        ka.e.f20531c.a(aVar.e(), "finishSession", aVar.a);
        wd.c cVar = wd.c.f26969c;
        if (cVar.f26970b.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.a.remove(this);
        ArrayList arrayList = cVar.f26970b;
        arrayList.remove(this);
        if (z10) {
            if (arrayList.size() <= 0) {
                z11 = false;
            }
            if (!z11) {
                nd.h.e().g();
            }
        }
        this.f26513e.d();
        this.f26513e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vd.b
    public final void c(View view) {
        if (this.f26515g) {
            return;
        }
        com.bumptech.glide.e.c(view, "AdView is null");
        if (((View) this.f26512d.get()) == view) {
            return;
        }
        this.f26512d = new ce.a(view);
        yd.a aVar = this.f26513e;
        aVar.getClass();
        aVar.f28170e = System.nanoTime();
        aVar.f28169d = 1;
        Collection<i> unmodifiableCollection = Collections.unmodifiableCollection(wd.c.f26969c.a);
        if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
            for (i iVar : unmodifiableCollection) {
                if (iVar != this && ((View) iVar.f26512d.get()) == view) {
                    iVar.f26512d.clear();
                }
            }
        }
    }

    @Override // vd.b
    public final void d() {
        boolean z10;
        Date date;
        if (this.f26514f) {
            return;
        }
        this.f26514f = true;
        wd.c cVar = wd.c.f26969c;
        if (cVar.f26970b.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.f26970b.add(this);
        if (!z10) {
            nd.h.e().f();
        }
        float c10 = nd.h.e().c();
        yd.a aVar = this.f26513e;
        ka.e.f20531c.a(aVar.e(), "setDeviceVolume", Float.valueOf(c10), aVar.a);
        yd.a aVar2 = this.f26513e;
        Date date2 = wd.a.f26963f.f26964b;
        if (date2 != null) {
            date = (Date) date2.clone();
        } else {
            date = null;
        }
        aVar2.a(date);
        this.f26513e.b(this, this.a);
    }
}

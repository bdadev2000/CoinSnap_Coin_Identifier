package k4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final List f20215b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.c f20216c;

    /* renamed from: d, reason: collision with root package name */
    public int f20217d;

    /* renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.h f20218f;

    /* renamed from: g, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f20219g;

    /* renamed from: h, reason: collision with root package name */
    public List f20220h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20221i;

    public b0(ArrayList arrayList, m0.c cVar) {
        this.f20216c = cVar;
        if (!arrayList.isEmpty()) {
            this.f20215b = arrayList;
            this.f20217d = 0;
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.f20215b.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        List list = this.f20220h;
        if (list != null) {
            this.f20216c.c(list);
        }
        this.f20220h = null;
        Iterator it = this.f20215b.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(Exception exc) {
        List list = this.f20220h;
        com.bumptech.glide.c.l(list);
        list.add(exc);
        g();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f20221i = true;
        Iterator it = this.f20215b.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final e4.a d() {
        return ((com.bumptech.glide.load.data.e) this.f20215b.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        this.f20218f = hVar;
        this.f20219g = dVar;
        this.f20220h = (List) this.f20216c.d();
        ((com.bumptech.glide.load.data.e) this.f20215b.get(this.f20217d)).e(hVar, this);
        if (this.f20221i) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        if (obj != null) {
            this.f20219g.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.f20221i) {
            return;
        }
        if (this.f20217d < this.f20215b.size() - 1) {
            this.f20217d++;
            e(this.f20218f, this.f20219g);
        } else {
            com.bumptech.glide.c.l(this.f20220h);
            this.f20219g.c(new g4.b0("Fetch failed", new ArrayList(this.f20220h)));
        }
    }
}

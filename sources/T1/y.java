package T1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class y implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final S.c f2997c;

    /* renamed from: d, reason: collision with root package name */
    public int f2998d;

    /* renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.g f2999f;

    /* renamed from: g, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f3000g;

    /* renamed from: h, reason: collision with root package name */
    public List f3001h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3002i;

    public y(ArrayList arrayList, S.c cVar) {
        this.f2997c = cVar;
        if (!arrayList.isEmpty()) {
            this.b = arrayList;
            this.f2998d = 0;
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.b.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        List list = this.f3001h;
        if (list != null) {
            this.f2997c.b(list);
        }
        this.f3001h = null;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(Exception exc) {
        List list = this.f3001h;
        j2.g.c(list, "Argument must not be null");
        list.add(exc);
        f();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f3002i = true;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        return ((com.bumptech.glide.load.data.e) this.b.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        this.f2999f = gVar;
        this.f3000g = dVar;
        this.f3001h = (List) this.f2997c.g();
        ((com.bumptech.glide.load.data.e) this.b.get(this.f2998d)).e(gVar, this);
        if (this.f3002i) {
            cancel();
        }
    }

    public final void f() {
        if (this.f3002i) {
            return;
        }
        if (this.f2998d < this.b.size() - 1) {
            this.f2998d++;
            e(this.f2999f, this.f3000g);
        } else {
            j2.g.b(this.f3001h);
            this.f3000g.c(new P1.x("Fetch failed", new ArrayList(this.f3001h)));
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void h(Object obj) {
        if (obj != null) {
            this.f3000g.h(obj);
        } else {
            f();
        }
    }
}

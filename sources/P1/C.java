package P1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class C implements h, com.bumptech.glide.load.data.d {
    public final g b;

    /* renamed from: c, reason: collision with root package name */
    public final i f2271c;

    /* renamed from: d, reason: collision with root package name */
    public int f2272d;

    /* renamed from: f, reason: collision with root package name */
    public int f2273f = -1;

    /* renamed from: g, reason: collision with root package name */
    public N1.f f2274g;

    /* renamed from: h, reason: collision with root package name */
    public List f2275h;

    /* renamed from: i, reason: collision with root package name */
    public int f2276i;

    /* renamed from: j, reason: collision with root package name */
    public volatile T1.t f2277j;

    /* renamed from: k, reason: collision with root package name */
    public File f2278k;
    public D l;

    public C(i iVar, g gVar) {
        this.f2271c = iVar;
        this.b = gVar;
    }

    @Override // P1.h
    public final boolean b() {
        ArrayList a6 = this.f2271c.a();
        boolean z8 = false;
        if (a6.isEmpty()) {
            return false;
        }
        List d2 = this.f2271c.d();
        if (d2.isEmpty()) {
            if (File.class.equals(this.f2271c.f2314k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f2271c.f2307d.getClass() + " to " + this.f2271c.f2314k);
        }
        while (true) {
            List list = this.f2275h;
            if (list != null && this.f2276i < list.size()) {
                this.f2277j = null;
                while (!z8 && this.f2276i < this.f2275h.size()) {
                    List list2 = this.f2275h;
                    int i9 = this.f2276i;
                    this.f2276i = i9 + 1;
                    T1.u uVar = (T1.u) list2.get(i9);
                    File file = this.f2278k;
                    i iVar = this.f2271c;
                    this.f2277j = uVar.b(file, iVar.f2308e, iVar.f2309f, iVar.f2312i);
                    if (this.f2277j != null && this.f2271c.c(this.f2277j.f2994c.a()) != null) {
                        this.f2277j.f2994c.e(this.f2271c.f2316o, this);
                        z8 = true;
                    }
                }
                return z8;
            }
            int i10 = this.f2273f + 1;
            this.f2273f = i10;
            if (i10 >= d2.size()) {
                int i11 = this.f2272d + 1;
                this.f2272d = i11;
                if (i11 >= a6.size()) {
                    return false;
                }
                this.f2273f = 0;
            }
            N1.f fVar = (N1.f) a6.get(this.f2272d);
            Class cls = (Class) d2.get(this.f2273f);
            N1.m f9 = this.f2271c.f(cls);
            i iVar2 = this.f2271c;
            this.l = new D(iVar2.f2306c.f12810a, fVar, iVar2.f2315n, iVar2.f2308e, iVar2.f2309f, f9, cls, iVar2.f2312i);
            File c9 = iVar2.f2311h.a().c(this.l);
            this.f2278k = c9;
            if (c9 != null) {
                this.f2274g = fVar;
                this.f2275h = this.f2271c.f2306c.a().f(c9);
                this.f2276i = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(Exception exc) {
        this.b.a(this.l, exc, this.f2277j.f2994c, 4);
    }

    @Override // P1.h
    public final void cancel() {
        T1.t tVar = this.f2277j;
        if (tVar != null) {
            tVar.f2994c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void h(Object obj) {
        this.b.d(this.f2274g, obj, this.f2277j.f2994c, 4, this.l);
    }
}

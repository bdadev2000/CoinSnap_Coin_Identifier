package g4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 implements h, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final g f18065b;

    /* renamed from: c, reason: collision with root package name */
    public final i f18066c;

    /* renamed from: d, reason: collision with root package name */
    public int f18067d;

    /* renamed from: f, reason: collision with root package name */
    public int f18068f = -1;

    /* renamed from: g, reason: collision with root package name */
    public e4.j f18069g;

    /* renamed from: h, reason: collision with root package name */
    public List f18070h;

    /* renamed from: i, reason: collision with root package name */
    public int f18071i;

    /* renamed from: j, reason: collision with root package name */
    public volatile k4.x f18072j;

    /* renamed from: k, reason: collision with root package name */
    public File f18073k;

    /* renamed from: l, reason: collision with root package name */
    public i0 f18074l;

    public h0(i iVar, g gVar) {
        this.f18066c = iVar;
        this.f18065b = gVar;
    }

    @Override // g4.h
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList a = this.f18066c.a();
        if (a.isEmpty()) {
            return false;
        }
        List d10 = this.f18066c.d();
        if (d10.isEmpty()) {
            if (File.class.equals(this.f18066c.f18084k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f18066c.f18077d.getClass() + " to " + this.f18066c.f18084k);
        }
        while (true) {
            List list = this.f18070h;
            if (list != null) {
                if (this.f18071i < list.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f18072j = null;
                    boolean z13 = false;
                    while (!z13) {
                        if (this.f18071i < this.f18070h.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        }
                        List list2 = this.f18070h;
                        int i10 = this.f18071i;
                        this.f18071i = i10 + 1;
                        k4.y yVar = (k4.y) list2.get(i10);
                        File file = this.f18073k;
                        i iVar = this.f18066c;
                        this.f18072j = yVar.b(file, iVar.f18078e, iVar.f18079f, iVar.f18082i);
                        if (this.f18072j != null) {
                            if (this.f18066c.c(this.f18072j.f20271c.a()) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                this.f18072j.f20271c.e(this.f18066c.f18088o, this);
                                z13 = true;
                            }
                        }
                    }
                    return z13;
                }
            }
            int i11 = this.f18068f + 1;
            this.f18068f = i11;
            if (i11 >= d10.size()) {
                int i12 = this.f18067d + 1;
                this.f18067d = i12;
                if (i12 >= a.size()) {
                    return false;
                }
                this.f18068f = 0;
            }
            e4.j jVar = (e4.j) a.get(this.f18067d);
            Class cls = (Class) d10.get(this.f18068f);
            e4.q f10 = this.f18066c.f(cls);
            i iVar2 = this.f18066c;
            this.f18074l = new i0(iVar2.f18076c.a, jVar, iVar2.f18087n, iVar2.f18078e, iVar2.f18079f, f10, cls, iVar2.f18082i);
            File g10 = iVar2.f18081h.a().g(this.f18074l);
            this.f18073k = g10;
            if (g10 != null) {
                this.f18069g = jVar;
                this.f18070h = this.f18066c.f18076c.a().e(g10);
                this.f18071i = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(Exception exc) {
        this.f18065b.a(this.f18074l, exc, this.f18072j.f20271c, e4.a.RESOURCE_DISK_CACHE);
    }

    @Override // g4.h
    public final void cancel() {
        k4.x xVar = this.f18072j;
        if (xVar != null) {
            xVar.f20271c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        this.f18065b.c(this.f18069g, obj, this.f18072j.f20271c, e4.a.RESOURCE_DISK_CACHE, this.f18074l);
    }
}

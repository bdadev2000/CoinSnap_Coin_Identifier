package g4;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements h, com.bumptech.glide.load.data.d {

    /* renamed from: b, reason: collision with root package name */
    public final List f18047b;

    /* renamed from: c, reason: collision with root package name */
    public final i f18048c;

    /* renamed from: d, reason: collision with root package name */
    public final g f18049d;

    /* renamed from: f, reason: collision with root package name */
    public int f18050f = -1;

    /* renamed from: g, reason: collision with root package name */
    public e4.j f18051g;

    /* renamed from: h, reason: collision with root package name */
    public List f18052h;

    /* renamed from: i, reason: collision with root package name */
    public int f18053i;

    /* renamed from: j, reason: collision with root package name */
    public volatile k4.x f18054j;

    /* renamed from: k, reason: collision with root package name */
    public File f18055k;

    public e(List list, i iVar, g gVar) {
        this.f18047b = list;
        this.f18048c = iVar;
        this.f18049d = gVar;
    }

    @Override // g4.h
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        while (true) {
            List list = this.f18052h;
            if (list != null) {
                if (this.f18053i < list.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f18054j = null;
                    boolean z13 = false;
                    while (!z13) {
                        if (this.f18053i < this.f18052h.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        }
                        List list2 = this.f18052h;
                        int i10 = this.f18053i;
                        this.f18053i = i10 + 1;
                        k4.y yVar = (k4.y) list2.get(i10);
                        File file = this.f18055k;
                        i iVar = this.f18048c;
                        this.f18054j = yVar.b(file, iVar.f18078e, iVar.f18079f, iVar.f18082i);
                        if (this.f18054j != null) {
                            if (this.f18048c.c(this.f18054j.f20271c.a()) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                this.f18054j.f20271c.e(this.f18048c.f18088o, this);
                                z13 = true;
                            }
                        }
                    }
                    return z13;
                }
            }
            int i11 = this.f18050f + 1;
            this.f18050f = i11;
            if (i11 >= this.f18047b.size()) {
                return false;
            }
            e4.j jVar = (e4.j) this.f18047b.get(this.f18050f);
            i iVar2 = this.f18048c;
            File g10 = iVar2.f18081h.a().g(new f(jVar, iVar2.f18087n));
            this.f18055k = g10;
            if (g10 != null) {
                this.f18051g = jVar;
                this.f18052h = this.f18048c.f18076c.a().e(g10);
                this.f18053i = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(Exception exc) {
        this.f18049d.a(this.f18051g, exc, this.f18054j.f20271c, e4.a.DATA_DISK_CACHE);
    }

    @Override // g4.h
    public final void cancel() {
        k4.x xVar = this.f18054j;
        if (xVar != null) {
            xVar.f20271c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Object obj) {
        this.f18049d.c(this.f18051g, obj, this.f18054j.f20271c, e4.a.DATA_DISK_CACHE, this.f18051g);
    }
}

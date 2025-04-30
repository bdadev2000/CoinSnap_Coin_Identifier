package P1;

import java.io.File;
import java.util.List;

/* renamed from: P1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231e implements h, com.bumptech.glide.load.data.d {
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final i f2296c;

    /* renamed from: d, reason: collision with root package name */
    public final g f2297d;

    /* renamed from: f, reason: collision with root package name */
    public int f2298f = -1;

    /* renamed from: g, reason: collision with root package name */
    public N1.f f2299g;

    /* renamed from: h, reason: collision with root package name */
    public List f2300h;

    /* renamed from: i, reason: collision with root package name */
    public int f2301i;

    /* renamed from: j, reason: collision with root package name */
    public volatile T1.t f2302j;

    /* renamed from: k, reason: collision with root package name */
    public File f2303k;

    public C0231e(List list, i iVar, g gVar) {
        this.b = list;
        this.f2296c = iVar;
        this.f2297d = gVar;
    }

    @Override // P1.h
    public final boolean b() {
        while (true) {
            List list = this.f2300h;
            boolean z8 = false;
            if (list != null && this.f2301i < list.size()) {
                this.f2302j = null;
                while (!z8 && this.f2301i < this.f2300h.size()) {
                    List list2 = this.f2300h;
                    int i9 = this.f2301i;
                    this.f2301i = i9 + 1;
                    T1.u uVar = (T1.u) list2.get(i9);
                    File file = this.f2303k;
                    i iVar = this.f2296c;
                    this.f2302j = uVar.b(file, iVar.f2308e, iVar.f2309f, iVar.f2312i);
                    if (this.f2302j != null && this.f2296c.c(this.f2302j.f2994c.a()) != null) {
                        this.f2302j.f2994c.e(this.f2296c.f2316o, this);
                        z8 = true;
                    }
                }
                return z8;
            }
            int i10 = this.f2298f + 1;
            this.f2298f = i10;
            if (i10 >= this.b.size()) {
                return false;
            }
            N1.f fVar = (N1.f) this.b.get(this.f2298f);
            i iVar2 = this.f2296c;
            File c9 = iVar2.f2311h.a().c(new C0232f(fVar, iVar2.f2315n));
            this.f2303k = c9;
            if (c9 != null) {
                this.f2299g = fVar;
                this.f2300h = this.f2296c.f2306c.a().f(c9);
                this.f2301i = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(Exception exc) {
        this.f2297d.a(this.f2299g, exc, this.f2302j.f2994c, 3);
    }

    @Override // P1.h
    public final void cancel() {
        T1.t tVar = this.f2302j;
        if (tVar != null) {
            tVar.f2994c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void h(Object obj) {
        this.f2297d.d(this.f2299g, obj, this.f2302j.f2994c, 3, this.f2299g);
    }
}

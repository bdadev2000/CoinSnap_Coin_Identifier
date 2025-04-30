package D1;

import U4.y;
import java.util.List;
import java.util.Locale;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f677a;
    public final v1.i b;

    /* renamed from: c, reason: collision with root package name */
    public final String f678c;

    /* renamed from: d, reason: collision with root package name */
    public final long f679d;

    /* renamed from: e, reason: collision with root package name */
    public final int f680e;

    /* renamed from: f, reason: collision with root package name */
    public final long f681f;

    /* renamed from: g, reason: collision with root package name */
    public final String f682g;

    /* renamed from: h, reason: collision with root package name */
    public final List f683h;

    /* renamed from: i, reason: collision with root package name */
    public final B1.d f684i;

    /* renamed from: j, reason: collision with root package name */
    public final int f685j;

    /* renamed from: k, reason: collision with root package name */
    public final int f686k;
    public final int l;
    public final float m;

    /* renamed from: n, reason: collision with root package name */
    public final float f687n;

    /* renamed from: o, reason: collision with root package name */
    public final float f688o;

    /* renamed from: p, reason: collision with root package name */
    public final float f689p;

    /* renamed from: q, reason: collision with root package name */
    public final B1.a f690q;

    /* renamed from: r, reason: collision with root package name */
    public final y f691r;

    /* renamed from: s, reason: collision with root package name */
    public final B1.b f692s;

    /* renamed from: t, reason: collision with root package name */
    public final List f693t;

    /* renamed from: u, reason: collision with root package name */
    public final int f694u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f695v;

    /* renamed from: w, reason: collision with root package name */
    public final E1.c f696w;

    /* renamed from: x, reason: collision with root package name */
    public final F1.i f697x;

    /* renamed from: y, reason: collision with root package name */
    public final int f698y;

    public e(List list, v1.i iVar, String str, long j7, int i9, long j9, String str2, List list2, B1.d dVar, int i10, int i11, int i12, float f9, float f10, float f11, float f12, B1.a aVar, y yVar, List list3, int i13, B1.b bVar, boolean z8, E1.c cVar, F1.i iVar2, int i14) {
        this.f677a = list;
        this.b = iVar;
        this.f678c = str;
        this.f679d = j7;
        this.f680e = i9;
        this.f681f = j9;
        this.f682g = str2;
        this.f683h = list2;
        this.f684i = dVar;
        this.f685j = i10;
        this.f686k = i11;
        this.l = i12;
        this.m = f9;
        this.f687n = f10;
        this.f688o = f11;
        this.f689p = f12;
        this.f690q = aVar;
        this.f691r = yVar;
        this.f693t = list3;
        this.f694u = i13;
        this.f692s = bVar;
        this.f695v = z8;
        this.f696w = cVar;
        this.f697x = iVar2;
        this.f698y = i14;
    }

    public final String a(String str) {
        int i9;
        StringBuilder b = AbstractC2965e.b(str);
        b.append(this.f678c);
        b.append("\n");
        v1.i iVar = this.b;
        e eVar = (e) iVar.f23491i.d(null, this.f681f);
        if (eVar != null) {
            b.append("\t\tParents: ");
            b.append(eVar.f678c);
            for (e eVar2 = (e) iVar.f23491i.d(null, eVar.f681f); eVar2 != null; eVar2 = (e) iVar.f23491i.d(null, eVar2.f681f)) {
                b.append("->");
                b.append(eVar2.f678c);
            }
            b.append(str);
            b.append("\n");
        }
        List list = this.f683h;
        if (!list.isEmpty()) {
            b.append(str);
            b.append("\tMasks: ");
            b.append(list.size());
            b.append("\n");
        }
        int i10 = this.f685j;
        if (i10 != 0 && (i9 = this.f686k) != 0) {
            b.append(str);
            b.append("\tBackground: ");
            b.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(this.l)));
        }
        List list2 = this.f677a;
        if (!list2.isEmpty()) {
            b.append(str);
            b.append("\tShapes:\n");
            for (Object obj : list2) {
                b.append(str);
                b.append("\t\t");
                b.append(obj);
                b.append("\n");
            }
        }
        return b.toString();
    }

    public final String toString() {
        return a("");
    }
}

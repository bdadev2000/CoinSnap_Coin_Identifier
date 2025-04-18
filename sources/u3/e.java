package u3;

import ic.t;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final m3.j f25503b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25504c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25505d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25506e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25507f;

    /* renamed from: g, reason: collision with root package name */
    public final String f25508g;

    /* renamed from: h, reason: collision with root package name */
    public final List f25509h;

    /* renamed from: i, reason: collision with root package name */
    public final s3.c f25510i;

    /* renamed from: j, reason: collision with root package name */
    public final int f25511j;

    /* renamed from: k, reason: collision with root package name */
    public final int f25512k;

    /* renamed from: l, reason: collision with root package name */
    public final int f25513l;

    /* renamed from: m, reason: collision with root package name */
    public final float f25514m;

    /* renamed from: n, reason: collision with root package name */
    public final float f25515n;

    /* renamed from: o, reason: collision with root package name */
    public final float f25516o;

    /* renamed from: p, reason: collision with root package name */
    public final float f25517p;

    /* renamed from: q, reason: collision with root package name */
    public final h4.c f25518q;

    /* renamed from: r, reason: collision with root package name */
    public final t f25519r;

    /* renamed from: s, reason: collision with root package name */
    public final s3.a f25520s;

    /* renamed from: t, reason: collision with root package name */
    public final List f25521t;
    public final int u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f25522v;

    /* renamed from: w, reason: collision with root package name */
    public final v3.c f25523w;

    /* renamed from: x, reason: collision with root package name */
    public final w3.h f25524x;

    /* renamed from: y, reason: collision with root package name */
    public final int f25525y;

    public e(List list, m3.j jVar, String str, long j3, int i10, long j10, String str2, List list2, s3.c cVar, int i11, int i12, int i13, float f10, float f11, float f12, float f13, h4.c cVar2, t tVar, List list3, int i14, s3.a aVar, boolean z10, v3.c cVar3, w3.h hVar, int i15) {
        this.a = list;
        this.f25503b = jVar;
        this.f25504c = str;
        this.f25505d = j3;
        this.f25506e = i10;
        this.f25507f = j10;
        this.f25508g = str2;
        this.f25509h = list2;
        this.f25510i = cVar;
        this.f25511j = i11;
        this.f25512k = i12;
        this.f25513l = i13;
        this.f25514m = f10;
        this.f25515n = f11;
        this.f25516o = f12;
        this.f25517p = f13;
        this.f25518q = cVar2;
        this.f25519r = tVar;
        this.f25521t = list3;
        this.u = i14;
        this.f25520s = aVar;
        this.f25522v = z10;
        this.f25523w = cVar3;
        this.f25524x = hVar;
        this.f25525y = i15;
    }

    public final String a(String str) {
        int i10;
        StringBuilder m10 = eb.j.m(str);
        m10.append(this.f25504c);
        m10.append("\n");
        m3.j jVar = this.f25503b;
        e eVar = (e) jVar.f21558i.d(this.f25507f, null);
        if (eVar != null) {
            m10.append("\t\tParents: ");
            m10.append(eVar.f25504c);
            for (e eVar2 = (e) jVar.f21558i.d(eVar.f25507f, null); eVar2 != null; eVar2 = (e) jVar.f21558i.d(eVar2.f25507f, null)) {
                m10.append("->");
                m10.append(eVar2.f25504c);
            }
            m10.append(str);
            m10.append("\n");
        }
        List list = this.f25509h;
        if (!list.isEmpty()) {
            m10.append(str);
            m10.append("\tMasks: ");
            m10.append(list.size());
            m10.append("\n");
        }
        int i11 = this.f25511j;
        if (i11 != 0 && (i10 = this.f25512k) != 0) {
            m10.append(str);
            m10.append("\tBackground: ");
            m10.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f25513l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            m10.append(str);
            m10.append("\tShapes:\n");
            for (Object obj : list2) {
                m10.append(str);
                m10.append("\t\t");
                m10.append(obj);
                m10.append("\n");
            }
        }
        return m10.toString();
    }

    public final String toString() {
        return a("");
    }
}

package t3;

import java.util.ArrayList;
import java.util.List;
import m3.x;

/* loaded from: classes.dex */
public final class e implements b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25203b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.c f25204c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.c f25205d;

    /* renamed from: e, reason: collision with root package name */
    public final h4.c f25206e;

    /* renamed from: f, reason: collision with root package name */
    public final h4.c f25207f;

    /* renamed from: g, reason: collision with root package name */
    public final s3.a f25208g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25209h;

    /* renamed from: i, reason: collision with root package name */
    public final int f25210i;

    /* renamed from: j, reason: collision with root package name */
    public final float f25211j;

    /* renamed from: k, reason: collision with root package name */
    public final List f25212k;

    /* renamed from: l, reason: collision with root package name */
    public final s3.a f25213l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f25214m;

    public e(String str, int i10, h4.c cVar, h4.c cVar2, h4.c cVar3, h4.c cVar4, s3.a aVar, int i11, int i12, float f10, ArrayList arrayList, s3.a aVar2, boolean z10) {
        this.a = str;
        this.f25203b = i10;
        this.f25204c = cVar;
        this.f25205d = cVar2;
        this.f25206e = cVar3;
        this.f25207f = cVar4;
        this.f25208g = aVar;
        this.f25209h = i11;
        this.f25210i = i12;
        this.f25211j = f10;
        this.f25212k = arrayList;
        this.f25213l = aVar2;
        this.f25214m = z10;
    }

    @Override // t3.b
    public final o3.d a(x xVar, m3.j jVar, u3.b bVar) {
        return new o3.j(xVar, bVar, this);
    }
}

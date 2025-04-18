package t3;

import java.util.ArrayList;
import java.util.List;
import m3.x;
import o3.t;

/* loaded from: classes.dex */
public final class o implements b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final s3.a f25246b;

    /* renamed from: c, reason: collision with root package name */
    public final List f25247c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.c f25248d;

    /* renamed from: e, reason: collision with root package name */
    public final h4.c f25249e;

    /* renamed from: f, reason: collision with root package name */
    public final s3.a f25250f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25251g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25252h;

    /* renamed from: i, reason: collision with root package name */
    public final float f25253i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f25254j;

    public o(String str, s3.a aVar, ArrayList arrayList, h4.c cVar, h4.c cVar2, s3.a aVar2, int i10, int i11, float f10, boolean z10) {
        this.a = str;
        this.f25246b = aVar;
        this.f25247c = arrayList;
        this.f25248d = cVar;
        this.f25249e = cVar2;
        this.f25250f = aVar2;
        this.f25251g = i10;
        this.f25252h = i11;
        this.f25253i = f10;
        this.f25254j = z10;
    }

    @Override // t3.b
    public final o3.d a(x xVar, m3.j jVar, u3.b bVar) {
        return new t(xVar, bVar, this);
    }
}

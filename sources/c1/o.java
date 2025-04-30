package C1;

import java.util.ArrayList;
import java.util.List;
import v1.v;
import x1.s;

/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f475a;
    public final B1.b b;

    /* renamed from: c, reason: collision with root package name */
    public final List f476c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.a f477d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.a f478e;

    /* renamed from: f, reason: collision with root package name */
    public final B1.b f479f;

    /* renamed from: g, reason: collision with root package name */
    public final int f480g;

    /* renamed from: h, reason: collision with root package name */
    public final int f481h;

    /* renamed from: i, reason: collision with root package name */
    public final float f482i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f483j;

    public o(String str, B1.b bVar, ArrayList arrayList, B1.a aVar, B1.a aVar2, B1.b bVar2, int i9, int i10, float f9, boolean z8) {
        this.f475a = str;
        this.b = bVar;
        this.f476c = arrayList;
        this.f477d = aVar;
        this.f478e = aVar2;
        this.f479f = bVar2;
        this.f480g = i9;
        this.f481h = i10;
        this.f482i = f9;
        this.f483j = z8;
    }

    @Override // C1.b
    public final x1.c a(v vVar, v1.i iVar, D1.b bVar) {
        return new s(vVar, bVar, this);
    }
}

package C1;

import v1.v;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f421a;
    public final B1.e b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.a f422c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f423d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f424e;

    public a(String str, B1.e eVar, B1.a aVar, boolean z8, boolean z9) {
        this.f421a = str;
        this.b = eVar;
        this.f422c = aVar;
        this.f423d = z8;
        this.f424e = z9;
    }

    @Override // C1.b
    public final x1.c a(v vVar, v1.i iVar, D1.b bVar) {
        return new x1.f(vVar, bVar, this);
    }
}

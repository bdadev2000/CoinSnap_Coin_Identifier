package C1;

import v1.v;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f457a = 1;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.b f458c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f459d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.e f460e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f461f;

    public i(String str, B1.b bVar, B1.b bVar2, B1.d dVar, boolean z8) {
        this.b = str;
        this.f458c = bVar;
        this.f460e = bVar2;
        this.f461f = dVar;
        this.f459d = z8;
    }

    @Override // C1.b
    public final x1.c a(v vVar, v1.i iVar, D1.b bVar) {
        switch (this.f457a) {
            case 0:
                return new x1.o(vVar, bVar, this);
            default:
                return new x1.p(vVar, bVar, this);
        }
    }

    public String toString() {
        switch (this.f457a) {
            case 0:
                return "RectangleShape{position=" + this.f460e + ", size=" + ((B1.e) this.f461f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, B1.e eVar, B1.a aVar, B1.b bVar, boolean z8) {
        this.b = str;
        this.f460e = eVar;
        this.f461f = aVar;
        this.f458c = bVar;
        this.f459d = z8;
    }
}

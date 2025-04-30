package C1;

import v1.v;
import x1.t;

/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f484a;
    public final B1.b b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.b f485c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.b f486d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f487e;

    public p(String str, int i9, B1.b bVar, B1.b bVar2, B1.b bVar3, boolean z8) {
        this.f484a = i9;
        this.b = bVar;
        this.f485c = bVar2;
        this.f486d = bVar3;
        this.f487e = z8;
    }

    @Override // C1.b
    public final x1.c a(v vVar, v1.i iVar, D1.b bVar) {
        return new t(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.f485c + ", offset: " + this.f486d + "}";
    }
}

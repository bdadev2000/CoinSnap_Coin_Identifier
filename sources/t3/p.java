package t3;

import m3.x;
import o3.u;

/* loaded from: classes.dex */
public final class p implements b {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final s3.a f25255b;

    /* renamed from: c, reason: collision with root package name */
    public final s3.a f25256c;

    /* renamed from: d, reason: collision with root package name */
    public final s3.a f25257d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25258e;

    public p(String str, int i10, s3.a aVar, s3.a aVar2, s3.a aVar3, boolean z10) {
        this.a = i10;
        this.f25255b = aVar;
        this.f25256c = aVar2;
        this.f25257d = aVar3;
        this.f25258e = z10;
    }

    @Override // t3.b
    public final o3.d a(x xVar, m3.j jVar, u3.b bVar) {
        return new u(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f25255b + ", end: " + this.f25256c + ", offset: " + this.f25257d + "}";
    }
}

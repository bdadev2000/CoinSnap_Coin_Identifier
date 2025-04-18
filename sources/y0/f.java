package y0;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f31431a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31432b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.l f31433c;

    public f(j jVar, boolean z2, q0.l lVar) {
        p0.a.s(lVar, "predicate");
        this.f31431a = jVar;
        this.f31432b = z2;
        this.f31433c = lVar;
    }

    @Override // y0.j
    public final Iterator iterator() {
        return new e(this);
    }
}

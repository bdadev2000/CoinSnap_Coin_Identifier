package h0;

import b1.f0;
import kotlin.jvm.internal.q;
import q0.p;

/* loaded from: classes4.dex */
public abstract class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f30714a;

    public a(k kVar) {
        this.f30714a = kVar;
    }

    @Override // h0.l
    public final Object H(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // h0.j
    public final k getKey() {
        return this.f30714a;
    }

    @Override // h0.l
    public j i(k kVar) {
        return q.e(this, kVar);
    }

    @Override // h0.l
    public l s(k kVar) {
        return q.i(this, kVar);
    }

    @Override // h0.l
    public final l u(l lVar) {
        p0.a.s(lVar, "context");
        return f0.y(this, lVar);
    }
}

package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public abstract class x extends a0 implements x0.l {
    @Override // kotlin.jvm.internal.h
    public x0.b computeReflected() {
        g0.f30932a.getClass();
        return this;
    }

    @Override // x0.l
    public Object getDelegate(Object obj) {
        return ((x0.l) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ x0.i getGetter() {
        mo629getGetter();
        return null;
    }

    @Override // q0.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // x0.l
    /* renamed from: getGetter, reason: collision with other method in class */
    public x0.k mo629getGetter() {
        ((x0.l) getReflected()).mo629getGetter();
        return null;
    }
}

package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public class t extends u implements x0.h {
    public t(Class cls, String str, String str2, int i2) {
        super(h.NO_RECEIVER, cls, str, str2, i2);
    }

    @Override // kotlin.jvm.internal.h
    public final x0.b computeReflected() {
        g0.f30932a.getClass();
        return this;
    }

    public Object get(Object obj) {
        mo629getGetter();
        throw null;
    }

    @Override // x0.l
    public final Object getDelegate(Object obj) {
        return ((t) ((x0.h) getReflected())).getDelegate(obj);
    }

    @Override // x0.l
    /* renamed from: getGetter */
    public final x0.k mo629getGetter() {
        ((t) ((x0.h) getReflected())).mo629getGetter();
        return null;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return get(obj);
    }
}

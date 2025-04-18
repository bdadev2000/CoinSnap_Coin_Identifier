package androidx.compose.runtime;

import h0.l;
import q0.p;

/* loaded from: classes2.dex */
public interface Composer {

    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final Composer$Companion$Empty$1 f13690a = new Object();
    }

    void A();

    void B(q0.a aVar);

    void C(RecomposeScope recomposeScope);

    void D();

    int E();

    CompositionContext F();

    void G();

    void H();

    boolean I(Object obj);

    void J(int i2);

    Object K(ProvidableCompositionLocal providableCompositionLocal);

    void L(q0.a aVar);

    default boolean a(boolean z2) {
        return a(z2);
    }

    default boolean b(float f2) {
        return b(f2);
    }

    default boolean c(int i2) {
        return c(i2);
    }

    default boolean d(long j2) {
        return d(j2);
    }

    boolean e();

    void f(boolean z2);

    ComposerImpl g(int i2);

    void h(Object obj, p pVar);

    boolean i();

    Applier j();

    void k(Object obj);

    l l();

    PersistentCompositionLocalMap m();

    void n();

    void o(Object obj);

    void p();

    void q();

    RecomposeScopeImpl r();

    void s();

    void t(int i2);

    Object u();

    SlotTable v();

    default boolean w(Object obj) {
        return I(obj);
    }

    void x(Object obj);

    void y(int i2, Object obj);

    void z();
}

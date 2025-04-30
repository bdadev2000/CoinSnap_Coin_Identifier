package c7;

import e8.C2231f;

/* loaded from: classes3.dex */
public final class T {
    public static final S Companion = new S(null);
    private final Boolean isCoppa;

    public /* synthetic */ T(int i9, Boolean bool, e8.g0 g0Var) {
        if (1 == (i9 & 1)) {
            this.isCoppa = bool;
        } else {
            e8.W.h(i9, 1, Q.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ T copy$default(T t9, Boolean bool, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bool = t9.isCoppa;
        }
        return t9.copy(bool);
    }

    public static final void write$Self(T t9, d8.b bVar, c8.g gVar) {
        G7.j.e(t9, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.u(gVar, 0, C2231f.f20162a, t9.isCoppa);
    }

    public final Boolean component1() {
        return this.isCoppa;
    }

    public final T copy(Boolean bool) {
        return new T(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof T) && G7.j.a(this.isCoppa, ((T) obj).isCoppa)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.isCoppa;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isCoppa() {
        return this.isCoppa;
    }

    public String toString() {
        return "COPPA(isCoppa=" + this.isCoppa + ')';
    }

    public T(Boolean bool) {
        this.isCoppa = bool;
    }

    public static /* synthetic */ void isCoppa$annotations() {
    }
}

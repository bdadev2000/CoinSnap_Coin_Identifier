package x7;

import java.util.UUID;

/* loaded from: classes3.dex */
public interface n {
    static void c(n nVar, n nVar2) {
        if (nVar == nVar2) {
            return;
        }
        if (nVar2 != null) {
            nVar2.f(null);
        }
        if (nVar != null) {
            nVar.e(null);
        }
    }

    UUID a();

    boolean b();

    w7.b d();

    void e(q qVar);

    void f(q qVar);

    boolean g(String str);

    m getError();

    int getState();
}

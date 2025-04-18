package j0;

import h0.l;
import h0.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(h0.g gVar) {
        super(gVar);
        if (gVar != null && gVar.getContext() != m.f30726a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // h0.g
    @NotNull
    public l getContext() {
        return m.f30726a;
    }
}

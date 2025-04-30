package y7;

import w7.k;
import w7.l;

/* renamed from: y7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2958g extends AbstractC2952a {
    public AbstractC2958g(w7.f fVar) {
        super(fVar);
        if (fVar != null && fVar.getContext() != l.b) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // w7.f
    public final k getContext() {
        return l.b;
    }
}

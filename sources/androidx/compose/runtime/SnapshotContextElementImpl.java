package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import b1.c2;
import b1.f0;
import h0.j;
import h0.k;
import h0.l;
import kotlin.jvm.internal.q;
import q0.p;

@StabilityInferred
@ExperimentalComposeApi
/* loaded from: classes2.dex */
public final class SnapshotContextElementImpl implements SnapshotContextElement, c2 {
    @Override // b1.c2
    public final void D(Object obj) {
        throw null;
    }

    @Override // h0.l
    public final Object H(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // h0.j
    public final k getKey() {
        return SnapshotContextElement.Key.f14557a;
    }

    @Override // b1.c2
    public final Object h(l lVar) {
        throw null;
    }

    @Override // h0.l
    public final j i(k kVar) {
        return q.e(this, kVar);
    }

    @Override // h0.l
    public final l s(k kVar) {
        return q.i(this, kVar);
    }

    @Override // h0.l
    public final l u(l lVar) {
        p0.a.s(lVar, "context");
        return f0.y(this, lVar);
    }
}

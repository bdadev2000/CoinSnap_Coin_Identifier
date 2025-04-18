package e0;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class k extends AbstractSet implements Set, r0.f {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}

package e0;

import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class h extends AbstractCollection implements Collection, r0.b {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}

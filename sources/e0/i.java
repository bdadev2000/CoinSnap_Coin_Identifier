package e0;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class i extends AbstractList implements List, r0.c {
    public abstract int b();

    public abstract Object c(int i2);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i2) {
        return c(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}

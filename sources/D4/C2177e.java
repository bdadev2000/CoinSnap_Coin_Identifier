package d4;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: d4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2177e extends AbstractCollection {
    public final /* synthetic */ C2178f b;

    public C2177e(C2178f c2178f) {
        this.b = c2178f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2178f c2178f = this.b;
        Map b = c2178f.b();
        if (b != null) {
            return b.values().iterator();
        }
        return new C2174b(c2178f, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.size();
    }
}

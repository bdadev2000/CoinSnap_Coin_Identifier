package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;
import d0.k;
import java.util.ArrayList;
import java.util.List;
import q0.l;

/* loaded from: classes4.dex */
public final class LazyGridState$prefetchScope$1 implements LazyGridPrefetchScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4623a;

    public LazyGridState$prefetchScope$1(LazyGridState lazyGridState) {
        this.f4623a = lazyGridState;
    }

    public final ArrayList a(int i2) {
        ArrayList arrayList = new ArrayList();
        LazyGridState lazyGridState = this.f4623a;
        Snapshot a2 = Snapshot.Companion.a();
        l f2 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            List list = (List) ((LazyGridMeasureResult) lazyGridState.f4606c.getValue()).f4541h.invoke(Integer.valueOf(i2));
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                k kVar = (k) list.get(i3);
                arrayList.add(lazyGridState.f4614m.a(((Number) kVar.f30134a).intValue(), ((Constraints) kVar.f30135b).f17480a));
            }
            return arrayList;
        } finally {
            Snapshot.Companion.f(a2, c2, f2);
        }
    }
}

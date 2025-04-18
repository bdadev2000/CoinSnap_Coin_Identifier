package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p0.a;

@ExperimentalFoundationApi
/* loaded from: classes3.dex */
final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final LazyLayoutItemContentFactory f4793a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4794b = new LinkedHashMap();

    public LazyLayoutItemReusePolicy(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.f4793a = lazyLayoutItemContentFactory;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void a(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        LinkedHashMap linkedHashMap = this.f4794b;
        linkedHashMap.clear();
        Iterator it = slotIdsSet.f15856a.iterator();
        while (it.hasNext()) {
            Object b2 = this.f4793a.b(it.next());
            Integer num = (Integer) linkedHashMap.get(b2);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(b2, Integer.valueOf(intValue + 1));
            }
        }
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean b(Object obj, Object obj2) {
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.f4793a;
        return a.g(lazyLayoutItemContentFactory.b(obj), lazyLayoutItemContentFactory.b(obj2));
    }
}

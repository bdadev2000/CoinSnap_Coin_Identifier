package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final SlotTable f13998a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13999b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14000c;

    public SlotTableGroup(int i2, int i3, SlotTable slotTable) {
        this.f13998a = slotTable;
        this.f13999b = i2;
        this.f14000c = i3;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, androidx.compose.runtime.SourceInformationGroupPath] */
    @Override // java.lang.Iterable
    public final Iterator<CompositionGroup> iterator() {
        int i2;
        ArrayList arrayList;
        int n2;
        SlotTable slotTable = this.f13998a;
        if (slotTable.f13994h != this.f14000c) {
            throw new ConcurrentModificationException();
        }
        HashMap hashMap = slotTable.f13996j;
        GroupSourceInformation groupSourceInformation = null;
        int i3 = this.f13999b;
        if (hashMap != null) {
            if (!(!slotTable.f13993g)) {
                ComposerKt.c("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            Anchor anchor = (i3 < 0 || i3 >= (i2 = slotTable.f13990b) || (n2 = SlotTableKt.n((arrayList = slotTable.f13995i), i3, i2)) < 0) ? null : (Anchor) arrayList.get(n2);
            if (anchor != null) {
                groupSourceInformation = (GroupSourceInformation) hashMap.get(anchor);
            }
        }
        return groupSourceInformation != null ? new SourceInformationGroupIterator(slotTable, i3, groupSourceInformation, new Object()) : new GroupIterator(i3 + 1, SlotTableKt.c(i3, slotTable.f13989a) + i3, slotTable);
    }
}

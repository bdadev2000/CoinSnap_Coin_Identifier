package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class SourceInformationGroupIterator implements Iterator<CompositionGroup>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final SlotTable f14069a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14070b;

    /* renamed from: c, reason: collision with root package name */
    public final GroupSourceInformation f14071c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public int f14072f;

    public SourceInformationGroupIterator(SlotTable slotTable, int i2, GroupSourceInformation groupSourceInformation, SourceInformationGroupPath sourceInformationGroupPath) {
        this.f14069a = slotTable;
        this.f14070b = i2;
        this.f14071c = groupSourceInformation;
        this.d = slotTable.f13994h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList arrayList = this.f14071c.f13806a;
        return arrayList != null && this.f14072f < arrayList.size();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.RelativeGroupPath, java.lang.Object] */
    @Override // java.util.Iterator
    public final CompositionGroup next() {
        Object obj;
        ArrayList arrayList = this.f14071c.f13806a;
        if (arrayList != null) {
            int i2 = this.f14072f;
            this.f14072f = i2 + 1;
            obj = arrayList.get(i2);
        } else {
            obj = null;
        }
        boolean z2 = obj instanceof Anchor;
        SlotTable slotTable = this.f14069a;
        if (z2) {
            return new SlotTableGroup(((Anchor) obj).f13675a, this.d, slotTable);
        }
        if (!(obj instanceof GroupSourceInformation)) {
            ComposerKt.d("Unexpected group information structure");
            throw null;
        }
        return new SourceInformationSlotTableGroup(slotTable, this.f14070b, (GroupSourceInformation) obj, new Object());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

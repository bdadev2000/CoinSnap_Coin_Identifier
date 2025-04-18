package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final SlotTable f14073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14074b;

    /* renamed from: c, reason: collision with root package name */
    public final GroupSourceInformation f14075c;
    public final SourceInformationGroupPath d;

    public SourceInformationSlotTableGroup(SlotTable slotTable, int i2, GroupSourceInformation groupSourceInformation, RelativeGroupPath relativeGroupPath) {
        this.f14073a = slotTable;
        this.f14074b = i2;
        this.f14075c = groupSourceInformation;
        this.d = relativeGroupPath;
        groupSourceInformation.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator<CompositionGroup> iterator() {
        return new SourceInformationGroupIterator(this.f14073a, this.f14074b, this.f14075c, this.d);
    }
}

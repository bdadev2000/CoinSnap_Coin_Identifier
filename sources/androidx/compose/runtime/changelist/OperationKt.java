package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.SlotTableKt;
import androidx.compose.runtime.SlotWriter;

/* loaded from: classes4.dex */
public final class OperationKt {
    public static final void a(SlotWriter slotWriter, Applier applier, int i2) {
        while (true) {
            int i3 = slotWriter.f14020v;
            if (i2 > i3 && i2 < slotWriter.f14019u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            slotWriter.H();
            int i4 = slotWriter.f14020v;
            if (SlotTableKt.f(slotWriter.p(i4), slotWriter.f14002b)) {
                applier.h();
            }
            slotWriter.i();
        }
    }
}

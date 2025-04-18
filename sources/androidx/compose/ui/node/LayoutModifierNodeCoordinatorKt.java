package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;

/* loaded from: classes3.dex */
public final class LayoutModifierNodeCoordinatorKt {
    public static final int a(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        LookaheadCapablePlaceable u02 = lookaheadCapablePlaceable.u0();
        if (u02 == null) {
            InlineClassHelperKt.b("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
            throw null;
        }
        if (lookaheadCapablePlaceable.C0().q().containsKey(alignmentLine)) {
            Integer num = (Integer) lookaheadCapablePlaceable.C0().q().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int Z = u02.Z(alignmentLine);
        if (Z == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        u02.f16054h = true;
        lookaheadCapablePlaceable.f16055i = true;
        lookaheadCapablePlaceable.L0();
        u02.f16054h = false;
        lookaheadCapablePlaceable.f16055i = false;
        return Z + ((int) (alignmentLine instanceof HorizontalAlignmentLine ? u02.E0() & 4294967295L : u02.E0() >> 32));
    }
}

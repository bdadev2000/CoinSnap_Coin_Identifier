package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

/* loaded from: classes4.dex */
public final class TooltipDefaults$rememberRichTooltipPositionProvider$1$1 implements PopupPositionProvider {
    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        int i2 = intRect.f17490a;
        int i3 = (int) (j3 >> 32);
        if (i2 + i3 > ((int) (j2 >> 32))) {
            int i4 = intRect.f17492c - i3;
            i2 = i4 < 0 ? i2 + ((intRect.c() - i3) / 2) : i4;
        }
        int i5 = intRect.f17491b - ((int) (4294967295L & j3));
        if (i5 < 0) {
            i5 = intRect.d;
        }
        return IntOffsetKt.a(i2, i5);
    }
}

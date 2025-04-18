package androidx.compose.ui.window;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Alignment f17595a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17596b;

    public AlignmentOffsetPositionProvider(Alignment alignment, long j2) {
        this.f17595a = alignment;
        this.f17596b = j2;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        long a2 = this.f17595a.a(0L, IntSizeKt.a(intRect.c(), intRect.b()), layoutDirection);
        long a3 = this.f17595a.a(0L, j3, layoutDirection);
        long j4 = ((-((int) (a3 & 4294967295L))) & 4294967295L) | ((-((int) (a3 >> 32))) << 32);
        long j5 = this.f17596b;
        return IntOffset.d(IntOffset.d(IntOffset.d(IntOffsetKt.a(intRect.f17490a, intRect.f17491b), a2), j4), IntOffsetKt.a(((int) (j5 >> 32)) * (layoutDirection == LayoutDirection.f17494a ? 1 : -1), (int) (j5 & 4294967295L)));
    }
}

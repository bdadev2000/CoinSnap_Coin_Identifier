package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

@StabilityInferred
/* loaded from: classes4.dex */
public final class HandlePositionProvider implements PopupPositionProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Alignment f7066a;

    /* renamed from: b, reason: collision with root package name */
    public final OffsetProvider f7067b;

    /* renamed from: c, reason: collision with root package name */
    public long f7068c = 0;

    public HandlePositionProvider(Alignment alignment, OffsetProvider offsetProvider) {
        this.f7066a = alignment;
        this.f7067b = offsetProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        long a2 = this.f7067b.a();
        if (!OffsetKt.c(a2)) {
            a2 = this.f7068c;
        }
        this.f7068c = a2;
        return IntOffset.d(IntOffset.d(IntOffsetKt.a(intRect.f17490a, intRect.f17491b), IntOffsetKt.b(a2)), this.f7066a.a(j3, 0L, layoutDirection));
    }
}

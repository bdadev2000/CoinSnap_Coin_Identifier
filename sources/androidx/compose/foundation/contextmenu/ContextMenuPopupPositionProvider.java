package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {

    /* renamed from: a, reason: collision with root package name */
    public final long f2935a;

    public ContextMenuPopupPositionProvider(long j2) {
        this.f2935a = j2;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public final long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        int i2 = intRect.f17490a;
        long j4 = this.f2935a;
        return IntOffsetKt.a(ContextMenuPopupPositionProvider_androidKt.a(i2 + ((int) (j4 >> 32)), (int) (j3 >> 32), (int) (j2 >> 32), layoutDirection == LayoutDirection.f17494a), ContextMenuPopupPositionProvider_androidKt.a(intRect.f17491b + ((int) (j4 & 4294967295L)), (int) (j3 & 4294967295L), (int) (j2 & 4294967295L), true));
    }
}

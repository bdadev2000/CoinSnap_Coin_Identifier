package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;

/* loaded from: classes.dex */
public final class ContentScale$Companion$FillBounds$1 implements ContentScale {
    @Override // androidx.compose.ui.layout.ContentScale
    public final long a(long j2, long j3) {
        return ScaleFactorKt.a(Size.d(j3) / Size.d(j2), Size.b(j3) / Size.b(j2));
    }
}

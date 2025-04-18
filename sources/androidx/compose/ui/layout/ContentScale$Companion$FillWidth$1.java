package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;

/* loaded from: classes.dex */
public final class ContentScale$Companion$FillWidth$1 implements ContentScale {
    @Override // androidx.compose.ui.layout.ContentScale
    public final long a(long j2, long j3) {
        float d = Size.d(j3) / Size.d(j2);
        return ScaleFactorKt.a(d, d);
    }
}

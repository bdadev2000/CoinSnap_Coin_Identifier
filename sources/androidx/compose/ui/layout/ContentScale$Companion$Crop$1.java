package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;

/* loaded from: classes.dex */
public final class ContentScale$Companion$Crop$1 implements ContentScale {
    @Override // androidx.compose.ui.layout.ContentScale
    public final long a(long j2, long j3) {
        float max = Math.max(Size.d(j3) / Size.d(j2), Size.b(j3) / Size.b(j2));
        return ScaleFactorKt.a(max, max);
    }
}

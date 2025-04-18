package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import h0.g;

/* loaded from: classes3.dex */
public final class LayerSnapshotV21 implements LayerSnapshotImpl {
    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public final Object a(GraphicsLayer graphicsLayer, g gVar) {
        long j2 = graphicsLayer.f15171t;
        Bitmap createBitmap = Bitmap.createBitmap((int) (j2 >> 32), (int) (j2 & 4294967295L), Bitmap.Config.ARGB_8888);
        graphicsLayer.c(AndroidCanvas_androidKt.a(new Canvas(createBitmap)), null);
        return createBitmap;
    }
}

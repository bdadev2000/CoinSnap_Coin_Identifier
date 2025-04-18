package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import h0.g;

@RequiresApi
/* loaded from: classes3.dex */
public final class LayerSnapshotV28 implements LayerSnapshotImpl {

    /* renamed from: a, reason: collision with root package name */
    public static final LayerSnapshotV28 f15248a = new Object();

    /* loaded from: classes3.dex */
    public static final class GraphicsLayerPicture extends Picture {

        /* renamed from: a, reason: collision with root package name */
        public final GraphicsLayer f15249a;

        public GraphicsLayerPicture(GraphicsLayer graphicsLayer) {
            this.f15249a = graphicsLayer;
        }

        @Override // android.graphics.Picture
        public final Canvas beginRecording(int i2, int i3) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public final void draw(Canvas canvas) {
            this.f15249a.c(AndroidCanvas_androidKt.a(canvas), null);
        }

        @Override // android.graphics.Picture
        public final void endRecording() {
        }

        @Override // android.graphics.Picture
        public final int getHeight() {
            return (int) (this.f15249a.f15171t & 4294967295L);
        }

        @Override // android.graphics.Picture
        public final int getWidth() {
            return (int) (this.f15249a.f15171t >> 32);
        }

        @Override // android.graphics.Picture
        public final boolean requiresHardwareAcceleration() {
            return true;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public final Object a(GraphicsLayer graphicsLayer, g gVar) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap(new GraphicsLayerPicture(graphicsLayer));
        return createBitmap;
    }
}

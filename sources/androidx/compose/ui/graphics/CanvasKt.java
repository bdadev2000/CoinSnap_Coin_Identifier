package androidx.compose.ui.graphics;

/* loaded from: classes3.dex */
public final class CanvasKt {
    public static final AndroidCanvas a(AndroidImageBitmap androidImageBitmap) {
        android.graphics.Canvas canvas = AndroidCanvas_androidKt.f14928a;
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.f14925a = new android.graphics.Canvas(AndroidImageBitmap_androidKt.a(androidImageBitmap));
        return androidCanvas;
    }
}

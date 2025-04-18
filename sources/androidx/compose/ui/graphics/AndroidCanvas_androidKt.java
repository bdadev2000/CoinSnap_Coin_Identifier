package androidx.compose.ui.graphics;

/* loaded from: classes4.dex */
public final class AndroidCanvas_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final android.graphics.Canvas f14928a = new android.graphics.Canvas();

    public static final AndroidCanvas a(android.graphics.Canvas canvas) {
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.f14925a = canvas;
        return androidCanvas;
    }

    public static final android.graphics.Canvas b(Canvas canvas) {
        p0.a.q(canvas, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((AndroidCanvas) canvas).f14925a;
    }
}

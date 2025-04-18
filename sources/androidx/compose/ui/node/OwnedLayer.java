package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import q0.p;

/* loaded from: classes2.dex */
public interface OwnedLayer {
    void a(float[] fArr);

    long b(long j2, boolean z2);

    void c(long j2);

    void d(Canvas canvas, GraphicsLayer graphicsLayer);

    void destroy();

    void e(MutableRect mutableRect, boolean z2);

    void f(p pVar, q0.a aVar);

    boolean g(long j2);

    void h(ReusableGraphicsLayerScope reusableGraphicsLayerScope);

    void i(float[] fArr);

    void invalidate();

    void j(long j2);

    void k();
}

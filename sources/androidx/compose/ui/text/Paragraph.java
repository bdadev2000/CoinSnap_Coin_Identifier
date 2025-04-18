package androidx.compose.ui.text;

import androidx.compose.animation.core.a;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;

/* loaded from: classes2.dex */
public interface Paragraph {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    ResolvedTextDirection a(int i2);

    float b(int i2);

    float c(int i2);

    Rect d(int i2);

    float e(int i2);

    Rect f(int i2);

    void g(Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2);

    float getHeight();

    float getWidth();

    long h(int i2);

    float i();

    int j(long j2);

    int k(int i2);

    int l(int i2, boolean z2);

    int m(float f2);

    AndroidPath n(int i2, int i3);

    float o(int i2, boolean z2);

    void p(Canvas canvas, Brush brush, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2);

    void q(long j2, float[] fArr, int i2);

    float r();

    int s(int i2);

    ResolvedTextDirection t(int i2);

    float u(int i2);

    List v();

    long w(Rect rect, int i2, a aVar);
}

package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;

/* loaded from: classes4.dex */
public interface DeviceRenderNode {
    void A(Matrix matrix);

    void B(int i2);

    int C();

    void D(float f2);

    void E(float f2);

    void F(int i2);

    int G();

    void H(boolean z2);

    void I(int i2);

    float J();

    float a();

    void b(Canvas canvas);

    void c(float f2);

    void d(float f2);

    void e(float f2);

    void f(RenderEffect renderEffect);

    void g(float f2);

    int getHeight();

    int getWidth();

    void h(float f2);

    void i(float f2);

    void j(float f2);

    void k(float f2);

    void l(float f2);

    void m();

    int n();

    boolean o();

    void p(boolean z2);

    void q(Outline outline);

    boolean r(int i2, int i3, int i4, int i5);

    void s(float f2);

    void t(int i2);

    void u(int i2);

    boolean v();

    boolean w();

    int x();

    boolean y();

    void z(CanvasHolder canvasHolder, Path path, q0.l lVar);
}

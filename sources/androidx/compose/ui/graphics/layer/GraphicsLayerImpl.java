package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import q0.l;

/* loaded from: classes.dex */
public interface GraphicsLayerImpl {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f15177a = Companion.f15178a;

    /* loaded from: classes.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f15178a = new Object();
    }

    long A();

    float B();

    void C(float f2);

    Matrix D();

    float E();

    void F(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, l lVar);

    void G(long j2);

    float H();

    void I();

    float J();

    float K();

    void L(int i2);

    float M();

    float N();

    void O(Canvas canvas);

    float a();

    boolean b();

    void c(float f2);

    void d(float f2);

    void e(float f2);

    void f(RenderEffect renderEffect);

    void g(float f2);

    void h(float f2);

    void i(float f2);

    void j(float f2);

    void k(float f2);

    void l(float f2);

    void m();

    void n();

    default boolean o() {
        return true;
    }

    int p();

    void q(Outline outline);

    RenderEffect r();

    int s();

    void t(int i2, int i3, long j2);

    float u();

    float v();

    void w(long j2);

    void x(boolean z2);

    void y(long j2);

    long z();
}

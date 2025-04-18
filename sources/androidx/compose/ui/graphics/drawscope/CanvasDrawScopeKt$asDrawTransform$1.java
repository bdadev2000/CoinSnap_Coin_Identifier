package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;

/* loaded from: classes4.dex */
public final class CanvasDrawScopeKt$asDrawTransform$1 implements DrawTransform {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawContext f15142a;

    public CanvasDrawScopeKt$asDrawTransform$1(DrawContext drawContext) {
        this.f15142a = drawContext;
    }

    public final void a(Path path, int i2) {
        this.f15142a.a().g(path, i2);
    }

    public final void b(float f2, float f3, float f4, float f5, int i2) {
        this.f15142a.a().f(f2, f3, f4, f5, i2);
    }

    public final void c(float f2, float f3, float f4, float f5) {
        DrawContext drawContext = this.f15142a;
        Canvas a2 = drawContext.a();
        long a3 = SizeKt.a(Size.d(drawContext.b()) - (f4 + f2), Size.b(drawContext.b()) - (f5 + f3));
        if (Size.d(a3) < 0.0f || Size.b(a3) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        drawContext.c(a3);
        a2.h(f2, f3);
    }

    public final void d(long j2, float f2) {
        Canvas a2 = this.f15142a.a();
        a2.h(Offset.g(j2), Offset.h(j2));
        a2.n(f2);
        a2.h(-Offset.g(j2), -Offset.h(j2));
    }

    public final void e(long j2, float f2, float f3) {
        Canvas a2 = this.f15142a.a();
        a2.h(Offset.g(j2), Offset.h(j2));
        a2.a(f2, f3);
        a2.h(-Offset.g(j2), -Offset.h(j2));
    }

    public final void f(float[] fArr) {
        this.f15142a.a().r(fArr);
    }

    public final void g(float f2, float f3) {
        this.f15142a.a().h(f2, f3);
    }
}

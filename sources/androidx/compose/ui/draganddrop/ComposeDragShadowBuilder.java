package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Density f14768a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14769b;

    /* renamed from: c, reason: collision with root package name */
    public final l f14770c;

    public ComposeDragShadowBuilder(Density density, long j2, l lVar) {
        this.f14768a = density;
        this.f14769b = j2;
        this.f14770c = lVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        LayoutDirection layoutDirection = LayoutDirection.f17494a;
        AndroidCanvas a2 = AndroidCanvas_androidKt.a(canvas);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.f15133a;
        Density density = drawParams.f15136a;
        LayoutDirection layoutDirection2 = drawParams.f15137b;
        androidx.compose.ui.graphics.Canvas canvas2 = drawParams.f15138c;
        long j2 = drawParams.d;
        drawParams.f15136a = this.f14768a;
        drawParams.f15137b = layoutDirection;
        drawParams.f15138c = a2;
        drawParams.d = this.f14769b;
        a2.p();
        this.f14770c.invoke(canvasDrawScope);
        a2.i();
        drawParams.f15136a = density;
        drawParams.f15137b = layoutDirection2;
        drawParams.f15138c = canvas2;
        drawParams.d = j2;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j2 = this.f14769b;
        float d = Size.d(j2);
        Density density = this.f14768a;
        point.set(density.F0(density.I(d)), density.F0(density.I(Size.b(j2))));
        point2.set(point.x / 2, point.y / 2);
    }
}

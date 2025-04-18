package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DrawScope$record$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawScope f15144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f15145b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawScope$record$1(DrawScope drawScope, l lVar) {
        super(1);
        this.f15144a = drawScope;
        this.f15145b = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        Density d = drawScope.A1().d();
        LayoutDirection f2 = drawScope.A1().f();
        Canvas a2 = drawScope.A1().a();
        long b2 = drawScope.A1().b();
        GraphicsLayer graphicsLayer = drawScope.A1().f15140b;
        l lVar = this.f15145b;
        DrawScope drawScope2 = this.f15144a;
        Density d2 = drawScope2.A1().d();
        LayoutDirection f3 = drawScope2.A1().f();
        Canvas a3 = drawScope2.A1().a();
        long b3 = drawScope2.A1().b();
        GraphicsLayer graphicsLayer2 = drawScope2.A1().f15140b;
        CanvasDrawScope$drawContext$1 A1 = drawScope2.A1();
        A1.h(d);
        A1.j(f2);
        A1.g(a2);
        A1.c(b2);
        A1.f15140b = graphicsLayer;
        a2.p();
        try {
            lVar.invoke(drawScope2);
            a2.i();
            CanvasDrawScope$drawContext$1 A12 = drawScope2.A1();
            A12.h(d2);
            A12.j(f3);
            A12.g(a3);
            A12.c(b3);
            A12.f15140b = graphicsLayer2;
            return b0.f30125a;
        } catch (Throwable th) {
            a2.i();
            CanvasDrawScope$drawContext$1 A13 = drawScope2.A1();
            A13.h(d2);
            A13.j(f3);
            A13.g(a3);
            A13.c(b3);
            A13.f15140b = graphicsLayer2;
            throw th;
        }
    }
}

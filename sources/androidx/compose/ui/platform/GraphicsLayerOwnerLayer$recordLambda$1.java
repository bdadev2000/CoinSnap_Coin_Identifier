package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class GraphicsLayerOwnerLayer$recordLambda$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GraphicsLayerOwnerLayer f16513a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayerOwnerLayer$recordLambda$1(GraphicsLayerOwnerLayer graphicsLayerOwnerLayer) {
        super(1);
        this.f16513a = graphicsLayerOwnerLayer;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        Canvas a2 = drawScope.A1().a();
        q0.p pVar = this.f16513a.d;
        if (pVar != null) {
            pVar.invoke(a2, drawScope.A1().f15140b);
        }
        return b0.f30125a;
    }
}

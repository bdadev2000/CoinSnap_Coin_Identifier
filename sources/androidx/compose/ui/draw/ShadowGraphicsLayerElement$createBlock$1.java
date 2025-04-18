package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ShadowGraphicsLayerElement$createBlock$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShadowGraphicsLayerElement f14825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowGraphicsLayerElement$createBlock$1(ShadowGraphicsLayerElement shadowGraphicsLayerElement) {
        super(1);
        this.f14825a = shadowGraphicsLayerElement;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = this.f14825a;
        graphicsLayerScope.C(graphicsLayerScope.y1(shadowGraphicsLayerElement.f14821a));
        graphicsLayerScope.w1(shadowGraphicsLayerElement.f14822b);
        graphicsLayerScope.x(shadowGraphicsLayerElement.f14823c);
        graphicsLayerScope.w(shadowGraphicsLayerElement.d);
        graphicsLayerScope.y(shadowGraphicsLayerElement.f14824f);
        return b0.f30125a;
    }
}

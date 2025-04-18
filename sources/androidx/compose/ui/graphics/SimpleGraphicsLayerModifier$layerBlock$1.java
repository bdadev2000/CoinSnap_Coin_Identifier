package androidx.compose.ui.graphics;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SimpleGraphicsLayerModifier$layerBlock$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SimpleGraphicsLayerModifier f15052a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$layerBlock$1(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.f15052a = simpleGraphicsLayerModifier;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = this.f15052a;
        graphicsLayerScope.e(simpleGraphicsLayerModifier.f15042o);
        graphicsLayerScope.k(simpleGraphicsLayerModifier.f15043p);
        graphicsLayerScope.c(simpleGraphicsLayerModifier.f15044q);
        graphicsLayerScope.l(simpleGraphicsLayerModifier.f15045r);
        graphicsLayerScope.d(simpleGraphicsLayerModifier.f15046s);
        graphicsLayerScope.C(simpleGraphicsLayerModifier.f15047t);
        graphicsLayerScope.h(simpleGraphicsLayerModifier.f15048u);
        graphicsLayerScope.i(simpleGraphicsLayerModifier.f15049v);
        graphicsLayerScope.j(simpleGraphicsLayerModifier.w);
        graphicsLayerScope.g(simpleGraphicsLayerModifier.x);
        graphicsLayerScope.G0(simpleGraphicsLayerModifier.f15050y);
        graphicsLayerScope.w1(simpleGraphicsLayerModifier.f15051z);
        graphicsLayerScope.x(simpleGraphicsLayerModifier.A);
        graphicsLayerScope.f(simpleGraphicsLayerModifier.B);
        graphicsLayerScope.w(simpleGraphicsLayerModifier.C);
        graphicsLayerScope.y(simpleGraphicsLayerModifier.D);
        graphicsLayerScope.t(simpleGraphicsLayerModifier.E);
        return b0.f30125a;
    }
}

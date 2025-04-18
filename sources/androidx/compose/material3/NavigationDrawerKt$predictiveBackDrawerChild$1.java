package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class NavigationDrawerKt$predictiveBackDrawerChild$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerPredictiveBackState f10200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$predictiveBackDrawerChild$1(DrawerPredictiveBackState drawerPredictiveBackState, boolean z2) {
        super(1);
        this.f10200a = drawerPredictiveBackState;
        this.f10201b = z2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        DrawerPredictiveBackState drawerPredictiveBackState = this.f10200a;
        float c2 = NavigationDrawerKt.c(graphicsLayerScope, drawerPredictiveBackState);
        graphicsLayerScope.e(c2 == 0.0f ? 1.0f : NavigationDrawerKt.d(graphicsLayerScope, drawerPredictiveBackState) / c2);
        graphicsLayerScope.G0(TransformOriginKt.a(this.f10201b ? 0.0f : 1.0f, 0.0f));
        return b0.f30125a;
    }
}

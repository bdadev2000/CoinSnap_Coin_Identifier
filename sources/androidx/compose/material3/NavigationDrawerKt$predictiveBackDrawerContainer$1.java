package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavigationDrawerKt$predictiveBackDrawerContainer$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DrawerPredictiveBackState f10202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$predictiveBackDrawerContainer$1(DrawerPredictiveBackState drawerPredictiveBackState, boolean z2) {
        super(1);
        this.f10202a = drawerPredictiveBackState;
        this.f10203b = z2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        DrawerPredictiveBackState drawerPredictiveBackState = this.f10202a;
        graphicsLayerScope.e(NavigationDrawerKt.c(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.k(NavigationDrawerKt.d(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.G0(TransformOriginKt.a(this.f10203b ? 1.0f : 0.0f, 0.5f));
        return b0.f30125a;
    }
}

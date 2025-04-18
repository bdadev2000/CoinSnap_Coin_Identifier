package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class PullToRefreshKt$pullToRefreshIndicator$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f13163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f13165c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Shape f13166f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$pullToRefreshIndicator$2(PullToRefreshState pullToRefreshState, boolean z2, float f2, float f3, Shape shape) {
        super(1);
        this.f13163a = pullToRefreshState;
        this.f13164b = z2;
        this.f13165c = f2;
        this.d = f3;
        this.f13166f = shape;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        PullToRefreshState pullToRefreshState = this.f13163a;
        boolean z2 = pullToRefreshState.c() > 0.0f || this.f13164b;
        graphicsLayerScope.d((pullToRefreshState.c() * graphicsLayerScope.F0(this.f13165c)) - Size.b(graphicsLayerScope.b()));
        graphicsLayerScope.C(z2 ? graphicsLayerScope.y1(this.d) : 0.0f);
        graphicsLayerScope.w1(this.f13166f);
        graphicsLayerScope.x(true);
        return b0.f30125a;
    }
}

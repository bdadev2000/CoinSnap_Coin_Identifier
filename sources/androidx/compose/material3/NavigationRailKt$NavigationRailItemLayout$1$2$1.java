package androidx.compose.material3;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class NavigationRailKt$NavigationRailItemLayout$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f10364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItemLayout$1$2$1(q0.a aVar, boolean z2) {
        super(1);
        this.f10363a = z2;
        this.f10364b = aVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((GraphicsLayerScope) obj).c(this.f10363a ? 1.0f : ((Number) this.f10364b.invoke()).floatValue());
        return b0.f30125a;
    }
}

package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SearchBar_androidKt$SearchBarImpl$animatedShape$1$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f11025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f11026b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBarImpl$animatedShape$1$1(Density density, Animatable animatable) {
        super(3);
        this.f11025a = density;
        this.f11026b = animatable;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j2 = ((Size) obj2).f14923a;
        float y1 = this.f11025a.y1((1 - ((Number) this.f11026b.d()).floatValue()) * SearchBar_androidKt.f10895a);
        Rect a2 = RectKt.a(0L, j2);
        long a3 = CornerRadiusKt.a(y1, y1);
        float b2 = CornerRadius.b(a3);
        float c2 = CornerRadius.c(a3);
        float f2 = a2.f14914a;
        float f3 = a2.f14915b;
        float f4 = a2.f14916c;
        float f5 = a2.d;
        long a4 = CornerRadiusKt.a(b2, c2);
        ((Path) obj).v(new RoundRect(f2, f3, f4, f5, a4, a4, a4, a4), Path.Direction.f15004a);
        return b0.f30125a;
    }
}

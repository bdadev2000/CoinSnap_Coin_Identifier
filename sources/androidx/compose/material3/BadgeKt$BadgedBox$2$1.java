package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class BadgeKt$BadgedBox$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f7893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f7894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f7895c;
    public final /* synthetic */ MutableFloatState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeKt$BadgedBox$2$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, MutableFloatState mutableFloatState4) {
        super(1);
        this.f7893a = mutableFloatState;
        this.f7894b = mutableFloatState2;
        this.f7895c = mutableFloatState3;
        this.d = mutableFloatState4;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LayoutCoordinates a02;
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        Rect b2 = LayoutCoordinatesKt.b(layoutCoordinates);
        float f2 = BadgeKt.f7883a;
        this.f7893a.n(b2.f14914a);
        this.f7894b.n(b2.f14915b);
        LayoutCoordinates a03 = layoutCoordinates.a0();
        LayoutCoordinates z2 = (a03 == null || (a02 = a03.a0()) == null) ? null : a02.z();
        if (z2 != null) {
            Rect b3 = LayoutCoordinatesKt.b(z2);
            this.f7895c.n(b3.f14916c);
            this.d.n(b3.f14915b);
        }
        return b0.f30125a;
    }
}

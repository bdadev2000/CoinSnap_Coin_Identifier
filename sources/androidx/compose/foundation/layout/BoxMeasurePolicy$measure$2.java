package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class BoxMeasurePolicy$measure$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f3806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Measurable f3807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f3808c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BoxMeasurePolicy f3810g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxMeasurePolicy$measure$2(Placeable placeable, Measurable measurable, MeasureScope measureScope, int i2, int i3, BoxMeasurePolicy boxMeasurePolicy) {
        super(1);
        this.f3806a = placeable;
        this.f3807b = measurable;
        this.f3808c = measureScope;
        this.d = i2;
        this.f3809f = i3;
        this.f3810g = boxMeasurePolicy;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        BoxKt.b((Placeable.PlacementScope) obj, this.f3806a, this.f3807b, this.f3808c.getLayoutDirection(), this.d, this.f3809f, this.f3810g.f3803a);
        return b0.f30125a;
    }
}

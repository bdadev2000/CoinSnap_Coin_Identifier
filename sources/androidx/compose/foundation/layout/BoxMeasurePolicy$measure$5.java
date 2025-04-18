package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class BoxMeasurePolicy$measure$5 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable[] f3811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f3812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f3813c;
    public final /* synthetic */ d0 d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f3814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BoxMeasurePolicy f3815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxMeasurePolicy$measure$5(Placeable[] placeableArr, List list, MeasureScope measureScope, d0 d0Var, d0 d0Var2, BoxMeasurePolicy boxMeasurePolicy) {
        super(1);
        this.f3811a = placeableArr;
        this.f3812b = list;
        this.f3813c = measureScope;
        this.d = d0Var;
        this.f3814f = d0Var2;
        this.f3815g = boxMeasurePolicy;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable[] placeableArr = this.f3811a;
        int length = placeableArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            Placeable placeable = placeableArr[i3];
            p0.a.q(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            BoxKt.b(placementScope, placeable, (Measurable) this.f3812b.get(i2), this.f3813c.getLayoutDirection(), this.d.f30925a, this.f3814f.f30925a, this.f3815g.f3803a);
            i3++;
            i2++;
        }
        return b0.f30125a;
    }
}

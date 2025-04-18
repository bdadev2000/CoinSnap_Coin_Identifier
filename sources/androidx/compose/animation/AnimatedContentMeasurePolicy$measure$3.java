package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AnimatedContentMeasurePolicy$measure$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable[] f1664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentMeasurePolicy f1665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1666c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$measure$3(Placeable[] placeableArr, AnimatedContentMeasurePolicy animatedContentMeasurePolicy, int i2, int i3) {
        super(1);
        this.f1664a = placeableArr;
        this.f1665b = animatedContentMeasurePolicy;
        this.f1666c = i2;
        this.d = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        for (Placeable placeable : this.f1664a) {
            if (placeable != null) {
                long a2 = this.f1665b.f1663a.f1669b.a(IntSizeKt.a(placeable.f15825a, placeable.f15826b), IntSizeKt.a(this.f1666c, this.d), LayoutDirection.f17494a);
                placementScope.e(placeable, (int) (a2 >> 32), (int) (a2 & 4294967295L), 0.0f);
            }
        }
        return b0.f30125a;
    }
}

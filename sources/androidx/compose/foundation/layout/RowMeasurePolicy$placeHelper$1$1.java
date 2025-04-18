package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class RowMeasurePolicy$placeHelper$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable[] f4090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RowMeasurePolicy f4091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4092c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f4093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowMeasurePolicy$placeHelper$1$1(Placeable[] placeableArr, RowMeasurePolicy rowMeasurePolicy, int i2, int i3, int[] iArr) {
        super(1);
        this.f4090a = placeableArr;
        this.f4091b = rowMeasurePolicy;
        this.f4092c = i2;
        this.d = i3;
        this.f4093f = iArr;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable[] placeableArr = this.f4090a;
        int length = placeableArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Placeable placeable = placeableArr[i2];
            int i4 = i3 + 1;
            p0.a.p(placeable);
            RowColumnParentData b2 = RowColumnImplKt.b(placeable);
            RowMeasurePolicy rowMeasurePolicy = this.f4091b;
            rowMeasurePolicy.getClass();
            CrossAxisAlignment crossAxisAlignment = b2 != null ? b2.f4086c : null;
            int i5 = this.f4092c;
            placementScope.e(placeable, this.f4093f[i3], crossAxisAlignment != null ? crossAxisAlignment.a(i5 - placeable.f15826b, LayoutDirection.f17494a, placeable, this.d) : rowMeasurePolicy.f4089b.a(0, i5 - placeable.f15826b), 0.0f);
            i2++;
            i3 = i4;
        }
        return b0.f30125a;
    }
}

package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class ColumnMeasurePolicy$placeHelper$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable[] f3832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ColumnMeasurePolicy f3833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3834c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f3835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int[] f3836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColumnMeasurePolicy$placeHelper$1$1(Placeable[] placeableArr, ColumnMeasurePolicy columnMeasurePolicy, int i2, int i3, MeasureScope measureScope, int[] iArr) {
        super(1);
        this.f3832a = placeableArr;
        this.f3833b = columnMeasurePolicy;
        this.f3834c = i2;
        this.d = i3;
        this.f3835f = measureScope;
        this.f3836g = iArr;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        Placeable[] placeableArr = this.f3832a;
        int length = placeableArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Placeable placeable = placeableArr[i2];
            int i4 = i3 + 1;
            p0.a.p(placeable);
            RowColumnParentData b2 = RowColumnImplKt.b(placeable);
            LayoutDirection layoutDirection = this.f3835f.getLayoutDirection();
            ColumnMeasurePolicy columnMeasurePolicy = this.f3833b;
            columnMeasurePolicy.getClass();
            CrossAxisAlignment crossAxisAlignment = b2 != null ? b2.f4086c : null;
            int i5 = this.f3834c;
            placementScope.e(placeable, crossAxisAlignment != null ? crossAxisAlignment.a(i5 - placeable.f15825a, layoutDirection, placeable, this.d) : columnMeasurePolicy.f3831b.a(0, i5 - placeable.f15825a, layoutDirection), this.f3836g[i3], 0.0f);
            i2++;
            i3 = i4;
        }
        return b0.f30125a;
    }
}

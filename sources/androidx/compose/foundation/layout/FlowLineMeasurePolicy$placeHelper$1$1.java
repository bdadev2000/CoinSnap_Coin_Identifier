package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class FlowLineMeasurePolicy$placeHelper$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f3956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3958c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Placeable[] f3959f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FlowLineMeasurePolicy f3960g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3961h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f3962i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3963j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int[] f3964k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLineMeasurePolicy$placeHelper$1$1(int[] iArr, int i2, int i3, int i4, Placeable[] placeableArr, FlowLineMeasurePolicy flowLineMeasurePolicy, int i5, MeasureScope measureScope, int i6, int[] iArr2) {
        super(1);
        this.f3956a = iArr;
        this.f3957b = i2;
        this.f3958c = i3;
        this.d = i4;
        this.f3959f = placeableArr;
        this.f3960g = flowLineMeasurePolicy;
        this.f3961h = i5;
        this.f3962i = measureScope;
        this.f3963j = i6;
        this.f3964k = iArr2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        int[] iArr = this.f3956a;
        int i2 = iArr != null ? iArr[this.f3957b] : 0;
        int i3 = this.f3958c;
        for (int i4 = i3; i4 < this.d; i4++) {
            Placeable placeable = this.f3959f[i4];
            p0.a.p(placeable);
            int k2 = this.f3960g.k(this.f3961h, this.f3963j, RowColumnImplKt.b(placeable), placeable, this.f3962i.getLayoutDirection()) + i2;
            boolean isHorizontal = this.f3960g.isHorizontal();
            int[] iArr2 = this.f3964k;
            if (isHorizontal) {
                placementScope.e(placeable, iArr2[i4 - i3], k2, 0.0f);
            } else {
                placementScope.e(placeable, k2, iArr2[i4 - i3], 0.0f);
            }
        }
        return b0.f30125a;
    }
}

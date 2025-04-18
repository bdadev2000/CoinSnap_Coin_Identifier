package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class SegmentedButtonContentMeasurePolicy$measure$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f11078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f11079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SegmentedButtonContentMeasurePolicy f11080c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f11081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonContentMeasurePolicy$measure$2(ArrayList arrayList, MeasureScope measureScope, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy, int i2, ArrayList arrayList2, int i3) {
        super(1);
        this.f11078a = arrayList;
        this.f11079b = measureScope;
        this.f11080c = segmentedButtonContentMeasurePolicy;
        this.d = i2;
        this.f11081f = arrayList2;
        this.f11082g = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        int i2;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        List list = this.f11078a;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = this.f11082g;
            if (i3 >= size) {
                break;
            }
            Placeable placeable = (Placeable) list.get(i3);
            placementScope.e(placeable, 0, (i2 - placeable.f15826b) / 2, 0.0f);
            i3++;
        }
        float f2 = SegmentedButtonDefaults.f11085c;
        MeasureScope measureScope = this.f11079b;
        int F0 = measureScope.F0(SegmentedButtonKt.f11096a) + measureScope.F0(f2);
        Animatable animatable = this.f11080c.f11073b;
        int intValue = F0 + (animatable != null ? ((Number) animatable.d()).intValue() : this.d);
        List list2 = this.f11081f;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable placeable2 = (Placeable) list2.get(i4);
            placementScope.e(placeable2, intValue, (i2 - placeable2.f15826b) / 2, 0.0f);
        }
        return b0.f30125a;
    }
}

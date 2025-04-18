package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class EqualWeightContentMeasurePolicy$measure$5 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f9269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EqualWeightContentMeasurePolicy$measure$5(ArrayList arrayList) {
        super(1);
        this.f9269a = arrayList;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        List list = this.f9269a;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            Placeable.PlacementScope.h(placementScope, placeable, i2, 0);
            i2 += placeable.f15825a;
        }
        return b0.f30125a;
    }
}

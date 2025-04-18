package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class RootMeasurePolicy$measure$4 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15836a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootMeasurePolicy$measure$4(ArrayList arrayList) {
        super(1);
        this.f15836a = arrayList;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        List list = this.f15836a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable.PlacementScope.j(placementScope, (Placeable) list.get(i2), 0, 0);
        }
        return b0.f30125a;
    }
}

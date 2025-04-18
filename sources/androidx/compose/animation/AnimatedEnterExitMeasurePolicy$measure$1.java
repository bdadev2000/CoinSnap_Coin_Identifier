package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class AnimatedEnterExitMeasurePolicy$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f1683a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedEnterExitMeasurePolicy$measure$1(ArrayList arrayList) {
        super(1);
        this.f1683a = arrayList;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        List list = this.f1683a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            placementScope.e((Placeable) list.get(i2), 0, 0, 0.0f);
        }
        return b0.f30125a;
    }
}

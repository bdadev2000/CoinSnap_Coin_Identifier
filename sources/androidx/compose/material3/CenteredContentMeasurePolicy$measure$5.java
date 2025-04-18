package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class CenteredContentMeasurePolicy$measure$5 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f8185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f8186b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredContentMeasurePolicy$measure$5(d0 d0Var, ArrayList arrayList) {
        super(1);
        this.f8185a = d0Var;
        this.f8186b = arrayList;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        int i2 = this.f8185a.f30925a;
        List list = this.f8186b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            Placeable.PlacementScope.h(placementScope, placeable, i2, 0);
            i2 += placeable.f15825a;
        }
        return b0.f30125a;
    }
}

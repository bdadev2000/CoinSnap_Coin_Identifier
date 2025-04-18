package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import d0.b0;
import d0.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextMeasurePolicy$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f6238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextMeasurePolicy$measure$1(ArrayList arrayList, ArrayList arrayList2) {
        super(1);
        this.f6238a = arrayList;
        this.f6239b = arrayList2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        List list = this.f6238a;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                k kVar = (k) list.get(i2);
                Placeable.PlacementScope.g(placementScope, (Placeable) kVar.f30134a, ((IntOffset) kVar.f30135b).f17489a);
            }
        }
        List list2 = this.f6239b;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                k kVar2 = (k) list2.get(i3);
                Placeable placeable = (Placeable) kVar2.f30134a;
                q0.a aVar = (q0.a) kVar2.f30135b;
                Placeable.PlacementScope.g(placementScope, placeable, aVar != null ? ((IntOffset) aVar.invoke()).f17489a : 0L);
            }
        }
        return b0.f30125a;
    }
}

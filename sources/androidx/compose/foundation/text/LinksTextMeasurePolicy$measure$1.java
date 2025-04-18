package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import d0.b0;
import d0.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LinksTextMeasurePolicy$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f6046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinksTextMeasurePolicy f6047b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinksTextMeasurePolicy$measure$1(List list, LinksTextMeasurePolicy linksTextMeasurePolicy) {
        super(1);
        this.f6046a = list;
        this.f6047b = linksTextMeasurePolicy;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        ArrayList d = BasicTextKt.d(this.f6046a, this.f6047b.f6045a);
        if (d != null) {
            int size = d.size();
            for (int i2 = 0; i2 < size; i2++) {
                k kVar = (k) d.get(i2);
                Placeable placeable = (Placeable) kVar.f30134a;
                q0.a aVar = (q0.a) kVar.f30135b;
                Placeable.PlacementScope.g(placementScope, placeable, aVar != null ? ((IntOffset) aVar.invoke()).f17489a : 0L);
            }
        }
        return b0.f30125a;
    }
}

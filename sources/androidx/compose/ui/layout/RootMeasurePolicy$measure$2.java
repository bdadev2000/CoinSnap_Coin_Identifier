package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class RootMeasurePolicy$measure$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f15835a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootMeasurePolicy$measure$2(Placeable placeable) {
        super(1);
        this.f15835a = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope.j((Placeable.PlacementScope) obj, this.f15835a, 0, 0);
        return b0.f30125a;
    }
}

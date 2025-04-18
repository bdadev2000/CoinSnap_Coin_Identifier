package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class OffsetNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OffsetNode f4052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f4053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f4054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetNode$measure$1(OffsetNode offsetNode, Placeable placeable, MeasureScope measureScope) {
        super(1);
        this.f4052a = offsetNode;
        this.f4053b = placeable;
        this.f4054c = measureScope;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        OffsetNode offsetNode = this.f4052a;
        boolean z2 = offsetNode.f4051q;
        Placeable placeable = this.f4053b;
        MeasureScope measureScope = this.f4054c;
        if (z2) {
            Placeable.PlacementScope.h(placementScope, placeable, measureScope.F0(offsetNode.f4049o), measureScope.F0(offsetNode.f4050p));
        } else {
            placementScope.e(placeable, measureScope.F0(offsetNode.f4049o), measureScope.F0(offsetNode.f4050p), 0.0f);
        }
        return b0.f30125a;
    }
}

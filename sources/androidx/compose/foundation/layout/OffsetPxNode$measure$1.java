package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class OffsetPxNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OffsetPxNode f4059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f4060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Placeable f4061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetPxNode$measure$1(OffsetPxNode offsetPxNode, MeasureScope measureScope, Placeable placeable) {
        super(1);
        this.f4059a = offsetPxNode;
        this.f4060b = measureScope;
        this.f4061c = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        OffsetPxNode offsetPxNode = this.f4059a;
        long j2 = ((IntOffset) offsetPxNode.f4057o.invoke(this.f4060b)).f17489a;
        if (offsetPxNode.f4058p) {
            Placeable.PlacementScope.j(placementScope, this.f4061c, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        } else {
            Placeable.PlacementScope.m(placementScope, this.f4061c, (int) (j2 >> 32), (int) (j2 & 4294967295L), null, 12);
        }
        return b0.f30125a;
    }
}

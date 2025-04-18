package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.android.gms.common.api.Api;
import e0.x;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public Direction f4231o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4232p;

    /* renamed from: q, reason: collision with root package name */
    public p f4233q;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Direction direction = this.f4231o;
        Direction direction2 = Direction.f3879a;
        int k2 = direction != direction2 ? 0 : Constraints.k(j2);
        Direction direction3 = this.f4231o;
        Direction direction4 = Direction.f3880b;
        int j3 = direction3 == direction4 ? Constraints.j(j2) : 0;
        Direction direction5 = this.f4231o;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i3 = (direction5 == direction2 || !this.f4232p) ? Constraints.i(j2) : Integer.MAX_VALUE;
        if (this.f4231o == direction4 || !this.f4232p) {
            i2 = Constraints.h(j2);
        }
        Placeable V = measurable.V(ConstraintsKt.a(k2, i3, j3, i2));
        int A = p0.a.A(V.f15825a, Constraints.k(j2), Constraints.i(j2));
        int A2 = p0.a.A(V.f15826b, Constraints.j(j2), Constraints.h(j2));
        return measureScope.T(A, A2, x.f30219a, new WrapContentNode$measure$1(this, A, V, A2, measureScope));
    }
}

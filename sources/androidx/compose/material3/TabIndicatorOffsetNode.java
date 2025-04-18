package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import e0.x;
import java.util.List;
import kotlin.jvm.internal.e;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public State f11711o;

    /* renamed from: p, reason: collision with root package name */
    public int f11712p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11713q;

    /* renamed from: r, reason: collision with root package name */
    public Animatable f11714r;

    /* renamed from: s, reason: collision with root package name */
    public Animatable f11715s;

    /* renamed from: t, reason: collision with root package name */
    public Dp f11716t;

    /* renamed from: u, reason: collision with root package name */
    public Dp f11717u;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        boolean isEmpty = ((List) this.f11711o.getValue()).isEmpty();
        x xVar = x.f30219a;
        if (isEmpty) {
            return measureScope.T(0, 0, xVar, TabIndicatorOffsetNode$measure$1.f11718a);
        }
        float f2 = this.f11713q ? ((TabPosition) ((List) this.f11711o.getValue()).get(this.f11712p)).f11796c : ((TabPosition) ((List) this.f11711o.getValue()).get(this.f11712p)).f11795b;
        Dp dp = this.f11717u;
        if (dp != null) {
            Animatable animatable = this.f11715s;
            if (animatable == null) {
                animatable = new Animatable(dp, VectorConvertersKt.f2342c, null, 12);
                this.f11715s = animatable;
            }
            if (!Dp.a(f2, ((Dp) animatable.e.getValue()).f17486a)) {
                e.v(S1(), null, 0, new TabIndicatorOffsetNode$measure$2(animatable, f2, null), 3);
            }
        } else {
            this.f11717u = new Dp(f2);
        }
        float f3 = ((TabPosition) ((List) this.f11711o.getValue()).get(this.f11712p)).f11794a;
        Dp dp2 = this.f11716t;
        if (dp2 != null) {
            Animatable animatable2 = this.f11714r;
            if (animatable2 == null) {
                animatable2 = new Animatable(dp2, VectorConvertersKt.f2342c, null, 12);
                this.f11714r = animatable2;
            }
            if (!Dp.a(f3, ((Dp) animatable2.e.getValue()).f17486a)) {
                e.v(S1(), null, 0, new TabIndicatorOffsetNode$measure$3(animatable2, f3, null), 3);
            }
        } else {
            this.f11716t = new Dp(f3);
        }
        Animatable animatable3 = this.f11714r;
        if (animatable3 != null) {
            f3 = ((Dp) animatable3.d()).f17486a;
        }
        Animatable animatable4 = this.f11715s;
        if (animatable4 != null) {
            f2 = ((Dp) animatable4.d()).f17486a;
        }
        Placeable V = measurable.V(Constraints.b(j2, measureScope.F0(f2), measureScope.F0(f2), 0, 0, 12));
        return measureScope.T(V.f15825a, V.f15826b, xVar, new TabIndicatorOffsetNode$measure$4(V, measureScope, f3));
    }
}
